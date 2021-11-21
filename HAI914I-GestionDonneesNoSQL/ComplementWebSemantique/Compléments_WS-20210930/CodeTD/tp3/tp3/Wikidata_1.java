package exemples.tp3;

import java.util.Iterator;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

public class Wikidata_1

{
    public static final String NL = System.getProperty("line.separator") ;

	  public static void main(String[] args)
	    {	 
		 String sparqlService = "https://query.wikidata.org/sparql";
		
		  String prolog2 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		  String prolog1 = "PREFIX schema: <http://schema.org/>";
		 
		  String rdq = prolog1 + NL + prolog2 + NL +
			"SELECT ?s ?name WHERE { ?s rdf:type schema:Article. "
			+  "   OPTIONAL {?s schema:name ?name }  FILTER (lang(?name) = 'en')  } "
			+"	LIMIT 10 " ;
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.sparqlService(sparqlService,
					query);	  		  		  
		  try {
			
			       ResultSet rs = qexec.execSelect() ;
			       ResultSetFormatter.out(System.out, rs, query);		  
		  }
		  finally {qexec.close();}
	    }
	}