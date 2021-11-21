package exemples.tp1;


import java.io.InputStream;

import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.RDF;

public class Q3_1 {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
		    m.read(rdf_file);
		    String a_ns = m.getNsPrefixURI("animal" );
	    	
	    	Resource per = m.getResource( a_ns + "Chat" );
	    	ResIterator res_i = m.listSubjectsWithProperty( RDF.type, per );
	    	while (res_i.hasNext())
	    	{ Resource s = res_i.nextResource();
	    	System.out.println(s.getLocalName()); }
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}