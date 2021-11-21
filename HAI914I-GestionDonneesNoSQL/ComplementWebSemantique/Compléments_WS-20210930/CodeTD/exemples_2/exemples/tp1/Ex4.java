package exemples.tp1;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;

public class Ex4 {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.read(rdf_file);
			String a_ns = m.getNsPrefixURI("animal");
			Resource cat = m.getResource(a_ns + "Chat");
			Property color = m.getProperty(a_ns + "couleur");
			System.out.println(cat.getLocalName());
			System.out.println(cat.getNameSpace()); 	
			System.out.println(color.getURI()); 	
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}