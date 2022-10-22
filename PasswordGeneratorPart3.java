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


public class PasswordGeneratorPart3 {
    public static void main(String[] args) 
    {

        // Variables
        int uppercase;      // Hold user input for if the user wants uppercase letters
        int lowercase;      // Hold user input for if the user wants lowercse letters
        int numbers;        // Hold user input for if the user wants numbers
        int symbols;        // Hold user input for if the user wants symbols
        int newitem;        // Holds the chois for which type of item to add to the password
        String length;      // Hold user input for length

        // Boolean
        boolean finding_newitem = true; // Used to keep looking for newitems for list

        // Create newpassword ArrayList as a string
        ArrayList<String> newpassword = new ArrayList < String > ();

        // Generate random integer
        Random rand = new Random();

        // Ask user if they want uppercase letters
        uppercase = JOptionPane.showConfirmDialog(null,
                                                     "Would you like to have uppercase letters?",
                                                       "Password Generator",
                                                              JOptionPane.YES_NO_OPTION);

        // Ask user if they want lowercase letters
        lowercase = JOptionPane.showConfirmDialog(null,
                                                      "Would you like to have lowercase letters?",
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

        for (int i = 0; i < passwordlength; i++ ){

          // while statment is for if the user does not 
          // want a specific item the (int i) does not go
          // up while getting random item
          while (finding_newitem) {
            // Get a random number to choise between numbers, uppercase letters, and lowercase ltters
            newitem = rand.nextInt(0, 3);

            if (numbers == 0 && newitem == 0){          
              // Get a random number for the password
              int x = rand.nextInt(0, 10);
              // Change the Integer to a String so it can be added to the list
              String new_number = Integer.toString(x);
              // Add new number to password
              newpassword.add(new_number);
              // to stop looking for new item
              finding_newitem = false;
              // Print password
              System.out.print(newpassword.get(i));
            }
              else if (uppercase == 0 && newitem == 1) {
              // Get a random letter for the password
              char uppercase_letter = (char) (rand.nextInt(26) + 'A');
              // Change the char to a String so ir can be added to the list
              String new_uppercase_letter = String.valueOf(uppercase_letter);
              // Add new letter to password
              newpassword.add(new_uppercase_letter);
              // to stop looking for new item
              finding_newitem = false;
              // Print password
              System.out.print(newpassword.get(i));
            }
            else if (lowercase == 0 && newitem == 2) {
              // Get a random letter for the password
              char uppercase_letter = (char) (rand.nextInt(26) + 'a');
              // Change the char to a String so ir can be added to the list
              String new_uppercase_letter = String.valueOf(uppercase_letter);
              // Add new letter to password
              newpassword.add(new_uppercase_letter);
              // to stop looking for new item
              finding_newitem = false;
              // Print password
              System.out.print(newpassword.get(i));
            }    
        }   
        // Set finding_newitem to true to alwas run a if statment
        finding_newitem = true;
    }  
  }
}
