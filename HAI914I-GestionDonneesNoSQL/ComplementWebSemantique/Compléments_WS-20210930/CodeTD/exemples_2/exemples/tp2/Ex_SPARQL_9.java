package exemples.tp2;


import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Query;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;


public class Ex_SPARQL_9
{

    public static final String NL = System.getProperty("line.separator") ;
	  public static void main(String[] args)
	    {
		  Model m = ModelFactory.createDefaultModel();
		  String fil_tom = "tom.n3";
					            
		  m.read(fil_tom);
		  String animal_ns = m.getNsPrefixURI("animal");
		  String prolog1 = "PREFIX animal: <"+animal_ns+">" ;
		  String prolog2 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		  String prolog3 = "PREFIX rdfs: <"+RDFS.getURI()+">" ;
		  
		  String rdq = prolog1 + NL + prolog2 + NL  + prolog3 + NL  +
		  "SELECT ?p ?label WHERE { ?p rdfs:label ?label . " 
		 +  " {?p rdf:type animal:Chat . } "
		 + " UNION"
		 +  " {?p rdf:type animal:Souris . } "
		 + " UNION"
		 +  " {?p rdf:type animal:Canari . } "
		 + " }" ;
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.create(query, m);
		  query.serialize(new IndentedWriter(System.out,true)) ;
		  System.out.println();
		  try {
		       ResultSet rs = qexec.execSelect() ;
		       ResultSetFormatter.out(System.out, rs, query);		  
		  }
		  finally {qexec.close();}
	    }
	}