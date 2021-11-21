import numpy as np
import gensim.downloader as api
wv = api.load('word2vec-google-news-300')

print(wv.most_similar(positive=['car','minivan'], topn=5))
# OUT : [('SUV', 0.8532192707061768), ('vehicle', 0.8175783753395081), ('pickup_truck', 0.7763688564300537), ('Jeep', 0.7567334175109863), ('Ford_Explorer', 0.7565720081329346)]

print(wv.doesnt_match(['fire' , 'water' , 'land' , 'sea' , 'air' , 'car' ]))
# OUT : car