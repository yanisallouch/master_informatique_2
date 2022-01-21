|||
|:-:|:-:|:-:|
||M2 Informatique - HMIN305 - "Métaprogrammation et Réflexivité"||
||Année 2020-2021. Session 1, janvier 2021.||
||Christophe Dony, Blazo Nastov ||

**Durée : 2h00. Documents non autorisés.**

>Notes : On parlera de Pharo pour désigner Pharo-Smalltalk où Smalltalk est le langage historique proposant entre autres un système de métaclasses implicite universel. Pharo est un environnement de développement logiciel fondé sur Smalltalk. Similairement, Objvlisp est un langage historique proposant un système de métaclasses explicites universel utilisé entre autres dans le système objet de Common-Lisp (également nommé CLOS).

#	1 Utilisation de Système réflexifs

Exercices d'utilisation du méta-niveau de certains langages dont Pharo ou Common-Lisp ou Java.

Si vous ne vous souvenez pas exactement du nom de certaines méthodes, ce n'est pas dramatique, vous pouvez utiliser des noms approchants à condition qu'ils correspondent à des choses existantes. Bien sûr, si vous vous souvenez, c'est mieux.

1. Sachant qu'en Smalltalk, tout est objet, que tout objet est une instance d'une classe, et que la méthode ***class*** rend la classe de son receveur, dite pour chacune des expressions ci-dessous quelle est sa valeur et quel est le type de cette valeur, par exemple : la valeur de *3 + 4* est le *SmallInteger 7*.
	a) *1 class*, valeur "SmallInteger", type "SmallInteger class"
	b) *1 class class*, valeur "SmallInteger class", type "Metaclass"
	c) *1 class class class*, valeur "Metaclass", type "Metaclass class"
	d) *(Pile new) class*, valeur "Pile", type "Pile class"
	e) *(Pile new) class class class*, valeur "Metaclass", type "Metaclass class"
	f) *(1 class class class) == ((Pile new) class class class)*, valeur "true", type "True"
	g) *((1 class class class) == ((Pile new) class class class)) class*, valeur "True", type "True class"

2. En Pharo et Java ou autres - Introspection : écrire une méthode booléenne disant si un objet o comprends un message m. Si oui, l'envoi du message a m à l'objet o exécutera une méthode, si non il provequera une erreur de type "message non compris" (doesNotUnderstand en Pharo).
Rappel : en syntaxe Java, o.f(x) est un envoi de message dont le receveur est o et le sélecteur f; x est un argument, o est d'ailleurs aussi un arguement.
Une telle méthode est utile :
 - en typage dynamique de façon général si l'on souhaite vérifier avant d'envoyer un message
 - en typage statique en cas d'utilisation d'une couche réflexive et si l'on souhaite vérifier avant de réaliser des envois de message dont le sélecteur est calculé dynamiquement. A noter qu'un compilateur Java par exemple utilise une telle méthode pour compiler un envoi de message.
 Lisez les 3 sous-questions avant de répondre.

2. 1. A écrire en Pharo, la méthode s'appelera *understands* :.
 Exemple d'utilisation :
```smalltalk
p := Pile new.
p understands: #pop "-> true"
p understands: #machin "-> false"
p understands: #clone "-> true"
p understands: #class "-> true"
Class understands: #class "-> true"
```
```smalltalk
Object>>understands: aMsg
 [self perform: aMsg]
 on: MessageNotUnderstood  do: [ ^ false].
 ^ true
 ```
Alternative sans effet de bord (execution du message envoye) inspiré du message `lookupSelector` implementer dans la classe **Behavior**
```smalltalk
Object>>understands: selector
	"Look up the given selector in my methodDictionary.
	Return the true if found.
	Otherwise chase the superclass chain and try again.
	Return false if no method is found."
	| lookupClass |
	lookupClass := self.
	[lookupClass == nil]
		whileFalse: [ 
			lookupClass methodDict 
				at: selector
				ifPresent: [ ^ true ].
			lookupClass := lookupClass superclass].
	^ false
```

2. 2. Java : A écrire en Java, en utilisant le package Reflect. La méthode sera une méthode statique à deux paramètres **understands (Object o, String selector)**. 
Pourquoi doit-on faire une méthode statique et pas une méthode normale comme en Pharo? Que manque-t-il à la couche réfléxive de Java pour cela ?

```java
public static boolean understands(Object o, String selector) {
	Method[] methods = o.getDeclaredMethods();
	Boolean toOut = false;

	for(Method m : methods) {
		if(m.getName().equals(selector)) {
			toOut = true;
		}
	}
	return toOut;
}
```
ou encore
```java
public static boolean understands(Object o, String selector) {
	Method method = o.getClass().getMethod(selector, null);
	
	if(methode == null){
		return false;
	} else {
		// meth.invoke(o, null); /* seulement executer si c'est ce que le problème indique */
		return true;
	}
}
```

