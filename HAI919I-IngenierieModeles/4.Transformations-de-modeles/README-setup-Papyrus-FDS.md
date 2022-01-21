Installer le modeleur eCore dans la version Papyrus d'Eclipse
Help->install new Software.
Dans work with, choisir : https://download.eclipse.org/releases/2021-03/
Puis sous Modeling, choisir, Ecore Diagram Editor (SDK).
Terminez l'installation.
Lancer la version Papyrus d'Eclipse sur les postes FDS
éditer le fichier papyrus.ini
y ajouter la partie en gras :
-startup
plugins/org.eclipse.equinox.launcher_1.6.300.v20210813-1054.jar
--launcher.library
plugins/org.eclipse.equinox.launcher.gtk.linux.x86_64_1.2.300.v20210828-0802
-showsplash
org.eclipse.papyrus.rcp
--launcher.XXMaxPermSize
256m
--launcher.defaultAction
openFile

-vm
/usr/lib/jvm/java-11-openjdk-amd64/bin/java

-vmargs
-Xms256m
-Xmx1024m
-Dosgi.bundlefile.limit=200