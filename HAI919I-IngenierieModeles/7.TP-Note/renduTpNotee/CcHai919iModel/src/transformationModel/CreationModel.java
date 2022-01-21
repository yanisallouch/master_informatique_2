package transformationModel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.VisibilityKind;

import umlUtils.LoadUML;

public class CreationModel {

	Model myModel;
	UMLFactory factory = UMLFactory.eINSTANCE;

	public static void main(String[] args) {
		CreationModel creationModel = new CreationModel();
		creationModel.myModel = creationModel.factory.createModel();
		Class objetAbstrait = creationModel.createAbstractClass("ObjetAbstrait");
		Class objetDecore = creationModel.createAbstractClass("ObjetDecore");
		Class decoration = creationModel.createAbstractClass("Decoration");
		creationModel.createHierarchie(objetAbstrait, objetDecore);
		creationModel.createHierarchie(objetAbstrait, decoration);
		creationModel.createCompositionAssociation(decoration, objetAbstrait);
		// ajout des classes au model
		creationModel.myModel.getPackagedElements().add(objetAbstrait);
		creationModel.myModel.getPackagedElements().add(objetDecore);
		creationModel.myModel.getPackagedElements().add(decoration);

		// récupéere les infos du parser
		ParserModel parser = new ParserModel();
		parser.parse();
		List<String> objectsListName = parser.getObjectsListName();
		List<String> personalisationEltListName = parser.getPersonalisationEltListName();
		List<String> variableCarateristcListName = parser.getVariableCarateristcListName();

		// ajout des nouvelles sous classes au model
		List<Class> objectClasses = creationModel.addSubclassesToModel(objetDecore, objectsListName);
		List<Class> personalisationClasses = creationModel.addSubclassesToModel(decoration, personalisationEltListName);

		// ajout des méthodes abstraite
		creationModel.addAbstactMethodsToModel(objetAbstrait, variableCarateristcListName);
		creationModel.addAbstactMethodsToModel(objetDecore, variableCarateristcListName);

		// ajout des méthodes concrete
		creationModel.addMethodsToModel(decoration, variableCarateristcListName);

		creationModel.addMethodsToNewClasses(objectClasses, variableCarateristcListName);
		creationModel.addMethodsToNewClasses(personalisationClasses, variableCarateristcListName);

		LoadUML.sauverModele("model/modelcreated.uml", creationModel.myModel);
		System.out.println("transformation du modèle reussi");

	}

	private void addMethodsToNewClasses(List<Class> aClasses, List<String> variableCarateristcListName) {
		for (Class c : aClasses) {
			addMethodsToModel(c, variableCarateristcListName);
		}
	}

	private void addMethodsToModel(Class aClass, List<String> variableCarateristcListName) {
		Operation op;
		for (String elt : variableCarateristcListName) {
			op = factory.createOperation();
			op.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			op.setName(elt);
			aClass.getOwnedOperations().add(op);
		}

	}

	private void addAbstactMethodsToModel(Class aClass, List<String> variableCarateristcListName) {
		Operation op;
		for (String elt : variableCarateristcListName) {
			op = factory.createOperation();
			op.setVisibility(VisibilityKind.PUBLIC_LITERAL);
			op.setName(elt);
			op.setIsAbstract(true);
			aClass.getOwnedOperations().add(op);

		}

	}

	private List<Class> addSubclassesToModel(Class superClass, List<String> subClassNames) {
		Class c;
		List<Class> classes = new ArrayList();
		for (String subclassName : subClassNames) {
			c = createClass(subclassName);
			createHierarchie(superClass, c);
			myModel.getPackagedElements().add(c);
			classes.add(c);
		}
		return classes;

	}

	private Class createClass(String className) {
		Class c = this.factory.createClass();
		c.setName(className);
		return c;
	}

	private void createCompositionAssociation(Class decoration, Class objetAbstrait) {
		Association composition = factory.createAssociation();
		Property p1 = factory.createProperty();
		p1.setName("decore");
		p1.setLower(1);
		p1.setUpper(1);
		p1.setType(decoration);
		p1.setAggregation(AggregationKind.COMPOSITE_LITERAL);
		composition.getMemberEnds().add(p1);
		decoration.getOwnedAttributes().add(p1);

		Property p2 = factory.createProperty();
		p2.setName("decore");
		p2.setLower(1);
		p2.setUpper(1);
		p2.setType(objetAbstrait);
		composition.getMemberEnds().add(p2);
		objetAbstrait.getOwnedAttributes().add(p2);
		myModel.getPackagedElements().add(composition);

	}

	private void createHierarchie(Class superClass, Class subClass) {
		subClass.createGeneralization(superClass);

	}

	private Class createAbstractClass(String className) {
		Class abstractClass = this.factory.createClass();
		abstractClass.setIsAbstract(true);
		abstractClass.setName(className);
		return abstractClass;
	}

}
