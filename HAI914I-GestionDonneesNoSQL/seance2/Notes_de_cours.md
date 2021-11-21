#	Slide 53

~~Quand vous dites que `MATCH (n)` se positionne sur tous les noeuds, est ce qu'il crée une liste de noeuds a parcourir puis, par un ordre codée donnée (est-il connu ? configurable ? forcée ?) se positionner sur chacune des relations du noeud, puis `DELETE n,r` ?~~

Oui il crée une structure (indéfini), non on ne peut pas ordonner.

#	Slide 55

~~Vous dites `Des noeuds non connexes, c'est porteur de sens`, quel est ce sens ? Des noeuds de type `communes` non connexes : dom-tom ?~~

RAS, oui les DOM-TOM sont des noeuds non connexes a la métropole.

#	Slide 56

~~On peut crée un index sur l'ID du noeud ? Est ce utile si je fais régulièrement des recherches par ID ? Est ce que ce n'est pas déjà fais nativement ?~~

L'ID est déjà une strucutre indéxé par défaut. Il faut indéxé d'autres structures.

#	Slide 58

~~Ce n'est pas exactement la requète de la slide 56 ? vu que dans cette slide, on ne déclare pas de variable c, et dans la seconde on n'utilise pas `index`...~~

C'est exactement la traduction de la requète, c'est Neo4J qui crée la variable `c` dans ça représentation.
Les requètes d'index ont choisi des noms de variables portant a confusion..

#	Slide 61

~~Je n'ai pas compris la raison d'utiliser un paramètre `name` et pas juste entre quote ?~~

Il n'est peut-être pas possible d'escape les `"`
nécéssaires pour écrire la variable.

#	Slide 64

~~Pourquoi le nom de variable de type Transaction est `tx`, le `x` signifie quoi (plus généralement) ?~~

C'est une codification standard, par ailleurs le `x` peut signifier `exclusif`. C'est en lien avec le faite que Neo4J implémente le système ACID.

#	Slide 73 à 75

~~Je n'ai rien compris de l'explication et des questions posées ...~~

Au final ça va LOL.

#	Slide 78

~~Pourquoi est ce que les dates de fin et début sont noté entre `quote` et avec double `^` suivi d'un type formaté en XML ?~~

Les dates sont des litéraux, la ou `P_Saurel` est un noeud (balise XML). Le double chapeau permet de typé la string au format XML (standard).

#	Slide 79

~~Pourquoi vous avez mentionnés les `classifiers` de GNA ?
C'est quoi `GNA` ?~~

GNA propose des `classifiers` sémantique.

#	Slide 81

**Utilisation d'index OBLIGATOIRE pour l'utilisation de base RDF volumineuse !**

#	Slide 83 à 84

~~On a perdu la propriète `dates d'administration` ? c'etait l'objectif de ces slides ?~~

Oui.