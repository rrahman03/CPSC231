// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is a child of the abstract class ChapmanHousing
 * It represents the Panther Village Chapman housing unit
 */
public class PantherVillage extends ChapmanHousing {
  private int numRooms; // Added numRooms member variable since Panther Village units have multiple
                        // rooms

  /**
   * Default constructor
   * sets default values for member variables
   * shares member variables with parent abstract class ChapmanHousing
   */
  public PantherVillage() {
    super(70, 400, 330, 3, false, 900.00, 30, true, true, true, false, "off-campus", "continuing student apartment");
    this.numRooms = 3; // Initialize the new variable numRooms
  }

  /**
   * Overloaded Constructor
   * Allows user to set values for member variables
   * Takes in values for all memeber variables from the parent class
   * Allows user to set the value for each member variable
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
  public PantherVillage(int spaceAvailable, int buildingCapacity, int currentOccupancy,
      int numRoommates, boolean sharedBathroom, double price, int numLaundry, boolean shuttle,
      boolean gym, boolean parking, boolean mealPlan, String location, String housingType, int numRooms) {
    super(spaceAvailable, buildingCapacity, currentOccupancy, numRoommates, sharedBathroom, price, numLaundry,
        shuttle, gym, parking, mealPlan, location, housingType);
    this.numRooms = numRooms;
  }

  /**
   * Method to calculate total space available in Panther Village (implements
   * abstract method from
   * ChapmanHousing)
   * 
   * @return the current amount of space available in Panther Village
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
   * Accessor for numRooms
   * 
   * @return the number of bedrooms in a Panther Village apartment
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
   * Method to print out all info about Panther Village
   * 
   * @return string representation of the housing unit and its properties
   */
  @Override
  public String toString() {
    return "\nPanther Village Info:" + "\nNumber of Rooms per apartment: " + this.numRooms +
        "\n" + super.toString(); // Include the new variable in the toString representation
  }
}