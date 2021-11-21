# *********************************************************************
# 4.1 MAP seulement
########################################################################
########################################################################
########################################################################
# 1. donnez toutes les informations sur les régions (de type old region) de la base
curl -X PUT $COUCH3/$DB_NAME/_design/oldregion -d @oldregion.js
# {"ok":true,"id":"_design/oldregion","rev":"1-23a6f9c9273aa1492061deaee896a2d8"}
#
# oldregion.js :
#
#{
#"_id":"_design/oldregion",
#"language":"javascript",
#    "views":{ "oldregion":{
#              "map" : "function(doc) { if (doc.type=='old_region') {emit(doc.id, doc)}}"
#        }
#    }
#}
curl -X GET $COUCH3/$DB_NAME/_design/oldregion/_view/oldregion
# {"total_rows":3,"offset":0,"rows":[
# {"id":"53","key":null,"value":{"_id":"53","_rev":"1-148e83a58b22b44c09dedc8fc301a6bf","reg":"53","type":"old_region","chef_lieu_reg":"35238","nom_reg":"BRETAGNE","departements":[{"dep":"56","nom_dep":"MORBIHAN","chef_lieu_dep":"56260"},{"dep":"35","nom_dep":"ILLE-ET-VILAINE","chef_lieu_dep":"35238"},{"dep":"29","nom_dep":"FINISTERE","chef_lieu_dep":"29232"},{"dep":"22","nom_dep":"COTES-D'ARMOR","chef_lieu_dep":"22278"}]}},
# {"id":"73","key":null,"value":{"_id":"73","_rev":"1-072ad97e650976f986baa93526549bdf","reg":"73","new_reg":"occitanie","chef_lieu_reg":"31555","nom_reg":"MIDI-PYRENEES","type":"old_region"}},
# {"id":"91","key":null,"value":{"_id":"91","_rev":"1-56783ec078b22a4de2039390f10115e0","reg":"91","chef_lieu_reg":"34172","type":"old_region","new_reg":"occitanie","nom_reg":"LANGUEDOC-ROUSSILLON","departements":[{"dep":"34","nom_dep":"HERAULT","chef_lieu_dep":"34172"},{"dep":"30","nom_dep":"GARD","chef_lieu_dep":"30189"},{"dep":"11","nom_dep":"AUDE","chef_lieu_dep":"11069"},{"dep":"66","nom_dep":"PYRENEES-ORIENTALES","chef_lieu_dep":"66136"}]}}
# ]}
########################################################################
########################################################################
########################################################################
# 2. donner les noms (cles) et latitude et longitude de chaque commune
curl -X PUT $COUCH3/$DB_NAME/_design/coordonnecommune -d @gps_commune.js
# {"ok":true,"id":"_design/coordonnecommune","rev":"1-6aa942ef38e7013da4daee1c4c9c3e0e"}
#
# gps_commune.js :
#
#{
#"_id":"_design/coordonnecommune",
#"language":"javascript",
#    "views":{ "coordonnecommune":{
#              "map" : "function(doc) { if (doc.type=='commune') {emit(doc.id, {"longitude":doc.longitude, "latitude":doc.latitude"})}}"
#        }
#    }
#}
curl -X GET $COUCH3/$DB_NAME/_design/coordonnecommune/_view/coordonnecommune
# {"total_rows":310,"offset":0,"rows":[
# {"id":"12100","key":null,"value":{"longitude":"2.3068719","latitude":"44.541155"}},
# {"id":"12101","key":null,"value":{"longitude":"2.2464369","latitude":"44.60439"}},
# {"id":"12102","key":null,"value":{"longitude":"2.603146","latitude":"44.289231"}},
# {"id":"12103","key":null,"value":{"longitude":"2.680656","latitude":"44.650497"}},
# {"id":"12104","key":null,"value":{"longitude":"2.003604","latitude":"44.5103099"}},
# {"id":"12105","key":null,"value":{"longitude":"2.040994","latitude":"44.2309399"}},
# {"id":"12106","key":null,"value":{"longitude":"2.791774","latitude":"44.453399"}},
# {"id":"12107","key":null,"value":{"longitude":"2.9305279","latitude":"44.355137"}},
# {"id":"12108","key":null,"value":{"longitude":"2.178495","latitude":"44.501997"}},
# {"id":"12109","key":null,"value":{"longitude":"2.931512","latitude":"43.84675"}},
# {"id":"12110","key":null,"value":{"longitude":"2.583646","latitude":"44.605428"}},
# {"id":"12111","key":null,"value":{"longitude":"2.370077","latitude":"44.442564"}},
# {"id":"12112","key":null,"value":{"longitude":"2.779032","latitude":"44.7641909"}},
# {"id":"12113","key":null,"value":{"longitude":"2.366895","latitude":"44.264976"}},
# {"id":"12114","key":null,"value":{"longitude":"2.3581979","latitude":"44.629347"}},
# {"id":"12115","key":null,"value":{"longitude":"3.195591","latitude":"43.97316"}},
# {"id":"12116","key":null,"value":{"longitude":"2.761407","latitude":"44.71248"}},
# {"id":"12117","key":null,"value":{"longitude":"2.8827029","latitude":"44.772803"}},
# {"id":"12118","key":null,"value":{"longitude":"2.636106","latitude":"44.778252"}},
# {"id":"12119","key":null,"value":{"longitude":"2.845605","latitude":"44.683579"}},
# {"id":"12120","key":null,"value":{"longitude":"2.8221029","latitude":"44.38091"}},
# {"id":"12121","key":null,"value":{"longitude":"2.16112","latitude":"44.424712"}},
# {"id":"12122","key":null,"value":{"longitude":"3.098039","latitude":"43.9956249"}},
# {"id":"12123","key":null,"value":{"longitude":"3.030504","latitude":"44.335423"}},
# {"id":"12124","key":null,"value":{"longitude":"2.864163","latitude":"44.486583"}},
# {"id":"12125","key":null,"value":{"longitude":"2.623361","latitude":"43.7923199"}},
# {"id":"12126","key":null,"value":{"longitude":"3.003384","latitude":"44.309423"}},
# {"id":"12127","key":null,"value":{"longitude":"2.439815","latitude":"44.088735"}},
# {"id":"12128","key":null,"value":{"longitude":"2.147231","latitude":"44.230447"}},
# {"id":"12129","key":null,"value":{"longitude":"2.6609409","latitude":"44.059432"}},
# {"id":"12130","key":null,"value":{"longitude":"2.2310789","latitude":"44.5912099"}},
# {"id":"12131","key":null,"value":{"longitude":"2.667245","latitude":"44.371049"}},
# {"id":"12133","key":null,"value":{"longitude":"2.535384","latitude":"44.314058"}},
# {"id":"12134","key":null,"value":{"longitude":"2.260088","latitude":"44.481508"}},
# {"id":"12135","key":null,"value":{"longitude":"2.110506","latitude":"44.235908"}},
# {"id":"12136","key":null,"value":{"longitude":"2.10191","latitude":"44.398883"}},
# {"id":"12137","key":null,"value":{"longitude":"2.470469","latitude":"44.255088"}},
# {"id":"12138","key":null,"value":{"longitude":"2.462587","latitude":"44.474899"}},
# {"id":"12139","key":null,"value":{"longitude":"3.0306","latitude":"43.8733"}},
# {"id":"12140","key":null,"value":{"longitude":"1.923258","latitude":"44.376779"}},
# {"id":"12141","key":null,"value":{"longitude":"2.620405","latitude":"43.938967"}},
# {"id":"12142","key":null,"value":{"longitude":"2.363362","latitude":"44.388035"}},
# {"id":"12143","key":null,"value":{"longitude":"3.017677","latitude":"43.739512"}},
# {"id":"12144","key":null,"value":{"longitude":"2.4352109","latitude":"44.138002"}},
# {"id":"12145","key":null,"value":{"longitude":"3.077801","latitude":"44.100575"}},
# {"id":"12146","key":null,"value":{"longitude":"2.580307","latitude":"44.3431659"}},
# {"id":"12147","key":null,"value":{"longitude":"3.013407","latitude":"43.83836"}},
# {"id":"12148","key":null,"value":{"longitude":"2.229185","latitude":"44.476868"}},
# {"id":"12149","key":null,"value":{"longitude":"2.648045","latitude":"43.967534"}},
# {"id":"12150","key":null,"value":{"longitude":"1.998179","latitude":"44.26547"}},
# {"id":"12151","key":null,"value":{"longitude":"2.640329","latitude":"44.709426"}},
# {"id":"12152","key":null,"value":{"longitude":"2.5681949","latitude":"43.842494"}},
# {"id":"12153","key":null,"value":{"longitude":"2.9023089","latitude":"44.101957"}},
# {"id":"12154","key":null,"value":{"longitude":"2.834124","latitude":"43.879171"}},
# {"id":"30300","key":null,"value":{"longitude":"4.081816","latitude":"43.941825"}},
# {"id":"30301","key":null,"value":{"longitude":"4.483002","latitude":"44.041673"}},
# {"id":"30302","key":null,"value":{"longitude":"4.6413209","latitude":"44.060359"}},
# {"id":"30303","key":null,"value":{"longitude":"4.221388","latitude":"44.246948"}},
# {"id":"30304","key":null,"value":{"longitude":"4.525694","latitude":"44.259989"}},
# {"id":"30305","key":null,"value":{"longitude":"4.160302","latitude":"44.167109"}},
# {"id":"30306","key":null,"value":{"longitude":"4.067847","latitude":"43.811215"}},
# {"id":"30307","key":null,"value":{"longitude":"4.033995","latitude":"44.2071789"}},
# {"id":"30308","key":null,"value":{"longitude":"4.425435","latitude":"43.954454"}},
# {"id":"30309","key":null,"value":{"longitude":"4.041635","latitude":"43.873393"}},
# {"id":"30310","key":null,"value":{"longitude":"3.762631","latitude":"44.118296"}},
# {"id":"30311","key":null,"value":{"longitude":"3.949454","latitude":"43.940731"}},
# {"id":"30312","key":null,"value":{"longitude":"4.793843","latitude":"44.024696"}},
# {"id":"30313","key":null,"value":{"longitude":"4.210193","latitude":"43.962179"}},
# {"id":"30314","key":null,"value":{"longitude":"4.0835549","latitude":"43.961381"}},
# {"id":"30315","key":null,"value":{"longitude":"4.681451","latitude":"43.94146"}},
# {"id":"30316","key":null,"value":{"longitude":"4.026705","latitude":"44.326733"}},
# {"id":"30317","key":null,"value":{"longitude":"4.55152","latitude":"43.910916"}},
# {"id":"30318","key":null,"value":{"longitude":"4.192423","latitude":"44.152133"}},
# {"id":"30319","key":null,"value":{"longitude":"4.355749","latitude":"44.038861"}},
# {"id":"30320","key":null,"value":{"longitude":"4.284184","latitude":"44.116447"}},
# {"id":"30321","key":null,"value":{"longitude":"4.089738","latitude":"43.78345"}},
# {"id":"30322","key":null,"value":{"longitude":"3.82936","latitude":"44.063588"}},
# {"id":"30323","key":null,"value":{"longitude":"4.0122","latitude":"44.1758"}},
# {"id":"30324","key":null,"value":{"longitude":"4.121526","latitude":"43.815669"}},
# {"id":"30325","key":null,"value":{"longitude":"3.714011","latitude":"43.979192"}},
# {"id":"30326","key":null,"value":{"longitude":"4.698161","latitude":"44.01293"}},
# {"id":"30327","key":null,"value":{"longitude":"4.310923","latitude":"44.241357"}},
# {"id":"30328","key":null,"value":{"longitude":"4.6208159","latitude":"43.898626"}},
# {"id":"30329","key":null,"value":{"longitude":"3.926833","latitude":"44.064516"}},
# {"id":"30330","key":null,"value":{"longitude":"3.997929","latitude":"44.022678"}},
# {"id":"30331","key":null,"value":{"longitude":"4.588198","latitude":"44.1063339"}},
# {"id":"30332","key":null,"value":{"longitude":"3.388931","latitude":"44.078389"}},
# {"id":"30333","key":null,"value":{"longitude":"4.267574","latitude":"43.756062"}},
# {"id":"30334","key":null,"value":{"longitude":"4.419946","latitude":"44.01211"}},
# {"id":"30335","key":null,"value":{"longitude":"3.887914","latitude":"44.032308"}},
# {"id":"30336","key":null,"value":{"longitude":"4.628383","latitude":"43.853401"}},
# {"id":"30337","key":null,"value":{"longitude":"4.477507","latitude":"44.060291"}},
# {"id":"30338","key":null,"value":{"longitude":"4.352839","latitude":"44.131606"}},
# {"id":"30339","key":null,"value":{"longitude":"3.64152","latitude":"44.081018"}},
# {"id":"30340","key":null,"value":{"longitude":"4.578701","latitude":"44.006745"}},
# {"id":"30341","key":null,"value":{"longitude":"4.278326","latitude":"43.692984"}},
# {"id":"30342","key":null,"value":{"longitude":"4.657324","latitude":"44.196915"}},
# {"id":"30343","key":null,"value":{"longitude":"4.445796","latitude":"44.170397"}},
# {"id":"30344","key":null,"value":{"longitude":"4.220695","latitude":"43.743522"}},
# {"id":"30345","key":null,"value":{"longitude":"4.006832","latitude":"44.286961"}},
# {"id":"30346","key":null,"value":{"longitude":"4.52405","latitude":"43.9670879"}},
# {"id":"30347","key":null,"value":{"longitude":"4.258625","latitude":"43.740442"}},
# {"id":"30348","key":null,"value":{"longitude":"4.13701","latitude":"44.052407"}},
# {"id":"30349","key":null,"value":{"longitude":"4.083147","latitude":"43.869191"}},
# {"id":"30350","key":null,"value":{"longitude":"3.606322","latitude":"43.992927"}},
# {"id":"30351","key":null,"value":{"longitude":"4.796959","latitude":"43.96341"}},
# {"id":"30352","key":null,"value":{"longitude":"4.097864","latitude":"43.794979"}},
# {"id":"30353","key":null,"value":{"longitude":"3.458948","latitude":"43.899744"}},
# {"id":"30354","key":null,"value":{"longitude":"4.147969","latitude":"43.9372929"}},
# {"id":"30355","key":null,"value":{"longitude":"4.613772","latitude":"44.0816609"}},
# {"id":"30356","key":null,"value":{"longitude":"4.433086","latitude":"43.825125"}},
# {"id":"31100","key":null,"value":{"longitude":"1.632733","latitude":"43.286726"}},
# {"id":"31101","key":null,"value":{"longitude":"1.179779","latitude":"43.474459"}},
# {"id":"31102","key":null,"value":{"longitude":"1.791883","latitude":"43.488899"}},
# {"id":"31103","key":null,"value":{"longitude":"1.330085","latitude":"43.217166"}},
# {"id":"31104","key":null,"value":{"longitude":"1.257628","latitude":"43.336511"}},
# {"id":"31105","key":null,"value":{"longitude":"1.702717","latitude":"43.499714"}},
# {"id":"31106","key":null,"value":{"longitude":"1.760954","latitude":"43.529232"}},
# {"id":"31107","key":null,"value":{"longitude":"1.22576","latitude":"43.294811"}},
# {"id":"31108","key":null,"value":{"longitude":".682937","latitude":"43.198206"}},
# {"id":"31109","key":null,"value":{"longitude":".79226","latitude":"43.2271"}},
# {"id":"31110","key":null,"value":{"longitude":".989226","latitude":"43.122619"}},
# {"id":"31111","key":null,"value":{"longitude":"1.35421","latitude":"43.228343"}},
# {"id":"31112","key":null,"value":{"longitude":".979541","latitude":"43.054262"}},
# {"id":"31113","key":null,"value":{"longitude":"1.499573","latitude":"43.51563"}},
# {"id":"31114","key":null,"value":{"longitude":".923307","latitude":"43.035583"}},
# {"id":"31115","key":null,"value":{"longitude":".900859","latitude":"43.35455"}},
# {"id":"31116","key":null,"value":{"longitude":"1.428006","latitude":"43.693262"}},
# {"id":"31117","key":null,"value":{"longitude":"1.53247","latitude":"43.67732"}},
# {"id":"31118","key":null,"value":{"longitude":"1.35767","latitude":"43.783897"}},
# {"id":"31119","key":null,"value":{"longitude":"1.017325","latitude":"43.306315"}},
# {"id":"31120","key":null,"value":{"longitude":"1.13917","latitude":"43.672323"}},
# {"id":"31121","key":null,"value":{"longitude":".780353","latitude":"43.276931"}},
# {"id":"31122","key":null,"value":{"longitude":"1.008329","latitude":"43.331898"}},
# {"id":"31123","key":null,"value":{"longitude":".5337769","latitude":"42.8056849"}},
# {"id":"31124","key":null,"value":{"longitude":".858299","latitude":"43.134121"}},
# {"id":"31125","key":null,"value":{"longitude":".506018","latitude":"42.810353"}},
# {"id":"31126","key":null,"value":{"longitude":"1.0845149","latitude":"43.714303"}},
# {"id":"31127","key":null,"value":{"longitude":".523021","latitude":"42.851062"}},
# {"id":"31128","key":null,"value":{"longitude":"1.468521","latitude":"43.298771"}},
# {"id":"31129","key":null,"value":{"longitude":".578906","latitude":"42.798929"}},
# {"id":"31130","key":null,"value":{"longitude":".545758","latitude":"43.184906"}},
# {"id":"31131","key":null,"value":{"longitude":".73471","latitude":"42.985917"}},
# {"id":"31132","key":null,"value":{"longitude":".607939","latitude":"42.868436"}},
# {"id":"31133","key":null,"value":{"longitude":".531879","latitude":"42.806696"}},
# {"id":"31134","key":null,"value":{"longitude":".858445","latitude":"43.182424"}},
# {"id":"31135","key":null,"value":{"longitude":"1.086645","latitude":"43.205201"}},
# {"id":"31136","key":null,"value":{"longitude":"1.4322","latitude":"43.750797"}},
# {"id":"31137","key":null,"value":{"longitude":"1.740848","latitude":"43.456612"}},
# {"id":"31138","key":null,"value":{"longitude":".691825","latitude":"43.227146"}},
# {"id":"31139","key":null,"value":{"longitude":".655738","latitude":"42.937876"}},
# {"id":"31140","key":null,"value":{"longitude":".883529","latitude":"43.018832"}},
# {"id":"31141","key":null,"value":{"longitude":".736922","latitude":"43.260476"}},
# {"id":"31142","key":null,"value":{"longitude":".60049","latitude":"42.85615"}},
# {"id":"31143","key":null,"value":{"longitude":".633765","latitude":"43.060995"}},
# {"id":"31144","key":null,"value":{"longitude":".6394","latitude":"42.9164"}},
# {"id":"31145","key":null,"value":{"longitude":"1.53157","latitude":"43.313989"}},
# {"id":"31146","key":null,"value":{"longitude":".517703","latitude":"42.852436"}},
# {"id":"31147","key":null,"value":{"longitude":".626175","latitude":"43.097844"}},
# {"id":"31148","key":null,"value":{"longitude":"1.432748","latitude":"43.457742"}},
# {"id":"31149","key":null,"value":{"longitude":"1.336579","latitude":"43.612189"}},
# {"id":"31150","key":null,"value":{"longitude":"1.326251","latitude":"43.649136"}},
# {"id":"31151","key":null,"value":{"longitude":"1.497457","latitude":"43.473039"}},
# {"id":"31152","key":null,"value":{"longitude":".885734","latitude":"43.349683"}},
# {"id":"31153","key":null,"value":{"longitude":"1.088911","latitude":"43.200967"}},
# {"id":"31155","key":null,"value":{"longitude":".821962","latitude":"43.051899"}},
# {"id":"31156","key":null,"value":{"longitude":"1.042266","latitude":"43.760883"}},
# {"id":"31157","key":null,"value":{"longitude":"1.344995","latitude":"43.537141"}},
# {"id":"31158","key":null,"value":{"longitude":".536488","latitude":"43.099341"}},
# {"id":"31159","key":null,"value":{"longitude":".615815","latitude":"43.1457369"}},
# {"id":"31160","key":null,"value":{"longitude":"1.269206","latitude":"43.694109"}},
# {"id":"31161","key":null,"value":{"longitude":"1.531064","latitude":"43.484126"}},
# {"id":"31162","key":null,"value":{"longitude":"1.5506","latitude":"43.472739"}},
# {"id":"31163","key":null,"value":{"longitude":"1.602243","latitude":"43.596829"}},
# {"id":"31164","key":null,"value":{"longitude":"1.099049","latitude":"43.754211"}},
# {"id":"31165","key":null,"value":{"longitude":"1.354479","latitude":"43.421645"}},
# {"id":"31166","key":null,"value":{"longitude":"1.087962","latitude":"43.530754"}},
# {"id":"31167","key":null,"value":{"longitude":".743888","latitude":"43.0506839"}},
# {"id":"31168","key":null,"value":{"longitude":".886593","latitude":"43.272413"}},
# {"id":"31169","key":null,"value":{"longitude":"1.559973","latitude":"43.518518"}},
# {"id":"31170","key":null,"value":{"longitude":".749592","latitude":"43.272842"}},
# {"id":"31171","key":null,"value":{"longitude":"1.488485","latitude":"43.4513729"}},
# {"id":"31172","key":null,"value":{"longitude":".805631","latitude":"43.264874"}},
# {"id":"31173","key":null,"value":{"longitude":"1.400255","latitude":"43.297632"}},
# {"id":"31174","key":null,"value":{"longitude":".847239","latitude":"43.035279"}},
# {"id":"31175","key":null,"value":{"longitude":".7856689","latitude":"43.10522"}},
# {"id":"31176","key":null,"value":{"longitude":".641375","latitude":"42.947272"}},
# {"id":"31177","key":null,"value":{"longitude":".687898","latitude":"42.926786"}},
# {"id":"31178","key":null,"value":{"longitude":".895048","latitude":"43.31376"}},
# {"id":"31179","key":null,"value":{"longitude":"1.826962","latitude":"43.566997"}},
# {"id":"31180","key":null,"value":{"longitude":"1.860273","latitude":"43.478246"}},
# {"id":"31181","key":null,"value":{"longitude":"1.3000449","latitude":"43.399711"}},
# {"id":"31182","key":null,"value":{"longitude":"1.392018","latitude":"43.679151"}},
# {"id":"31183","key":null,"value":{"longitude":".897827","latitude":"43.084797"}},
# {"id":"31184","key":null,"value":{"longitude":"1.562375","latitude":"43.5947"}},
# {"id":"31185","key":null,"value":{"longitude":"1.786977","latitude":"43.4076639"}},
# {"id":"31186","key":null,"value":{"longitude":"1.443648","latitude":"43.681019"}},
# {"id":"31187","key":null,"value":{"longitude":"1.230645","latitude":"43.535456"}},
# {"id":"31188","key":null,"value":{"longitude":"1.19141","latitude":"43.552556"}},
# {"id":"31189","key":null,"value":{"longitude":"1.045324","latitude":"43.432478"}},
# {"id":"31190","key":null,"value":{"longitude":".736588","latitude":"42.872381"}},
# {"id":"31191","key":null,"value":{"longitude":".931512","latitude":"42.985924"}},
# {"id":"31192","key":null,"value":{"longitude":"1.617736","latitude":"43.504762"}},
# {"id":"31193","key":null,"value":{"longitude":"1.06674","latitude":"43.282124"}},
# {"id":"31194","key":null,"value":{"longitude":"1.747868","latitude":"43.587205"}},
# {"id":"31195","key":null,"value":{"longitude":".99837","latitude":"43.019475"}},
# {"id":"31196","key":null,"value":{"longitude":".972708","latitude":"43.260042"}},
# {"id":"31197","key":null,"value":{"longitude":".531638","latitude":"43.135862"}},
# {"id":"31198","key":null,"value":{"longitude":".937695","latitude":"43.188635"}},
# {"id":"31199","key":null,"value":{"longitude":".6484879","latitude":"42.950816"}},
# {"id":"34100","key":null,"value":{"longitude":"2.8925","latitude":"43.4858"}},
# {"id":"34101","key":null,"value":{"longitude":"3.462905","latitude":"43.382125"}},
# {"id":"34102","key":null,"value":{"longitude":"3.91426","latitude":"43.794225"}},
# {"id":"34103","key":null,"value":{"longitude":"3.379627","latitude":"43.539626"}},
# {"id":"34104","key":null,"value":{"longitude":"3.24592","latitude":"43.570799"}},
# {"id":"34105","key":null,"value":{"longitude":"3.244396","latitude":"43.501335"}},
# {"id":"34106","key":null,"value":{"longitude":"3.356998","latitude":"43.751909"}},
# {"id":"34107","key":null,"value":{"longitude":"2.797722","latitude":"43.606093"}},
# {"id":"34108","key":null,"value":{"longitude":"3.755999","latitude":"43.444815"}},
# {"id":"34109","key":null,"value":{"longitude":"3.2728799","latitude":"43.513361"}},
# {"id":"34110","key":null,"value":{"longitude":"4.0214359","latitude":"43.77055"}},
# {"id":"34111","key":null,"value":{"longitude":"3.708787","latitude":"43.934614"}},
# {"id":"34112","key":null,"value":{"longitude":"4.013013","latitude":"43.797636"}},
# {"id":"34113","key":null,"value":{"longitude":"3.721009","latitude":"43.49767"}},
# {"id":"34114","key":null,"value":{"longitude":"3.551364","latitude":"43.653241"}},
# {"id":"34115","key":null,"value":{"longitude":"3.629151","latitude":"43.891704"}},
# {"id":"34116","key":null,"value":{"longitude":"3.797514","latitude":"43.647718"}},
# {"id":"34117","key":null,"value":{"longitude":"3.094231","latitude":"43.679435"}},
# {"id":"34118","key":null,"value":{"longitude":"3.924334","latitude":"43.721972"}},
# {"id":"34119","key":null,"value":{"longitude":"3.115754","latitude":"43.593054"}},
# {"id":"34120","key":null,"value":{"longitude":"3.911453","latitude":"43.660874"}},
# {"id":"34121","key":null,"value":{"longitude":"3.194576","latitude":"43.73708"}},
# {"id":"34122","key":null,"value":{"longitude":"3.476311","latitude":"43.676194"}},
# {"id":"34123","key":null,"value":{"longitude":"3.812357","latitude":"43.611297"}},
# {"id":"34124","key":null,"value":{"longitude":"3.436364","latitude":"43.646316"}},
# {"id":"34125","key":null,"value":{"longitude":"3.523731","latitude":"43.673823"}},
# {"id":"34126","key":null,"value":{"longitude":"3.084903","latitude":"43.597083"}},
# {"id":"34127","key":null,"value":{"longitude":"4.073251","latitude":"43.65216"}},
# {"id":"34128","key":null,"value":{"longitude":"3.723849","latitude":"43.922663"}},
# {"id":"34129","key":null,"value":{"longitude":"3.896473","latitude":"43.567296"}},
# {"id":"34130","key":null,"value":{"longitude":"3.196108","latitude":"43.521161"}},
# {"id":"34131","key":null,"value":{"longitude":"3.885359","latitude":"43.832368"}},
# {"id":"34132","key":null,"value":{"longitude":"3.288837","latitude":"43.777753"}},
# {"id":"34133","key":null,"value":{"longitude":"3.272758","latitude":"43.695424"}},
# {"id":"34134","key":null,"value":{"longitude":"3.8028784","latitude":"43.5842818"}},
# {"id":"34135","key":null,"value":{"longitude":"3.1738719","latitude":"43.273243"}},
# {"id":"34136","key":null,"value":{"longitude":"3.435196","latitude":"43.496175"}},
# {"id":"34137","key":null,"value":{"longitude":"3.369954","latitude":"43.636121"}},
# {"id":"34138","key":null,"value":{"longitude":"3.416024","latitude":"43.585471"}},
# {"id":"34139","key":null,"value":{"longitude":"3.236956","latitude":"43.418425"}},
# {"id":"34140","key":null,"value":{"longitude":"3.171837","latitude":"43.383092"}},
# {"id":"34141","key":null,"value":{"longitude":"2.637515","latitude":"43.315257"}},
# {"id":"34142","key":null,"value":{"longitude":"3.313975","latitude":"43.73366"}},
# {"id":"34143","key":null,"value":{"longitude":"3.613867","latitude":"43.449359"}},
# {"id":"34144","key":null,"value":{"longitude":"3.195023","latitude":"43.709075"}},
# {"id":"34145","key":null,"value":{"longitude":"4.135366","latitude":"43.67445"}},
# {"id":"34146","key":null,"value":{"longitude":"4.092158","latitude":"43.677936"}},
# {"id":"34147","key":null,"value":{"longitude":"3.222528","latitude":"43.470887"}},
# {"id":"34148","key":null,"value":{"longitude":"3.157423","latitude":"43.368625"}},
# {"id":"34149","key":null,"value":{"longitude":"3.3075","latitude":"43.491044"}},
# {"id":"34150","key":null,"value":{"longitude":"3.527539","latitude":"43.355966"}},
# {"id":"34151","key":null,"value":{"longitude":"4.178997","latitude":"43.665346"}},
# {"id":"34152","key":null,"value":{"longitude":"3.752129","latitude":"43.781528"}},
# {"id":"34153","key":null,"value":{"longitude":"3.809893","latitude":"43.730637"}},
# {"id":"34154","key":null,"value":{"longitude":"4.010165","latitude":"43.6154409"}},
# {"id":"34155","key":null,"value":{"longitude":"3.119836","latitude":"43.358381"}},
# {"id":"34156","key":null,"value":{"longitude":"3.2861","latitude":"43.6356"}},
# {"id":"34157","key":null,"value":{"longitude":"3.606834","latitude":"43.4255939"}},
# {"id":"34158","key":null,"value":{"longitude":"2.7466","latitude":"43.354066"}},
# {"id":"34159","key":null,"value":{"longitude":"3.802455","latitude":"43.508417"}},
# {"id":"34160","key":null,"value":{"longitude":"2.956289","latitude":"43.57123"}},
# {"id":"34161","key":null,"value":{"longitude":"3.117645","latitude":"43.327762"}},
# {"id":"34162","key":null,"value":{"longitude":"3.484114","latitude":"43.480287"}},
# {"id":"34163","key":null,"value":{"longitude":"3.69797","latitude":"43.649322"}},
# {"id":"34164","key":null,"value":{"longitude":"3.955276","latitude":"43.752541"}},
# {"id":"34165","key":null,"value":{"longitude":"3.694195","latitude":"43.516132"}},
# {"id":"34166","key":null,"value":{"longitude":"3.367212","latitude":"43.397065"}},
# {"id":"34167","key":null,"value":{"longitude":"3.030385","latitude":"43.294355"}},
# {"id":"34168","key":null,"value":{"longitude":"3.2767","latitude":"43.5625"}},
# {"id":"34169","key":null,"value":{"longitude":"3.859265","latitude":"43.671824"}},
# {"id":"34170","key":null,"value":{"longitude":"2.906839","latitude":"43.335536"}},
# {"id":"34171","key":null,"value":{"longitude":"3.790882","latitude":"43.926841"}},
# {"id":"34172","key":null,"value":{"longitude":"3.876716","latitude":"43.610769"}},
# {"id":"34173","key":null,"value":{"longitude":"3.506458","latitude":"43.695436"}},
# {"id":"34174","key":null,"value":{"longitude":"3.757109","latitude":"43.941609"}},
# {"id":"34175","key":null,"value":{"longitude":"3.349915","latitude":"43.61649"}},
# {"id":"34176","key":null,"value":{"longitude":"4.0411979","latitude":"43.649001"}},
# {"id":"34177","key":null,"value":{"longitude":"3.74559","latitude":"43.68923"}},
# {"id":"34178","key":null,"value":{"longitude":"3.14372","latitude":"43.440076"}},
# {"id":"34179","key":null,"value":{"longitude":"3.736497","latitude":"43.604431"}},
# {"id":"34180","key":null,"value":{"longitude":"3.430843","latitude":"43.606614"}},
# {"id":"34181","key":null,"value":{"longitude":"3.336279","latitude":"43.532917"}},
# {"id":"34182","key":null,"value":{"longitude":"3.406619","latitude":"43.421755"}},
# {"id":"34183","key":null,"value":{"longitude":"3.12804","latitude":"43.289765"}},
# {"id":"34184","key":null,"value":{"longitude":"3.407481","latitude":"43.512776"}},
# {"id":"34185","key":null,"value":{"longitude":"3.777582","latitude":"43.82575"}},
# {"id":"34186","key":null,"value":{"longitude":"3.3030933","latitude":"43.6547782"}},
# {"id":"34187","key":null,"value":{"longitude":"2.913728","latitude":"43.556706"}},
# {"id":"34188","key":null,"value":{"longitude":"3.2894","latitude":"43.7081"}},
# {"id":"34189","key":null,"value":{"longitude":"2.7301129","latitude":"43.284351"}},
# {"id":"34190","key":null,"value":{"longitude":"2.765961","latitude":"43.288411"}},
# {"id":"34191","key":null,"value":{"longitude":"3.185118","latitude":"43.4315969"}},
# {"id":"34192","key":null,"value":{"longitude":"3.933493","latitude":"43.528906"}},
# {"id":"34193","key":null,"value":{"longitude":"2.846652","latitude":"43.450633"}},
# {"id":"34194","key":null,"value":{"longitude":"3.459371","latitude":"43.539645"}},
# {"id":"34195","key":null,"value":{"longitude":"3.587405","latitude":"43.805928"}},
# {"id":"34196","key":null,"value":{"longitude":"3.323006","latitude":"43.802808"}},
# {"id":"34197","key":null,"value":{"longitude":"3.396765","latitude":"43.575601"}},
# {"id":"34198","key":null,"value":{"longitude":"3.954211","latitude":"43.563782"}},
# {"id":"34199","key":null,"value":{"longitude":"3.423193","latitude":"43.461531"}}
# ]}
########################################################################
########################################################################
########################################################################
# 3. donner le code insee (cle), le departement, la latitude et la longitude de MONTPELLIER (nom de la commune)
curl -X PUT $COUCH3/$DB_NAME/_design/montpellier -d @montpellier.js
# {"ok":true,"id":"_design/montpellier","rev":"1-27f2eac478104151a0b4fdbc874da3ce"}
#
# montpellier.js :
#
# {
# "_id":"_design/montpellier",
# "language":"javascript",
#     "views":{ "montpellier":{
#               "map" : "function(doc) { if (doc.nom=='MONTPELLIER') {emit(doc.id, {departement:doc.dep,longitude:doc.longitude, latitude:doc.latitude})}}"
#         }
#     }
# }
curl -X GET $COUCH3/$DB_NAME/_design/montpellier/_view/montpellier
# {"total_rows":1,"offset":0,"rows":[
# {"id":"34172","key":null,"value":{"departement":"34","longitude":"3.876716","latitude":"43.610769"}}
# ]}
########################################################################
########################################################################
########################################################################
# 4. donnez le nom et le prenom de la presidente de la region Occitanie
curl -X PUT $COUCH3/$DB_NAME/_design/president -d @president.js
# {"ok":true,"id":"_design/president","rev":"1-a854a3a212ecd67a3853c2e9f0a4d52e"}
#
# president.js :
#
# {
# "_id":"_design/president",
# "language":"javascript",
#     "views":{ "president":{
#               "map" : "function(doc) { if (doc.nom_reg=='Occitanie' && doc.type=='region') {emit(doc.id, {nom:doc.president.nom,prenom:doc.president.prenom})}}"
#         }
#     }
# }
curl -X GET $COUCH3/$DB_NAME/_design/president/_view/president
# {"total_rows":1,"offset":0,"rows":[
# {"id":"occitanie","key":null,"value":{"nom":"Delga","prenom":"Carole"}}
# ]}
# ATTENTION ca BUG avec une requete POST !!
#curl -X POST $COUCH3/$DB_NAME -d @president.js -H "Content-Type: application/json"
#{"ok":true,"id":"6aa0d986954ac4db427aab0b180640b7","rev":"1-0df3ec0ecd3c83a0d0d1241b93771fd8"}

