package exemples.tp3;

import java.util.Iterator;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;


public class DbPedia_1

{
    public static final String NL = System.getProperty("line.separator") ;

	  public static void main(String[] args)
	    {	 
		 String sparqlService = "http://dbpedia.org/sparql";	
		  String prolog2 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		  String prolog1 = "PREFIX db-onto: <http://dbpedia.org/ontology/>";
		  String prolog5 = "PREFIX db-resource: <http://fr.dbpedia.org/resource/>";
		 
		  String rdq = prolog1 + NL + prolog2 + NL + prolog5 + NL +
				  "SELECT ?ville ?region WHERE { "
				  + "  ?ville rdf:type db-onto:Settlement ."
				  + "  ?ville db-onto:region  ?region . "
				  + "}  LIMIT 100";
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.sparqlService(sparqlService,
					query);	  		  		  
		  try {
			  Iterator<QuerySolution> results = qexec.execSelect();
			  System.out.println("Villes : ");
			for (; results.hasNext();) {
				QuerySolution sol = results.next();
				Resource ville = (Resource) sol.get("?ville");
				Resource region = (Resource) sol.get("?region");
				System.out.println(region.getLocalName() + " ==== : " + ville.getLocalName());
			}
		  }
		  finally {qexec.close();}
	    }
	}