package transformationModel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import objetPersonnalisablePackage.CaracteristiqueVariable;
import objetPersonnalisablePackage.ElementDePersonnalisation;
import objetPersonnalisablePackage.GammePersonnalisable;
import objetPersonnalisablePackage.Objet;
import objetPersonnalisablePackage.ObjetPersonnalisablePackagePackage;

/**
 * 
 * @author Kaci Ahmed
 * @author Allouch Yanis
 *
 */

public class ParserModel {
	private List<String> objectsListName=null;
	private List<String> personalisationEltListName=null;
	private List<String> variableCarateristcListName=null ;
	
	public static void main(String[] args) {

		Resource resource = chargerModele("model/GammePersonnalisable.xmi",
				ObjetPersonnalisablePackagePackage.eINSTANCE);
		if (resource == null)
			System.err.println(" Erreur de chargement du modèle");
		GammePersonnalisable maGam = (GammePersonnalisable) resource.getContents().get(0);

		System.out.println("class de ma gam : " + maGam.getClass().toString());

		ParserModel parser = new ParserModel();
		parser.objectsListName = parser.getObjectsListName(maGam);
		parser.personalisationEltListName = parser.getPersonalisationEltListName(maGam);
		parser.variableCarateristcListName = parser.getVariableCaracteristicListName(maGam);

	}
	public void  parse () {

		Resource resource = chargerModele("model/GammePersonnalisable.xmi",
				ObjetPersonnalisablePackagePackage.eINSTANCE);
		if (resource == null)
			System.err.println(" Erreur de chargement du modèle");
		GammePersonnalisable maGam = (GammePersonnalisable) resource.getContents().get(0);


		
		this.objectsListName = this.getObjectsListName(maGam);
		this.personalisationEltListName = this.getPersonalisationEltListName(maGam);
		this.variableCarateristcListName = this.getVariableCaracteristicListName(maGam);

	}

	private List<String> getVariableCaracteristicListName(GammePersonnalisable maGam) {
		List<String> variableCaracteristicListNames = new ArrayList();
		for (CaracteristiqueVariable c : maGam.getElementsvariables()) {
			variableCaracteristicListNames.add(c.getNom());
		}
		return variableCaracteristicListNames;
	}

	private List<String> getPersonalisationEltListName(GammePersonnalisable maGam) {
		List<String> personalisationEltListNames = new ArrayList();
		for (ElementDePersonnalisation elt : maGam.getElementsdepersonnalisation()) {
			personalisationEltListNames.add(elt.getNom());
		}
		return personalisationEltListNames;
	}

	private List<String> getObjectsListName(GammePersonnalisable maGam) {
		List<String> objectListNames = new ArrayList();
		for (Objet obj : maGam.getObjets()) {
			objectListNames.add(obj.getNom());
		}
		return objectListNames;
	}

	public static Resource chargerModele(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			java.util.Map options = new java.util.HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		} catch (Exception e) {
			System.err.println("ERREUR chargement du modèle : " + e);
			e.printStackTrace();
		}
		return resource;
	}

	public List<String> getObjectsListName() {
		return objectsListName;
	}

	public void setObjectsListName(List<String> objectsListName) {
		this.objectsListName = objectsListName;
	}

	public List<String> getPersonalisationEltListName() {
		return personalisationEltListName;
	}

	public void setPersonalisationEltListName(List<String> personalisationEltListName) {
		this.personalisationEltListName = personalisationEltListName;
	}

	public List<String> getVariableCarateristcListName() {
		return variableCarateristcListName;
	}

	public void setVariableCarateristcListName(List<String> variableCarateristcListName) {
		this.variableCarateristcListName = variableCarateristcListName;
	}

	
	
}
