package exemples.tp3;

import org.apache.jena.query.Dataset ;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.vocabulary.RDF;

public class TripleStore4
{
	 public static void main(String[] args)
	    {
	        String directory = "/home/isa/Bureau/TS_Tom" ;
	        Dataset dataset = TDBFactory.createDataset(directory) ;
	        Model model = dataset.getDefaultModel() ;
	        String a_ns = model.getNsPrefixURI("animal");
	        Resource bugs_bunny = model.createResource(a_ns+"Bugs_Bunny");
	        Resource lapin = model.createResource(a_ns+"Lapin");
	        model.add(bugs_bunny,RDF.type,lapin);
	        model.write(System.out,"N3");
	        dataset.close();
	    }
}