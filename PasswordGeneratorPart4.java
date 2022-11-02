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
import java.util.stream.Collectors;

public class PasswordGeneratorPart4 {

    public static void main(String[] args) 
    {

        // Variables
        int uppercase;      // Hold user input for if the user wants uppercase letters
        int lowercase;      // Hold user input for if the user wants lowercse letters
        int numbers;        // Hold user input for if the user wants numbers
        int symbols;        // Hold user input for if the user wants symbols
        int newitem;        // Holds the chois for which type of item to add to the password
        String isTrueUppercase; // Used for echoing user input
        String isTrueLowercase; // Used for echoing user input
        String isTrueNumber;     // Used for echoing user input
        String isTrueSymbols;   // Used for echoing user input
        String length;      // Hold user input for length
        String SYMBOLS = "!@#$%&?"; // Symbole characters to use. 

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

        // Convert the String to a Intreger
        int passwordlength = Integer.parseInt(length);

        for (int i = 0; i < passwordlength; i++ ){

          // while statment is for if the user does not 
          // want a specific item the (int i) does not go
          // up while getting random item
          while (finding_newitem) {
            // Get a random number to choise between numbers, uppercase letters, and lowercase ltters
            newitem = rand.nextInt(0, 4);

            if (numbers == 0 && newitem == 0){          
              // Get a random number for the password
              int x = rand.nextInt(0, 10);
              // Change the Integer to a String so it can be added to the list
              String new_number = Integer.toString(x);
              // Add new number to password
              newpassword.add(new_number);
              // to stop looking for new item
              finding_newitem = false;
            }
              else if (uppercase == 0 && newitem == 1) {
              // Get a random letter for the password
              char uppercase_letter = (char) (rand.nextInt(26) + 'A');
              // Change the char to a String so it can be added to the list
              String new_uppercase_letter = String.valueOf(uppercase_letter);
              // Add new letter to password
              newpassword.add(new_uppercase_letter);
              // to stop looking for new item
              finding_newitem = false;
            }
            else if (lowercase == 0 && newitem == 2) {
              // Get a random letter for the password
              char lowercase_letter = (char) (rand.nextInt(26) + 'a');
              // Change the char to a String so it can be added to the list
              String new_lowercase_letter = String.valueOf(lowercase_letter);
              // Add new letter to password
              newpassword.add(new_lowercase_letter);
              // to stop looking for new item
              finding_newitem = false;
            }    
            else if (symbols == 0 && newitem == 3) {
              // Get a random letter for the password
              newitem = rand.nextInt(SYMBOLS.length());
              char new_random_symbol = SYMBOLS.charAt(newitem);
              // Change the char to a String so it can be added to the list
              String new_symbol = String.valueOf(new_random_symbol);
              // Add new symbol to password
              newpassword.add(new_symbol);
              // to stop looking for new item
              finding_newitem = false;
            }
        }   
        // Set finding_newitem to true to alwas run a if statment
        finding_newitem = true;

    // Echo user input in string. (Not Boolean)
    }  
    if (numbers == 0) {
      isTrueNumber = "numbers yes";
    } else {
      isTrueNumber = "numbers no";
    }
    if (uppercase == 0) {
      isTrueUppercase = "uppercase letters yes";
    } else {
      isTrueUppercase = "uppercase letters no";
    }
    if (lowercase == 0) {
      isTrueLowercase = "lowercase letters yes";
    } else {
      isTrueLowercase = "lowercase letters no";
    }
    if (symbols == 0) {
      isTrueSymbols = "symbols yes";
    } else {
      isTrueSymbols = "symbols no";
    }

    // Change the newpassword to string using Collectors so the password will print without  [ , , ,]
    String password = newpassword.stream().map(String::valueOf).collect(Collectors.joining(""));

    // Echo user input in and display the password using JOptionPane
    JOptionPane.showMessageDialog(null, "You chose to use\n" 
                                  + isTrueUppercase + "\n" 
                                  + isTrueLowercase + "\n"
                                  + isTrueNumber + "\n"
                                  + isTrueSymbols + "\n"
                                  + "The length of the password: " + length
                                  + "\nYour new password: " + (password), 
                                  "Password Generator", 
                                  JOptionPane.PLAIN_MESSAGE);

  }
}
