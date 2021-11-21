package exemples.tp2;

import java.util.Iterator;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Query;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;

public class Ex_SPARQL_2
{

    public static final String NL = System.getProperty("line.separator") ;
	  public static void main(String[] args)
	    {
		  Model m = ModelFactory.createDefaultModel();
		  String fil_tom = "tom.n3";
					            
		  String prolog1 = "PREFIX rdf: <"+RDF.getURI()+">" ;
		 
		  m.read(fil_tom);
		  
		  String rdq = prolog1 + NL  +
		  "SELECT ?s  ?o WHERE { ?s rdf:type ?o}" ;
		  
		  Query query = QueryFactory.create(rdq);
		  QueryExecution qexec = QueryExecutionFactory.create(query, m);
		  query.serialize(new IndentedWriter(System.out,true)) ;
		  System.out.println();
		  try {
			  Iterator<QuerySolution> results = qexec.execSelect();
			  RDFVisitor aVisitor = new Un_Visiteur();
			  System.out.println("Les ressources et leurs types");
			  System.out.println();
			  for (;results.hasNext();)
			  {
				  QuerySolution sol = results.next();
				  RDFNode s = sol.get("s");
				  RDFNode o = sol.get("o");
				  System.out.print(s.visitWith(aVisitor)+"    ");
				  Resource type = (Resource) o.asResource();
				  System.out.println(type.getNameSpace()+" "+type.getLocalName());
					 
			  }
		  }
		  finally {qexec.close();}
	    }
	}