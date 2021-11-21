package exemples.tp1;


import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.NodeIterator;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.util.FileManager;

public class Ex5 {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.read(rdf_file);
			String a_ns = m.getNsPrefixURI("animal");
			Resource tom = m.getResource(a_ns + "Tom");
			Property color = m.getProperty(a_ns + "couleur");
			NodeIterator nod_i1 = m.listObjectsOfProperty(tom, color);
		 	 while (nod_i1.hasNext())
		 	 { RDFNode n = nod_i1.nextNode();		
		        	Literal l = (Literal) n;
		        	System.out.println(l.getLexicalForm());   	   
					}
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}