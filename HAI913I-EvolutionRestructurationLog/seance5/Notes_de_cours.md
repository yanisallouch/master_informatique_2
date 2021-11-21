#	Slide 58 (ExtractionComposant.pdf)

Résumé (Synthèse) du contenu des diapositives : 

1. Problème : compréhension = construire un modèle du code **orienté objet**
	- Modèle = architecture = \sum composants || peut etre approximer par \sum Modules (foncitonnalités).
2. Soltuion : définir un modèle de correspondance (ce qu'on appelle aussi un modèle de mapping) c'est a dire : monde OO <=> monde Composant
	- Un composant = un ensemble de classe (\sum classes),
	- une architecture = partition de classes,
	- => Quel est la partition de classes qui reflète l'architecture métier du système OO ?
	- Pour que ça reflète, on a définis une fonction qui évalue la qualité (au sens) métier de chaque (partie) groupe (partition) de classe,
	- => La qualité d'une architecture = \sum qualité des ces composants (qualités de la partie?) .
3. Quel est la qualité d'un groupe de classe (pour être un bon composant) ?
	- On a trouvé 3 caractéristiques qui mesure la qualité d'un composant.
		1. La **spécialisation** (pas au sens héritage mais **spécificité**). Est ce qu'il encapsule une fonctionnalité bien précise ?
		2. L'autonomie. Quel est ça dépendence avec le reste ?
		3. Ca composabilité. Est ce que ces interfaces avec les autres est bien définies ?
4. Etablir une relation entre chaque caractéristique et un ensembles de métrique pour pouvoir évaluer la caractéristique en question !
	- Une fonction d'évalutation de chaque caractéristique,
	- La formule de qualité d'un composant = (\lambda1 * qualité d'un composant + \lambda2 * qualité d'autonomie + \lambda3 * qualité de spécificité) / \lambda1 + \lambda2 + \lambda3

#	Slide 82

- comment est calculé la précision, le recul c'est quoi (voir chapitre 5 de son livre) ?

#	Introduction à Spoon (30 slides)

#	Slide 