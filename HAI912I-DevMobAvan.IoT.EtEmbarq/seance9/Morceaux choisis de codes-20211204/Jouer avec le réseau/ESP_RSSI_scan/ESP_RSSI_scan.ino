#include <ESP8266WiFi.h>

#define LED_PIN LED_BUILTIN
#define LED_ON LOW
#define LED_OFF HIGH

#ifdef DEBUG_ESP_PORT
#  define DEBUG_MSG(...)                                                \
  DEBUG_ESP_PORT.printf("DBG:%s:%s:%d:", __FILE__, __FUNCTION__, __LINE__); \
  DEBUG_ESP_PORT.printf(__VA_ARGS__);                                   \
  Serial.flush()
#else
#  define DEBUG_MSG(...) (void) 0
#endif

#define ESP_MODE_AP (1)
#define ESP_MODE_STA (2)
#define ESP_MODE_AP_STA (ESP_MODE_AP | ESP_MODE_STA)

#ifndef ESP_MODE
#  define ESP_MODE ESP_MODE_AP_STA
#endif

#if ESP_MODE & ESP_MODE_STA
#  if ESP_MODE & ESP_MODE_AP
#    define THIS_ESP_MODE WIFI_AP_STA
#    pragma message("The ESP is both a station and an access point")
#  else
#    define THIS_ESP_MODE WIFI_STA
#    pragma message("The ESP is a station")
#  endif
#else
#  if ESP_MODE & ESP_MODE_AP
#    define THIS_ESP_MODE WIFI_AP
#    pragma message("The ESP is an access point")
#  else
#    define THIS_ESP_MODE WIFI_AP_STA // To prevent compilation spurious error message
#    error The ESP mode is neither ESP_MODE_STA nor ESP_MODE_AP nor ESP_MODE_AP_STA. Please set your compilation flags correctly.
#  endif
#endif

unsigned long int last_scan_time = 0;

/**
 * Return the hexadecimal string representation of the given byte array.
 *
 * \param data The byte array to stringify
 *
 * \param n the size of the byte array (default to 6)
 *
 * \return The hexadecimal String representation of the given data
 * byte array of length n.
 */
String byteArray2String(const uint8_t *data, int n = 6) {
  String hex_str = "";
  if (data) {
    for (int i = 0; i < n; ++i) {
      char hex_code[3];
      sprintf(hex_code, "%02X", data[i]);
      if (i) {
        hex_str += ':';
      }
      hex_str += hex_code;
    }
  }
  return hex_str;
}

/**
 * Return the C string corresponding to the given WiFi mode.
 *
 * \param mode The WiFi mode.
 *
 * \return The C string corresponding to the given WiFi mode.
 */
const char *Mode2CString(WiFiMode mode) {
  switch (mode) {
  case WIFI_OFF: return "off";
  case WIFI_STA: return "station";
  case WIFI_AP: return "access point";
  case WIFI_AP_STA: return "station & access point";
  }
  return "???";
}

/**
 * Return the C string corresponding to the given WiFi disconnect
 * reason.
 *
 * \see https://aboutcher.co.uk/2012/07/linux-wifi-deauthenticated-reason-codes/
 *
 * \param reason The disconnection reason
 *
 * \return the C string corresponding to the given WiFi disconnect
 * reason.
 */
