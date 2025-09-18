/**
 * Demonstrates various String methods and Math class methods in Java.
 */
public class StringAndMathDemo {

    public static void main(String[] args) {
        // ----------------------------
        // STRING METHODS
        // ----------------------------
        System.out.println("=== String Methods ===");

        String word1 = "Hello";
        String word2 = "World";
        String phrase = "Hello World!";

        // 1. int length()
        System.out.println("Length of '" + word1 + "': " + word1.length()); // 5

        // 2. boolean equals(String other)
        System.out.println("'" + word1 + "' equals 'Hello'? " + word1.equals("Hello")); // true
        System.out.println("'" + word1 + "' equals '" + word2 + "'? " + word1.equals(word2)); // false

        // 3. String substring(int from)
        System.out.println("Substring of '" + phrase + "' from index 6: " + phrase.substring(6)); // "World!"

        // 4. String substring(int from, int to)
        System.out.println("Substring of '" + phrase + "' from index 0 to 5: " + phrase.substring(0, 5)); // "Hello"

        // 5. int indexOf(String str)
        System.out.println("Index of 'World' in '" + phrase + "': " + phrase.indexOf("World")); // 6

        // 6. int compareTo(String other)
        System.out.println("'Hello' compareTo 'World': " + word1.compareTo(word2));
        // Negative value because "Hello" < "World" lexicographically
        System.out.println("'World' compareTo 'Hello': " + word2.compareTo(word1));
        // Positive value because "World" > "Hello"


        // ----------------------------
        // MATH CLASS METHODS
        // ----------------------------
        System.out.println("\n=== Math Class Methods ===");

        int num1 = -25;
        double num2 = -3.14;

        // 1. static int abs(int x)
        System.out.println("Absolute value of " + num1 + ": " + Math.abs(num1)); // 25

        // 2. static double abs(double x)
        System.out.println("Absolute value of " + num2 + ": " + Math.abs(num2)); // 3.14

        // 3. static double pow(double base, double exponent)
        System.out.println("2 to the power of 3: " + Math.pow(2, 3)); // 8.0

        // 4. static double sqrt(double x)
        System.out.println("Square root of 16: " + Math.sqrt(16)); // 4.0

        // 5. static double random()
        // Note: Math.random() returns a double between 0.0 (inclusive) and 1.0 (exclusive).
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());

        // Example: Generate a random integer between 1 and 10
        int randomNum = (int)(Math.random() * 10) + 1;
        System.out.println("Random integer between 1 and 10: " + randomNum);
    }
}
