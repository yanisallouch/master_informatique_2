//////////////////////////////////////////////////////////
MATCH (c:Commune {name:'MONTPELLIER'})
CREATE (gf:Personne {nom:"FRECHE",prenom:"GEORGES"}) <-[ap1:ADMINISTREE_PAR {date_debut:1997, date_fin:2004}]- (c),
(hm:Personne {nom:"MANDROUX",prenom:"HELENE"})<-[ap2:ADMINISTREE_PAR {date_debut:2004, date_fin:2014}]-(c), (ps:Personne {nom:"SAUREL",prenom:"PHILIPPE"})<-[ap3:ADMINISTREE_PAR {date_debut:2014, date_fin:2020}]-(c), (md:Personne {nom:"DELAFOSSE",prenom:"MICKAEL"})<-[ap4:ADMINISTREE_PAR {date_debut:2020, date_fin:2026}]-(c)
return *
//////////////////////////////////////////////////////////
call apoc.export.json.query("MATCH (c:Commune)-[w:WITHIN]-(d:Departement), (d)-[w1:WITHIN]-(r:Region)  Return id(c) as ID, labels(c) as Label, c.name as Commune, d.name as Departement, r.name as Region", "export_q2-1.json", {} )
//////////////////////////////////////////////////////////
:GET /rdf/describe/id/0
//
@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix neovoc: <neo4j://vocabulary#> .
@prefix neoind: <neo4j://individuals#> .


neoind:219 neovoc:NEARBY neoind:0 .

neoind:0 a neovoc:Commune;
  neovoc:ADMINISTREE_PAR neoind:254, neoind:255, neoind:256, neoind:257;
  neovoc:WITHIN neoind:236;
  neovoc:codeinsee "34172"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3610769E1;
  neovoc:longitude 3.876716E0;
  neovoc:name "MONTPELLIER" .

neoind:47 neovoc:NEARBY neoind:0 .

neoind:46 neovoc:NEARBY neoind:0 .

neoind:48 neovoc:NEARBY neoind:0 .

neoind:49 neovoc:NEARBY neoind:0 .

neoind:44 neovoc:NEARBY neoind:0 .

neoind:45 neovoc:NEARBY neoind:0 .

neoind:51 neovoc:NEARBY neoind:0 .
//////////////////////////////////////////////////////////
:POST /rdf/cypher { "cypher":"MATCH (c:Commune {name:'MONTPELLIER'}) RETURN c" , "format" : "RDF"}
//
<?xml version="1.0" encoding="UTF-8"?>
<rdf:RDF
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:neovoc="neo4j://vocabulary#"
  xmlns:neoind="neo4j://individuals#">

<rdf:Description rdf:about="neo4j://individuals#0">
  <rdf:type rdf:resource="neo4j://vocabulary#Commune"/>
  <neovoc:name>MONTPELLIER</neovoc:name>
  <neovoc:longitude rdf:datatype="http://www.w3.org/2001/XMLSchema#double">3.876716</neovoc:longitude>
  <neovoc:latitude rdf:datatype="http://www.w3.org/2001/XMLSchema#double">43.610769</neovoc:latitude>
  <neovoc:codeinsee rdf:datatype="http://www.w3.org/2001/XMLSchema#long">34172</neovoc:codeinsee>
</rdf:Description>

</rdf:RDF>
//////////////////////////////////////////////////////////
:POST /rdf/cypher { "cypher":"MATCH (c:Commune {name:'MONTPELLIER'})-[w:ADMINISTREE_PAR]-(p) RETURN c, w, p", "format": "RDF"}
//
<?xml version="1.0" encoding="UTF-8"?>
<rdf:RDF
  xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
  xmlns:neovoc="neo4j://vocabulary#"
  xmlns:neoind="neo4j://individuals#">

