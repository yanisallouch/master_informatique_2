package exemples.tpSuite;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.shared.PrefixMapping;

public class KbVocabulary {
	
    // define models
static final String animal_ns = "http://www.ex.fr/animal#";

private static Model core_model = ModelFactory.createDefaultModel();

public static String getUri()
{return animal_ns;}


static {
      
        core_model.setNsPrefixes(PrefixMapping.Standard);
        core_model.setNsPrefix("animal", animal_ns);
    }

public static final Resource
// entities
Personnage = core_model.createResource(animal_ns + "Personnage"),
Chat = core_model.createResource(animal_ns + "Chat"),
Souris = core_model.createResource(animal_ns + "Souris"),
Canari = core_model.createResource(animal_ns + "Canari"),
tom = core_model.createResource(animal_ns + "Tom"),
titi = core_model.createResource(animal_ns + "Titi"),
sylvestre = core_model.createResource(animal_ns + "Sylvestre"),
jerry = core_model.createResource(animal_ns + "Jerry")
;

public static final Property
// properties
couleur = core_model.createProperty(animal_ns, "couleur"),
age = core_model.createProperty(animal_ns, "age"),
interagitAvec = core_model.createProperty(animal_ns, "interagitAvec") ;

}