package com.yanisallouch.tp1;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
//import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class LoadUML {

	static Model model;
	static List<String> containerNamesVisited = new ArrayList<>();

	public static Model chargerModele(final String uri) {
		Resource resource = null;
		final EPackage pack = UMLPackage.eINSTANCE;
		try {
			final var uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("uml", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			final XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			final java.util.Map<String, XMLMap> options = new java.util.HashMap<>();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (final Exception e) {
			System.err.println("ERREUR chargement du modele : " + e);
			e.printStackTrace();
		}
		return (Model) resource.getContents().get(0);
	}

	static public Class findClass(final String name, final Model m) {
		Class classResultat = null;
		if (m != null) {
			for (final PackageableElement pe : m.getPackagedElements()) {
				if (pe instanceof final Class elemClass) {
					if (elemClass.getName().compareTo(name) == 0) {
						System.out.println("**Find class of interest " + elemClass.getLabel());
						return elemClass;
					}
				} else if (pe instanceof final Package elemPackage) {
					System.out.println("Recursion... on " + elemPackage.getLabel());
					classResultat = LoadUML.findClassInPackage(name, elemPackage);
					if (classResultat != null) {
						return classResultat;
					}
				}
			}
		}
		return classResultat;
	}

	static public Class findClassInPackage(final String name, final Package p) {
		Class classResultat = null;
		if (p != null) {
			for (final PackageableElement pe : p.getPackagedElements()) {
				if (pe instanceof final Class elemClass) {
					if (elemClass.getName().compareTo(name) == 0) {
						System.out.println("Find class of interest " + elemClass.getLabel());
						return elemClass;
					}
				} else if (pe instanceof final Package elemPackage) {
					System.out.println("Recursion... on " + elemPackage.getLabel());
					classResultat = LoadUML.findClassInPackage(name, elemPackage);
					if (classResultat != null) {
						return classResultat;
					}
				}
			}
		}
		return classResultat;
	}

	private static Operation findMethod(final Class sourceClass, final String methodNameCible) {
		final List<Operation> methods = sourceClass.getOperations();
		for (final Operation method : methods) {
			if (method.getLabel().equals(methodNameCible)) {
				System.out.println("**Find method of interest : " + methodNameCible + ", in class of interest : "
						+ sourceClass.getLabel());
				return method;
			}
		}
		return null;
	}

	static public Package findPackageInPackage(final String name, final Package p) {
		final Package packageResultat = null;
		if (p != null) {
			for (final PackageableElement pe : p.getPackagedElements()) {
				if (pe instanceof Package t) {
					if (t.getName().compareTo(name) == 0) {
						System.out.println("**Find Package : " + t.getLabel());
						return t;
					}
					t = LoadUML.findPackageInPackage(name, t);
					if (t != null) {
						System.out.println("Recursion... on " + t.getLabel());
						return packageResultat;
					}
				}

			}
		}
		return packageResultat;
	}

	public static void main(final String[] args) {

		// Instruction recuperrant le modele sous forme d'arbre a partir de la classe
		// racine "Model"
		final var umlP = LoadUML.chargerModele("model/model3-complexe.uml");
		final var nomModele = umlP.getName();

		System.out.println("Ton modele se nomme: \"" + nomModele + "\"");

		// Modifier le nom du modele UML
		umlP.setName("My model");
		System.out.println("\"" + nomModele + "\" Changer ! Le modele se nomme: \"" + umlP.getName() + "\"");

		LoadUML.model = umlP;

		// Question1
		System.out.println("Quesitons1");
		final var classNameSource = "FirstClass";
		final var sourcePackagename = "FirstPackage";
		final var packageNameCible = "SecondPackage";
		final var packageNameSource = sourcePackagename;
		System.out.println("Refactor move returned : " + LoadUML.refactorMoveClassFromPackage2Package(LoadUML.model,
				classNameSource, packageNameSource, packageNameCible));

		// Question2
		// Skip

		// Question3
		System.out.println("Quesitons3");
		final var classNameSource2 = "FirstSubClass";
		final var classNameCible2 = "FirstSuperClass";
		final var methodNameCible = "firstSubMethod";
		System.out
				.println("Refactor Push-up returned : " + LoadUML.refactorMoveMethodFromClass2SuperClass(LoadUML.model,
						classNameSource2, classNameCible2, methodNameCible));

		// Sauvegarder le modele avec son nouveau nom
		LoadUML.sauverModele("model/changerNom.uml", LoadUML.model);
	}

	public static void moveClassToPackage(final Class c, final Package target) {
		System.out.println("Moving " + c.getLabel() + " to package " + target.getLabel());
		target.getPackagedElements().add(c);//

	}

	static public boolean pushUpMethod(final Class origin, final Class sup, final Operation target) {
		if (!origin.allParents().contains(sup) && !origin.getOperations().contains(target)
				&& sup.getOperations().contains(target)) {
			return false;
		}
		sup.getOwnedOperations().add((target));
		return true;
	}

	public static boolean refactorMoveClassFromPackage2Package(final Model model, final String className,
			final String packageNameSource, final String packageNameCible) {

		final var packageSource = LoadUML.findPackageInPackage(packageNameSource, model);
		final var packageCible = LoadUML.findPackageInPackage(packageNameCible, model);
		final var classSource = LoadUML.findClassInPackage(className, packageSource);

		if ((classSource == null) || (packageSource == null) || (packageCible == null)) {
			return false;
		}
		LoadUML.moveClassToPackage(classSource, packageCible);
		return true;
	}

	private static boolean refactorMoveMethodFromClass2SuperClass(final Model model2, final String classNameSource2,
			final String classNameCible2, final String methodNameCible) {
		final var sourceClass = LoadUML.findClass(classNameSource2, model2);
		final var cibleClass = LoadUML.findClass(classNameCible2, model2);
		final var cibleMethod = LoadUML.findMethod(sourceClass, methodNameCible);

		final var string = new StringBuilder();
		if (((sourceClass != null) && (cibleClass != null) && (cibleMethod != null))) {
			return LoadUML.pushUpMethod(sourceClass, cibleClass, cibleMethod);
		}
		if (sourceClass == null) {
			string.append("Class source : ").append(classNameSource2);
		} else if (cibleClass == null) {
			string.append("Class cible : ").append(classNameCible2);
		} else if (cibleMethod == null) {
			string.append("Method cible : ").append(methodNameCible);
		}
		System.out.println(string.append(" is missing").toString());
		return false;
	}

	public static void sauverModele(final String uri, final EObject root) {
		Resource resource = null;
		try {
			final var uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(root);
			resource.save(null);
		} catch (final Exception e) {
			System.err.println("ERREUR sauvegarde du modele : " + e);
			e.printStackTrace();
		}
	}

}
