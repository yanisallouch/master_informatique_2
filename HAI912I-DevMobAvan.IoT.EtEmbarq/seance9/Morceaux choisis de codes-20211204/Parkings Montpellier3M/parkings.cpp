#include "parkings.h"
#include <iostream>
#include <cstdio>

using namespace std;


// Données de géolocalisation : https://data.montpellier3m.fr/dataset/parkings-en-ouvrage-de-montpellier
// Identifants : https://data.montpellier3m.fr/dataset/disponibilite-des-places-dans-les-parkings-de-montpellier-mediterranee-metropole
const parking_t parkings[] = {
                             /* ID,           name,                      longitude,         latitude */
                             { "FR_MTP_ANTI",  "Antigone",                   3.888818930000000, 43.608716059999999 },
                             { "FR_MTP_COME",  "Comédie",                    3.879761960000000, 43.608560920000002 },
                             { "FR_MTP_CORU",  "Corum",                      3.882257730000000, 43.613888209999999 },
                             { "FR_MTP_EURO",  "Europa",                     3.892530740000000, 43.607849710000004 },
                             { "FR_MTP_FOCH",  "Foch Préfecture",            3.876570840000000, 43.610749120000001 },
                             { "FR_MTP_GAMB",  "Gambetta",                   3.871374360000000, 43.606951379999998 },
                             { "FR_MTP_GARE",  "Saint Roch",                 3.878550720000000, 43.603291489999997 },
                             { "FR_MTP_TRIA",  "Triangle",                   3.881844180000000, 43.609233840000002 },
                             { "FR_MTP_ARCT",  "Arc de Triomphe",            3.873200750000000, 43.611002669999998 },
                             { "FR_MTP_PITO",  "Pitot",                      3.870191170000000, 43.612244939999997 },
                             { "FR_MTP_CIRC",  "Circé Odysseum",             3.917849500000000, 43.604953770000002 },
                             { "FR_MTP_SABI",  "Sabines",                    3.860224600000000, 43.583832630000003 },
                             { "FR_MTP_GARC",  "Garcia Lorca",               3.890715800000000, 43.590985089999997 },
                             { "FR_CAS_SABL",  "Notre Dame de Sablassou",    3.922295360000000, 43.634191940000001 },
                             { "FR_MTP_MOSS",  "Mosson",                     3.819665540000000, 43.616237159999997 },
                             { "FR_STJ_SJLC",  "Saint-Jean-le-Sec",          3.837931200000000, 43.570822249999999 },
                             { "FR_MTP_MEDC",  "Euromédecine",               3.827723650000000, 43.638953590000000 },
                             { "FR_MTP_OCCI",  "Occitanie",                  3.848597960000000, 43.634562320000001 },
                             { "FR_CAS_CDGA",  "Charles de Gaulle",          3.897762100000000, 43.628542119999999 },
                             { "FR_MTP_ARCE",  "Arceaux",                    3.867490670000000, 43.611716469999998 },
                             { "FR_MTP_POLY",  "Polygone",                   3.884765390000000, 43.608370960000002 },
                             { "FR_MTP_GA109", "Multiplexe (est)",           3.918980000000000, 43.605060000000000 },
                             { "FR_MTP_GA250", "Multiplexe (ouest)",         3.914030000000000, 43.604000000000000 },
                             // Les parkings ci-après n'ont pas de données temps réel sur le site de Montpellier 3M
                             { 0,              "Peyrou",                     3.870383780000000, 43.611297000000000 },
                             { 0,              "Hôtel de ville",             3.895853270000000, 43.599231000000003 },
                             { 0,              "Jacou",                      3.912884750000000, 43.654598700000001 },
                             { 0,              "Georges Pompidou",           3.921084190000000, 43.649339200000000 },
                             { 0,              "Via Domitia",                3.929538080000000, 43.646658010000003 },
                             { 0,              "Juvignac",                   3.809621860000000, 43.617403740000000 },
                             { 0,              "Saint-Jean-de-Védas Centre", 3.830585520000000, 43.574962790000001 },
                             { 0,              "Lattes",                     3.904817620000000, 43.570809879999999 },
                             { 0,              "Parc expo",                  3.945678520000000, 43.572910210000003 },
                             { 0,              "Pérols centre",              3.957355560000000, 43.565378570000000 },
                             { 0,              "Décathlon",                  3.923800380000000, 43.606185590000003 },
                             { 0,              "Ikéa",                       3.925582560000000, 43.604609619999998 },
                             { 0,              "Géant Casino",               3.922104130000000, 43.603155600000001 },
                             { 0,              "Mare Nostrum",               3.919015140000000, 43.602370800000003 },
                             { 0,              "Végapolis",                  3.914773710000000, 43.602896510000001 },
                             { 0,              "Multiplexe",                 3.914110760000000, 43.604152429999999 },
                             { 0,              "La Mantilla",                3.902399940000000, 43.598772959999998 },
                             { 0, 0, 0, 0 }
};


