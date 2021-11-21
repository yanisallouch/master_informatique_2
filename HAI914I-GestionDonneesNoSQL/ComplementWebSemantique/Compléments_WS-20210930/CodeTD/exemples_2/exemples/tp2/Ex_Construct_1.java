package exemples.tp2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.jena.atlas.io.IndentedWriter;
import org.apache.jena.query.Query;
import org.apache.jena.rdf.model.*;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;


public class Ex_Construct_1 {

    public static final String NL = System.getProperty("line.separator");
/* voir http://downlode.org/Code/RDF/ISO-3166/countries */
/* */
    public static void main(String[] args) {
        Model m = ModelFactory.createDefaultModel();
        String fil_tom = "tom.n3";
        m.read(fil_tom);
        
        String prolog1 = "PREFIX rdf: <" + RDF.getURI() + ">";
		String animal_ns = m.getNsPrefixURI("animal");
		String prolog2 = "PREFIX animal: <"+animal_ns+">" ;
	      String prolog3 = "PREFIX rdfs: <" + RDFS.getURI() + ">";
        // Query string.
        String rdq = prolog1
                + NL
                + prolog2
                + NL
                + prolog3
                + NL
                + "CONSTRUCT WHERE { ?i rdf:type animal:Chat ." +
                " ?i rdfs:label ?label ."+
                " ?i animal:couleur ?couleur .}";

        Query query = QueryFactory.create(rdq);
        QueryExecution qexec = QueryExecutionFactory.create(query, m);
		query.serialize(new IndentedWriter(System.out,true)) ;
		System.out.println();
        Model results = qexec.execConstruct();
    //    System.out.println(results.size());
        results.write(System.out, "N3");
        try {
            FileOutputStream ost = new FileOutputStream("tomConstruct.n3");
            results.write(ost, "N3" ); }
            catch (FileNotFoundException e) {
                System.out.println("pb de fichier");
            }
        qexec.close();
    }
}