/*INSERT HEADER HERE*/

import java.util.Scanner;

public class MathMinigame {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Step 1: Take in  first and last name
        System.out.print("Enter your first name: ");
        // TODO: Take in first name
 
        System.out.print("Enter your last name: ");
        // TODO: Take in last name

        // TODO: Create username from first initial + last name
        System.out.println("Welcome: " + /* username here */);

        // Step 2: Ask user for two random whole numbers
        System.out.print("Enter a whole number: ");
        // TODO: Take in first number

        System.out.print("Enter another whole number: ");
        // TODO: Take in second number

        // Step 3: Randomly choose an operation
        // TODO: Use Math.random() to pick a number 1–5

        // TODO: Perform the chosen operation and store the result
        // TODO: Keep track of the operation name (e.g., "Addition")

        // Step 4: Display result and ask user to guess
        System.out.println("\nThe result of the mystery operation is: " /* + result */);
        System.out.println("Which operation was performed?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulus");
        System.out.print("Enter the operation name: ");
        keyboard.nextLine(); // consume newline
        String guess = keyboard.nextLine();

        // Step 5: Compare and check if guess is correct

    }
}