const char *Reason2CString(WiFiDisconnectReason reason) {
  switch (reason) {
  case WIFI_DISCONNECT_REASON_UNSPECIFIED: return "Unspecific Reason";
  case WIFI_DISCONNECT_REASON_AUTH_EXPIRE: return "Previous authentication no longer valid";
  case WIFI_DISCONNECT_REASON_AUTH_LEAVE: return "The access point went offline, deauthenticating the client";
  case WIFI_DISCONNECT_REASON_ASSOC_EXPIRE: return "Client session timeout exceeded";
  case WIFI_DISCONNECT_REASON_ASSOC_TOOMANY: return "Disassociated because access point is unable to handle all currently associated stations";
  case WIFI_DISCONNECT_REASON_NOT_AUTHED: return "Client attempted to transfer data before it was authenticated";
  case WIFI_DISCONNECT_REASON_NOT_ASSOCED: return "Client attempted to transfer data before it was associated";
  case WIFI_DISCONNECT_REASON_ASSOC_LEAVE: return "Operating System moved the client to another access point using non-aggressive load balancing";
  case WIFI_DISCONNECT_REASON_ASSOC_NOT_AUTHED: return "Client not authorized yet, still attempting to associate with an access point";
  case WIFI_DISCONNECT_REASON_DISASSOC_PWRCAP_BAD: return "Disassociated because the information in the Power Capability element is unacceptable";
  case WIFI_DISCONNECT_REASON_DISASSOC_SUPCHAN_BAD: return "Disassociated because the information in the Supported Channels element is unacceptable";
  case WIFI_DISCONNECT_REASON_IE_INVALID: return "Invalid information element";
  case WIFI_DISCONNECT_REASON_MIC_FAILURE: return "Message integrity code (MIC) failure";
  case WIFI_DISCONNECT_REASON_4WAY_HANDSHAKE_TIMEOUT: return "4-Way Handshake timeout";
  case WIFI_DISCONNECT_REASON_GROUP_KEY_UPDATE_TIMEOUT: return "Group Key Handshake timeout";
  case WIFI_DISCONNECT_REASON_IE_IN_4WAY_DIFFERS: return "Information element in 4-Way Handshake different from (Re)Association Request/Probe Response/Beacon frame";
  case WIFI_DISCONNECT_REASON_GROUP_CIPHER_INVALID: return "Invalid group cipher or Association denied due to requesting station not supporting all of the data rates in the BSSBasicRateSet parameter";
  case WIFI_DISCONNECT_REASON_PAIRWISE_CIPHER_INVALID: return "Invalid pairwise cipher";
  case WIFI_DISCONNECT_REASON_AKMP_INVALID: return "Invalid AKMP";
  case WIFI_DISCONNECT_REASON_UNSUPP_RSN_IE_VERSION: return "Unsupported RSN information element version";
  case WIFI_DISCONNECT_REASON_INVALID_RSN_IE_CAP: return "Invalid RSN information element capabilities";
  case WIFI_DISCONNECT_REASON_802_1X_AUTH_FAILED: return "IEEE 802.1X authentication failed";
  case WIFI_DISCONNECT_REASON_CIPHER_SUITE_REJECTED: return "Cipher suite rejected because of the security policy";

  case WIFI_DISCONNECT_REASON_BEACON_TIMEOUT: return "Beacon frame reception timeout";
  case WIFI_DISCONNECT_REASON_NO_AP_FOUND: return "No access point found";
  case WIFI_DISCONNECT_REASON_AUTH_FAIL: return "Authentication failure";
  case WIFI_DISCONNECT_REASON_ASSOC_FAIL: return "Association failure";
  case WIFI_DISCONNECT_REASON_HANDSHAKE_TIMEOUT: return "Handshake timeout";
  }
  return "???";
}

/**
 * Return the description for the given encryption type value.
 *
 * \param enc The encryption type value
 *
 * \return The C string corresponding to the given encryption value.
 */
const char *EncryptionType2Cstr(uint8_t enc) {
  switch (enc) {
  case ENC_TYPE_WEP: return "WEP";
  case ENC_TYPE_TKIP: return "WPA / PSK";
  case ENC_TYPE_CCMP: return "WPA2 / PSK";
  case ENC_TYPE_NONE: return "Open";
  case ENC_TYPE_AUTO: return "WPA / WPA2 / PSK";
  default: return "???";
  }
}


#if ESP_MODE & ESP_MODE_STA
// This ESP acts as a station
const char *WIFI_SSID = "My phone demo AP";
const char *WIFI_password = "S1mpl3Passw0rd";
#define DATA_SIZE 50
int data[DATA_SIZE] = { 0 };
int data_index = 0;
/**
 * Print the RSSI data to the serial output.
 */
