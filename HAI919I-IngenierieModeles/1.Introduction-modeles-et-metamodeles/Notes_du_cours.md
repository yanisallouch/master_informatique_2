#	Séance du 09 Sept 2021

##	Un peu d'histoire

###	Année 60
Margaret Hamilton, [une photo iconique](https://fr.wikipedia.org/wiki/Margaret_Hamilton_(scientifique)#/media/Fichier:Margaret_Hamilton_-_restoration.jpg) d'elle avec une pile de livre (composant le code source imprimé du programme Apollo) a ces côté.

###	Année 70

Apparition du fonctionnelle, découpage des programmes en fonction/sous-fonction.

###	Année 80

L'évolution du cachier des charges, des exigences, contraintes, besoins, etc. rends les fonctions attendues obsèletes.
Plusieurs raisons impliquent l'évolution du logiciel. Brouillon, confusion, malentendu, erreur, une correction d'un bug, etc.

Un article de Mickael Jackson, MIT. Exemple d'horodatage d'un système de barques. Objectif : vérifié qu'il y a le bon nombre de barques pour le loueur de barques. 

Conclusion : il faut s'interesser aux structures, aux concepts. Il faut d'abord se reposer sur un découpage structurelles, un découpage par classe puis aux fonctions. On devient robuste a l'ajout de fonctionnalité.

###	Année 90

*	Utilisation du concept objet
*	Ligne de produits

###	Année 2000

*	On a commencé a mettre du logiciel partout pour remplacer l'électronique
*	Développement d'un autre genre de ligne de produit : cross-platform

###	Année 2010

*	Un problème survient : obsolescence technologique accélérée

###	Solution

Devenir plus abstrait. Modeliser une base de concepts qui pourra être projeter sur les frameworks désirés (qui évoluent, changent très vite). Il suffit de developper la projection.

##	Maitriser la compléxité du logiciel

*	Les patterns de conceptions
*	Les aspects : une forme de programmation des lignes de produits logicielles

Un exemple avec Tomcat slide 2 sur 13.

###	Aspect

On parle de tissage d'aspect. Un outil qui permet d'identifier les zones automatiquement.

*	Les tisseurs d'aspect : en Java il y en a un
*	L'idée est de centraliser la modification et de la répercuter automatiquement

### Composant

Les composants ne sont pas des Objets.

###	Middleware ou Middle-war ?

Une floppé de solution qui sont déjà dépassé.

##	Modéliser/Abstraire pour (mieux) programmer !

###	OMG

[Plus de détail](https://fr.wikipedia.org/wiki/Object_Management_Group)

L'Object Management Group (OMG) est un consortium international à but non lucratif créé en 1989 dont l’objectif est de standardiser et promouvoir le modèle objet sous toutes ses formes.

###	UML

Première modélisation : UML (1995), les profils UML (voir éventuellement le cours de Mme Huchard) permettent de crée des classes Custom d'UML pour générer du code AD-HOC.

Autant que pensez qu'un langage, middleware puisse "rule them all" il est autant fantaissiste de pensez que UML puisse faire pareil.


###	Création de MDA

[Plus de détail](https://fr.wikipedia.org/wiki/Model_driven_architecture)

L’architecture dirigée par les modèles ou MDA (pour l'anglais model driven architecture) est une démarche de réalisation de logiciels, proposée et soutenue par l'OMG. C'est **une variante particulière de l'ingénierie dirigée par les modèles** (IDM, ou MDE pour l'anglais model driven engineering). D'autres variantes de l'IDM ont été développées, par exemple par Microsoft avec DSL Tools.

###	Création de MDE

[Plus de détail](https://fr.wikipedia.org/wiki/Ing%C3%A9nierie_dirig%C3%A9e_par_les_mod%C3%A8les)

En génie logiciel, l'ingénierie dirigée par les modèles (IDM, en anglais : model-driven engineering) est un ensemble de pratiques fondées sur le concept de modèle de domaine. Ces pratiques ont pour but d'automatiser la production, la maintenance ou l'utilisation de systèmes logiciels. L'objectif de cette approche est de concentrer les efforts sur le domaine d'application du logiciel plutôt que sur son implémentation. Apparue dans les années 2000, l'ingénierie dirigée par les modèles est un sujet de recherche actif qui utilise de manière intensive les métamodèles et les transformations de modèle.

##	Méta-modèle

Ce qu'il faut retenir :

*	Le bon modèle c'est celui qui réponds bien en fonction des besoins
*	Le bon modèle n'est pas forcément précis. Voir l'exemple de la carte slide 5 sur 13
	*	Il n'y a pas de bonne échelles, il faut le juste millieu pour pouvoir répondre aux questions sans compliqué les réponses.

###	Réseau de pétri / Machine de Mealy

*	On doit connaitre sa syntaxe
*	On doit connaitre les concepts modéliser, représenter dans le modèle

*	« Un méta-modèle définit une abstraction, ses concepts »
*	Le méta-modèle est la légende de la carte (on se fiche de la couleur graphique de la légende, on cherche les concepts représentés !)

## Des instances aux méta-modèles

[Plus on modélise, moins il y'a d'outils/concepts a utiliser.](#ref_+_on_modelise)
Exemple utiliser : il y a une table avec N philosophe voulant manger a la même table avec des fourchettes en nombre N-1.

*	Le niveau M0 fait débât. Est ce que le diagramme d'instance c'est du M0 ou du M1 ? On va considérer que le diag. d'instance c'est du M0 parce qu'il modélise les "vrais" objets
*	Le niveau M1 modélise le système et non pas les "vrais" objets
*	A partir d'un méta-modèle, je peux crée plusieurs modèles, etc.
*	Plus on modélise, plus on abstrait, moins il y a de concept dans le vocabulaire. <a name="ref_+_on_modelise"></a>

##	Les niveaux de modélisation

Voir schéma, slide 38.

| Niveau 	| Outils 	| Description 	|
| ------------- |:-------------:| -----:|
| M3 | eCore (Eclipse Foundation), MOF (OMG) | est conforme au niveau M3 |
| M2 | méta-modèle UML | est conforme au niveau M3 |
| M1 | un modèle UML | est conforme au niveau M2 |
| M0 | le système | est conforme au niveau M1 |


##	Le MOF

L'instanciation de MOF peut donner MOF.

##	eMOF / eCORE

eMOF est un sous-ensemble de MOF (essential MOF).
eCORE est la version de Eclipse Foundation de eMOF.

###	Méta-méta-modèle détaillé de eCORE

Remarques : 

*	Les traits bleues se déduisent des traits noirs. Exemple avec `+eSuperTypes` et `+eAllSuperTypes`

###	Exemple : Enseignant / Etudiant

Voir slide 49.

## Objectif : Algorithmes

On peut créer des algorithmes qui peuvent a partir d'un méta-modèle manipuler le modèle pour factoriser, remanié le modèle (et l'optimiser/éviter la redondance ?)

Voir slide 52.

Un programme pour manipuler le méta-méta modèle permettrai de manipuler des programmes qui manipule des méta-modèles ?

### Exemple de [MM](#glossaire) : UML <-> Merise

*	MM : Méta-modèle

En utilisant le méta-méta modèle d'UML nous pouvons utiliser leur langages de transformation (projections) pour passer d'un méta-modèle UML a un méta-modèle Merise.


