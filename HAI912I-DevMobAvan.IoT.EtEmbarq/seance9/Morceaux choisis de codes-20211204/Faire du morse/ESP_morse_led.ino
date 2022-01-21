#include "Arduino.h"

#define MORSE_PIN LED_BUILTIN
#define MORSE_ON LOW
#define MORSE_OFF HIGH

#ifdef DEBUG
#  define DEBUG_MSG(...) Serial.printf(__VA_ARGS__)
#else
#  define DEBUG_MSG(...) (void) 0
#endif

#define DOT_DELAY 50
#define DOT_SYMBOL '.'
#define DASH_SYMBOL '-'
#define LETTER_SEPARATOR '/'
#define WORD_SEPARATOR ' '


const char * get_morse_code(const char c) {
  char _c = toupper(c);
  switch (_c) {
    case 'A': return ".-";
    case 'B': return "-...";
    case 'C': return "-.-.";
    case 'D': return "-..";
    case 'E': return ".";
    case 'F': return "..-.";
    case 'G': return "--.";
    case 'H': return "....";
    case 'I': return "..";
    case 'J': return ".---";
    case 'K': return "-.-";
    case 'L': return ".-..";
    case 'M': return "--";
    case 'N': return "-.";
    case 'O': return "---";
    case 'P': return ".--.";
    case 'Q': return "--.-";
    case 'R': return ".-.";
    case 'S': return "...";
    case 'T': return "-";
    case 'U': return "..-";
    case 'V': return "...-";
    case 'W': return ".--";
    case 'X': return "-..-";
    case 'Y': return "-.--";
    case 'Z': return "--..";
    case '0': return "-----";
    case '1': return ".----";
    case '2': return "..---";
    case '3': return "...--";
    case '4': return "....-";
    case '5': return ".....";
    case '6': return "-....";
    case '7': return "--...";
    case '8': return "---..";
    case '9': return "----.";
    default:
    DEBUG_MSG("Character '%c' not handled", c);
  }
  return " ";
}

short int duree(const char c) {
  switch(c) {
    case DOT_SYMBOL: return DOT_DELAY;
    case DASH_SYMBOL: return 3*DOT_DELAY;
    case LETTER_SEPARATOR: return 2*DOT_DELAY; /* +1 but already added after previous symbol */
    case WORD_SEPARATOR: return 6*DOT_DELAY; /* +1 but already added after previous symbol */
  }
  return 0;
}


void separator_to_led(const char c) {
  short int _d = duree(c);
  DEBUG_MSG("[SEPARATOR:%c=>%d]\n", c, _d);
  digitalWrite(MORSE_PIN, MORSE_OFF);
  delay(_d);
}


void letter_morse_code_to_led(const char c) {
  if ((c != DOT_SYMBOL) && (c != DASH_SYMBOL)) {
    return;
  }
  short int _d = duree(c);
  DEBUG_MSG(":%d", _d);
  digitalWrite(MORSE_PIN, MORSE_ON);
  delay(_d);
  digitalWrite(MORSE_PIN, MORSE_OFF);
  DEBUG_MSG(".");
  delay(DOT_DELAY);
}

void morse_code_to_led(const char * msg) {
  if (!msg) {
    return;
  }
  while (*msg != '\0') {
    DEBUG_MSG(" [%c]", *msg);
    letter_morse_code_to_led(*msg);
    ++msg;
  }
  DEBUG_MSG("\n");
}

void str_to_morse(const char * msg) {
  if (!msg) {
    return;
  }
  DEBUG_MSG("Start of '%s' encoding\n", msg);
  const char *prec = NULL;
  while (*msg != '\0') {
    if (prec) {
      if (*prec == ' ') {
        DEBUG_MSG("WORD SEPARATION\n");
        separator_to_led(WORD_SEPARATOR);
      } else {
        DEBUG_MSG("LETTER SEPARATION\n");
        separator_to_led(LETTER_SEPARATOR);
      }
    }
    const char *morse_code_str = get_morse_code(*msg);
    DEBUG_MSG("Morse code of '%c' is '%s'\n", *msg, morse_code_str);
    morse_code_to_led(morse_code_str);
    prec = msg++;
  }
  DEBUG_MSG("End of '%s' encoding\n", msg);
}

// the setup function runs once when you press reset or power the board
void setup() {
  Serial.begin(115200);
  while (!Serial) {
    delay(10);
  }
  DEBUG_MSG("\n***************** Starting Initialisation *******************\n");
  int br = Serial.baudRate();
  DEBUG_MSG("Serial is %d bps", br);
  // initialize digital pin MORSE_PIN as an output.
  pinMode(MORSE_PIN, OUTPUT);
  DEBUG_MSG("\n***************** Initialisation done *****************\n");
  delay(2000);
  str_to_morse("ESP is Ready");
}


// the loop function runs over and over again forever
void loop() {
  delay(5000);
  str_to_morse("SOS");
  delay(5000);
  str_to_morse("Hello World");
  delay(5000);
  str_to_morse("That's All Folks!!!");
}

// Local Variables:
// mode: c++
// End:
