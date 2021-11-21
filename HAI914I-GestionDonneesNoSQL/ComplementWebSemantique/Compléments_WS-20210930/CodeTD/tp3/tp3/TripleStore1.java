package exemples.tp3;

import org.apache.jena.query.Dataset ;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;

import org.apache.jena.tdb.TDBFactory;

public class TripleStore1
{
	public static final String rdf_file = "tomAndWikidata.n3";
    public static void main(String[] args)
    {
        String directory = "/home/isa/Bureau/TS_Tom" ;
        Dataset ds = TDBFactory.createDataset(directory) ;
        Model model = ds.getDefaultModel() ;
        model.read(rdf_file );
    	StmtIterator stmt_i = model.listStatements();
    	System.out.println("Objets des triplets du modele ");
    	System.out.println(" ========================== ");
    	while (stmt_i.hasNext())
    	{ 
    		Statement stmt = stmt_i.nextStatement();
    		RDFNode o = stmt.getObject();
    		if (o instanceof Resource)
	    	{ 
    			Resource or = (Resource) o; 
    			if (or.isAnon())
	    	System.out.println(" Noeud anonyme "+or.getId());
	    	else	System.out.println(" Nom objet "+or.getLocalName());}
    		else if (o.isLiteral())
	    	{	Literal ol = (Literal) o;
	    		System.out.println(" Valeur litteral "+ol.getLexicalForm());}
	    	}  
        ds.close();
    }
}