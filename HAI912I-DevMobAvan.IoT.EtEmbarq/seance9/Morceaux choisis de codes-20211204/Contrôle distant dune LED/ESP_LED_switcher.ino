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


// Replace with your network credentials
const char *ESP_SSID = "This ESP AP";
const char *ESP_password = "S1mpl3Passw0rdT00";
const int ESP_port = 5555;

// Set web server
WiFiServer server(ESP_port);

bool led_status = false;

unsigned long int last_time = 0;
#define TIMEOUT_DELAY 2000

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

  pinMode(LED_PIN, OUTPUT);
  WiFi.setPhyMode(WIFI_PHY_MODE_11N);
  WiFi.persistent(false);
  WiFi.disconnect(true); //ESP has tendency to store old SSID and password and tries to connect
  WiFi.softAPdisconnect(true);
  WiFi.mode(WIFI_AP);
  delay(100);
  WiFi.printDiag(Serial);
  Serial.println(WiFi.macAddress());

  WiFi.softAP(ESP_SSID, ESP_password);
  digitalWrite(LED_PIN, LED_OFF);
  led_status = false;
  server.begin();
  Serial.println("[The ESP Switcher is Started]\n");
}

String HtmlButton(const String &action, bool enabled, const String &label = "") {
  String _label = label;
  if (_label.isEmpty()) {
    _label = action;
    _label.toUpperCase();
  }
  String html_code = "<p>";
  html_code += "<button class=\"button ";
  html_code += (enabled ? "enabled" : "disabled");
  html_code += "\">";
  html_code += "<a href=\"/LED/" + action + "\">";
  html_code += _label;
  html_code += "</a>";
  html_code += "</button>";
  html_code += "</p>";
  return html_code;
}

void loop(){
  WiFiClient client = server.available();   // Listen for incoming clients
  String currentLine = "";
  String header = "";

  if (client) {                             // If a new client connects,
    long unsigned int now = millis();
    last_time = now;
    DEBUG_MSG("New Client.\n");
    String data = "";                // make a String to hold incoming data from the client
    while (client.connected() && ((now - last_time) <= TIMEOUT_DELAY)) {
      now = millis();
      if (client.available()) {             // if there's bytes to read from the client,
        char c = client.read();             // read a byte, then
        Serial.print(c);
        header += c;
        if (c == '\n') {                    // if the byte is a newline character
          // if the current line is blank, you got two newline characters in a row.
          // that's the end of the client HTTP request, so send a response:
          if (currentLine.length() == 0) {
            // HTTP headers always start with a response code (e.g. HTTP/1.1 200 OK)
            // and a content-type so the client knows what's coming, then a blank line:
            client.println("HTTP/1.1 200 OK");
            client.println("Content-type:text/html");
            client.println("Connection: close");
            client.println();
            
            // switch the LED on or off
            if (header.indexOf("GET /LED/on") >= 0) {
              DEBUG_MSG("Switch LED on\n");
              led_status = true;
              digitalWrite(LED_PIN, LED_ON);
            } else if (header.indexOf("GET /LED/off") >= 0) {
              DEBUG_MSG("Switch LED off\n");
              led_status = false;
              digitalWrite(LED_PIN, LED_OFF);
            } else if (header.indexOf("GET /LED/toggle") >= 0) {
              DEBUG_MSG("Toggle LED\n");
              led_status = !led_status;
              digitalWrite(LED_PIN, led_status ? LED_ON : LED_OFF);
            }
            
            // Display the HTML web page
            client.println("<!DOCTYPE html><html>");
            client.println("<head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
            client.println("<link rel=\"icon\" href=\"data:,\">");
            client.println("<style>");
            client.println("html { font-family: Helvetica; display: inline-block; margin: 0px auto; text-align: center;}");
            client.println(".button { border: none; color: white; background-color: black; padding: 16px 40px; text-decoration: none; font-size: 30px; margin: 2px; cursor: pointer;}");
            client.println(".enabled {background-color: #33AA33;}");
            client.println(".disabled {pointer-events: none; cursor: not-allowed; background-color: #AA9999;}");
            client.println("</style></head>");
            
            // Web Page Heading
            client.println("<body><h1>ESP8266 LED switcher</h1>");
            
            // Display current state, and ON/OFF buttons for the builtin LED   
            client.println(String("<p>LED State ") + (led_status ? "On" : "Off") + "</p>");
            client.println(HtmlButton("on", !led_status));
            client.println(HtmlButton("off", led_status));
            client.println(HtmlButton("toggle", true, "Toggle"));               
            client.println("</body></html>");
            
            // The HTTP response ends with another blank line
            client.println();
            // Break out of the while loop
            break;
          } else { // if you got a newline, then clear currentLine
            currentLine = "";
          }
        } else if (c != '\r') {  // if you got anything else but a carriage return character,
          currentLine += c;      // add it to the end of the currentLine
        }
      }
    }
    // Clear the header variable
    header = "";
    // Close the connection
    client.stop();
    DEBUG_MSG("Client disconnected.\n\n");
  }
}

// Local Variables:
// mode: c++
// End:
