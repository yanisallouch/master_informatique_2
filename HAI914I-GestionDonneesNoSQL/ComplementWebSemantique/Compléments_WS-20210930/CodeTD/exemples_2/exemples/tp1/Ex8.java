package exemples.tp1;


import java.io.InputStream;

import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;

public class Ex8 {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
		    m.read(rdf_file);
		//    Model model = RDFDataMgr.loadModel(rdf_file) ;
		    InfModel inf_m = ModelFactory.createRDFSModel(m);
		    String a_ns = m.getNsPrefixURI("animal" );
	    	
	    	Resource per = m.getResource( a_ns + "Personnage" );
	    	ResIterator res_i = inf_m.listSubjectsWithProperty( RDF.type, per );
	    	while (res_i.hasNext())
	    	{ Resource s = res_i.nextResource();
	    	System.out.println(s.getLocalName()); }
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}