void printData() {
  Serial.printf("[");
  for (int i = 0; i < DATA_SIZE; ++i) {
    Serial.printf("%d, ", data[(i+data_index) % DATA_SIZE]);
  }
  Serial.println("]");
}

enum {
      NOT_CONNECTED_STATE,
      CONNECTING_STATE,
      CONNECTED_STATE
} last_connection_state = NOT_CONNECTED_STATE;

WiFiEventHandler StaConnectedEventHandler;
void onStaConnectedCallback(const WiFiEventStationModeConnected &event) {
  DEBUG_MSG("Station connected\n"
            "- ssid: '%s'\n- bssid: <%s>\n- channel: %d\n",
            event.ssid.c_str(),
            byteArray2String(event.bssid).c_str(),
            event.channel);
}

WiFiEventHandler StaDisconnectedEventHandler;
void onStaDisconnectedCallback(const WiFiEventStationModeDisconnected& event) {
  DEBUG_MSG("Station disconnected\n"
            "- ssid: '%s'\n- bssid: <%s>\n- reason: %s\n",
            event.ssid.c_str(),
            byteArray2String(event.bssid).c_str(),
            Reason2CString(event.reason));
}

WiFiEventHandler StaAuthModeChangedEventHandler;
void onStaAuthModeChangedCallback(const WiFiEventStationModeAuthModeChanged &event) {
  DEBUG_MSG("Station auth mode changed\n"
            "Authentication mode changed from %d to %d.\n",
            event.oldMode,
            event.newMode);

}

WiFiEventHandler StaModeGotIPEventHandler;
void onStaModeGotIPCallback(const WiFiEventStationModeGotIP &event) {
  DEBUG_MSG("Station got IP\n"
            "- IP: %s\n-Mask: %s\n- Gateway: %s\n",
            event.ip.toString().c_str(),
            event.mask.toString().c_str(),
            event.gw.toString().c_str());
}

WiFiEventHandler StaDhcpTimeoutEventHandler;
void onStaDhcpTimeoutCallback(void) {
  DEBUG_MSG("Station DHCP timeout\n");
}
#endif

// This ESP acts as an access point
#if ESP_MODE & ESP_MODE_AP
const char *ESP_SSID = "This ESP AP";
const char *ESP_password = "S1mpl3Passw0rdT00";

WiFiEventHandler SoftApConnectedEventHandler;
void onSoftApConnectedCallback(const WiFiEventSoftAPModeStationConnected &event) {
  DEBUG_MSG("Soft AP connected\n"
            "- mac: '%s'\n- id: %d\n",
            byteArray2String(event.mac).c_str(),
            event.aid);
}

WiFiEventHandler SoftApDisconnectedEventHandler;
void onSoftApDisconnectedCallback(const WiFiEventSoftAPModeStationDisconnected &event) {
  DEBUG_MSG("Soft AP disconnected\n"
            "- mac: '%s'\n- id: %d\n",
            byteArray2String(event.mac).c_str(),
            event.aid);
}

WiFiEventHandler SoftApProbeRequestReceivedEventHandler;
void onSoftApProbeRequestReceivedCallback(const WiFiEventSoftAPModeProbeRequestReceived &event) {
  DEBUG_MSG("Soft AP probe request received\n"
            "- mac: '%s'\n- RSSI: %d\n",
            byteArray2String(event.mac).c_str(),
            event.rssi);
}
#endif

WiFiEventHandler WiFiModeChangeEventHandler;
void onWiFiModeChangeCallback(const WiFiEventModeChange &event) {
  DEBUG_MSG("Wifi mode changed\n"
            "Wifi mode changed from %s to %s.\n",
            Mode2CString(event.oldMode),
            Mode2CString(event.newMode));
}

/**
 * Prints the given access point informations on serial.
 *
 * \param SSID The access point SSID
 *
 * \param BSSID The access point MAC address (byte array of length 6)
 *
 * \param RSSI The Received Signal Strength Indication from the access
 * point
 *
 * \param channel The access point emission channel
 *
 * \param encryptionType the encryption type used by the access point
 *
 * \param isHidden Boolean information which is true if the access
 * point is hidden
 */
