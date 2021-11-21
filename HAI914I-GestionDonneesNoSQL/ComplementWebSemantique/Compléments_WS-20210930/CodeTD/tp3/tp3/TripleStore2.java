package exemples.tp3;

import org.apache.jena.query.Dataset ;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;


import org.apache.jena.tdb.TDBFactory;

public class TripleStore2
{
	 public static void main(String[] args)
	    {
	        String directory = "/home/isa/Bureau/TS_Tom" ;
	        Dataset dataset = TDBFactory.createDataset(directory) ;
	        
	        String sparqlQueryString = "SELECT * WHERE  " +
	        		"  { ?s ?p <http://www.ex.fr/animal#Souris> } " ;
	               
	        Query query = QueryFactory.create(sparqlQueryString) ;
	        QueryExecution qexec = QueryExecutionFactory.create(query, dataset) ;
	        ResultSet results = qexec.execSelect() ;
	        ResultSetFormatter.out(results) ;
	        qexec.close() ;

	        dataset.close();
	    }
}