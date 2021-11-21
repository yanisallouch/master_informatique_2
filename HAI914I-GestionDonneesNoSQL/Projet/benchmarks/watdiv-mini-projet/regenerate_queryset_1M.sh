for qt in testsuite/templates/*.sparql-template; 
do
   qt2=${qt##*templates/}
   bin/Release/watdiv -q model/wsdbm-data-model.txt ${qt} 10000 1 > testsuite/queries/${qt2%.sparql-template}_10000.queryset ;
done;
