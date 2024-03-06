// Raneem Rahman and Brooke England
// no in-code references
/**
 * Abstract class that is a parent for all types of chapman housing
 * Creates attributes and methods to be implemented by children
 */
public abstract class ChapmanHousing implements Comparable<ChapmanHousing> {
  protected int spaceAvailable; // amount of space available in a housing unit as an int
  protected int buildingCapacity; // building capacity of housing unit as an int
  protected int currentOccupancy; // current occupancy/number of students in housing unit as an int
  protected int numRoommates; // number of roomates in housing unit as an int
  protected boolean sharedBathroom; // boolean true if bathrooms are shared, false if not
  protected double price; // price of housing unit as a double
  protected boolean shuttle; // boolean true if housing unit has a shuttle, false if not
  protected boolean gym; // boolean true if housing unit has a gym, false if not
  protected boolean parking; // boolean true is housing unit has parking, false if not
  protected int numLaundry; // number of laundry rooms in housing unit as an int
  protected boolean mealPlan; // boolean true if housing unit has a meal plan, false if not
  protected String location; // location of the housing unit as a String
  protected String housingType; // housing type as a String

  /**
   * Default Constructor
   * Sets default values for member variables
   */
  public ChapmanHousing() {
    spaceAvailable = 0;
    buildingCapacity = 0;
    currentOccupancy = 0;
    numRoommates = 0;
    sharedBathroom = true;
    price = 0;
    numLaundry = 0;
    shuttle = false;
    gym = false;
    mealPlan = false;
    parking = true;
    location = "";
    housingType = "";
  }

  /**
   * Overloaded Constructor
   * Allows user to set the value for each member variable
   * 
   * @param buildingName
   * @param spaceAvailable
   * @param buildingCapacity
   * @param currentOccupancy
   * @param numRoommates
   * @param sharedBathroom
   * @param price
   * @param numLaundry
   * @param shuttle
   * @param gym
   * @param parking
   * @param mealPlan
   * @param location
   * @param housingType
   */
  public ChapmanHousing(int spaceAvailable, int buildingCapacity, int currentOccupancy, int numRoommates,
      boolean sharedBathroom, double price, int numLaundry, boolean shuttle, boolean gym, boolean parking,
      boolean mealPlan, String location, String housingType) {
    this.spaceAvailable = spaceAvailable;
    this.buildingCapacity = buildingCapacity;
    this.currentOccupancy = currentOccupancy;
    this.numRoommates = numRoommates;
    this.sharedBathroom = sharedBathroom;
    this.price = price;
    this.numLaundry = numLaundry;
    this.shuttle = shuttle;
    this.gym = gym;
    this.parking = parking;
    this.mealPlan = mealPlan;
    this.location = location;
    this.housingType = housingType;
  }

  /**
   * Abstract Method to calculate the total amount of space available in a housing
   * unit
   * Should be implemented by all child classes
   */
  public abstract int calcSpaceAvailable();

  /**
   * Method to remove a student from a housing unit
   * if successful, decrements currentOccupancy and increments spaceAvailable
   * if there are no students to remove, prints message to user
   */
  public void removeStudent() {
    if (currentOccupancy > 0) {
      currentOccupancy--;
      spaceAvailable++;
    } else {
      System.out.println("No students to remove");
    }
  }

  /**
   * Method to add a student to a housing unit while there is still space left in
   * the
   * specific dorm/apartment
   * increments currentOccupancy and decrements spaceAvailable if they were
   * successfully added
   * if there is no space available prints message to user
   */
  public void addStudent() {
    if (currentOccupancy < buildingCapacity) {
      currentOccupancy++;
      spaceAvailable--;
    } else {
      System.out.println("Sorry there is no space available in this housing");
    }
  }

  /**
   * Accessor for spaceAvailable
   * 
   * @return space available in housing unit as an int
   */
  public int getSpaceAvailable() {
    return this.spaceAvailable;
  }

  /**
   * Mutator for spaceAvailable
   * 
   * @param spaceAvailable
   */
  public void setSpaceAvailable(int spaceAvailable) {
    this.spaceAvailable = spaceAvailable;
  }

  /**
   * Accessor for buildingCapacity
   * 
   * @return the building capacity as an int
   */
  public int getBuildingCapacity() {
    return this.buildingCapacity;
  }

  /**
   * Mutator for buildingCapacity
   * 
   * @param buildingCapacity
   */
  public void setBuildingCapacity(int buildingCapacity) {
    this.buildingCapacity = buildingCapacity;
  }

  /**
   * Acessor for currentOccupancy
   * 
   * @return the current occupancy of the housing unit as an int
   */
  public int getCurrentOccupancy() {
    return this.currentOccupancy;
  }

  /**
   * Mutator for currentOccupancy
   * 
   * @param currentOccupancy
   */
  public void setCurrentOccupancy(int currentOccupancy) {
    this.currentOccupancy = currentOccupancy;
  }

