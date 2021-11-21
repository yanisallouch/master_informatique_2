package exemples.tp2;

import org.apache.jena.rdf.model.AnonId;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.RDFVisitor;
import org.apache.jena.rdf.model.Resource;


public class Un_Visiteur implements RDFVisitor {
	public Object visitBlank(Resource r, AnonId id) {
	return "anon: " + id;
	}
	public Object visitURI(Resource r, String uri) {
	return r.getLocalName();
	}
	public Object visitLiteral(Literal l) {
	return l.getValue(); 
	}
	}