for n in {0..100};  
do
for qt in testsuite/templates/*.sparql-template; 
do
   qt2=${qt##*templates/}
   bin/Release/watdiv -q model/wsdbm-data-model.txt ${qt} 1000 1 > testsuite/queries/${qt2%.sparql-template}_${n}_1000.queryset ;
done;
done;