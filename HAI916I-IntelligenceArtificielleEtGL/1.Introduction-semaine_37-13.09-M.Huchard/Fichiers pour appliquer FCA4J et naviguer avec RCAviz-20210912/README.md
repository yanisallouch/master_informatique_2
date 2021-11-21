FCA4J:  https://www.lirmm.fr/fca4j/

RCAviz : https://info-demo.lirmm.fr/rcaviz/
Quand vous parvenez sur l'interface, chargez Animals11.json

# TP Prise en main

GET STARTED WITH FCA4J

In this document, you will find the command lines to produce various FCA artifacts for ‘animals11’ example.
This example is a description of 10 animals by 11 attributes.

The following artifacts will be built:
- Concept lattice
- Iceberg50
- AOCposet
- Duquenne-Guigues Basis of Implications (DGBI)

- Irreducible elements
- A clarified and reduced formal context (and its concept lattice and AOCposet)

STEP 0- Download files fca4j-cli-0.4.jar and Animals11.csv at https://www.lirmm.fr/fca4j/ 

STEP 1- Assume fca4j-cli-0.4.jar is in current Directory ‘./‘

STEP 2- Create directory ./Animals11 

mkdir ./Animals11


Assume Animals11.csv in Directory ‘./Animals11/‘

STEP 3- How to build the Concept Lattice
Create directory ./Animals11/Lattice 

mkdir ./Animals11/Lattice


Launch fca4j 

java -jar fca4j-cli-0.4.jar LATTICE Animals11/Animals11.csv -i CSV -s SEMICOLON -g Animals11/Lattice/Animals11.dot


This builds Animals11.dot, a textual graph view of the simplified concept lattice with algorithm ADD_EXTENT
Produce a pdf view of the lattice, Graphviz 

https://graphviz.org/) has to be installed (dot -Tpdf Animals11/Lattice/Animals11.dot -o Animals11/Lattice/Animals11.pdf



STEP 4- How to build the Iceberg50 Lattice

Create directory ./Animals11/Iceberg50 

mkdir ./Animals11/Iceberg50


Launch fca4j 

java -jar fca4j-cli-0.4.jar LATTICE -a ICEBERG Animals11/Animals11.csv -p 50 -i CSV -s SEMICOLON -g Animals11/Iceberg50/Animals11iceberg.dot


Produce a pdf view of the iceberg lattice 

dot -Tpdf Animals11/Iceberg50/Animals11iceberg.dot -o Animals11/Iceberg50/Animals11iceberg50.pdf



STEP 5- How to build the AOCposet

Create directory ./Animals11/AOCposet 

mkdir ./Animals11/AOCposet


Launch fca4j 

java -jar fca4j-cli-0.4.jar AOCPOSET Animals11/Animals11.csv -i CSV -s SEMICOLON -g Animals11/AOCposet/Animals11aocposet.dot


Produce a pdf view of the AOCposet 

dot -Tpdf Animals11/AOCposet/Animals11aocposet.dot -o Animals11/AOCposet/AOCposet.pdf



STEP 6- How to compute the Duquennes-Guigues basis of Implications 

DGBI

; rules will be stored by support in different TXT files

Create directory ./Animals11/DGBI 

mkdir ./Animals11/DGBI


Launch fca4j  

java -jar fca4j-cli-0.4.jar RULEBASIS Animals11/Animals11.csv -i CSV -s SEMICOLON -folder ./Animals11/DGBI/



STEP 7- How to compute the irreducible objects

Launch fca4j  

java -jar fca4j-cli-0.4.jar IRREDUCIBLE Animals11/Animals11.csv -lobj -u -i CSV -s SEMICOLON Animals11/animals11irrobjs.txt



STEP 8- How to compute the irreducible attributes

Launch fca4j  

java -jar fca4j-cli-0.4.jar IRREDUCIBLE Animals11/Animals11.csv -lattr -u -i CSV -s SEMICOLON Animals11/animals11irrattrs.txt



STEP 9- How to clarify the formal context along objects and attributes

Launch fca4j 

java -jar fca4j-cli-0.4.jar CLARIFY Animals11/Animals11.csv -xa -xo -i CSV -s SEMICOLON Animals11/Animals11clarified.csv



STEP 10- How to reduce the formal context 

Launch fca4j 

java -jar fca4j-cli-0.4.jar REDUCE Animals11/Animals11.csv -xa -xo -u -i CSV -s SEMICOLON Animals11/Animals11clarifiedreduced.csv



STEP 11- How to obtain the concept lattice and the AOCposet of the reduced animals11 example

Create directory ./Animals11/Reduced 

mkdir ./Animals11/Reduced


Create directory ./Animals11/Reduced/Lattice 

mkdir ./Animals11/Reduced/Lattice


Create directory ./Animals11/Reduced/AOCposet 

mkdir ./Animals11/Reduced/AOCposet


Launch fca4j 

java -jar fca4j-cli-0.4.jar LATTICE Animals11/Animals11clarifiedreduced.csv -i CSV -s SEMICOLON -g Animals11/Reduced/Lattice/Animals11clarifiedreduced.dot


Produce pdf view 

dot -Tpdf Animals11/Reduced/Lattice/Animals11clarifiedreduced.dot -o Animals11/Reduced/Lattice/Animals11clarifiedreduced.pdf


Launch fca4j 

java -jar fca4j-cli-0.4.jar AOCPOSET Animals11/Animals11clarifiedreduced.csv -i CSV -s SEMICOLON -g Animals11/Reduced/AOCposet/Animals11clarifiedreduced.dot


Produce pdf view 

dot -Tpdf Animals11/Reduced/AOCposet/Animals11clarifiedreduced.dot -o Animals11/Reduced/AOCposet/Animals11clarifiedreduced.pdf

dot -Tpdf Animals11/Reduced/Lattice/Animals11clarifiedreduced.dot -o Animals11/Reduced/Lattice/Animals11clarifiedreduced.pdf