|||
|:-:|:-:|:-:|
||M2 Informatique - HMIN305 - "Métaprogrammation et Réflexivité"||
||Année 2020-2021. Session 1, janvier 2021.||
||Christophe Dony, Blazo Nastov ||

**Durée : 2h00. Documents non autorisés.**

>Notes : On parlera de Pharo pour désigner Pharo-Smalltalk où Smalltalk est le langage historique proposant entre autres un système de métaclasses implicite universel. Pharo est un environnement de développement logiciel fondé sur Smalltalk. Similairement, Objvlisp est un langage historique proposant un système de métaclasses explicites universel utilisé entre autres dans le système objet de Common-Lisp (également nommé CLOS).

#   1 Utilisation de Système réflexifs

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

Le lookup de base tel qu'on la vue dans le TP d'implementation d'un noyau réflexif ObjvLisp (CLOS) en Pharo :

```smalltalk
lookup: selector
    "look for the method named <selector> starting in the receiver. 
    The lookup is done for a message sent to <anObjObject>. self is an objClass"

    |lookMethod|
    lookMethod := self bodyOfMethod: selector.
    ^ lookMethod
        ifNotNil: [ lookMethod ]
        ifNil: [ 
        (self objName == #Object) 
        ifTrue: [ nil ]
        ifFalse: [ self objSuperclass lookup: selector ]
         ].
```
```smalltalk
Object>>understands:selector
 | understoodMethod |
 understoodMethod := self bodyOfMethod: selector
 understoodMethod
    ifNotNil: [ ^true ]
    ifNil [ 
        [ self name == #Object ]
            ifTrue: [ ^false ]
            ifFalse: [ ^super understands: selector ]
    ]
```

2. 2. Java : A écrire en Java, en utilisant le package Reflect. La méthode sera une méthode statique à deux paramètres **understands (Object o, String selector)**. 
Pourquoi doit-on faire une méthode statique et pas une méthode normale comme en Pharo? Que manque-t-il à la couche réfléxive de Java pour cela ?

2. 3. Si vous savez écrire une telle méthode dans un autre langage doté d'une couche réflexive, à la place de l'un des 2 précédents, faites le ici.