package exemples.tpSuite;

import org.apache.jena.ontology.Individual;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;

public class Chat {
	private String couleur;
	private String nom;
	private Integer age;

	public Chat(String nom) {
		this.nom= nom ;
	}

	public Chat(String nom, Integer age, String couleur) {
		this.nom=nom; this.age=age;  this.couleur=couleur; 
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}	

	public OntModel rdfIser (OntModel om, OntClass oc)
	{
		Individual i = om.createIndividual(KbVocabulary.getUri()+this.getNom(),oc);
		i.addProperty(RDFS.label, om.createLiteral(this.getNom(),"fr"));
		i.addProperty(KbVocabulary.couleur, om.createLiteral(this.getCouleur(),"fr"));
		i.addProperty(KbVocabulary.age, om.createTypedLiteral(this.getAge(),XSD.getURI() + "integer"));
		
		return om;
	}
	
	
}