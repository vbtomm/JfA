package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);// will allow snails to reenter the pen from the pasture.

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT); // will allow the snails to leave the pen and go out to pasture
    }

    // TODO -- Fill your code in here

    public static final int HERD  = 24; // indicate the size of escargatoire.

    public void simulateHerd(Random rand) {
        int snailsInsidePen = HERD; //how many snails are inside the pen.
        int snailsOutsidePen = 0; //how many snails are inside the pasture.
        int random = 0;
        mOut.println("There are currently " + snailsInsidePen + " snails in the pen and " + snailsOutsidePen + " snails in the pasture");
        for (int i = 0; i < MAX_ITERATIONS; i++) {
            int direction = 0;
            int count = 0;
            boolean bool;
            if (snailsInsidePen == 0) {
                random = rand.nextInt(snailsOutsidePen)+1;
                count = mWestGate.thru(random);
                snailsInsidePen =  snailsInsidePen + count;
            }
            else if(snailsOutsidePen == 0) {
                random = rand.nextInt(snailsInsidePen)+1;
                count = mEastGate.thru(random);
                snailsInsidePen =  snailsInsidePen + count;
            }
            else {
                bool = rand.nextBoolean();
                if(bool) {
                    random = rand.nextInt(snailsInsidePen)+1;
                    count = mEastGate.thru(random);
                    snailsInsidePen =  snailsInsidePen + count;
                }
                else {
                    random = rand.nextInt(snailsOutsidePen)+1;
                    count = mWestGate.thru(random);
                    snailsInsidePen =  snailsInsidePen + count;

                }
            }
            snailsOutsidePen = HERD - snailsInsidePen;
            //output
            mOut.println("There are currently " + snailsInsidePen + " snails in the pen and " + snailsOutsidePen + " snails in the pasture");
        }

    }

}