void printNetworkInformations(const String &SSID, uint8_t* BSSID,
                              int32_t RSSI, int32_t channel,
                              uint8_t encryptionType = -1, bool isHidden = false) {
  Serial.printf("=> %s (%ddBm) <%s> on channel %d> [%s, %s] \n",
                SSID.c_str(),
                RSSI,
                byteArray2String(BSSID).c_str(),
                channel,
                (isHidden ? "Hidden" : "Visible"),
                EncryptionType2Cstr(encryptionType));
}

/**
 * Assuming a network scan has detected n (>= 0) WiFi networks, prints
 * the network infromations on serial output.
 *
 * \param n the number of available WiFi networks.
 */
void printNetworks(int n) {
  if (n == 0) {
    Serial.println("No Networks Found");
  } else {
    Serial.printf("Found %d networks:\n", n);
    for (int i = 0; i < n; ++i) {
      String SSID;
      uint8_t* BSSID;
      int32_t RSSI;
      int32_t channel;
      uint8_t encryptionType;
      bool isHidden;
      WiFi.getNetworkInfo(i, SSID, encryptionType, RSSI, BSSID, channel, isHidden);
      Serial.printf("- %2d: ", i + 1);
      printNetworkInformations(SSID, BSSID, RSSI, channel, encryptionType, isHidden);
    }
  }
  Serial.println("");
}


/**
 * Node initialisation.
 *
 * The node is not connected to any network and is not accessible
 * either.
 */
void setup() {
  Serial.begin(115200);
  while (!Serial) {
    delay(10);
  }
#ifdef DEBUG_ESP_PORT
  DEBUG_ESP_PORT.setDebugOutput(true);
#endif
  Serial.println("");
  Serial.flush();
  Serial.println("[Initialization startup]");

  // Set WiFi to station mode and disconnect from an AP if it was previously connected
  pinMode(LED_PIN, OUTPUT);
  WiFi.setPhyMode(WIFI_PHY_MODE_11N);
  WiFi.persistent(false);
  WiFi.disconnect(true); //ESP has tendency to store old SSID and password and tries to connect
  WiFi.softAPdisconnect(true);
  WiFi.mode(THIS_ESP_MODE);
  delay(100);
  WiFi.printDiag(Serial);
  Serial.println(WiFi.macAddress());

#if ESP_MODE & ESP_MODE_STA
  StaConnectedEventHandler               = WiFi.onStationModeConnected(onStaConnectedCallback);
  StaDisconnectedEventHandler            = WiFi.onStationModeDisconnected(onStaDisconnectedCallback);
  StaAuthModeChangedEventHandler         = WiFi.onStationModeAuthModeChanged(onStaAuthModeChangedCallback);
  StaModeGotIPEventHandler               = WiFi.onStationModeGotIP(onStaModeGotIPCallback);
  StaDhcpTimeoutEventHandler             = WiFi.onStationModeDHCPTimeout(onStaDhcpTimeoutCallback);
#endif
#if ESP_MODE & ESP_MODE_AP
  SoftApConnectedEventHandler            = WiFi.onSoftAPModeStationConnected(onSoftApConnectedCallback);
  SoftApDisconnectedEventHandler         = WiFi.onSoftAPModeStationDisconnected(onSoftApDisconnectedCallback);
  SoftApProbeRequestReceivedEventHandler = WiFi.onSoftAPModeProbeRequestReceived(onSoftApProbeRequestReceivedCallback);
#endif
  WiFiModeChangeEventHandler             = WiFi.onWiFiModeChange(onWiFiModeChangeCallback);

  digitalWrite(LED_PIN, LED_OFF);
  Serial.println("[The ESP WiFi Network Scanner is Started]\n");
#if ESP_MODE & ESP_MODE_AP
  WiFi.softAP(ESP_SSID, ESP_password);
#endif
#if ESP_MODE & ESP_MODE_STA
  WiFi.begin(WIFI_SSID, WIFI_password);
#endif
}