<rdf:Description rdf:about="neo4j://individuals#0">
  <rdf:type rdf:resource="neo4j://vocabulary#Commune"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#254">
  <neovoc:prenom>GEORGES</neovoc:prenom>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:name>MONTPELLIER</neovoc:name>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#254">
  <rdf:type rdf:resource="neo4j://vocabulary#Maire"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:longitude rdf:datatype="http://www.w3.org/2001/XMLSchema#double">3.876716</neovoc:longitude>
  <neovoc:latitude rdf:datatype="http://www.w3.org/2001/XMLSchema#double">43.610769</neovoc:latitude>
  <neovoc:codeinsee rdf:datatype="http://www.w3.org/2001/XMLSchema#long">34172</neovoc:codeinsee>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#254">
  <rdf:type rdf:resource="neo4j://vocabulary#Personne"/>
  <neovoc:nom>FRECHE</neovoc:nom>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:ADMINISTREE_PAR rdf:resource="neo4j://individuals#254"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#255">
  <neovoc:nom>MANDROUX</neovoc:nom>
  <neovoc:prenom>HELENE</neovoc:prenom>
  <rdf:type rdf:resource="neo4j://vocabulary#Personne"/>
  <rdf:type rdf:resource="neo4j://vocabulary#Maire"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:ADMINISTREE_PAR rdf:resource="neo4j://individuals#255"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#256">
  <neovoc:nom>SAUREL</neovoc:nom>
  <rdf:type rdf:resource="neo4j://vocabulary#Maire"/>
  <rdf:type rdf:resource="neo4j://vocabulary#Personne"/>
  <neovoc:prenom>PHILIPPE</neovoc:prenom>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:ADMINISTREE_PAR rdf:resource="neo4j://individuals#256"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#257">
  <neovoc:prenom>MICKAEL</neovoc:prenom>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#0">
  <neovoc:ADMINISTREE_PAR rdf:resource="neo4j://individuals#257"/>
</rdf:Description>

<rdf:Description rdf:about="neo4j://individuals#257">
  <rdf:type rdf:resource="neo4j://vocabulary#Personne"/>
  <neovoc:nom>DELAFOSSE</neovoc:nom>
  <rdf:type rdf:resource="neo4j://vocabulary#Maire"/>
</rdf:Description>

</rdf:RDF>
//////////////////////////////////////////////////////////
:POST /rdf/cypher {"cypher":"MATCH (c:Commune {name:'MONTPELLIER'})-[w]-(p) RETURN c, w, p", "format":"rdf"}
//
@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix neovoc: <neo4j://vocabulary#> .
@prefix neoind: <neo4j://individuals#> .


neoind:0 a neovoc:Commune;
  neovoc:ADMINISTREE_PAR neoind:254, neoind:255, neoind:256, neoind:257;
  neovoc:WITHIN neoind:236;
  neovoc:codeinsee "34172"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3610769E1;
  neovoc:longitude 3.876716E0;
  neovoc:name "MONTPELLIER" .

neoind:254 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "FRECHE";
  neovoc:prenom "GEORGES" .

neoind:255 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "MANDROUX";
  neovoc:prenom "HELENE" .

neoind:256 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "SAUREL";
  neovoc:prenom "PHILIPPE" .

neoind:257 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "DELAFOSSE";
  neovoc:prenom "MICKAEL" .

neoind:49 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34129"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3567296E1;
  neovoc:longitude 3.896473E0;
  neovoc:name "LATTES" .

neoind:51 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34327"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3656681E1;
  neovoc:longitude 3.9693E0;
  neovoc:name "VENDARGUES" .

neoind:45 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34077"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3657266E1;
  neovoc:longitude 3.887951E0;
  neovoc:name "CLAPIERS" .

neoind:219 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34145"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.367445E1;
  neovoc:longitude 4.135366E0;
  neovoc:name "LUNEL" .

neoind:47 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34169"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3671824E1;
  neovoc:longitude 3.859265E0;
  neovoc:name "MONTFERRIER-SUR-LEZ" .

neoind:48 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34202"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.35819029E1;
  neovoc:longitude 3.761729E0;
  neovoc:name "PIGNAN" .

neoind:46 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34123"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3611297E1;
  neovoc:longitude 3.812357E0;
  neovoc:name "JUVIGNAC" .

neoind:44 a neovoc:Commune;
  neovoc:NEARBY neoind:0;
  neovoc:codeinsee "34120"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3660874E1;
  neovoc:longitude 3.911453E0;
  neovoc:name "JACOU" .

neoind:236 a neovoc:Departement;
  neovoc:id "34";
  neovoc:name "HERAULT" .
//////////////////////////////////////////////////////////
MATCH (c:Commune)-[a:ADMINISTREE_PAR]-(p:Personne)
MERGE (m:Mandat {date_debut:a.date_debut, date_fin:a.date_fin})<-[:chefDe]-(p)
MERGE (c)<-[:gouvernerPar]-(m)
RETURN c,a,p,m
//////////////////////////////////////////////////////////
:POST /rdf/cypher { "cypher":"MATCH (c:Commune)-[a:ADMINISTREE_PAR]-(p:Personne) MERGE (m:Mandat {date_debut:a.date_debut, date_fin:a.date_fin})<-[:chefDe]-(p) MERGE (c)<-[:gouvernerPar]-(m) RETURN c,a,p,m", "format":"rdf"}
//
@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix neovoc: <neo4j://vocabulary#> .
@prefix neoind: <neo4j://individuals#> .


neoind:254 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "FRECHE";
  neovoc:prenom "GEORGES" .

