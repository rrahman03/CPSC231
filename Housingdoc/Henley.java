// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is a child of the abstract class ChapmanHosuing
 * It represents the Henley Chapman housing unit
 */
public class Henley extends ChapmanHousing {

  /**
   * Default constructor
   * Sets default values for all member variables
   */
  public Henley() {
    super(275, 500, 225, 3, true, 12000.00, 10, false, true, false, true, "on-campus", "freshman dorm");
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
  public Henley(String buildingName, int spaceAvailable, int buildingCapacity, int currentOccupancy, int numRoommates,
      boolean sharedBathroom, double price, int numLaundry, boolean shuttle, boolean gym, boolean parking,
      boolean mealPlan, String location, String housingType) {
    super(spaceAvailable, buildingCapacity, currentOccupancy, numRoommates, sharedBathroom, price, numLaundry, shuttle,
        gym, parking, mealPlan, location, housingType);
  }

  /**
   * Method to calculate total occupancy in Henley (abstract method from
   * ChapmanHousing)
   * 
   * @return the amount of space available in Henley as an int
   */
  @Override
  public int calcSpaceAvailable() {
    this.spaceAvailable = buildingCapacity - currentOccupancy;
    System.out.println(this.spaceAvailable);
    return this.spaceAvailable;
  }

  /**
   * Method to calculate the space available in Henley (abstract method from
   * ChapmanHousing)
   * 
   * @return the current space available in Henley housing unit
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
   * Method to print out all info about Henley and its properties
   * 
   * @return string representation of Henley
   */
  @Override
  public String toString() {
    return "\nHenley Info:" + "\n" + super.toString();
  }
}
