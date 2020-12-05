/*
* This program finds a planets position in the solar system when the name of 
* said planet is inputted.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-30
* Class PlanetsCheck.
*/


// Import the Scanner class
import java.util.Scanner;

public class PlanetsCheck {

  // Enumeration containing the solar system planets
  enum PlanetsEnum {
    // List of Planets
    MERCURY(1), VENUS(2), EARTH(3), MARS(4), JUPITER(5),
    SATURN(6), URANUS(7), NEPTUNE(8);
    // finds numeral position when called
    int planetIndex;
    PlanetsEnum(int enumIndex) {
      this.planetIndex = enumIndex;
    }

    // Returns planet position
    public int showPlanet() {
      return planetIndex;
    }
  }

  /**
   * This function recieves user input and calls the enumeration to find the
   * corresponding position to the planets name listed in the enum.
   */
  public static void main(String[] args) {
    try {
      // states variables
      String planetInput = null;
      
      // create scanner object
      Scanner scan = new Scanner(System.in);
      
      //input
      System.out.println("Enter the planet name: ");
      String lplanetInput = scan.nextLine();
      
      // Converts string to uppercase to negate stray capitals
      planetInput = lplanetInput.toUpperCase();
      System.out.println();

      // Process
      PlanetsEnum planetName = PlanetsEnum.valueOf(planetInput);
      // retrieves corresponding planet value
      int planetPosition = planetName.showPlanet();

      // Output
      System.out.println(lplanetInput + " is planet number " + planetPosition
                         + " in the solar system.");

    // Catches inputs other than the planet names
    } catch (Exception e) {
      System.out.println();
      System.out.println("Invalid Input. Please enter planet names only.");
    } 
  }
}