#define MONTPELLIER3M_BASE_URL "https://data.montpellier3m.fr/"
#define MONTPELLIER3M_API_PATH_PREFIX "sites/default/files/ressources/"
#define MONTPELLIER3M_API_PATH_SUFFIX ".xml"

string _buildURL(const char *id) {
  string res = MONTPELLIER3M_BASE_URL MONTPELLIER3M_API_PATH_PREFIX;
  res += id;
  res += MONTPELLIER3M_API_PATH_SUFFIX;
  return res;
}

// Very quick and dirty XML parsing
string _getXmlValue(const string &line, const string &tag) {
  string res = "";
  size_t b1 = line.find_first_of('<');
  if (b1 != string::npos) {
    size_t e1 = line.find_first_of('>', b1);
    if ((e1 != string::npos) && (e1 - b1 - 1 == tag.length()) && !line.compare(b1 + 1, e1 - b1 - 1, tag)) {
      size_t e2 = line.find_last_of('>');
      if (e2 != string::npos) {
        size_t b2 = line.find_last_of('<', e2);
        if ((b2 != string::npos) && (e2 - b2 - 1 == (tag.length() + 1))
            && (line[b2 + 1] == '/') && !line.compare(b2 + 2, e2 - b2 - 2, tag)) {
          res = line.substr(e1 + 1, b2 - e1 - 1);
        }
      }
    }
  }
  return res;
}

bool getParkingInformations(const char *id, parking_data_t &data) {
  string cmd = "curl --silent ";
  char buffer[128];
  buffer[127] = '\0';
  cmd += _buildURL(id);
  // Not a good practice, but it is for demonstration purpose
  FILE *fd = popen(cmd.c_str(), "r");
  if (!fd) {
    return false;
  }
  while (!feof(fd)) {
    if (fgets(buffer, 127, fd)) {
      string l = _getXmlValue(buffer, "DateTime");
      if (!l.empty()) {
        data.date_time = l;
      } else {
        l = _getXmlValue(buffer, "Status");
        if (!l.empty()) {
          data.open = (l == "Open");
        } else {
          l = _getXmlValue(buffer, "Free");
          if (!l.empty()) {
            data.free = stoi(l);
          } else {
            l = _getXmlValue(buffer, "Total");
            if (!l.empty()) {
              data.total = stoi(l);
            }
          }
        }
      }
    }
  }
  pclose(fd);
  return true;
}

#ifdef __TEST_PARKINGS_LOCALISATIONS__

#include <iostream>
#include <cmath>
#include <libgen.h>

float distance(float x1, float y1, float x2, float y2) {
  return sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
}

int main(int argc, char **argv) {

  float X = 43.5;
  float Y = 3.6;
  if (argc > 2) {
    X = atof(argv[1]);
    Y = atof(argv[2]);
  } else {
    cerr << endl
         << "You can specifiy longitude and latitudes to compute the distance "
         << "(in degrees -- do not convert into kilometers!!!) to each parking."
         << endl << endl
         << "usage: " << basename(argv[0]) << " [long lat]"
         << endl << endl;
  }


  const parking_t *ptr = parkings;
  cout << "Iterate over parkings having an id" << endl;
  while (ptr->id) {
    parking_data_t data;
    cout << "Parking '" << ptr->name << "'"
         << " (ID: " << ptr->id << ")"
         << " at " << ptr->longitude << "x" << ptr->latitude
         << endl;
    if (getParkingInformations(ptr->id, data)) {
      cout << "- Last update: " << data.date_time << endl
           << "- status: " << (data.open ? "Open": "Closed") << endl
           << "- Occupency: " << data.free << "/" << data.total << endl;
    } else {
      cout << "[Unable to grab parking informations]" << endl;
    }
    ++ptr;
  }
  cout << endl;

  ptr = parkings;
  cout << "Iterate over parkings having a name" << endl;
  while (ptr->name) {
    cout << "Parking '" << ptr->name << "'";
    if (ptr->id) {
      cout << " (ID: " << ptr->id << ")";
    }
    cout << " at " << ptr->longitude << "x" << ptr->latitude
         << endl
         << "Distance is "
         << distance(X, Y, ptr->longitude, ptr->latitude)
         << endl;
    ++ptr;
  }
  cout << endl;
  cout << "That's all, Folks!!!" << endl << endl;

  return 0;

}
#endif
