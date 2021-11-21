package exemples.tp2;

import java.util.Iterator;
import org.apache.jena.atlas.io.IndentedWriter;
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



public class Ex_SPARQL_3
{

    public static final String NL = System.getProperty("line.separator") ;
	  public static void main(String[] args)
	    {
		  Model m = ModelFactory.createDefaultModel();
		  String fil_tom = "tom.n3";
					            
		  String an_ns ="http://www.ex.fr/animal#";
		  String prolog = "PREFIX animal: <"+an_ns+">" ;
		  String prolog2 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		 
		  System.out.println(prolog);
		  System.out.println(prolog2);
		  
		  m.read(fil_tom);
		  
		  String rdq = prolog + NL + prolog2 + NL  +
		  "SELECT ?s WHERE { ?s rdf:type animal:Chat}" ;
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.create(query, m);
		  query.serialize(new IndentedWriter(System.out,true)) ;
		  System.out.println();
		  try {
			  Iterator<QuerySolution> results = qexec.execSelect();
			  RDFVisitor aVisitor = new Un_Visiteur();
			  System.out.println("les chats");
			  for (;results.hasNext();)
			  {
				  QuerySolution sol = results.next();
				  RDFNode s = sol.get("s");
				  System.out.println(s.visitWith(aVisitor)+"    ");
			  }
		  }
		  finally {qexec.close();}
	    }
	}