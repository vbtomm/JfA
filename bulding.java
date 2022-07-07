package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.

    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    // constructor
    public Building (int length, int width, int lotLength, int lotWidth) {
        mLength = length;
        mWidth = width;
        mLotLength = lotLength;
        mLotWidth = lotWidth;
    }

    //getters
    public int getLength() { return mLength;     }
    public int getWidth() {
        return mWidth;
    }
    public int getLotLength() {
        return mLotLength;
    }
    public int getLotWidth() {
        return mLotWidth;
    }

    //setters
    public void setLength(int length) {
        mLength = length;
    }
    public void setWidth(int width) {
        mWidth = width;
    }
    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }
    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    //calculators
    public int calcBuildingArea() {
        int buildingArea = mLength * mWidth;
        return buildingArea;
            }

    public int calcLotArea() {
        int lotArea = mLotLength * mLotWidth;
        return lotArea;
    }

    //toString output
    @Override
    public String toString() {
        return mLength + " x " + mWidth + "building";
    }

}
