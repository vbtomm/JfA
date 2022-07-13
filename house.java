package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
        extends Building {

    // TODO - Put your code here.

    private String mOwner;
    private boolean mPool;


    // constructor
    public House(int length, int width, int lotLength, int lotWidth) {
        super (length, width, lotLength, lotWidth);
        this.mOwner = null;
        this.mPool = false;
    }

    // constructor with owner
    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super (length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
            }

    //constructor with owner and pool
    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }// constructor

    public String getOwner() { return mOwner; }
    public boolean hasPool() { return mPool; }

    public void setOwner(String owner) { mOwner = owner; }
    public void setPool(boolean pool) { mPool = pool; }

    @Override
    public String toString() {
        String result = "Owner: ";
        if (mOwner != null)
            result = result + getOwner();
        else
            result = result + "n/a";
        if (mPool)
            result = result + "; has a pool";
        else if (this.calcLotArea() > 2 * this.calcBuildingArea())
            result = result + "; has a big open space";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        House house = (House) obj;
        return obj instanceof House && (mPool == house.hasPool()) && (calcBuildingArea() == house.calcBuildingArea());

    }
}
