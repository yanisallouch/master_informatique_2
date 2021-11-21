package exemples.tp1;


import java.io.InputStream;

import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.util.FileManager;
import org.apache.jena.vocabulary.RDF;

public class Q3_3Bis {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
		    m.read(rdf_file);
		    String a_ns = m.getNsPrefixURI("animal" );
	    	Resource jer = m.getResource( a_ns + "Jerry" );
	    	StmtIterator propertiesIter = m.listStatements(jer, (Property) null,(RDFNode) null);    	
	    	for ( ; propertiesIter.hasNext() ; )
	    	{
	    		Statement stmnt=propertiesIter.nextStatement() ;
	    		Property p = stmnt.getPredicate();
	    		System.out.print(p.getLocalName()+"  ");
	    		RDFNode o = stmnt.getObject();
	    		if (o.isLiteral())
	  	 			System.out.println("  "+o.toString());
	  			else if (o.isAnon()) 
	  			{	Resource r1 = (Resource) o;
					System.out.println(" Id  : " + r1.getId());	}
	  			else 
	  				{ Resource r2 = (Resource) o;
	  				System.out.println(" Nom Qualifie : " +  r2.getLocalName());} 
				System.out.println();
	    	}
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}