  /**
   * Accessor for numRoommates
   * 
   * @return the number of roomates in the housing unit as an int
   */
  public int getNumRoommates() {
    return this.numRoommates;
  }

  /**
   * Mutator for numRoommates
   * 
   * @param numRoomates
   */
  public void setNumRoommates(int numRoommates) {
    this.numRoommates = numRoommates;
  }

  /**
   * Accessor for sharedBathroom
   * 
   * @return true or false if the housing unit has shared bathrooms (boolean)
   */
  public boolean isSharedBathroom() {
    return this.sharedBathroom;
  }

  /**
   * Mutator for sharedBathroom
   * 
   * @param sharedBathroom
   */
  public void setSharedBathroom(boolean sharedBathroom) {
    this.sharedBathroom = sharedBathroom;
  }

  /**
   * Accessor for price
   * 
   * @return the price of the hosuing unit as a double
   */
  public double getPrice() {
    return this.price;
  }

  /**
   * Mutator for price
   * 
   * @param price
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /**
   * Accessor for shuttle
   * 
   * @return true or false is the housing unit has a shuttle (boolean)
   */
  public boolean isShuttle() {
    return this.shuttle;
  }

  /**
   * Mutator for shuttle
   * 
   * @param shuttle
   */
  public void setShuttle(boolean shuttle) {
    this.shuttle = shuttle;
  }

  /**
   * Accessor for gym
   * 
   * @return true or false if the housing unit has a gym (boolean)
   */
  public boolean getGym() {
    return this.gym;
  }

  /**
   * Mutator for gym
   * 
   * @param gym
   */
  public void setGym(boolean gym) {
    this.gym = gym;
  }

  /**
   * Accessor for parking
   * 
   * @return true or false if the housing unit has parking (boolean)
   */
  public boolean getParking() {
    return this.parking;
  }

  /**
   * Mutator for parking
   * 
   * @param parking
   */
  public void setParking(boolean parking) {
    this.parking = parking;
  }

  /**
   * Accessor for numLaundry
   * 
   * @return the number of laundry rooms in the housing unit as an int
   */
  public int getNumLaundry() {
    return this.numLaundry;
  }

  /**
   * Mutator for numLaundry
   * 
   * @param numLaundry
   */
  public void setNumLaundry(int numLaundry) {
    this.numLaundry = numLaundry;
  }

  /**
   * Accessor for mealPlan
   * 
   * @return true or false if the housing unit includes a meal plan (boolean)
   */
  public boolean getMealPlan() {
    return this.mealPlan;
  }

  /**
   * Mutator for mealPlan
   * 
   * @param mealPlan
   */
  public void setMealPlan(boolean mealPlan) {
    this.mealPlan = mealPlan;
  }

  /**
   * Accessor for location
   * 
   * @return the location of the housing unit as a String
   */
  public String getLocation() {
    return this.location;
  }

  /**
   * Mutator for location
   * 
   * @param location
   */
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   * Accessor for hosuing type
   * 
   * @return the housing type as a String
   */
  public String getHousingType() {
    return this.housingType;
  }

  /**
   * Mutator for housing type
   * 
   * @param hosuingType
   */
  public void setHousingType(String housingType) {
    this.housingType = housingType;
  }

  /**
   * Implements the comparable interface
   * Compares Chapman Housing objects based on the amount of space available
   * 
   * @return the difference in the amount of space available in ChapmanHousing
   *         objects
   */
  public int compareTo(ChapmanHousing other) {
    return this.spaceAvailable - other.spaceAvailable;
  }

  /**
   * Equals Method
   * Check if two ChapmanHousing objects are equal
   * 
   * @param o Object to be compared
   * @return true if equal, false if not
   */
  public boolean equals(Object o) {
    if (!(o instanceof ChapmanHousing)) {
      return false;
    } else {
      ChapmanHousing other = (ChapmanHousing) o;
      return this.spaceAvailable == other.spaceAvailable && this.numRoommates == other.numRoommates
          && this.sharedBathroom == other.sharedBathroom && this.price == other.price && this.shuttle == other.shuttle
          && this.gym == other.gym && this.parking == other.parking && this.numLaundry == other.numLaundry
          && this.mealPlan == other.mealPlan && this.location.equals(other.location)
          && this.housingType.equals(other.housingType);
    }
  }

  /**
   * toString method
   * Displays the housing information as a String
   * 
   * @return string representation of the hosuing unit and its properties
   */
  public String toString() {
    return "Space Available: " + this.spaceAvailable + "\nBuilding Capacity: " + this.buildingCapacity
        + "\nCurrent Occupancy: " + this.currentOccupancy + "\nNumber of Roommates: " + this.numRoommates
        + "\nShared Bathroom: " + this.sharedBathroom + "\nPrice: " + this.price + "\nNumber of Laundry: "
        + this.numLaundry + "\nShuttle: " + this.shuttle + "\nGym: " + this.gym + "\nParking: " + this.parking
        + "\nMeal Plan: " + this.mealPlan + "\nLocation: " + this.location + "\nHousing Type: " + this.housingType;
  }

}