/**
 * The node constinuously scans for available networks, then prints
 * the networks informations. Between two actions, it sleeps for 5
 * seconds.
 *
 * The builtin led is on during the scanning/printing only (it is off
 * while sleeping).
 */
void loop() {

  int _delay = 15000;
  unsigned long int now = millis();
  digitalWrite(LED_PIN, LED_ON);
  DEBUG_MSG("[Waking up...]\n");

  int n = 0;
  if (last_connection_state != CONNECTING_STATE) {
    // Checking for network scan status
    n = WiFi.scanComplete();
    switch (n) {
    case WIFI_SCAN_FAILED: // No scan is running
      if (now - last_scan_time > 5000) {
        // No previous scan has been done or it is more than 5s older.
        Serial.println("[Starting WiFi Network Scan]");
        WiFi.scanNetworks(true /* asynchronous scan */,
                          true /* show hidden networks */);
      }
      break;
    case WIFI_SCAN_RUNNING:
      Serial.println("[WiFi Network Scan in progress]");
      break;
    default:
      printNetworks(n);
      WiFi.scanDelete();
      last_scan_time = now;
      WiFi.scanDelete();
    }
    yield();
  }

#if ESP_MODE & ESP_MODE_STA
  if (n >= 0) { // No scan is launched nor running
    wl_status_t s = WiFi.status();

    switch (s) {
    case WL_CONNECTED:
      if (last_connection_state != CONNECTED_STATE) {
        Serial.printf("[Connected to '%s' access point]\n", WIFI_SSID);
        printNetworkInformations(WiFi.SSID(), WiFi.BSSID(),
                                 WiFi.RSSI(), WiFi.channel());
        last_connection_state = CONNECTED_STATE;
        WiFi.printDiag(Serial);
        Serial.println(WiFi.localIP());
      }
      _delay = 500;
      data[data_index++] = WiFi.RSSI();
      data_index %= DATA_SIZE;
      printData();
      break;
    case WL_NO_SSID_AVAIL:
      if (last_connection_state != NOT_CONNECTED_STATE) {
        Serial.printf("[The '%s' access point isn't available]\n", WIFI_SSID);
        last_connection_state = NOT_CONNECTED_STATE;
        break;
      }
      [[fallthrough]];
    case WL_WRONG_PASSWORD:
    case WL_CONNECT_FAILED:
      if (last_connection_state != NOT_CONNECTED_STATE) {
        Serial.printf("[Wrong password for '%s' access point]\n", WIFI_SSID);
        last_connection_state = NOT_CONNECTED_STATE;
        break;
      }
      [[fallthrough]];
    case WL_IDLE_STATUS:
      if (last_connection_state != NOT_CONNECTED_STATE) {
        Serial.printf("[Current WiFi Status is IDLE for '%s' access point]\n", WIFI_SSID);
        last_connection_state = NOT_CONNECTED_STATE;
      }
      [[fallthrough]];
    case WL_CONNECTION_LOST:
    case WL_DISCONNECTED:
      switch (last_connection_state) {
      case NOT_CONNECTED_STATE:
        Serial.printf("[Current node is not connected to '%s' access point]\n", WIFI_SSID);
        Serial.printf("[Trying to connect to access point '%s']\n", WIFI_SSID);
        WiFi.begin(WIFI_SSID, WIFI_password);
        break;
      case CONNECTING_STATE:
        Serial.printf("[Still connecting to '%s' access point...]\n", WIFI_SSID);
        break;
      case CONNECTED_STATE:
        Serial.printf("[Connecting to '%s' access point lost]\n", WIFI_SSID);
        //WiFi.reconnect();
        break;
      }
      last_connection_state = CONNECTING_STATE;
    default:
      break;
    }
    yield();
  }
#endif
  DEBUG_MSG("[Sleeping]\n");
  digitalWrite(LED_PIN, LED_OFF);
  delay(_delay);
}


// Local Variables:
// mode: c++
// End:
