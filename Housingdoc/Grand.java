// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is a child of the abstract class ChapmanHosuing
 * It represents the Grand Chapman housing unit
 */
public class Grand extends ChapmanHousing {
  private int numRooms; // the number of bedrooms within each apartment

  /**
   * Default constructor
   * Sets default values for all member variables
   */
  public Grand() {
    super(100, 900, 800, 3, false, 1000.00, 300, true, true, true, false, "off-campus", "continuing student apartment");
    this.numRooms = 2;
  }

  /**
   * Overloaded Constructor
   * Allows user to set values for member variables
   * Takes in values for all memeber variables from the parent class
   * 
   * @param spaceAvailable   amount of space available in a housing unit as an int
   * @param buildingCapacity building capacity of housing unit as an int
   * @param currentOccupancy current occupancy/number of students in housing unit
   *                         as an int
   * @param numRoommates     number of roomates in housing unit as an int
   * @param sharedBathroom   boolean true if bathrooms are shared, false if not
   * @param price            price of housing unit as a double
   * @param numLaundry       number of laundry rooms in housing unit as an int
   * @param shuttle          boolean true if housing unit has a shuttle, false if
   *                         not
   * @param gym              boolean true if housing unit has a gym, false if not
   * @param parking          boolean true is housing unit has parking, false if
   *                         not
   * @param mealPlan         boolean true if housing unit has a meal plan, false
   *                         if not
   * @param location         location of the housing unit as a String
   * @param housingType      housing type as a String
   */
  public Grand(int spaceAvailable, int buildingCapacity, int currentOccupancy,
      int numRoommates,
      boolean sharedBathroom, double price, int numLaundry, boolean shuttle, boolean gym, boolean parking,
      boolean mealPlan, String location, String housingType) {
    super(spaceAvailable, buildingCapacity, currentOccupancy, numRoommates, sharedBathroom, price, numLaundry, shuttle,
        gym, parking, mealPlan, location, housingType);
  }

  /**
   * Accessor for numRooms
   * 
   * @return the number of bedrooms in a Grand apartment
   */
  public int getNumRooms() {
    return this.numRooms;
  }

  /**
   * Mutator for numRooms
   * 
   * @param numRooms
   */
  public void setNumRooms(int numRooms) {
    this.numRooms = numRooms;
  }

  /**
   * Method to calculate total space available in Grand (abstract method from
   * ChapmanHousing)
   * 
   * @return the current space available in Grand housing unit
   */
  @Override
  public int calcSpaceAvailable() {
    this.spaceAvailable = buildingCapacity - currentOccupancy;
    return this.spaceAvailable;
  }

  /**
   * Equals method, checks if two objects are considered equal
   * 
   * @param o object used for comparing
   * @return true if objects are equals, false if not
   */
  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * Method to print out all info about Grand
   * 
   * @return String representation of Grand housing unit and its properties
   */
  @Override
  public String toString() {
    return "\nGrand Info:" + "\n" + super.toString();
  }
}
