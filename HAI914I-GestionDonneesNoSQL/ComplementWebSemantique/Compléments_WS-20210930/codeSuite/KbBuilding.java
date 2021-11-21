package exemples.tpSuite;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntProperty;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.PrefixMapping;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;


public class KbBuilding {
	
	static String an = new String(KbVocabulary.getUri());
	public static void main(String args[]) {
	OntModel model = ModelFactory.createOntologyModel();
	model.setNsPrefix("animal", KbVocabulary.getUri());
	
	OntClass personnage = model.createClass(KbVocabulary.Personnage.toString());
	OntClass chat = model.createClass(KbVocabulary.Chat.toString());
	OntClass souris = model.createClass(KbVocabulary.Souris.toString());
	OntClass canari = model.createClass(KbVocabulary.Canari.toString());
	chat.addSuperClass(personnage); souris.addSuperClass(personnage) ; canari.addSuperClass(personnage);
    materialiser(model, chat);
    materialiser(model, souris);
    materialiser(model, canari);
    OntProperty iAvec = model.createObjectProperty(KbVocabulary.interagitAvec.toString());
    Individual tom = model.getIndividual(KbVocabulary.tom.toString());
    Individual jerry = model.getIndividual(KbVocabulary.jerry.toString());
    tom.addProperty(iAvec, jerry);
    
    Chat sylvestre = new Chat("Sylvestre",6,"gris");
    sylvestre.rdfIser(model, chat);
    
	model.write(System.out, "N3");
}
	
	public static OntModel materialiser (OntModel om, OntClass oc)
	{
		Individual tom = null ; Individual jerry = null ;
		if (oc.getLocalName().equals("Chat"))
		{	tom = om.createIndividual(KbVocabulary.tom.toString(),oc);
		tom.addProperty(RDFS.label, om.createLiteral("Tom","fr"));
		tom.addProperty(KbVocabulary.couleur, om.createLiteral("gris","fr"));
		tom.addProperty(KbVocabulary.age, om.createTypedLiteral("4",XSD.getURI() + "integer")); }
		if (oc.getLocalName().equals("Souris"))
		{	jerry = om.createIndividual(KbVocabulary.jerry.toString(),oc);
		jerry.addProperty(KbVocabulary.couleur, om.createLiteral("beige","fr"));
		jerry.addProperty(KbVocabulary.age, om.createTypedLiteral("2",XSD.getURI() + "integer")); }
		if (oc.getLocalName().equals("Canari"))
		{	Individual titi = om.createIndividual(KbVocabulary.titi.toString(),oc);
		titi.addProperty(RDFS.label, om.createLiteral("Titi","fr"));
		titi.addProperty(RDFS.label, om.createLiteral("Tweety","en"));
		titi.addProperty(KbVocabulary.couleur, om.createLiteral("jaune","fr"));
		titi.addProperty(KbVocabulary.couleur, om.createLiteral("yellow","fr"));
		titi.addProperty(KbVocabulary.age, om.createTypedLiteral("1",XSD.getURI() + "integer")); }
		
		return om;}

}