/*
This will use data structures to stack habits together.

By Rishi

Updated: 18th June, 2026
*/
import java.util.*;

public class habitStack {
    public static void main(String[] args) {
        String habitString = habits(); //get the habits as a string
        
    }

    public static String habits() {
        //Method gets the string with the habits!
        Scanner input = new Scanner(System.in); //scanner for user input
        System.out.println("Enter your habits, separated by commas: ");
        String habitString = input.next(); //get the habits as a string
        input.close(); //close the scanner
        System.out.println("Your habits are: " + habitString); //print the habits
        return habitString;
    }
}