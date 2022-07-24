package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.

    //initial setter
    private int divArgumentOne = 0;
    private int divArgumentTwo = 0;

    //getter/setter
    public Divide(int argumentOne, int argumentTwo) {
        divArgumentOne = argumentOne;
        divArgumentTwo = argumentTwo;
    }

    //Here we can get the string result of operation
    public String toString() {
        return String.valueOf(divArgumentOne / divArgumentTwo) + " R:" + String.valueOf(divArgumentOne % divArgumentTwo);
    }
}