On doit définir une méthode statique en Java et pas une méthode normal car en Java la recherche de méthode est effectué selon un typage statique.

2. 3. Si vous savez écrire une telle méthode dans un autre langage doté d'une couche réflexive, à la place de l'un des 2 précédents, faites le ici.

On pourrait possiblement le faire en Python ou Ruby comme nous l'avons abordé en cours. (Utilisé ObjVLisp implémenté en Pharo ou CLOS serait triché?).
Voici un autre exemple en JavaScript :

```js
function understands(o, selector) {
	return Reflect.has(o, selector);
}
```

3. En Pharo : Transformation de modèle (transformation d'une classe (un modèle) à runtime).
	1. Ecrivez une méthode qui s'applique à une classe et qui enlève de son dictionnaire de méthodes toutes les méthodes abstraites (ceci pourrait être une étape dans une transformation de code ou on essaierait de mieux factoriser les méthodes abstraites). On suppose que les méta-objets représentant les méthodes comprennent le message booléen isAbstract (si vous connaissez le vrai nom en Pharo, utilisez le).
```smalltalk
MyRefactoring>>removeAbstractMethods: aClassName 

| aClass abstractMethods |

aClass := (Smalltalk classNamed: aClassName).
abstractMethods := aClass methodDict keys select: [:aMethod | (aClass>>aMethod) isAbstract ].
abstractMethods do: [ :method | aClass removeSelector: method ].
 ```

3. 2. Pouvez vous faire la même chose avec Java Reflect ? Utilisez les termes "introspection" et "intercession" pour argumenter.

Il n'est pas possible de faire la même chose avec Java Reflect. En effet, le système Java n'est pas réfléxif (la capacité d'introspection et d'intercession), il ne possède que la capacité d'introspection de son système. C'est a dire qu'il ne possède pas la capacité a modifier causalement la représentation utilisateur et la représentation en machine.

3. 3. Connaissez vous un système pour Java ou un autre langage avec lequel on puisse réaliser cet exercice ?

Nous avons aborder en cours la notion d'Aspect et de Traits. En Java, les Traits ont été ajoutés dès Java 8, les Aspects sont à rajouté comme framework dans Eclipse pour augmenter Java. Nous avons aussi vu que les annotations implémentés en Java, est mécanisme permettant d'émuler la programmation par Aspect. Je pense qu'en utilisant ces deux concepts, nous pouvons emuler un comportement de refactoring similaire a celui implémenté dans la classe Pharo *MyRefactoring*.

#	2 Utilisation de systèmes à méta-classes - Objvlisp-Clos versus Pharo

Rappel, on a vu en cours un système de méta-classes nommé Objvlisp, vasé sur la classe Object et la méta-classe Class dont on rappelle les définitions sous forme d'envois de messages ci dessous dans une syntaxe que nous nommons "syntaxe Objvlisp". Cette définition est bien sûr circulaire et nécessite un bootstrap pour être mise en oeuvre, définition et bootstrap que nous avons présenté dans le cours.

Ce système de méta-classes est aussi celui de CLOS mais avec des noms différents : (*standard-object* et *standard-class*).

```smalltalk
Class new 
	name: #Class
	superclass: Object
	attributs: 'name superclass
			attributs methods'
	methods: '(new ... primitive code to instanciate a class ...)
			  (name: return name)
			  (superclass: return superclass)
			  ...'
```
*Listing 1 -Creation de **Class** en syntaxe Objvlisp*

```smalltalk
Class new 
	name: #Object
	superclass: nil
	attributs: ''
	methods: 'many methods'
```
*Listing 2 -Creation de **Object** en syntaxe Objvlisp*


On va dans les sous-sections suivantes utiliser ce système puis le comparer au système de méta-classes de Pharo.

##	2.1 Réalisations en Objvlisp/Common-Lisp/CLOS

1. Soit une méta-classe *MemoClass* définissant des classes capables de mémoriser la liste de leur instances.
	1. Donnez, dans le système *Objvlisp*, en syntaxe *Objvlisp* ou en sysntaxe *CLOS*, une définition de la méta-classe **MemoClass** sans le code des méthodes.
```smalltalk
Class new
	name: #MemoClass
	superclass: Class
	attributs: 'listeInstances'
	methods: 'many methods'
```

2. Comment décririez-vous la variable utilisée pour stocker pour chaque classe la liste de ses instances.
 - La variable *listInstances* est une collection utilisé pour stocker pour chaque classe la liste des ces instances. Elle est decrite comme un attribut de la méta-classe *MemoClass* qui est unique pour toutes classe instance de cette méta-class, plus précisément, c'est un attribut de classe (statique en Java).

3. On souhaite créer la classe *Point* des points du plan (les points possédant une abscisse x et une ordonnée y) comme une *MemoClass*. Donnez en *Objvlisp* ou *CLOS* la définition de la classe *Point*.
```smalltalk
MemoClass new
	name: #Point
	superclass: Object
	attributs: 'x y'
	methods: '(getx: ...)
			  (gety: ...)
			  ...'
```

4. Dites quelle est la méthode *new* exécutée lors de l'exécution de cette définition, expliquez.
 - Lors de l'exéuction de cette définition, on exécute la méthode *new* de la méta-class *Class*..
5. On crée une instance I de la classe *Point* par I := Point new, Dites quelle est la méthode *new* exécutée lors de l'exécution de cette instruction, expliquez.
 - Lors de l'exécution de I := Point new, la méthode new exécuter est celle de la classe MemoClass, car l'envoie du message *new* est chercher a partir de la classe du receveur. La classe de *Point* étant *MemoClass*.
6. Faites un schéma représentant les objets *I*, *Point* et *MemoClass*
 - voir l'image [sec2.1_q6.png](./sec2.1_q6.png)
7. Considérons une méta-classe *AbstractClass* dont les instances devront être des classes abstraites, i.e. non instanciables, i.e. des classes pour lesquelles l'envoi du message **new** provoquera une erreur. Ajoutons à cette description la contrainte suivante : *AbstractClass* doit mémoriser la liste de ces instances.
Donnez en *Objvlisp* ou *Clos* la définition de la méta-classe *AbstractClass*. Commentez.
```smalltalk
MemoClass new
	name: #AbstractClass
	superclass: Class
	attributs: ''
	methods: 'override of new to throw an error'

AbstractClass addMethod: #new
	body: [ :receiver :initargs | receiver error: 'this is an abstract class' ]
```

AbstractClass est une sous classe de *Class*, instance de *MemoClass*, ce qui fait d'elle une méta-class. Ainsi, quand on instance une classe *AbstractClass*, l'algorithme de lookup, va chercher dans la classe du receveur la méthode *new*. C'est à dire, dans la classe *MemoClass*, ce qui permet de créer des classes abstraites tous en ayant un moyen de se souvenir des classes abstraites instancier.

8. méta commentaire : vous pouvez traiter les sections suivantes avant de revenir à cette question.
Considérons une méta-classe *ConcreteClass* dont les instances seront des classes instanciables (les classes standard d'une application usuelle). On pose comme contrainte que toutes les classes instanciables devront être capables de fournir la collection de leurs instances. Par contre on demande que *ConcreteClass* ne mémorise pas la liste des ses instances.
Donnez en *Objvlisp* ou *Clos* la définition de *ConcreteClass*.
- Ce problème est abordé dans le mooc Pharo en semaine 6 ou 7. Il faut ajouter un attribut au classe intitulé *sharedVariables*, permettant au instances de partager une variable de classe sans que la classe déclarant *sharedVariables* n'en aient conscience.

##	2.2 Réalisations en Pharo

On reprend en partie l'énoncé de l'exercice précédent (section 2.1) et on réalise en Pharo avec son système de méta-classes. On rappelle que dans ce système, il y a une méta-classe (dite implicite) automatiquement créée et associée à chaque classe. On accède à l'édition de la méta-classe via le bouton "meta" du browser, ou par programme en envoyant le message **class** à la classe.

1. Créez en Pharo la classe Singleton1 et faites en sorte que ce soit une classe singleton au sens du schéma de conception du même nom; donc qu'elle ne puisse avoir qu'une seule instance.
Donnez le code de la méthode *new* que vous avez à définir.
```smalltalk
Object subClass: #Singleton1
	instanceVariableNames: ''
	classVariableNames: 'Instance'
	package: 'MySingleton1'

Singleton1 class>>new
	^ Instance ifNil: [Instance := super new]
```

2. Si on souhaite créer une classe Singleton1Bis soit aussi une classe singleton, voyez vous un moyen de réutiliser (sans copier/coller) le code de la méthode new de Singleton1 class.
 - Non, parce que la création de méta-class en Pharo est implicite. Pharo permet d'éditer les méta-class mais pas de modifier leur héritages. Cela est fait pour garder le modèle cohérent.
3. Au vu des questions précédentes. Donnez une liste de différences (limitations/avantages) entre le système de méta-classes de Pharo et celui d'Objvlisp ou CLOS.
 - Les limitations de Pharo par rapport à Objvlisp sont les suivantes :
  - Pharo crée implicitement la méta-class d'une classe lors de la création de cette dernière, ceci est un avantage pour le programmeur qui ne veut pas s'attarder dessus, tout ayant la capacité de les modifier. Cependant, cela lui prive de la liberté de modifier l'arbre d'héritage des méta-class (pour le garder l'héritage parallèle avec celui des classes et éviter des conflits de message non compris).
# 3 Projet phase 1

Vous avez dans votre projet implanté en Pharo un système à méta-classes explicites de type Objvlisp.

- Pour cela vous avez crée la classe Obj ci-dessous.

```smalltalk
Array variableSubclass: #Obj
	InstanceVariableNames: ''
	classVariableNames: ''
	package: 'ObjVSkeleton'
```

1. Que représente la classe Obj dans le système implanté ? Que représentent ses instances ?
 - Obj est la classe Pharo nous permettant de créer nos propres classes Objvlisp en Pharo. Ces instances vont modélisez des classes du systèmes Objvlisp (par exemple ObjClass et ObjObject).
2. Pourquoi est-elle une sous-classe de **Array** ?
 - C'est une sous classe de Array pour faciliter l'utilisation de méthode Pharo ainsi que pour moduler (**variableSubclass**) la taille en mémoire de cette objet en lui rajoutant un certains nombre de champs non connus par la classe de base.
3. Qu'est-ce que ObjObject par rapport à Obj ?
 - ObjObject est la racine du graphe d’héritage (de notre modèle ObjVLisp) et est une instance de ObjClass. Alors que Obj est la classe Pharo qui permet d'implémenter ObjObject et ObjClass. De plus, ObjClass est la première classe et la racine de l’arbre d’instanciation et l’instance d’elle-même dans ce modèle (ObjVLisp). (cf. section 1.3 Aperçu du noyau)

- Vous avez suivi la réalisation du bootstrap du système et à ce propos vous avez lu et exécuté la méthode suivante :

```smalltalk
manualObjClassStructure
| class |
class := Obj new: 6.
class objClassId: #ObjClass.
class objName: #ObjClass.
class objIVs: self classInstanceVariables.
class objKeywords: #(#name: #superclass: #iv: #keywords: #methodDict:).
class objSuperclassId: #ObjObject.
class objMethodDict: (IdentityDictionnary new: 3).
^ class
```

1. Que fait cette méthode ? Expliquez pourquoi le "manually".
 - La primitive manualObjClassStructure renvoie un objObject (avec une minuscule c'est une instance) qui représente la classe ObjClass (avec une majuscule c'est une Classe) (cf. 4.1 Création manuelle de la classe ObjClass). Elle comporte le mot "manually" puisque c'est nous même qui créons l'objet qui référence la classe *ObjClass* instance de ObjClass. Cette instance de méta-classe, nous sert a bootstrap le système avec un minimum d'information. Ce qui nous permet par la suite de crée ObjObject "normalement" et de recrée ObjClass "normalement".
2. Que fait l'expression Obj new: 6 ? pourquoi 6 ?
 - Elle retourne une instance de la classe Obj sous classe de Array de taille 6. Et 6 c'est le nombre minimal permettant de décrire une classe, plus de détail :
  - un slot qui contient pointeur sur la classe l'ayant instancié,
  - un slot pour son nom,
  - un slot pour les variables d'instances (instance-variables),
  - un slot vers la superclasse, un slot pour le dico de méthode,
  - un slot pour le constructeur (keywords), contient lui meme ces variables là ... spoiler de la question 3.2.3
3. Que représentent les noms dans le tableau #(#name: #superclass: #iv: #keywords: #methodDict:)
 - Il représentent les messages nécéssaires pour créez de nouvelles clases.

# 4 Projet Phase 2 - Lecture

Vous avez dans votre projet étudié un langage réflexif ou lu uun article lié au sujet. Résumez succintivement un point particulièrement intéressant que vous avez appris.

>>> J'ai compris grâce a l'article "Reflective Object Kernel" que les mots clés super et self en pharo (respectivement super et this en Java et cie.) sont identiques. C'est a dire qu'elles références toutes les deux le receveur du message. Cependant self permet au lookup de chercher depuis la classe du receveur, alors que super permet au lookup de chercher depuis la super-classe de la classe du receveur. 
Remarque : Dans l'implémentation de ObjVLisp en Pharo, il y a une petite simplification a ce niveau la, il y a deux lookup implémenté, un pour tous les cas (en gros self) qui se nomme quelque chose comme basic: ... withArgs:... et un pour le super qui se nom quelque chose comme super:... withArgs:..

Ou encore

>>> J'ai compris grâce a un des articles lu qu'il n'existe qu'un seul mécanisme de recherche de méthode identiques pour tous les objets (sans exception).