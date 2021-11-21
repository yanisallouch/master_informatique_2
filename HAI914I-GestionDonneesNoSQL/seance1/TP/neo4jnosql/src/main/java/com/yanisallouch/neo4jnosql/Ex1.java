package com.yanisallouch.neo4jnosql;

import java.io.File;
import java.util.Map;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Result;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class Ex1 {
	private enum Ex_Labels implements Label {
		DOCTOR, TEACHER, STUDENT, SCHOOL
	}

	private static final File DB_Folder = new File("C:\\neo4j-community-3.5.21_Ext\\data\\databases\\graph.db");

	public static void main(String[] args) {
		GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		GraphDatabaseService graphDB = dbFactory.newEmbeddedDatabase(Ex1.DB_Folder);

		try (Transaction tx = graphDB.beginTx()) {

			Result result;
			int cpt;
//
//			Node tom_node = graphDB.createNode(Ex_Labels.STUDENT);
//			Node um_node = graphDB.createNode(Ex_Labels.SCHOOL);
//			um_node.setProperty("name", "UM");
//			um_node.setProperty("city", "Montpellier");
//			um_node.setProperty("from", "France");
//			tom_node.setProperty("name", "Tom");
//			tom_node.createRelationshipTo(um_node, Relation.ENROLLED_IN);

			result = graphDB.execute("MATCH (u:SCHOOL) <-[ENROLLED_IN]- (s:STUDENT) " + "WHERE s.name = 'Tom'"
					+ "RETURN u.name, u.city");
			while (result.hasNext()) {
				Map<String, Object> row = result.next();
				for (String key : result.columns()) {
					System.out.printf("%s = %s%n", key, row.get(key));
				}
			}

			System.out.println("1. renvoyer le nombre de catégories (labels) venant typer les noeuds du graphe");
			result = graphDB.execute("MATCH (n) RETURN DISTINCT LABELS(n), COUNT(n)");
			cpt = 0;
			while (result.hasNext()) {
				result.next();
				for (String key : result.columns()) {
					// System.out.printf("%s = %-15s\t|\t", key, row.get(key));
					if (key.equals("LABELS(n)")) {
					} else {
						cpt++;
					}
				}
			}
			System.out.println("COUNT(LABELS) = " + cpt + "\n");

			System.out.println("2. renvoyer le nombre de catégories (type) venant typer les relations du graphe");
			result = graphDB.execute("MATCH (n)-[r]-() RETURN DISTINCT TYPE(r), COUNT(r)");
			cpt = 0;
			while (result.hasNext()) {
				result.next();
				for (String key : result.columns()) {
					// System.out.printf("%s = %-15s\t|\t", key, row.get(key));
					if (key.equals("TYPE(r)")) {
					} else {
						cpt++;
					}
				}
			}
			System.out.println("COUNT(TYPE) = " + cpt + "\n");

			System.out.println(
					"3. renvoyer les catégories de noeuds et les types de relations nouées à partir de ces noeuds");
			result = graphDB.execute(
					"MATCH (n)-[r]-() WITH n, r  RETURN DISTINCT LABELS(n), TYPE(r) ORDER BY LABELS(n), TYPE(r)");
			cpt = 0;
			while (result.hasNext()) {
				Map<String, Object> row = result.next();
				for (String key : result.columns()) {
					System.out.printf("%d. %s = %-20s\t|\t", cpt, key, row.get(key));
					if (key.equals("LABELS(n)")) {

					} else {
						cpt = cpt + 1;
						System.out.println("");
					}
				}
			}
			System.out.println("");

			System.out.println("4. retourner le type et le nombre d’instances de relation");
			result = graphDB.execute("MATCH (n)-[r]-() RETURN DISTINCT TYPE(r), COUNT(r)");
			cpt = 0;
			while (result.hasNext()) {
				Map<String, Object> row = result.next();
				for (String key : result.columns()) {
					System.out.printf("%d. %s = %-15s\t|\t", cpt, key, row.get(key));
					if (key.equals("TYPE(r)")) {
					} else {
						cpt++;
						System.out.println("");
					}
				}
			}
			System.out.println("");

			tx.success();
		}
	}
}
