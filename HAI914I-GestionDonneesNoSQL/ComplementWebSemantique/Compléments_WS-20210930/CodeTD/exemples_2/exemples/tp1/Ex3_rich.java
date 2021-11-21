package exemples.tp1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;

public class Ex3_rich {

	static final String animal_ns = "http://www.ex.fr/animal#";

	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.setNsPrefix("animal", animal_ns);
			m.setNsPrefix("rdf", RDF.getURI());
			m.setNsPrefix("rdfs", RDFS.getURI());
			m.setNsPrefix("xsd", XSD.getURI());
			// Personnage
			Resource personnage = m.createResource(animal_ns + "Personnage");
			m.add(personnage, RDFS.subClassOf,RDFS.Class);
			// Chat
			Resource cat = m.createResource(animal_ns + "Chat");
			m.add(cat, RDFS.subClassOf,RDFS.Class);
			// sous-classe de 
			cat.addProperty(RDFS.subClassOf, personnage);
			// Tom
			Resource tom = m.createResource(animal_ns + "Tom");
			tom.addProperty(RDF.type, cat);
			tom.addProperty(RDFS.label, "Tom");
			//
			Property color = m.createProperty(animal_ns + "couleur");
			tom.addProperty(color, m.createTypedLiteral("gris", XSD.getURI() + "string"));
			Property age = m.createProperty(animal_ns + "age");
		    tom.addProperty(age, m.createTypedLiteral("4", XSD.getURI() + "int"));
		    
		    // Souris
		 	Resource mouse = m.createResource(animal_ns + "Souris");
		 	m.add(mouse, RDFS.subClassOf,personnage);
			// Jerry
			Resource jerry = m.createResource(animal_ns + "Jerry");
			jerry.addProperty(RDF.type, mouse);
			jerry.addProperty(RDFS.label, "Jerry");
			jerry.addProperty(color, m.createTypedLiteral("beige", XSD.getURI() + "string"));
		    jerry.addProperty(age, m.createTypedLiteral("2", XSD.getURI() + "int"));
		    
		    // Sylvester
		    Resource sylvester = m.createResource(animal_ns + "Sylvester");
		    sylvester.addProperty(RDF.type, cat);
		    sylvester.addProperty(RDFS.label, "Sylvester");
		    sylvester.addProperty(color, m.createTypedLiteral("blanc", XSD.getURI() + "string"));
		    sylvester.addProperty(color, m.createTypedLiteral("noir", XSD.getURI() + "string"));
		    
			// Canari
			Resource canary = m.createResource(animal_ns + "Canari");
			m.add(canary, RDFS.subClassOf,personnage);
		    
		    
		    // Tweety
		    Resource tweety = m.createResource(animal_ns + "Tweety");
		    tweety.addProperty(RDF.type, canary);
		    tweety.addProperty(RDFS.label, "Titi");
		    tweety.addProperty(color, m.createTypedLiteral("jaune", XSD.getURI() + "string"));
		    
			m.write(System.out, "N3");

			  try { FileOutputStream outStream = new FileOutputStream("tom.n3"); //
			  m.write(outStream, "N3");
			  outStream.close(); } 
			  catch (FileNotFoundException e)
			  {System.out.println("File not found");} catch (IOException e)
			  {System.out.println("IO problem");}
		} catch (Exception e) {
			System.out.println("failure" + e);
		}
	}
}