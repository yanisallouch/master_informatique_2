#	Slide 8

~~- Le vecteur on l'appelle `one hot vector` ?~~
	- oui
~~- Je n'ai pas compris ou est la variable `hébergement`, pouvez vous précisez s'il vous plait ?~~
	- il n'y a pas de variable...

#	Slide 9

~~- Je ne comprends pas la notion d'orthogonalité entre ces deux vecteurs, pouvez vous précisez s'il vous plait ?~~
	- Ca signifiie qu'ils ne sont pas comparables

#	Slide 10

~~- Pourquoi des nombres rééls pour représenter le contexte d'un mot `m` et pas des entiers ?~~
	~~* est ce que c'est du a la nature statisque de la méthode qui établit une distribution \in [-1,1] ?~~
	- C'est du a la nature statistique	

#	Slide 11

~~- Est ce que le vecteur présenté fais référence a une des phrases présentées sur la slide précédente ?~~
	- Probablement pas

#	Slide 12

~~- Ca veut dire quoi un vecteur de dimensions 100 ?~~
	- 100 dimensions comme en programmation  `int [][]..`
~~- Comment on a réduis un vecteur de dimension 100 a 9 (ici présenté sur la slide) ?~~
	- Par des reductions matricielles, qui ne sont pas l'objectif du cours

#	Slide 16

~~- Dans cette slide, la fonction de classification est en dents de scie ?~~
	- C'est un défaut de réprésentation, elle bien linéaire

#	Slide 17

~~- Qu'est ce que c'est que `Cxd` en puissance des Réels ?~~
	- `C` signifie classe, `d` la dimension de `x`, `x` l'input
~~- Comment lire la notaiton `W_c.x` ou `W_y.x`?~~
	- Le produit du `poid de la classe` par `x`
#	Slide 21

- `w_i` vecteur de poid d'une input, stabilisé lorsqu'il est introduit dans un réseaux de neurones
- `x_i` inputs du neurones

#	Slide 23

~~- Pourquoi `+1` sur les derniers noeuds ?~~
	- C'est un bias
- Légende : 
	- Bleue <=> input
	- Orange <=> neuronne

#	Slide 24

~~- Pourquoi le dernier neurone de la dernière couche ne possède pas de `+1` ?~~
	- osef

#	Slide 25

~~- Comment lire cette fonction avec un vecteur de taille 3 ?~~
	- La fonction (sigmoid) appliqué au vecteur, c'est le vecteur qui contient l'application de la fonction sur chaque valeur.

#	Slide 29

~~- Je n'ai pas compris c'est quoi une feature ?~~
	- en réseau de neurone, on ne cherche pas de feature, car elles sont détérminés par les grandes valeurs qui vont par backpropagation faire ressortir des poids importants
	- une feature c'est une caractéristique de ce qu'on cherche a analyser.