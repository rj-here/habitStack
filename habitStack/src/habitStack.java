/*
This will use data structures to stack habits together.

By Rishi

Updated: 19th June, 2026
*/
import java.util.*;

public class habitStack {
    public static void main(String[] args) {
        String habitString = habits(); //get the habits as a string
        // Do something with the habits string, e.g., split it into an array
        String[] habitsArray = habitString.split(","); //split the habits into an array
        Stack<String> habitStack = new Stack<>(); //create a stack to hold the habits
        for (int counter = habitsArray.length-1; counter >= 0; counter--) {
            habitStack.push(habitsArray[counter].trim()); //push each habit onto the stack, trimming whitespace
        }
        printHabits(habitStack); //print the habits in the stack
    }

    public static String habits() {
        //Method gets the string with the habits!
        Scanner input = new Scanner(System.in); //scanner for user input
        System.out.println("Enter your habits, separated by commas: ");
        String habitString = input.nextLine(); //get the habits as a string
        input.close(); //close the scanner
        System.out.println("Your habits are: " + habitString); //print the habits
        return habitString;
    }

    public static void printHabits(Stack<String> habitStack) {
        //Method to print the habits in the stack
        System.out.println("Your habit stack is: ");
        int habitNo = 1; //counter for habit number
        while (!habitStack.isEmpty()) {
            System.out.println(habitNo + ". " + habitStack.pop()); //pop each habit from the stack and print it
            habitNo++;
        }
    }
}