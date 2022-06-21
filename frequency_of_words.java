Determine the frequency of words in an array
// Given ArrayList<String> words, an array list
// of words to be counted
Map<String, Integer> counts =
 new HashMap<String, Integer>();
for (String word : words){
word = word.toLowerCase();
 if(!counts.containsKey(word)) {
 counts.put(word, 1);
} else {
 counts.put(word, counts.get(word)+1);
}
}
