package exemples.tp1;



import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;

public class Ex6 {

	public static final String rdf_file = "tom.n3";
	
	public static void main(String args[]) {

		try {
			Model m = ModelFactory.createDefaultModel();
			m.read(rdf_file);
			System.out.println("Nombre de triplets du graphe = " + m.size());
			StmtIterator stmt_i = m.listStatements();
			while (stmt_i.hasNext()) {
				Statement stmt = stmt_i.nextStatement();
				Resource s = stmt.getSubject();
				if (s.isAnon()) {
					System.out.print(" Noeud anonyme " + s.getId());
				} else {
					System.out.print(" Nom Qualifie : " + s.getLocalName());
				}
				Resource p = stmt.getPredicate();
				System.out.print("   Property : " + p.getLocalName());
				RDFNode o = stmt.getObject();
	  			if (o.isLiteral())
	  	 			System.out.println("  "+o.toString());
	  			else if (o.isAnon()) 
	  			{
	  				Resource r1 = (Resource) o;
					System.out.println(" Id  : " + r1.getId());
	  			}
	  			else 
	  				{ Resource r2 = (Resource) o;
	  				System.out.println(" Nom Qualifie : " +  r2.getLocalName());} 
				System.out.println();
			}
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}