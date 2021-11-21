package exemples.tp1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.vocabulary.XSD;

public class Ex2 {

	static final String animal_ns = "http://www.ex.fr/animal#";

	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.setNsPrefix("animal", animal_ns);
			m.setNsPrefix("rdf", RDF.getURI());
			m.setNsPrefix("rdfs", RDFS.getURI());
			m.setNsPrefix("xsd", XSD.getURI());
			// Chat
			Resource cat = m.createResource(animal_ns + "Chat");
			// Tom
			Resource tom = m.createResource(animal_ns + "Tom");
			tom.addProperty(RDF.type, cat);
			tom.addProperty(RDFS.label, "Tom");
			//
			Property color = m.createProperty(animal_ns + "couleur");
			tom.addProperty(color, m.createTypedLiteral("gris", XSD.getURI() + "string"));
			Property age = m.createProperty(animal_ns + "age");
		    tom.addProperty(age, m.createTypedLiteral("4", XSD.getURI() + "int"));

			m.write(System.out, "RDF/XML");

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