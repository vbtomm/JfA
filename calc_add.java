package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    // TODO - add your solution here.

    //initial setter
    private int addArgumentOne = 0;
    private int addArgumentTwo = 0;

    //getter/setter
    public Add(int argumentOne, int argumentTwo) {
        addArgumentOne = argumentOne;
        addArgumentTwo = argumentTwo;
    }

//Here we can get the string result of operation
     public String toString() { return String.valueOf(addArgumentOne + addArgumentTwo); }
}
