// Import Scanner class to take input from the user
import java.util.Scanner;

// Define the class named ReverseString
public class ReverseString {

    // Main method – program execution starts from here
    public static void main(String[] args) {

        // Create Scanner object to read input from the keyboard (System.in)
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");

        // Read the complete line entered by the user and store it in 'str'
        String str = sc.nextLine();

        // Initialize an empty string to store the reversed result
        String reversed = "";

        // Loop starts from the last character of the string
        // str.length() - 1 gives the last index of the string
        // Loop runs until index becomes 0
        for (int i = str.length() - 1; i >= 0; i--) {

            // Fetch the character at index 'i' and append it to 'reversed'
            reversed = reversed + str.charAt(i);
        }

        // Print the original string entered by the user
        System.out.println("Original String: " + str);

        // Print the reversed string
        System.out.println("Reversed String: " + reversed);

        // Close the Scanner object to free system resources
        sc.close();
    }
}
