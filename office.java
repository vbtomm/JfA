package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
        extends Building {

    // TODO - Put your code here.

    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    //constructor
    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    //constructor with businessName
    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        this (length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        sTotalOffices++;
    }

    //constructor with businessName and parking spaces
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        this (length, width, lotLength, lotWidth, businessName);
        mBusinessName = null;
        mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }


    public static int getTotalOffices() {
        return sTotalOffices;
    }


    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }


    //String
    @Override
    public String toString() {
        String result = "Business: ";
        if(this.getBusinessName()!= null) {
            result = result + mBusinessName;
        }
        else{
            result = result + "unoccupied";
        }
        if(this.getParkingSpaces()>0){
            result = result +  "; has "+ mParkingSpaces + " parking spaces";
        }
        return result + " (total offices: " + sTotalOffices + ")";
    }

    //Equal
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Office) {
            Office otherOffice = (Office) obj;
            if (otherOffice.calcBuildingArea() == this.calcBuildingArea() && otherOffice.getParkingSpaces() == this.getParkingSpaces())
                return true;
        }
        return false;
    }
}
