package exemples.tp1;


import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.util.FileManager;

public class Ex7 {

	public static final String rdf_file = "tom.n3";

	public static void main(String args[]) {

		try {
			 Model m = ModelFactory.createDefaultModel();
			 RDFDataMgr.read(m,rdf_file) ;
			// ou Model m = RDFDataMgr.loadModel(rdf_file) ;
			
			System.out.println("Nombre de triplets du graphe = " + m.size());
			StmtIterator stmt_i = m.listStatements();
			while (stmt_i.hasNext()) {
				Statement stmt = stmt_i.nextStatement();
				Resource s = stmt.getSubject();
				if (s.isAnon()) {
					System.out.println(" Noeud anonyme " + s.getId());
				} else {
					System.out.println(" Nom Qualifie : " + s.getLocalName());
				}
			}
		}
 catch (Exception e) {
			System.out.println("failure" + e);
		}
		}
}