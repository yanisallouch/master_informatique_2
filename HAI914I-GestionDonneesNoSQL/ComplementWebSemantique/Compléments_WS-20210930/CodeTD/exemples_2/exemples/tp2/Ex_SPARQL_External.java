package exemples.tp2;

import java.util.Iterator;
import org.apache.jena.query.Query;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;



public class Ex_SPARQL_External
{

    public static final String NL = System.getProperty("line.separator") ;
	  public static void main(String[] args)
	    {
		  Model m = ModelFactory.createDefaultModel();
		  m.read("https://www.wikidata.org/wiki/Special:EntityData/Q131144.ttl");
		  String schema_ns = m.getNsPrefixURI("schema");
		  String wikidata_ns = m.getNsPrefixURI("wd");
		  
		  String prolog1 = "PREFIX schema: <"+schema_ns+">" ;
		  String prolog2 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		  String prolog3 = "PREFIX wd: <"+wikidata_ns+">" ;
		  
		  String rdq = prolog1 + NL + prolog2 + NL  + prolog3 + NL +
		  "SELECT ?s  ?name WHERE { ?s rdf:type schema:Article ."
		  + " OPTIONAL {?s schema:name ?name } }" ;
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.create(query, m);
		  try {
			  Iterator<QuerySolution> results = qexec.execSelect();
			  RDFVisitor aVisitor = new Un_Visiteur();
			  System.out.println("Les articles wikipedia");
			  for (;results.hasNext();)
			  {
				  QuerySolution sol = results.next();
				  RDFNode s = sol.get("s");
				  RDFNode nom = sol.get("name");
				  System.out.print(s.visitWith(aVisitor)+"    ");
				  if (nom != null)
					  System.out.println(nom.visitWith(aVisitor)+"   "+nom.toString());
					  else System.out.println(" no data ");
			  }
		  }
		  finally {qexec.close();}
	    }
	}