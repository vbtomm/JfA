package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */

    public void process(int argumentOne, int argumentTwo, int operation) {

// TODO - Put your code here.

        final int ADDITION = 1;
        final int SUBTRACTION = 2;
        final int MULTIPLICATION = 3;
        final int DIVISION = 4;

//ADDITION
        if (operation == ADDITION) {
            Add add1 = new Add(argumentOne, argumentTwo);
            mOut.print(add1.toString());
        }

///SUBTRACTION
         else if (operation == SUBTRACTION) {
            Subtract sub1 = new Subtract(argumentOne, argumentTwo);
            mOut.print(sub1.toString());
        }

//MULTIPLICATION
         else if (operation == MULTIPLICATION) {
            Multiply mul1 = new Multiply(argumentOne, argumentTwo);
            mOut.print(mul1.toString());
        }

//DIVISION
        else if (operation == DIVISION) {
            if (argumentTwo == 0) {
                mOut.print("You can not divide this!"); //Division by 0 is prohibited

            } else {
                Divide div1 = new Divide(argumentOne, argumentTwo);
                mOut.print(div1.toString());
            }

        }
    }


}
