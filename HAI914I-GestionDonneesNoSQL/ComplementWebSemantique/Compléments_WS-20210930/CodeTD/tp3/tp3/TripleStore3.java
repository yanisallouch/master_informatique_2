package exemples.tp3;

import org.apache.jena.query.Dataset ;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.tdb.TDBFactory;

public class TripleStore3
{
	 public static void main(String[] args)
	    {
	        String directory = "/home/isa/Bureau/TS_Tom" ;
	        Dataset dataset = TDBFactory.createDataset(directory) ;
	        Model model = dataset.getDefaultModel() ;
	        System.out.println("nombre de triplets : "+model.size());
	        model.write(System.out,"N3");
	        dataset.close();
	    }
}