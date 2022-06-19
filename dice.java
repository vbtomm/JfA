// Rolls two dice until a double is rolled
 public static void process() {
 Random rand = new Random(); // create Random object once
 int tries = 0;
 do {
 int die1 = rand.nextInt(6) + 1;
 int die2 = rand.nextInt(6) + 1;
 out.println(die1 + ", " + die2);
 tries++;
 } while (die1 != die2);

 out.println("It took you " + tries + " tries.");
 }
