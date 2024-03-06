// Raneem Rahman and Brooke England
// no in-code references
/**
 * This class is used to get user input for the housing management system
 * It asks the user if they would like to view and update housing information
 * and allows the user to add or remove students from any of the housing units
 * 
 * This class also implements a file management system.
 * It writes out the information for each housing unit to file "HousingInfo.txt"
 * The information is updated every time the user makes a change to the number of students
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ChapmanDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // creating new object for each housing unit
        Pralle p = new Pralle();
        Henley h = new Henley();
        PantherVillage pv = new PantherVillage();
        Grand g = new Grand();
        Sandhu s = new Sandhu();

        // asking user if they would like to view housing information
        System.out.println("\nWould you like to view and update Chapman Housing information? " + "\n- Yes" + "\n- No");
        String userAnswer = scnr.nextLine();

        while (userAnswer.toLowerCase().equals("yes")) {
            // ask user which Chapman Housing they would like information for
            System.out.println("\nEnter the Chapman housing you would like to see information for: " + "\n" +
                    "- Pralle" + "\n" + "- Henley" + "\n" + "- Panther Village" + "\n" + "- Grand" + "\n" + "- Sandhu");
            String userInput = scnr.nextLine();
            
            // print information for the user's desired housing
            if (userInput.toLowerCase().equals("pralle")) {
                System.out.println(p);
            } else if (userInput.toLowerCase().equals("henley")) {
                System.out.println(h);
            } else if (userInput.toLowerCase().equals("panther village")) {
                System.out.println(pv);
            } else if (userInput.toLowerCase().equals("grand")) {
                System.out.println(g);
            } else if (userInput.toLowerCase().equals("sandhu")) {
                System.out.println(s);
            } else {
                System.out.println("\nNot an option");
                continue;
            }

            // ask user if they would like to add or remove a student
            System.out.println("\nWould you like to add or remove a student? " + "\n" + "- Add" + "\n- Remove" + "\n- No");
            userInput = scnr.nextLine();

            if (userInput.toLowerCase().equals("add")) {
                // get which housing the user would like to add a student to
                System.out.println("\nWhich Chapman Housing would you like to add a student to?" + "\n" +
                        "- Pralle" + "\n" + "- Henley" + "\n" + "- Panther Village" + "\n" + "- Grand" + "\n" + "- Sandhu");
                String housingChoice = scnr.nextLine();
                if (housingChoice.toLowerCase().equals("pralle")) {
                    p.addStudent();
                    System.out.println("\nUpdated Pralle Info:" + "\n" + p);
                } else if (housingChoice.toLowerCase().equals("henley")) {
                    h.addStudent();
                    System.out.println("\nUpdated Henley Info:" + "\n" + h);
                } else if (housingChoice.toLowerCase().equals("panther village")) {
                    pv.addStudent();
                    System.out.println("\nUpdated Panther Village Info:" + "\n" + pv);
                } else if (housingChoice.toLowerCase().equals("grand")) {
                    g.addStudent();
                    System.out.println("\nUpdated Grand Info:" + "\n" + g);
                } else if (housingChoice.toLowerCase().equals("sandhu")) {
                    s.addStudent();
                    System.out.println("\nUpdated Sandhu Info:" + "\n" + s);
                } else {
                    // System.out.println("\nNot an option");
                }
            } else if (userInput.toLowerCase().equals("remove")) {
                // get which housing the user would like to remove a student from
                System.out.println("\nWhich Chapman housing would you like to remove a student from?" + "\n" +
                        "- Pralle" + "\n" + "- Henley" + "\n" + "- Panther Village" + "\n" + "- Grand" + "\n" + "- Sandhu");
                String housingChoice = scnr.nextLine();
                if (housingChoice.toLowerCase().equals("pralle")) {
                    p.removeStudent();
                    System.out.println("\nUpdated Pralle Info:" + "\n" + p);
                } else if (housingChoice.toLowerCase().equals("henley")) {
                    h.removeStudent();
                    System.out.println("\nUpdated Henley Info:" + "\n" + h);
                } else if (housingChoice.toLowerCase().equals("panther village")) {
                    pv.removeStudent();
                    System.out.println("\nUpdated Panther Village Info:" + "\n" + pv);
                } else if (housingChoice.toLowerCase().equals("grand")) {
                    g.removeStudent();
                    System.out.println("\nUpdated Grand Info:" + "\n" + g);
                } else if (housingChoice.toLowerCase().equals("sandhu")) {
                    s.removeStudent();
                    System.out.println("\nUpdated Sandhu Info:" + "\n" + g);
                } else {
                    // No need for "Not an option" statement here
                }
            } else {
                // No need for "Not an option" statement here
            }

            // ask if the user would like to continue viewing and updating housing info
            System.out.println("\nWould you like to continue? " + "\n- Yes" + "\n- No");
            userAnswer = scnr.nextLine();

            // Write out updated information to "HousingInfo.txt" file
            PrintWriter writer = null;
            try {
                writer = new PrintWriter(new FileWriter("HousingInfo.txt"), false);
                writer.println(p);
                writer.println(h);
                writer.println(pv);
                writer.println(g);
                writer.println(s);
                // catches exceptions and prints out message if something goes wrong while writing the file
            } catch (IOException e) {
                System.out.println("Something went wrong while writing this file");
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
        }
    }
}
