#ifndef __PARKINGS_H__
#define __PARKINGS_H__

#include <ctime>
#include <string>

/**
 * A parking is identified by a string ID, has a name, a longitude and
 * a latitude.
 *
 * The parking ID is the string used to identify the parking on
 * https://data.montpellier3m.fr/dataset/disponibilite-des-places-dans-les-parkings-de-montpellier-mediterranee-metropole
 * If the parking is not elligible for the service, then the ID is the
 * NULL C string.
 */

typedef struct {
  const char * id;
  const char * name;
  float longitude;
  float latitude;
} parking_t;

/**
 * The array containing parking descriptions.
 *
 * It can be iterated using the id attribute to enumerate parkings
 * that can be queried for their free places (by ending the
 * enumeration when the current parking id attribute is NULL) or by
 * the name attribute to include also parkings (by ending the
 * enumeration when the current parking * name attribute is NULL).
 */
extern const parking_t parkings[];

/**
 * Structure to handle available informations on parkings available
 * through the Montpellier3M open-data services.
 */ 
typedef struct {
  std::string date_time;
  bool open;
  unsigned int free;
  unsigned int total;
} parking_data_t;

/**
 * Retrieve informations for the given parking and store them in the
 * given parking_data_t structure.
 *
 * \return The function returns true if data are suceesfully retrieved
 * and false otherwise.
 */
bool getParkingInformations(const char *id, parking_data_t &data);

#endif
