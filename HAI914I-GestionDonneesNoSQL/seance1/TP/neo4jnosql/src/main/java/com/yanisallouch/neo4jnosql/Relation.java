package com.yanisallouch.neo4jnosql;

import org.neo4j.graphdb.RelationshipType;

public enum Relation implements RelationshipType {

	WORKS_WITH, WORKS_FOR, FRIEND, OWNS, ENROLLED_IN
}