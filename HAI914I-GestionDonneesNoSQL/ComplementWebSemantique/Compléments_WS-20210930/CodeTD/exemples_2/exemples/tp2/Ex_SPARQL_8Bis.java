package exemples.tp2;

import java.util.Iterator;
import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Query;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;


public class Ex_SPARQL_8Bis
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
		  "SELECT ?s ?age WHERE { ?s animal:age ?age . " 
		 +  " FILTER (?age > 2) }" ;
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.create(query, m);
		  query.serialize(new IndentedWriter(System.out,true)) ;
		  System.out.println();
		  try {
			  Iterator<QuerySolution> results = qexec.execSelect();
			  RDFVisitor aVisitor = new Un_Visiteur();
			  System.out.println("les personnages qui ont plus de deux ans ");
			  for (;results.hasNext();)
			  {
				  QuerySolution sol = results.next();
				  RDFNode s = sol.get("s");
				  RDFNode a = sol.get("age");
				  System.out.print(s.visitWith(aVisitor)+"    ");
				  System.out.println(a.visitWith(aVisitor)+"    ");
				
			  }
		  }
		  finally {qexec.close();}
	    }
	}