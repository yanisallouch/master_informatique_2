// Section 3.1

//-----------------------------------------------
// Setup
match (n:Commune { name:'MONTPELLIER'}) -[w:WITHIN]-> (d:Departement{name:'HERAULT'}) SET w.CHEF_LIEU_DEP="TRUE"
//
match (n:Commune { name:'NIMES'}) -[w:WITHIN]-> (d:Departement{name:'GARD'}) SET w.CHEF_LIEU_DEP="TRUE"
//
MATCH (h:Departement {name:'HAUTE-GARONNE'}), (r:Region {name:'OCCITANIE'})<-[w1:WITHIN]-(h)
MERGE (n:Commune {name: "TOULOUSE", latitude:43.604652, longitude:1.444209, codeinsee:'31555'}) -[w2:WITHIN]-> (h)
MERGE (n)-[w3:WITHIN]->(r)
SET w2.CHEF_LIEU_DEP="TRUE"
SET w3.CHEF_LIEU_REG="TRUE"
//-----------------------------------------------
//1
MATCH (:Departement)-[:WITHIN]->(c:Region {name:"OCCITANIE"})
WITH c, count(*) as nD
RETURN c.name as Reg, nD as departement
//2
MATCH (:Departement)-[:WITHIN]->(c:Region)
WITH c, count(*) as nD
RETURN c.name as Reg, nD as departement
//3
MATCH (:Departement)-[:WITHIN]->(c:Region)
WITH c, count(*) as nD
WHERE nD > 6
RETURN c.name as Reg, nD as departement
//4
MATCH (c:Commune)-[:WITHIN]->(d:Departement)
WITH c, d
WHERE  (c)-[:NEARBY]-(:Commune {name:"MONTPELLIER"})
RETURN c.name as commune, d.name as departement
//5
MATCH (i:Commune)-[:NEARBY*]-(:Commune {name:"MONTPELLIER"})
WHERE NOT (i) -[:WITHIN]-> (:Departement {name:"HERAULT"})
RETURN i.name as commune, i.codeinsee as codeinsee
//6
MATCH (c:Commune)-[w:WITHIN]-(d:Departement), (d)-[w2:WITHIN]-(r:Region)
RETURN c.name as commune, r.name as region, d.name as departement
//7
MATCH p=allshortestPaths( (m:Commune)-[:NEARBY*]-(n:Commune) )
WHERE m.name='MONTPELLIER' and n.name = 'NIMES'
RETURN extract (n in nodes(p) | n.name) as communesSurLeChemin
//8
MATCH p=shortestPath( (m:Commune)-[:NEARBY*]-(n:Commune) )
WHERE m.name='MONTPELLIER' and n.name = 'NIMES'
RETURN extract (n in nodes(p) | n.name) as communesSurLeChemin
