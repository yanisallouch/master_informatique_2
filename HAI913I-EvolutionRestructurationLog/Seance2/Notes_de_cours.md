#	Slide 6

~~Dans la problématique de couverture de code des tests logicielles. Est ce que cette problématique inclut la pertinence des test ?~~

Oui, la couverture du code est plus large que la définition litéral de couverture en nombre de ligne.

> Pradeo.com est une socièté d'analyse dynamique pour mobile.

~~Est ce qu'on ne peut pas réglé en partie le problème de sécurité avec les techniques en place comme une sandbox ? une vm ? une isolation totale ? Quelles sont les contraintes/inconvénients de ces solutions ?~~

On ajoute une barrière, mais il reste une lien avec la machine hôte. Partant du constat que rien n'est infaible, on ne peut alors pas prendre de risque d'éxécution. 

#	Slide 7

~~Pourquoi l'ensemble de l'analyse dynamique et statique (non-sure) ne composose pas l'ensemble de l'analyse statique (sure) ?~~

- L'analyse dynamique, est restreinte a une sous partie du comportement réél.

- L'analyse statique, est décomposé en deux partie :
	- La partie dite <<sure>>, analyse l'ensemble du comportement réél et emet des hypothèse en plus.
	- La partie dite <<non-sure>>, analyse une sous partie du comportement réel et emet des un sous-ensemble des hypothèses (de l'analyse statique sûre).

#	Slide 9

~~Analyse formelle ? est ce que ça a un lien avec la preuve de programme (vu en coq) ?~~

Oui

#	Slide 13

~~C'est quoi la cohésion des méthodes ?~~

Voir Loose Cohesion Class

#	Slide 38

~~GWT vers Angular, problème de référence sur un objet pour, **<<déterminer les pages>>**, ca veut dire quoi ?~~

Ils voulaient parler des pages webs.