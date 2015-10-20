package no.persoft;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * Created by Per-Arne on 20.10.2015.
 */
public class Main {


    public static void main(String[] args)
    {

        OntModel m = ModelFactory.createOntologyModel();

        OntClass ikt37 = m.createClass("IKT 437");


        DatatypeProperty courses = m.getDatatypeProperty("hasItems");


        ikt37.addProperty(courses, "Itmes");



    }




}
