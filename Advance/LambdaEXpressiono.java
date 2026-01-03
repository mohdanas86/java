package Advance;

/**
 * Lambda Expressions Notes for Beginners:
 * - What it is: Lambda expressions are a concise way to represent anonymous functions (methods without a name) in Java, often used with functional interfaces.
 * - When to use: Use lambdas for short, simple operations like iterating over collections, handling events, or passing behavior to methods.
 * - Why use: They reduce boilerplate code, make it easier to write functional-style code, and improve readability for small tasks.
 * - Other things: Lambdas use the -> syntax (parameters -> body). They can access local variables (effectively final). Work best with single-method interfaces like Runnable or Comparator.
 */

import java.util.ArrayList;

public class LambdaEXpressiono {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Anas");
        names.add("Alice");
        names.add("John");

        // Example 1: Basic Lambda Expression
        // Using lambda directly in a forEach loop to print each item in a list
        names.forEach(name -> System.out.println(name));

        // Example 2: Lambda in a Variable
        // Storing a lambda in a variable for reuse (using Runnable interface)
        Runnable greet = () -> System.out.println("Welcome..");
        greet.run(); // Executes the lambda stored in the variable

        // Example 3: Lambda as Method Parameter
        // Passing a lambda to a method that expects a functional interface (e.g.,
        // Comparator for sorting)
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(2);
        nums.add(3);
        nums.add(1);

        nums.sort((a, b) -> a.compareTo(b)); // Lambda compares integers for sorting in ascending order
        System.out.println(nums);
    }
}
