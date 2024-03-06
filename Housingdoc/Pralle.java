// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is a child of the abstract class ChapmanHosuing
 * It represents the Pralle Chapman housing unit
 */
public class Pralle extends ChapmanHousing {

  /**
   * Default constructor
   * Sets default values for all member variables
   */
  public Pralle() {
    super(200, 500, 300, 3, true, 10000.00, 8, false, false, true, true, "on-campus", "freshman dorm");
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
  public Pralle(int spaceAvailable, int buildingCapacity, int currentOccupancy, int numRoommates,
      boolean sharedBathroom, double price, int numLaundry, boolean shuttle, boolean gym, boolean parking,
      boolean mealPlan, String location, String housingType) {
    super(spaceAvailable, buildingCapacity, currentOccupancy, numRoommates, sharedBathroom, price, numLaundry, shuttle,
        gym, parking, mealPlan, location, housingType);
  }

  /**
   * Method to calculate the space available in Pralle (abstract method from
   * ChapmanHousing)
   * 
   * @return the current space available in Pralle housing unit
   */
  @Override
  public int calcSpaceAvailable() {
    this.spaceAvailable = buildingCapacity - currentOccupancy;
    setSpaceAvailable(this.spaceAvailable);
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
   * Method to print out all info about Pralle and its properties
   * 
   * @return string representation of Pralle
   */
  @Override
  public String toString() {
    return "\nPralle Info:" + "\n" + super.toString();
  }
}