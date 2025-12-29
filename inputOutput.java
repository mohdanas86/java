
// INPUT AND OUTPUT: Reading user input and displaying formatted output
// WHAT IS THIS: Demonstrates Scanner class for input and printf for formatted output
// WHY USE:
//   1. User interaction - programs need to read user data
//   2. Formatted output - professional-looking console output
//   3. Data validation - read specific data types safely
//   4. Interactive programs - console-based applications
// WHEN USE: When building console applications that need user input/output

import java.util.*; // Import for Scanner class

public class inputOutput {

    public static void main(String[] args) {
        // SCANNER OBJECT: Creates Scanner to read from console input
        // WHAT: Scanner(System.in) reads from keyboard input
        // WHY: Provides easy methods to read different data types
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT METHODS DEMONSTRATION ===\n");

        // ===== nextInt() =====
        // METHOD: Reads next integer from input
        // WHAT: Parses and returns int value, throws exception if not integer
        // WHEN USE: When you need whole numbers (int range: -2.1B to 2.1B)
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("You entered integer: " + intValue);

        // ===== nextDouble() =====
        // METHOD: Reads next double-precision floating point number
        // WHAT: Parses decimal numbers, accepts scientific notation
        // WHEN USE: When you need high-precision decimal numbers
        System.out.print("\nEnter a double: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered double: " + doubleValue);

        // ===== nextFloat() =====
        // METHOD: Reads next single-precision floating point number
        // WHAT: Similar to nextDouble but uses less memory
        // WHEN USE: When memory is concern and precision isn't critical
        System.out.print("\nEnter a float: ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered float: " + floatValue);

        // ===== next() =====
        // METHOD: Reads next token/word until whitespace
        // WHAT: Reads single word, stops at space/tab/newline
        // WHEN USE: When reading single words or tokens
        System.out.print("\nEnter a single word: ");
        String word = sc.next();
        System.out.println("You entered word: " + word);

        // ===== nextLine() =====
        // BUFFER CLEARING: Consume leftover newline from previous nextInt/nextDouble/etc.
        // WHY: Numeric input methods don't consume newline, causes nextLine() to read empty string
        sc.nextLine(); // This clears the buffer

        // METHOD: Reads entire line including spaces until Enter
        // WHAT: Reads full line of text, preserves spaces
        // WHEN USE: When reading sentences or multi-word input
        System.out.print("\nEnter a line of text: ");
        String line = sc.nextLine();
        System.out.println("You entered line: " + line);

        System.out.println("\n=== OUTPUT FORMATTING WITH printf() ===\n");

        // ===== printf() METHOD =====
        // METHOD: Formatted output similar to C's printf
        // WHAT: Uses format specifiers to control output appearance
        // WHY: Professional formatting, precise control over output
        // WHEN USE: When you need formatted, aligned, or precise output

        System.out.println("Formatted Output Examples:");

        // SAMPLE DATA: Variables to demonstrate formatting
        int num = 40;
        String str = "Sample";
        float f1 = 10.0000000f;

        // FORMAT SPECIFIERS:
        // %d - integer, %s - string, %f - float/double
        // %.4f - float with 4 decimal places
        System.out.printf("Integer: %d, String: %s, Float: %.4f\n", num, str, f1);

        // MORE FORMATTING EXAMPLES:
        System.out.println("\nAdditional Formatting Examples:");

        // Width specifiers - minimum field width
        System.out.printf("Number with width 5: %5d\n", 42);    // Right-aligned
        System.out.printf("Number with width 5: %-5d\n", 42);   // Left-aligned

        // Precision for floating point
        double pi = 3.14159265359;
        System.out.printf("Pi with 2 decimals: %.2f\n", pi);
        System.out.printf("Pi with 4 decimals: %.4f\n", pi);

        // Multiple lines with consistent formatting
        System.out.println("\nTable Format:");
        System.out.printf("%-10s %-5s %-8s\n", "Name", "Age", "Salary");
        System.out.printf("%-10s %-5d %-8.2f\n", "Alice", 25, 50000.50);
        System.out.printf("%-10s %-5d %-8.2f\n", "Bob", 30, 60000.75);

        // RESOURCE CLEANUP: Close Scanner to free resources
        // WHY: Prevents resource leaks, good practice
        sc.close();

        System.out.println("\n=== COMMON ISSUES & SOLUTIONS ===");
        System.out.println("1. nextLine() after nextInt(): Use extra nextLine() to consume newline");
        System.out.println("2. InputMismatchException: Handle invalid input types");
        System.out.println("3. Resource leaks: Always close Scanner when done");
        System.out.println("4. Buffer issues: Be aware of what each method consumes");
    }
}
