/*
* Filename: PasswordGenerator.java
* Written by: Nicoli
* Written on: 9/14/2022
* Purpose: Generate a password with input from user
*/

// Import JOptionPane to use dialog boxes
import javax.swing.JOptionPane;
// Import ArrayList to use how holding password
import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) 
    {

        // Variables
        int uppercase;      // Hold user input for if the user wants uppercase letters
        int numbers;        // Hold user input for if the user wants numbers
        int symbols;        // Hold user input for if the user wants symbols
        String length;      // Hold user input for length

        // Create newpassword ArrayList as a string
        ArrayList<String> newpassword = new ArrayList < String > ();

        // Generate random integer from 0 - 9
        Random rand = new Random();

        // Ask user if they want uppercase letters
        uppercase = JOptionPane.showConfirmDialog(null,
                                                     "Would you like to have uppercase letters?",
                                                       "Password Generator",
                                                              JOptionPane.YES_NO_OPTION);

        // Ask user if they want numbers
        numbers = JOptionPane.showConfirmDialog(null,
                                         "Would you like to have numbers?",
                                           "Password Generator",
                                                   JOptionPane.YES_NO_OPTION);

        // Ask user if they want symbols
        symbols = JOptionPane.showConfirmDialog(null,
                                         "Would you like to have symbols?",
                                           "Password Generator",
                                                   JOptionPane.YES_NO_OPTION);

        // Ask user how long the password should be
        length = JOptionPane.showInputDialog(null,
                                   "How long to you want your password to be:",
                                     "Password Generator",
                                            JOptionPane.INFORMATION_MESSAGE);

        // Test if user input is working. 0: means the user answered yes and 1: means no
        System.out.println("Does the user want uppercase letters? " + uppercase +
                           ": Does the user want numbers " + numbers +
                           ": Does the user want numbers " + symbols +
                           ": How long should the password be " + length);

        // Convert the String to a Intreger
        int passwordlength = Integer.parseInt(length);

        if (numbers == 0){
          for (int i = 0; i < passwordlength; i++ ){               
            // Get a random number for the password
            int x = rand.nextInt(0, 10);
            // Change the Integer to a String so it can be added to the list
            String password = Integer.toString(x);
            // Add new number two password
            newpassword.add(password);
            // Print password
            System.out.print(newpassword.get(i));
          }
        }     
    }
}
