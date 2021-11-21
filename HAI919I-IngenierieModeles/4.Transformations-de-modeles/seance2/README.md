#	Associer une machine à états à une classe avec Papyrus
Pour tester vous aurez besoin de machines à états associées à des classes, quelques explications ici sur comment procéder avec Papyrus.
Pour créer une machine à états associée à une classe :
- Dans le model explorer, se placer sur la classe contextec
- clic droit , new diagram
- Choisir State Machine Diagram
Pour ajouter un trigger correspondant à un appel de méthode :
- Se placer sur les properties de la transition sur laquelle on veut ajouter le trigger
- Demander à créer un nouvel événement
- Choisir CallEvent
- Dans container : choisir l'élément qui doit contenir le nouvel événement, ici on pourra choisir RootElement par exemple, ou n'importe quel package
- puis choisir l'opération souhaitée.

last update : 14 octobre 2021