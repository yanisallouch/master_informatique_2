

# Spécialité [Génie Logiciel](https://formations.umontpellier.fr/fr/formations/master-XB/master-informatique-ME154/genie-logiciel-PR476/m2-genie-logiciel-KMAH9BWB.html)

[https://informatique-fds.edu.umontpellier.fr/etudiants/offre-de-formation-lmd5/parcours-gl-genie-logiciel/](https://informatique-fds.edu.umontpellier.fr/etudiants/offre-de-formation-lmd5/parcours-gl-genie-logiciel/)

Description récupérée du LMD4, lorsque le parcours se nommait AIGLE.

*	Conception et développement d’architectures logicielles

	-	architectures orientées services
	-	architectures web
	-	urbanisation (architectures des systèmes d’informations)

*	Maîtrise de la conception et du développement par objets
*	Maîtrise des technologies web
*	Maîtrise de l’informatique embarquée (pour mobiles...)

#	Template de présentation d'un module

##	[Code - Intitulé](./README.md)
###	[Professeur 1](http://www.lirmm.fr/) et [Professeur 2](http://www.lirmm.fr/) et ...

- les gros titres
- du cours avec 
- des redirections
-  si possibles

###	Bibliographie :

- si présent ajouté une bibliographie

<hr>

#	Présentation des modules

##	[HAI933I - Théorie des bases de données et de connaissances](./HAI933I-TheorieBDD)
###	[Marie-Laure MUGNIER (Univ. Montpellier)](http://www.lirmm.fr/~mugnier/) et [Jean-François BAGET (Inria)](http://www.lirmm.fr/~baget/)

1. Introduction
2. Fragment existentiel conjonctif : faits et requêtes conjonctives
3. Bases de connaissances : où l'on ajoute des règles et des contraintes
4. OWA / CWA : négation classique et négation par défaut
5. Règles existentielles
6. Answer Set Programming (ASP)

##	[HAI919I - Ingénierie des modèles](./HAI919I-IngenierieModeles)
###	[Clémentine Nebut](https://www.lirmm.fr/users/utilisateurs-lirmm/clementine-nebut) et [Marianne Huchard](https://www.lirmm.fr/users/utilisateurs-lirmm/marianne-huchard)

1. Introduction : modèles et métamodèles
2. Transformations de modèles
3. Le méta-modèle UML - 29/09 - 14H
4. OCL (10 et 17 novembre)
5. Syntaxe textuelle et XText
6. Syntaxes graphiques avec Sirius

###	Bibliographie :

* Combemale, Benoit, Robert France, Jean-Marc Jézéquel, Bernhard Rumpe, James Steel, and Didier Vojtisek. Engineering modeling languages: Turning domain knowledge into tools. CRC Press, 2016.
* Jézéquel, Jean-Marc, Benoit Combemale, and Didier Vojtisek. Ingénierie Dirigée par les Modèles: des concepts à la pratique... Ellipses, 2012. (Preprint version HAL)


##	[HAI934I - Vérification automatique de programmes](./HAI934I-VerificationAutoProgramme)
###	[Delahaye David](http://www.lirmm.fr/~delahaye/) et [Iampietro Vincent](http://www.lirmm.fr/~viampietro/)

1. Introduction

##	[HAI916I - Intelligence Artificielle et Génie Logiciel](./HAI916I-IntelligenceArtificielleEtGL)
###	[Marianne Huchard](https://www.lirmm.fr/users/utilisateurs-lirmm/marianne-huchard)

- Introduction IA et GL : qu’est-ce que l’IA, l'apprentissage, grandes directions en IA symbolique et sous-symbolique. Pointeurs vers des outils d'IA. Exemples de situations en génie logiciel. Introduction à l'Analyse formelle de concepts
- Analyse formelle de concepts et analyse de la variabilité. Construction de Feature Models à partir de structures conceptuelles
- Programmation par contraintes pour la génération de tests (1ere partie)
- Apprentissage automatique par analyse du code
- Programmation par contraintes pour la génération de tests (2e partie)
- Fouille de données pour la localisation de fautes (1ere partie)
- Fouille de données pour la localisation de fautes (2e partie)
- Analyse de la contribution architecturale dans les projets OS. Données GitHub, calcul de métrique, analyse statistique des résultats, interprétation (choix des visualisations adaptées)
- Classification de tickets dans les Issue Tracking Systems : distinction bug / non bug. Données issues d'IST (Jira), techniques de NLP (TF-IDF), classification supervisée, réseaux de neurones, évaluation (signification des écarts statistiques avec l'état de l'art)
- Clustering, q-learning pour la restructuration et la modernisation
- Analyse relationnelle de concepts et analyse de la variabilité logicielle par séparation des préoccupations
- Utilisation des métaheuristiques en GL

##	[HAI914I - Gestion des données au delà de SQL (NoSQL)](./HAI914I-GestionDonneesNoSQL)
###	[Isabelle Mougenot](https://fr.linkedin.com/in/isabelle-mougenot-596a2548) [Federico Ulliana](http://www.lirmm.fr/~ulliana/)

Exploration de différentes familles de systèmes NoSQL :

- Graphe : Neo4J
- KG : triplestore (langages web s´emantique)
- Outil de mapping objet/relationnel Hibernate
- Document : CouchDB
- Colonne : Hbase
- Principes généraux : limites du relationnel, scalabilité, distribution, principe CAP, paradigme Map-Reduce

##	[HAI931I - Systèmes Réflexifs et Models@runtime](./HAI931I-SystemesReflexifsModels@runtime)
###	[Christophe Dony](http://www.lirmm.fr/~dony/)

But : Utilisation et Construction de Langages Réflexifs autorisant la Méta-Programmation. (#meta-programming #dynamic adaptability #model@runtime)

1. Définitions : modèles, méta-modèles, réflexivité, méta-programmation,
2. Utilisation de systèmes réflexifs
	- contexte du developpement par objet.
	1. Méta-Programmation, Utilisation de méta-objets (Smalltalk, Clos, ... Ruby, Pharo, Python, ...), pour interroger ou manipuler :
		- tout ou partie des modèles (par exemple les classes, les hiérarchies de classes, les attributs, les méthodes),
		- tout ou partie de la machinerie d'exécution des programmes (par exemple le compilateur, la pile d'exécution).
	2. Réalisation de méta-modèles exécutables avec MOF/Eclipse (voir models@runtime) ...
3. Construction de systèmes réflexifs
	1. Intégration de méta-classes explicites dans un langage à objets, avec son bootsrap.
	2. construction d'un interpréteur méta-circulaire
	3. Construction d'un interpréteur méta-circulaire réflexif
4. Projets Etudiants - Exploration ouverte multi-langages et multi-thématique