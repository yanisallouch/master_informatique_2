#	Slide 6

~~- Pour `34` n'a pas de noeud en JSON ?~~
	- C'est une erreur

#	Slide 16

~~- Pourquoi `cluster of unreliable commodity hardware` comme titre ?~~
	- C'est le sens de `Couch`.
	- C'est de la fausse modestie (en espérant faire mieux  que leur concurrent).

#	Slide 22

~~- Est ce que la révision est unique par document ou partagé par plusieurs document ?~~
	- réponse en slide 28.

#	Slide 23

- MVCC ? systeme de controle de multi-version ? Controle de concurrence multi-version (slide 24) ?
- Compacter la bdd ?

#	Slide 25

~~- Est ce que la route `_uuids` fonctionne sur toutes les routes ?~~
	- Que sur le serveur.

#	Slide 26

~~- On va devoir faire du cherchement pas le haut (je n'ai pas entendu ce qui a été dis avant l'explication du document)?~~
	- Aucune idée de ce qu'elle a pu dire.

#	Slide 28

~~- Pourquoi la première façon est nommé `explicit id` ?~~
	- Dans la route on passe explicitement l'id du document voulu avec un verb PUT. Dans le second le document doit etre sérialisé dans un objet Design Document par l'action POST.

#	Slide 31

~~- Les champs sont mis a null ? on perds les propriétés ?~~
	- Mougenot pense, qu'il ajoute juste un attribut sur le document sans rien faire de plus, c'est une suppression dite "logique" (et c'est logique, parce que c'est le best-effort).

#	Slide 32

~~- Vous dites : "Quand tu requète, tu accède a un certains nombre de réplicat", qu'est ce que ca veut dire ?~~
	- Les noeuds clones sont accédés de manière transparentes par le service.

#	Slide 34

~~- On a vu dans les slides qu'on peut définir des id (clés?), comment on s'en sort pour définir un intervalle quand les clés sont mal formattés ?~~
	- Oui ce des _id. C'est au developpeur de s'en sortir pour crée des clés cohérents :-D.

#	Slide 35

~~- Pourquoi y'a des `c` sous les BTree ?~~
	- Aucune idée, a vérifier sur la source.

#	Slide 47

~~- Avec les maps/reduce on crée des vue matérialisés sur la bdd et ensuite on les consultes avec une requètes get (slide 48)~~
	- C'est juste de dire ça, ca crée des vues matérialisés, comme on les a vu en Oracle (SQL), la différence c'est quels sont automatiquement indéxés.