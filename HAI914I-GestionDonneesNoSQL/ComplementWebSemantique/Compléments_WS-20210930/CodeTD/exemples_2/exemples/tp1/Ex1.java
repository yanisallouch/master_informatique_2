package exemples.tp1;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

public class Ex1 {
	static final String animal_ns = "http://www.ex.fr/animal#";
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.setNsPrefix("animal", animal_ns);
			m.setNsPrefix("rdf", RDF.getURI());
			m.setNsPrefix("rdfs", RDFS.getURI());
			// Ressource Chat
			Resource cat = m.createResource(animal_ns + "Chat");
			// Ressource Tom
			Resource tom = m.createResource(animal_ns + "Tom");
			tom.addProperty(RDF.type, cat);
			tom.addProperty(RDFS.label, "Tom");
			// Propriete couleur
			Property color = m.createProperty(animal_ns + "couleur");
			tom.addProperty(color, m.createLiteral("gris", "fr"));
			// affichage des triplets
			// N3 (ou TURTLE), N-TRIPLE, RDF/XML, JSON-LD 
			m.write(System.out, "TURTLE");
		} catch (Exception e) {
			System.out.println("failure" + e);
		}
	}
}