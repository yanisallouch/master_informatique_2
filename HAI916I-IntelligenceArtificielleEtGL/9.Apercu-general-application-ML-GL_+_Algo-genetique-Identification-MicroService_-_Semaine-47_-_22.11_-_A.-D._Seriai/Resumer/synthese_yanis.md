Pour le papier choisi, rédigez une synthèse structurée (à déposer sur le dépôt ci-dessous):

#	Quel est le contexte ?

L'ingénierie logicielle est un travail compliqué qui implique des délais et des budgets. Il est important de minimiser les défauts en mettant en œuvre des mesures de qualité dès le début du cycle de vie du projet.

#	Quel est le problème ?

Les problèmes identifiés sont les suivants :
1. Les méthodes actuelles d'ingénierie logicielle dans la recherche présentent des stratégies de "prévention des défauts" plutôt que des stratégies de "détection des défauts". 

#	Existe-t-il des solutions connues et si oui quels sont leurs avantages/inconvénients ?

1. Les ingénieurs logiciels contemporains definissent des stratégies de tests logiciels pour le cycle de vie du projet et les appliques pour détecter des défauts dans ce cycle. Par ailleurs, ces tests fournissent des métriques logicielles,
2. L'analyse des métriques permet aux ingénieurs logiciels d'évaluer les risques logiciels et ces données métriques fournissent également des informations pour la prédiction des défauts.
3. Certains travaux de recherches cherchent a identifier quelles métriques sont pertinentes pour mésurer la qualité d'un projet, les défauts d'un projet.
4. D'autres travaux académique, se sont intéréssé sur l'étude d'amélioration des techniques de catégorisation du risque des défauts d'un projet.
5. Dans un travaux de recherche précédents, leur architecture de détection des bugs ne donnaient pas de résultats suffisamment satisfaisant, du a la présence de valeurs fortement corrélés et de valeurs non significatives en majorité.

#	Quel est le type de la solution choisie et pourquoi ?

L'article de recherche que nous étudions, a choisie 3 algorithmes de Machine Learnings pour identifier les défauts d'un projet :
- Multi layer Perceptron (MLP),
- Decision Tree (DT),
- Radial basis functions (RBF).

#	Quelle est la démarche (les étapes) ?

La démarche de présenté dans l'étude est la suivante :
- Le dataset dans sont entièreté est normalisé par application d'une technique intitulé 'Principal Component Analysis' (PCA),
- Le nouveau dataset est optimisé en enlevant les défaut étiquetté "mineur",
- Le dataset optimisé est alors utilisé comme entrainement de manière randomisé pour chaque éxécution par les algorithmes de Machine Learning,
- Enfin, ils testent de manière indépendantes chaques algorithmes sur le dataset servant au test en répétant l'éxécution randomisé deux cent fois.

#	Quels sont les résultats ?

Les résultats obtenus de la prédiction des datasets par algorithmes, est présentés dans les tableaux 1, 2 et 3.
Une comparaison des résultats par algorithmes leur permet d'affirmer de manière consistente que la détection utilisant RBF produit légèrement moins d'erreurs grace aux propriétés mathématiques suivantes :
- Convergence plus rapide,
- Moins d'erreur du a l'extrapolation de valeur,
- Une plus grande robustesse,
- L'erreur calculé sur la moyenne des carrés est plus petites.

De plus, ils observents que supprimés les défauts labélisés "mineur", produit de meilleur résultat a la prédiction des défauts importants labélisés "majeur" par les 3 techniques de Machine Learning.

#	Est-ce que vous avez essayé de regarder s'il existe dans la littérature d'autres travaux qui ont le même objectif que le papier que vous avez lu ? si oui lesquels ?

Non.

#	Avis personnel

##	Quel est votre avis personnel ? (Donnez votre évaluation personnelle de l'approche)

Les chercheurs de cette article, ont fait le choix de supprimer tous les défauts (en grande majorité) labélisés "mineur" dans le dataset servant a l'entrainement des algorithmes de Machine Learning. En effet, ils observent de manière empirique que ces données induit les algorithmes a sous-estimé les défauts "majeur". 
Hors ce choix est discutable, puisqu'ils ont choisis de complétement ignorés ces défauts de l'analyse. Nous pensons, qu'il faudrait pouvoir fournir un mécanisme d'attention aux algorithmes, permettant de quantifier l'attention portés a certains label du dataset. En effet, en tant qu'ingénieur logiciel, nous avons développer un mécanisme d'attention de recherche des défauts majeur dans un projet sans pour autant éliminer la détection des défauts mineur (dont nous restons conscients lors du développement).

##	Imaginez que vous êtes en entreprise et que vous avez le même problème à traiter, quelle approche proposeriez-vous ?

Il est admis aujourd'hui, qu'un grand nombre d'entreprise possède des outils d'intégration continue du code source en plus d'un système de versionning, dans le cycle de vie du projet. Parmi ces outils, certains se focalisent sur la qualité du code source et la détection de bugs (labélisés mineur a majeur). Ces outils produisents des résultats normalisés et analysables. De plus, dans l'historique du logiciel de versionning, il est possible de savoir quand un bug a été détecté, corrigé, de quel manière et pas quels personnes. Nous pouvons imaginer utiliser ces données là, comme un historique des bugs produits par le passé pour identifier les bugs futurs. 
Nous y voyons l'avantage suivant. Les prévisions produites par les algorithmes de machine learning sont personnalisés par l'entreprise et son passé. Ayant pour impact direct que le taux d'erreur devraient être inférieur aux approches plus génériques de détection des bugs, puisque les exemples produits et a produire, proviennent de la même entreprise.