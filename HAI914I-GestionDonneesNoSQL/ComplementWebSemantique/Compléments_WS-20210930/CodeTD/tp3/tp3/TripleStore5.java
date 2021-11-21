package exemples.tp3;

import org.apache.jena.query.Dataset ;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ReadWrite;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.Lock;
import org.apache.jena.tdb.TDB;
import org.apache.jena.tdb.TDBFactory;
import org.apache.jena.vocabulary.RDF;

public class TripleStore5
{
	  public static void main(String[] args)
	    {
	        String directory = "/home/isa/Bureau/TS_Tom" ;
	        Dataset ds = TDBFactory.createDataset(directory) ;
	        Model model = ds.getDefaultModel();
	        ds.begin(ReadWrite.WRITE);
	        model.enterCriticalSection(Lock.WRITE);
		try {
		    model.removeAll();
		    model.commit();
		} finally {
		    model.leaveCriticalSection();
		    ds.end();
		}

		
	}
}