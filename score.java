public void process(String input) {
 // All scores are text data in the string "input".
// Use methods of the String class to create
// an array of separate scores by splitting on the
 // blanks.
 String[] vals = input.split(" ");
// Each element of vals is a String representation
// of a score.

// Create an integer array that is the same size
// as the String array
int[] score = new int[vals.length];

// Convert each score from String into an integer
// and store into array and also total them
int total = 0;
for (int i=0; i<score.length; i++) {
 score[i] = Integer.parseInt(vals[i]);
 total += score[i];
}

// compute average
double average = (double)total/score.length;
 out.println("The average was: " + average);
 // compare each score against the average
 for (int i=0; i<score.length; i++) {
 if (score[i] < average) {
 out.println("Score " + score[i] +
 " was less than the average");
 }
}

