// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is a child of the abstract class ChapmanHousing
 * It represents the Sandhu Chapman housing unit
 */
public class Sandhu extends ChapmanHousing {
  /**
   * Default Constructor
   * Uses all of the member variables from the parent abstract class
   * ChapmanHousing
   */
  public Sandhu() {
    super(40, 300, 260, 3, true, 800.00, 30, false, false, true, true, "on-campus", "freshman dorm");
  }

  /**
   * Overloaded Constructor
   * Takes in values for all memeber variables from the parent class
   * Allows user to set the value for each member variable
   * 
   * @param spaceAvailable   amount of space available in a housing unit as an int
   * @param buildingCapacity building capacity of housing unit as an int
   * @param currentOccupancy current occupancy/number of students in housing unit as an int
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
  public Sandhu(int spaceAvailable, int buildingCapacity, int currentOccupancy, int numRoommates,
      boolean sharedBathroom, double price, int numLaundry, boolean shuttle, boolean gym, boolean parking,
      boolean mealPlan, String location, String housingType) {
    super(spaceAvailable, buildingCapacity, currentOccupancy, numRoommates, sharedBathroom, price, numLaundry, shuttle,
        gym, parking, mealPlan, location, housingType);
  }

  /**
   * Method to calculate total space available in Sandhu (abstract method from
   * ChapmanHousing)
   * 
   * @return returns the amount of space available in the housing unit
   */
  @Override
  public int calcSpaceAvailable() {
    this.spaceAvailable = buildingCapacity - currentOccupancy;
    System.out.println(this.spaceAvailable);
    return this.spaceAvailable;
  }

  /**
   * Equals method, checks if two objects are considered equal
   * 
   * @param o an object used to for comnparison
   * @return true or false if the objects are equal
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
   * Method to print out all info about Pralle
   */
  @Override
  public String toString() {
    return "\nSandhu Info:" + "\n" + super.toString();
  }
}
