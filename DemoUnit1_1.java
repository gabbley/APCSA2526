/**
 * Provides a basic demo of variables,
 * print statements, and order of operations.
 * 
 * AP Computer Science A
 * Ms. Gabrielle Baniqued
 */
 
public class DemoUnit1_1 {

   public static void main(String[] args) {
      String name = "Paola";
      double balance = 213.33;
      
      System.out.println("Incorrect: " + name + ", your balance is $" + balance + ".\n");
      
      int payEarned = 100;
      
      System.out.println("Correct, not rounded: " + name + ", your balance is $" + (balance + payEarned) + ".\n");
      
      System.out.println("Correct, rounded: " + name + ", your balance is $" + Math.round(balance + payEarned) + ".");
   }

}