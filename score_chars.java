String word = out.getWord(); //get word from Android UI
int numChars = word.length();
int numVowels = 0;
for (int i=0; i<numChars; i++) {
 char ch = word.charAt(i);
 ch = Character.toLowerCase(ch);
 if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
 numVowels++;
 }
}
int score = 2 * numChars; // score two points per letter
if (numChars >= 4 && numVowels >= (numChars-numVowels)) {
 score = 2 * score; // double the score when appropriate
}
out.println("Your score is: " + score);