neoind:0 a neovoc:Commune;
  neovoc:ADMINISTREE_PAR neoind:254, neoind:255, neoind:256, neoind:257;
  neovoc:codeinsee "34172"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:latitude 4.3610769E1;
  neovoc:longitude 3.876716E0;
  neovoc:name "MONTPELLIER" .

neoind:251 a neovoc:Mandat;
  neovoc:date_debut "1997"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:date_fin "2004"^^<http://www.w3.org/2001/XMLSchema#long> .

neoind:255 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "MANDROUX";
  neovoc:prenom "HELENE" .

neoind:247 a neovoc:Mandat;
  neovoc:date_debut "2004"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:date_fin "2014"^^<http://www.w3.org/2001/XMLSchema#long> .

neoind:249 a neovoc:Mandat;
  neovoc:date_debut "2014"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:date_fin "2020"^^<http://www.w3.org/2001/XMLSchema#long> .

neoind:256 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "SAUREL";
  neovoc:prenom "PHILIPPE" .

neoind:257 a neovoc:Maire, neovoc:Personne;
  neovoc:nom "DELAFOSSE";
  neovoc:prenom "MICKAEL" .

neoind:274 a neovoc:Mandat;
  neovoc:date_debut "2020"^^<http://www.w3.org/2001/XMLSchema#long>;
  neovoc:date_fin "2026"^^<http://www.w3.org/2001/XMLSchema#long> .
//////////////////////////////////////////////////////////
CREATE INDEX ON :Resource(uri) 
//////////////////////////////////////////////////////////
WITH ' PREFIX sch: <http://schema.org/> 
CONSTRUCT{ ?item a sch:City; 
           sch:address ?inseeCode; 
           sch:name ?itemLabel ; 
           sch:geoTouches ?otherItem .
	   ?otherItem a sch:City;	
	   sch:name ?otheritemLabel ;
	   sch:address ?otherinseeCode . } 
WHERE { ?item wdt:P374 ?inseeCode .
	?item wdt:P47 ?otherItem .
	?otherItem wdt:P374 ?otherinseeCode .
        ?item rdfs:label ?itemLabel . 
          filter(lang(?itemLabel) = "fr")  . 
        ?otherItem rdfs:label ?otheritemLabel . 
          filter(lang(?otheritemLabel) = "fr")  .
	 FILTER regex(?inseeCode, "^34")  .
        } ' AS sparql CALL semantics.importRDF(
  "https://query.wikidata.org/sparql?query=" +  
      apoc.text.urlencode(sparql),"JSON-LD", 
    { headerParams: { Accept: "application/ld+json"} })
YIELD terminationStatus, triplesLoaded,namespaces,extraInfo
RETURN terminationStatus, triplesLoaded,namespaces,extraInfo
//////////////////////////////////////////////////////////
MATCH (n:sch__City)
MATCH (d:Departement{name:"HERAULT"})
MERGE (n)-[:WITHIN]->(d)
RETURN n,d
//////////////////////////////////////////////////////////
MATCH (n:Commune)-[r]-()
DELETE n,r
//////////////////////////////////////////////////////////
MATCH (n:sch__City)-[r:sch__geoTouches]-(m:sch__City {sch__name:"Montpellier"})
RETURN m.sch__name as Commune, Count(n) as nombreCommuneLimitrophe
//////////////////////////////////////////////////////////
MATCH p=shortestPath((n:sch__City)-[*]-(m:sch__City))
WHERE n.sch__name='Montpellier' and m.sch__name='Beaulieu'
RETURN p
//////////////////////////////////////////////////////////
MATCH p=allshortestPaths((n:sch__City)-[*]-(m:sch__City))
WHERE n.sch__name='Montpellier' and m.sch__name='Beaulieu'
RETURN p
//////////////////////////////////////////////////////////
MATCH p=allshortestPaths( (m:sch__City)-[*]-(n:sch__City))
WHERE m.sch__name='Montpellier' and n.sch__name = 'Beaulieu'
RETURN extract (n in nodes(p) | {name:n.sch__name}) as communesSurLeChemin
//////////////////////////////////////////////////////////
MATCH p=allshortestPaths( (m:sch__City)-[*]-(n:sch__City))
WHERE m.sch__name='Montpellier' and n.sch__name = 'Beaulieu'
RETURN extract (n in nodes(p) | {name:n.sch__name, code:n.sch__address}) as communesSurLeChemin
//////////////////////////////////////////////////////////
MATCH p=allshortestPaths( (m:sch__City)-[*]-(n:sch__City))
WHERE m.sch__nale='Montpellier' and n.sch__name = 'Beaulieu'
RETURN Count(p) as nbPLusCourtChemin