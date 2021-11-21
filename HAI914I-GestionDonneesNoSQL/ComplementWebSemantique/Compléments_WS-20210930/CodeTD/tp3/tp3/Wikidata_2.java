package exemples.tp3;

import java.util.Iterator;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

public class Wikidata_2

{
	public static final String NL = System.getProperty("line.separator");

	public static void main(String[] args) {
		String sparqlService = "https://query.wikidata.org/sparql";

		String prolog2 = "PREFIX rdfs: <" + RDFS.getURI() + ">";
		String prolog1 = "PREFIX schema: <http://schema.org/>";
		String prolog3 = "PREFIX wd: <http://www.wikidata.org/entity/>";
		String prolog4 = "PREFIX wdt: <http://www.wikidata.org/prop/direct/>";

		String rdq = prolog1 + NL + prolog2 + NL + prolog3 + NL + prolog4 + NL
				+ "SELECT ?s ?label ?o ?label_s WHERE { bind(wd:Q131144 as ?s) "
				+ " ?s rdfs:label ?label ;  wdt:P31 ?o . "
				+ " ?o rdfs:label ?label_s filter(lang(?label) ='fr' && lang(?label_s) ='fr') }";

		Query query = QueryFactory.create(rdq);
		QueryExecution qexec = QueryExecutionFactory.sparqlService(sparqlService, query);
		try {

			ResultSet rs = qexec.execSelect();
			ResultSetFormatter.out(System.out, rs, query);
		} finally {
			qexec.close();
		}
	}
}