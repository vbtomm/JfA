public static List<String> loadWords(int len,
 String[] ospd)
{
 List<String> words = new ArrayList<String>(1000);
 for (String word : ospd) {
 if (word.length()==len) {
 words.add(word);
 }
 }
 return words;
}

public static void mustHaveAt(char ch, int position,
 List<String> aList)
{
 for (int i=aList.size()-1; i>=0; i--) {
 String word = aList.get(i);
 if (position >= word.length() ||
 word.charAt(position)!=ch)
 {
 aList.remove(i);
 }
 }
}

public static void mustNotHave(char ch,
 List<String> aList)
{
 Iterator<String> itr = aList.iterator();
 while (itr.hasNext()) {
 String word = itr.next();
 if (word.indexOf(ch)>=0) {
 itr.remove();
 }
 }
}