# *********************************************************************
# 4.2 MAP et REDUCE
########################################################################
########################################################################
########################################################################
# 1. donner le nombre de communes au total puis par departement et enfin par region (old region)
curl -X PUT $COUCH3/$DB_NAME/_design/nbCDR -d @nbCDR.js
# {"ok":true,"id":"_design/nbCDR","rev":"1-de350642539858ca3ab34399791f61e3"}
#
# nbCDR.js :
#
# {
# "_id":"_design/nbCDR",
# "language":"javascript",
#     "views":{ "nbCDR":{
#               "map" : "function(doc) { if (doc.type=='commune' && doc.dep && doc.old_reg) {emit([doc.id, doc.type, doc.dep, doc.old_reg], 1)}}",
#				"reduce": "_count"
#         }
#     }
# }
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR
# {"rows":[
# {"key":null,"value":310}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=1
# {"rows":[
# {"key":[null],"value":310}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=2
# {"rows":[
# {"key":[null,"commune"],"value":310}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=3
# {"rows":[
# {"key":[null,"commune","12"],"value":54},
# {"key":[null,"commune","30"],"value":57},
# {"key":[null,"commune","31"],"value":99},
# {"key":[null,"commune","34"],"value":100}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=4
# {"rows":[
# {"key":[null,"commune","12","73"],"value":54},
# {"key":[null,"commune","30","91"],"value":57},
# {"key":[null,"commune","31","73"],"value":99},
# {"key":[null,"commune","34","91"],"value":100}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=5
# {"rows":[
# {"key":[null,"commune","12","73"],"value":54},
# {"key":[null,"commune","30","91"],"value":57},
# {"key":[null,"commune","31","73"],"value":99},
# {"key":[null,"commune","34","91"],"value":100}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbCDR/_view/nbCDR?group_level=Exact
# {"error":"query_parse_error","reason":"Invalid value for integer: \"Exact\""}
########################################################################
########################################################################
########################################################################
# 2. donner le nombre d'habitants par commune en 1985
curl -X PUT $COUCH3/$DB_NAME/_design/nbHC95-5 -d @nbHC95.js
# {"ok":true,"id":"_design/nbHC95","rev":"1-fd77bccb1a6eab5d3ee58ddf5ca29ac4"}
#
# nbHC95.js :
#
# {
# "_id":"_design/nbHC95",
# "language":"javascript",
#     "views":{ "nbHC95":{
#               "map" : "function(doc) { if (doc.type=='commune') {emit([doc.id, doc.type], doc.pop_1985)}}",
# 			"reduce": "_sum"
#         }
#     }
# }
#
#{"ok":true,"id":"_design/nbHC95-2","rev":"1-bb7f277e0190f7dae988e0a1ef1d4d62"}
#
# nbHC95-2.js :
#
# {
# "_id":"_design/nbHC95-2",
# "language":"javascript",
#     "views":{ "nbHC95":{
#               "map" : "function(doc) { if (doc.type=='commune') {emit([doc.id, doc.type], doc.pop_1985)}}",
# 			"reduce": "function(keys, values, rereduce){ var sum = 0; values.forEach(function(value){sum += parseInt(value);});}"
#         }
#     }
# }
#
# {"ok":true,"id":"_design/nbHC95-3","rev":"1-47708bc465795836e3093cb5efd00733"}
#
# nbHC95-3.js :
# 
# {
# "_id":"_design/nbHC95-3",
# "language":"javascript",
#     "views":{ "nbHC95":{
#               "map" : "function(doc) { if (doc.type=='commune') {emit([doc.id, doc.type], doc.populations['pop_1985'])}}",
# 			"reduce": "_sum"
#         }
#     }
# }
#
# {"ok":true,"id":"_design/nbHC95-4","rev":"1-465bb6d1112658a6217e5636b37aef11"}
#
# nbHC95-4.js :
# 
# {
# "_id":"_design/nbHC95-4",
# "language":"javascript",
#     "views":{ "nbHC95":{
#               "map" : "function(doc) { if (doc.type=='commune' && doc.populations) {emit([doc.id, doc.type], doc.populations[1].pop_1985)}}",
# 			"reduce": "_sum"
#         }
#     }
# }
#
# {"ok":true,"id":"_design/nbHC95-5","rev":"1-bf3620bffc8ac819398b66d73d01b372"}
#
# nbHC95-5.js :
# 
# {
# "_id":"_design/nbHC95-5",
# "language":"javascript",
#     "views":{ "nbHC95":{
#               "map" : "function(doc) { if (doc.type=='commune' && doc.populations) {emit([doc.id, doc.nom], doc.populations[1].pop_1985)}}",
# 			"reduce": "_sum"
#         }
#     }
# }
curl -X GET $COUCH3/$DB_NAME/_design/nbHC95-5/_view/nbHC95
# {"rows":[
# {"key":null,"value":613114.4283706839}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbHC95-5/_view/nbHC95?group_level=1
# {"rows":[
# {"key":[null],"value":613114.4283706839}
# ]}
curl -X GET $COUCH3/$DB_NAME/_design/nbHC95-5/_view/nbHC95?group_level=2
# {"rows":[
# {"key":[null,"CALMONT"],"value":1489.29302895771},
# {"key":[null,"CAMBERNARD"],"value":270.838631263751},
# {"key":[null,"CAMBIAC"],"value":171.522818563878},
# {"key":[null,"CANENS"],"value":43.6666955698599},
# {"key":[null,"CAPENS"],"value":239.900661804255},
# {"key":[null,"CARAGOUDES"],"value":153.690964639593},
# {"key":[null,"CARAMAN"],"value":1678.41952052149},
# {"key":[null,"CARBONNE"],"value":3714.9091276143},
# {"key":[null,"CARDEILHAC"],"value":239.437941333835},
# {"key":[null,"CASSAGNABERE-TOURNAS"],"value":427.29534484399},
# {"key":[null,"CASSAGNE"],"value":605.379317168936},
# {"key":[null,"CASTAGNAC"],"value":171.853221262168},
# {"key":[null,"CASTAGNEDE"],"value":177.92026502586},
# {"key":[null,"CASTANET-TOLOSAN"],"value":5884.03804773081},
# {"key":[null,"CASTELBIAGUE"],"value":206.476035457572},
# {"key":[null,"CASTELGAILLARD"],"value":77.2528117022822},
# {"key":[null,"CASTELGINEST"],"value":5930.20661367353},
# {"key":[null,"CASTELMAUROU"],"value":2120.30495779855},
# {"key":[null,"CASTELNAU-D'ESTRETEFONDS"],"value":2112.80427902511},
# {"key":[null,"CASTELNAU-PICAMPEAU"],"value":177.079408928068},
# {"key":[null,"CASTERA"],"value":413.880973119091},
# {"key":[null,"CASTERA-VIGNOLES"],"value":70.1023945022901},
# {"key":[null,"CASTIES-LABRANDE"],"value":88.688366210087},
# {"key":[null,"CASTILLON-DE-LARBOUST"],"value":74.4749433802134},
# {"key":[null,"CASTILLON-DE-SAINT-MARTORY"],"value":214.164357343597},
# {"key":[null,"CATHERVIELLE"],"value":31.5904453473121},
# {"key":[null,"CAUBIAC"],"value":137.134023886258},
# {"key":[null,"CAUBOUS"],"value":9.67026484190435},
# {"key":[null,"CAUJAC"],"value":355.212768207577},
# {"key":[null,"CAZARIL-LASPENES"],"value":16.7277113031503},
# {"key":[null,"CAZARIL-TAMBOURES"],"value":110.946251922367},
# {"key":[null,"CAZAUNOUS"],"value":45.646504839583},
# {"key":[null,"CAZAUX-LAYRISSE"],"value":61.1799014340688},
# {"key":[null,"CAZEAUX-DE-LARBOUST"],"value":67.2121698705511},
# {"key":[null,"CAZENEUVE-MONTAUT"],"value":56.5945139086055},
# {"key":[null,"CAZERES"],"value":3241.59073760599},
# {"key":[null,"CEPET"],"value":942.502195492821},
# {"key":[null,"CESSALES"],"value":147.015534229904},
# {"key":[null,"CHARLAS"],"value":211.770570854196},
# {"key":[null,"CHAUM"],"value":205.926836777428},
# {"key":[null,"CHEIN-DESSUS"],"value":206.171031939406},
# {"key":[null,"CIADOUX"],"value":199.987912849943},
# {"key":[null,"CIER-DE-LUCHON"],"value":142.615798063703},
# {"key":[null,"CIER-DE-RIVIERE"],"value":242.035941489981},
# {"key":[null,"CIERP-GAUD"],"value":1046.18092894232},
# {"key":[null,"CINTEGABELLE"],"value":2126.8272951607},
# {"key":[null,"CIRES"],"value":10.6523810863254},
# {"key":[null,"CLARAC"],"value":335.316584971421},
# {"key":[null,"CLERMONT-LE-FORT"],"value":326.203776339168},
# {"key":[null,"COLOMIERS"],"value":24948.5175080932},
# {"key":[null,"CORNEBARRIEU"],"value":3151.39415652932},
# {"key":[null,"CORRONSAC"],"value":364.278204800064},
# {"key":[null,"COUEILLES"],"value":88.6936648239062},
# {"key":[null,"COULADERE"],"value":313.973806236179},
# {"key":[null,"COURET"],"value":213.795405125447},
# {"key":[null,"COX"],"value":220.281184130463},
# {"key":[null,"CUGNAUX"],"value":9968.09958932838},
# {"key":[null,"CUGURON"],"value":180.497998117939},
# {"key":[null,"CUING"],"value":381.966704085831},
# {"key":[null,"DAUX"],"value":1095.04117575915},
# {"key":[null,"DEYME"],"value":516.840555169338},
# {"key":[null,"DONNEVILLE"],"value":637.015332528928},
# {"key":[null,"DREMIL-LAFAGE"],"value":1348.6454923379},
# {"key":[null,"DRUDAS"],"value":134.371592863072},
# {"key":[null,"EAUNES"],"value":2425.54446110346},
# {"key":[null,"EMPEAUX"],"value":130.759093296742},
# {"key":[null,"ENCAUSSE-LES-THERMES"],"value":535.011084248001},
# {"key":[null,"EOUX"],"value":144.935214742287},
# {"key":[null,"ESCALQUENS"],"value":3448.27344068372},
# {"key":[null,"ESCANECRABE"],"value":214.128688901199},
# {"key":[null,"ESPANES"],"value":215.04381160555},
# {"key":[null,"ESPARRON"],"value":51.6107326636837},
# {"key":[null,"ESPERCE"],"value":176.506795992895},
# {"key":[null,"ESTADENS"],"value":349.905637066004},
# {"key":[null,"ESTANCARBON"],"value":484.990795009388},
# {"key":[null,"ESTENOS"],"value":183.267652832861},
# {"key":[null,"EUP"],"value":155.845535082599},
# {"key":[null,"FABAS"],"value":227.84774556856},
# {"key":[null,"FAGET"],"value":351.158128184441},
# {"key":[null,"FALGA"],"value":64.5950706622038},
# {"key":[null,"FAUGA"],"value":773.780844303332},
# {"key":[null,"FENOUILLET"],"value":3092.98433387344},
# {"key":[null,"FERRIERES-POUSSAROU"],"value":35.8391614288578},
# {"key":[null,"FIGAROL"],"value":185.202432476385},
# {"key":[null,"FIRMI"],"value":2858.54422983765},
# {"key":[null,"FLAGNAC"],"value":960.610399842191},
# {"key":[null,"FLAVIN"],"value":1722.4847660256},
# {"key":[null,"FLORENSAC"],"value":3255.9034203127},
# {"key":[null,"FLORENTIN-LA-CAPELLE"],"value":421.968795524586},
# {"key":[null,"FLOURENS"],"value":1179.83655762578},
# {"key":[null,"FOISSAC"],"value":320.008626421237},
# {"key":[null,"FOLCARDE"],"value":89.9824444120389},
# {"key":[null,"FONBEAUZARD"],"value":1766.05252793428},
# {"key":[null,"FONSORBES"],"value":3428.45906377176},
# {"key":[null,"FONTANES"],"value":165.229683895592},
# {"key":[null,"FONTENILLES"],"value":2014.52556452155},
# {"key":[null,"FONTES"],"value":772.558826216601},
# {"key":[null,"FORGUES"],"value":91.3757469662601},
# {"key":[null,"FOS"],"value":412.6253139462368},
# {"key":[null,"FOUGARON"],"value":74.635464917561},
# {"key":[null,"FOUILLADE"],"value":1103.72536727189},
# {"key":[null,"FOURQUEVAUX"],"value":588.115049489159},
# {"key":[null,"FOUSSERET"],"value":1366.42549396439},
# {"key":[null,"FOUZILHON"],"value":139.389052049322},
# {"key":[null,"FOZIERES"],"value":128.058624507099},
# {"key":[null,"FRAISSE-SUR-AGOUT"],"value":250.46058690438},
# {"key":[null,"FRANCARVILLE"],"value":102.964127449912},
# {"key":[null,"FRANCAZAL"],"value":14.0123623448323},
# {"key":[null,"FRANCON"],"value":174.810960496629},
# {"key":[null,"FRANQUEVIELLE"],"value":368.003861728559},
# {"key":[null,"FRECHET"],"value":121.397285366846},
# {"key":[null,"FRONSAC"],"value":213.535811737284},
# {"key":[null,"FRONTIGNAN"],"value":15280.2169015542},
# {"key":[null,"GABIAN"],"value":637.534874833971},
# {"key":[null,"GABRIAC"],"value":409.099167816766},
# {"key":[null,"GAILLAC-D'AVEYRON"],"value":367.748553862561},
# {"key":[null,"GALARGUES"],"value":362.007839373701},
# {"key":[null,"GALGAN"],"value":391.767179278727},
# {"key":[null,"GANGES"],"value":3429.09858152277},
# {"key":[null,"GARRIGUES"],"value":81.9528148150611},
# {"key":[null,"GIGEAN"],"value":2139.60906262165},
# {"key":[null,"GIGNAC"],"value":3385.93993728707},
# {"key":[null,"GISSAC"],"value":150.931803728164},
# {"key":[null,"GOLINHAC"],"value":466.917989303261},
# {"key":[null,"GORNIES"],"value":134.937884817302},
# {"key":[null,"GOUTRENS"],"value":465.843393893015},
# {"key":[null,"GRABELS"],"value":2672.36270588385},
# {"key":[null,"GRAISSAC"],"value":252.383035503571},
# {"key":[null,"GRAISSESSAC"],"value":817.807860540025},
# {"key":[null,"GRAMOND"],"value":406.093744933729},
# {"key":[null,"GRAND-VABRE"],"value":516.078910998972},
# {"key":[null,"GUZARGUES"],"value":151.161425260061},
# {"key":[null,"HEREPIAN"],"value":1186.26915008653},
# {"key":[null,"HOSPITALET-DU-LARZAC"],"value":244.902280316453},
# {"key":[null,"HUPARLAC"],"value":305.663259058689},
# {"key":[null,"JACOU"],"value":2552.61175573338},
# {"key":[null,"JONCELS"],"value":211.439168219236},
# {"key":[null,"JONQUIERES"],"value":289.119642346925},
# {"key":[null,"JUVIGNAC"],"value":3798.18991535037},
# {"key":[null,"LACALM"],"value":256.029514029915},
# {"key":[null,"LACOSTE"],"value":195.643234608979},
# {"key":[null,"LACROIX-BARREZ"],"value":609.309588657517},
# {"key":[null,"LAGAMAS"],"value":59.1970908117071},
# {"key":[null,"LAGUIOLE"],"value":1243.21596267386},
# {"key":[null,"LAISSAC"],"value":1443.13060752898},
# {"key":[null,"LAMALOU-LES-BAINS"],"value":2211.21374069951},
# {"key":[null,"LANSARGUES"],"value":1876.11278878862},
# {"key":[null,"LANUEJOULS"],"value":704.610322527987},
# {"key":[null,"LAPANOUSE"],"value":688.777083728715},
# {"key":[null,"LAPANOUSE-DE-CERNON"],"value":130.294464559506},
# {"key":[null,"LAROQUE"],"value":891.236489766941},
# {"key":[null,"LASSOUTS"],"value":368.971737206951},
# {"key":[null,"LATTES"],"value":8743.17927026048},
# {"key":[null,"LAURENS"],"value":1009.59431709008},
# {"key":[null,"LAURET"],"value":174.509880526996},
# {"key":[null,"LAUROUX"],"value":148.753177708157},
# {"key":[null,"LAVAL-ROQUECEZIERE"],"value":437.966016264674},
# {"key":[null,"LAVALETTE"],"value":38.5410344587732},
# {"key":[null,"LAVERNHE"],"value":239.791337511393},
# {"key":[null,"LAVERUNE"],"value":1878.81547392679},
# {"key":[null,"LEDERGUES"],"value":813.113664442903},
# {"key":[null,"LESCURE-JAOUL"],"value":353.906888516038},
# {"key":[null,"LESPIGNAN"],"value":2093.59468158743},
# {"key":[null,"LESTRADE-ET-THOUELS"],"value":596.851319204877},
# {"key":[null,"LEZIGNAN-LA-CEBE"],"value":909.141865879072},
# {"key":[null,"LIAUSSON"],"value":99.7694543852853},
# {"key":[null,"LIEURAN-CABRIERES"],"value":149.283255963532},
# {"key":[null,"LIEURAN-LES-BEZIERS"],"value":892.214008415962},
# {"key":[null,"LIGNAN-SUR-ORB"],"value":2160.53881855952},
# {"key":[null,"LIVINHAC-LE-HAUT"],"value":1263.67549255598},
# {"key":[null,"LIVINIERE"],"value":501.271218338489},
# {"key":[null,"LODEVE"],"value":8109.15406952236},
# {"key":[null,"LOUBIERE"],"value":935.095501578985},
# {"key":[null,"LOUPIAN"],"value":1159.09151958611},
# {"key":[null,"LUC-LA-PRIMAUBE"],"value":3838.6163101499},
# {"key":[null,"LUGAN"],"value":325.815327262751},
# {"key":[null,"LUNAC"],"value":498.537522741257},
# {"key":[null,"LUNAS"],"value":595.198762519374},
# {"key":[null,"LUNEL"],"value":16654.8467314471},
# {"key":[null,"LUNEL-VIEL"],"value":1894.38638230699},
# {"key":[null,"MAGALAS"],"value":1636.23163265415},
# {"key":[null,"MALEVILLE"],"value":921.149146725736},
# {"key":[null,"MANHAC"],"value":407.274796208742},
# {"key":[null,"MARAUSSAN"],"value":2220.17294987026},
# {"key":[null,"MARCILLAC-VALLON"],"value":1532.75509586746},
# {"key":[null,"MARGON"],"value":186.960584714604},
# {"key":[null,"MARNHAGUES-ET-LATOUR"],"value":116.648977157401},
# {"key":[null,"MARSEILLAN"],"value":4342.33044581748},
# {"key":[null,"MARSILLARGUES"],"value":3931.19205146234},
# {"key":[null,"MARTIEL"],"value":745.528326140773},
# {"key":[null,"MARTRIN"],"value":257.843946849134},
# {"key":[null,"MAS-DE-LONDRES"],"value":198.853019797483},
# {"key":[null,"MATELLES"],"value":932.604527015995},
# {"key":[null,"MAUGUIO"],"value":10501.8484073014},
# {"key":[null,"MAUREILHAN"],"value":1343.93557554578},
# {"key":[null,"MAYRAN"],"value":485.823428125179},
# {"key":[null,"MELAGUES"],"value":99.3144296962531},
# {"key":[null,"MELJAC"],"value":229.425236530097},
# {"key":[null,"MERIFONS"],"value":27.5329643279194},
# {"key":[null,"MEZE"],"value":5948.02960257118},
# {"key":[null,"MILLAU"],"value":21712.6655196621},
# {"key":[null,"MINERVE"],"value":108.974853429635},
# {"key":[null,"MIREVAL"],"value":1601.97187670572},
# {"key":[null,"MONASTERE"],"value":1370.3671742472},
# {"key":[null,"MONS"],"value":520.337388593647},
# {"key":[null,"MONTADY"],"value":1771.13367105533},
# {"key":[null,"MONTAGNAC"],"value":2996.6312820582616},
# {"key":[null,"MONTAGNOL"],"value":183.490932864216},
# {"key":[null,"MONTARNAUD"],"value":1268.14905052253},
# {"key":[null,"MONTAUD"],"value":464.9847585278},
# {"key":[null,"MONTBAZENS"],"value":1425.29541876784},
# {"key":[null,"MONTBAZIN"],"value":1660.97576328612},
# {"key":[null,"MONTBLANC"],"value":1712.28230906561},
# {"key":[null,"MONTCLAR"],"value":190.409389413954},
# {"key":[null,"MONTEILS"],"value":454.135399394471},
# {"key":[null,"MONTELS"],"value":123.846251318882},
# {"key":[null,"MONTESQUIEU"],"value":41.8260056238491},
# {"key":[null,"MONTEZIC"],"value":268.955047731838},
# {"key":[null,"MONTFERRIER-SUR-LEZ"],"value":2245.88079843782},
# {"key":[null,"MONTFRANC"],"value":165.997210649232},
# {"key":[null,"MONTJAUX"],"value":404.114524650659},
# {"key":[null,"MONTLAUR"],"value":548.624990387397},
# {"key":[null,"MONTOULIERS"],"value":185.029802623418},
# {"key":[null,"MONTOULIEU"],"value":70.9730764535685},
# {"key":[null,"MONTPELLIER"],"value":199901.168195529},
# {"key":[null,"MONTPEYROUX"],"value":856.300145987859},
# {"key":[null,"MOULES-ET-BAUCELS"],"value":221.318795248001},
# {"key":[null,"MOUREZE"],"value":82.9143486130599},
# {"key":[null,"MUDAISON"],"value":1501.05918029731},
# {"key":[null,"MURLES"],"value":156.734817799322},
# {"key":[null,"MURVIEL-LES-BEZIERS"],"value":2078.18439084722},
# {"key":[null,"MURVIEL-LES-MONTPELLIER"],"value":795.203520111501},
# {"key":[null,"NEBIAN"],"value":848.737292999804},
# {"key":[null,"NEFFIES"],"value":586.186104581042},
# {"key":[null,"NEZIGNAN-L'EVEQUE"],"value":726.978675187523},
# {"key":[null,"NISSAN-LEZ-ENSERUNE"],"value":2664.8099213546},
# {"key":[null,"NIZAS"],"value":421.566372538696},
# {"key":[null,"NOTRE-DAME-DE-LONDRES"],"value":240.493967230868},
# {"key":[null,"OCTON"],"value":287.896769835267},
# {"key":[null,"OLARGUES"],"value":519.219656572557},
# {"key":[null,"OLMET-ET-VILLECUN"],"value":78.8526011643187},
# {"key":[null,"OLONZAC"],"value":1600.8017743342},
# {"key":[null,"OUPIA"],"value":280.403933997938},
# {"key":[null,"PAILHES"],"value":352.970652840694},
# {"key":[null,"PALAVAS-LES-FLOTS"],"value":4311.64728082074},
# {"key":[null,"PARDAILHAN"],"value":110.131330230543},
# {"key":[null,"PAULHAN"],"value":2470.45535208142},
# {"key":[null,"PEGAIROLLES-DE-BUEGES"],"value":46.6565616888465},
# {"key":[null,"PEGAIROLLES-DE-L'ESCALETTE"],"value":151.045103127045},
# {"key":[null,"PERET"],"value":523.458475474342},
# {"key":[null,"PEROLS"],"value":5256.46937619273},
# {"key":[null,"PEZENAS"],"value":7503.65421389293},
# {"key":[null,"RODILHAN"],"value":2043.55428972371},
# {"key":[null,"SAINT-PAUL-LES-FONTS"],"value":458.804944376952},
# {"key":[null,"SAINT-THEODORIT"],"value":222.203268643391},
# {"key":[null,"SAINT-VICTOR-DE-MALCAP"],"value":508.361360849808},
# {"key":[null,"SAINT-VICTOR-DES-OULES"],"value":168.543958926572},
# {"key":[null,"SAINT-VICTOR-LA-COSTE"],"value":1191.77816767377},
# {"key":[null,"SALAZAC"],"value":139.117451860017},
# {"key":[null,"SALINDRES"],"value":3357.44651755904},
# {"key":[null,"SALINELLES"],"value":310.3237620936},
# {"key":[null,"SALLES-DU-GARDON"],"value":3349.50556056453},
# {"key":[null,"SANILHAC-SAGRIES"],"value":569.400794713442},
# {"key":[null,"SARDAN"],"value":148.66791228594},
# {"key":[null,"SAUMANE"],"value":152.717189642535},
# {"key":[null,"SAUVE"],"value":1494.15944824286},
# {"key":[null,"SAUVETERRE"],"value":1236.55186572697},
# {"key":[null,"SAUZET"],"value":438.713348396034},
# {"key":[null,"SAVIGNARGUES"],"value":131.116917703958},
# {"key":[null,"SAZE"],"value":1199.42724988073},
# {"key":[null,"SENECHAS"],"value":172.944429292653},
# {"key":[null,"SERNHAC"],"value":1006.50297498719},
# {"key":[null,"SERVAS"],"value":128.149151657555},
# {"key":[null,"SERVIERS-ET-LABAUME"],"value":269.535414447859},
# {"key":[null,"SEYNES"],"value":111.583242258018},
# {"key":[null,"SOMMIERES"],"value":2994.61669430126},
# {"key":[null,"SOUDORGUES"],"value":187.692702147158},
# {"key":[null,"SOUSTELLE"],"value":101.995113074137},
# {"key":[null,"SOUVIGNARGUES"],"value":498.261267172468},
# {"key":[null,"SUMENE"],"value":1527.34066094442},
# {"key":[null,"TAVEL"],"value":1408.53934535661},
# {"key":[null,"THARAUX"],"value":44.1338047276362},
# {"key":[null,"THEZIERS"],"value":740.202250737919},
# {"key":[null,"THOIRAS"],"value":315.822635573617},
# {"key":[null,"TORNAC"],"value":636.152794219716},
# {"key":[null,"TRESQUES"],"value":1754.89419467819},
# {"key":[null,"TREVES"],"value":126.852400227017},
# {"key":[null,"UCHAUD"],"value":2466.36527626011},
# {"key":[null,"UZES"],"value":7608.68849146084},
# {"key":[null,"VABRES"],"value":66.0788122888738},
# {"key":[null,"VALLABREGUES"],"value":972.641447374433},
# {"key":[null,"VALLABRIX"],"value":253.579788050693},
# {"key":[null,"VALLERARGUES"],"value":100.071729505433},
# {"key":[null,"VALLERAUGUE"],"value":1064.95095689192},
# {"key":[null,"VALLIGUIERES"],"value":291.557813607866},
# {"key":[null,"VAUVERT"],"value":9663.73173411792},
# {"key":[null,"VENEJAN"],"value":837.569329526997},
# {"key":[null,"VERFEUIL"],"value":412.07388294702},
# {"key":[null,"VERGEZE"],"value":2792.19218079794},
# {"key":[null,"VERNAREDE"],"value":491.96413293731},
# {"key":[null,"VERS-PONT-DU-GARD"],"value":996.101323165525},
# {"key":[null,"VESTRIC-ET-CANDIAC"],"value":785.808271884393},
# {"key":[null,"VEZENOBRES"],"value":1175.07259165319},
# {"key":[null,"VIC-LE-FESQ"],"value":225.424918795536},
# {"key":[null,"VIGAN"],"value":4544.94725893001},
# {"key":[null,"VILLENEUVE-LES-AVIGNON"],"value":9813.82119440455},
# {"key":[null,"VILLEVIEILLE"],"value":969.811521550111},
# {"key":[null,"VISSEC"],"value":51.1955582535875}
# ]}
########################################################################
########################################################################
########################################################################
# 3. donner le nombre d'habitants par departement en 1985
curl -X PUT $COUCH3/$DB_NAME/_design/nbHD85-2 -d @nbHD85.js
# {"ok":true,"id":"_design/nbHD85","rev":"1-717a195eeeb9be6762f9201c698197d0"}
#
# nbHD85.js :
# 
# {
# "_id":"_design/nbHC85",
# "language":"javascript",
#     "views":{ "nbHC85":{
#               "map" : "function(doc) { if (doc.type=='commune' && doc.populations && doc.dep) {emit([doc._id, doc.dep], doc.populations[1].pop_1985)}}",
# 			"reduce": "_sum"
#         }
#     }
# }
#
# {"ok":true,"id":"_design/nbHD85-2","rev":"1-d01a233dc0c3433780d33877251251d2"}
#
# nbHD85.js :
# 
# {
# "_id":"_design/nbHC85-2",
# "language":"javascript",
#     "views":{ "nbHC85-2":{
#               "map" : "function(doc) { if (doc.type=='commune' && doc.populations && doc.dep) {emit([doc._id, doc.dep], doc.populations[1].pop_1985)}}",
# 			"reduce": "_sum"
#         }
#     }
# }
curl -X GET $COUCH3/$DB_NAME/_design/nbHD85-2/_view/nbHD85-2

