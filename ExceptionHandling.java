// EXCEPTION HANDLING: Managing runtime errors gracefully
// WHAT IS THIS: Demonstrates try-catch-finally, throw, throws, and custom exceptions
// WHY USE:
//   1. Prevent program crashes - handle errors gracefully
//   2. User-friendly error messages - instead of stack traces
//   3. Resource cleanup - ensure resources are released
//   4. Debugging - identify and fix issues
//   5. Robust applications - handle unexpected situations
// WHEN USE: Any code that might fail (file I/O, network, user input, calculations)

public class ExceptionHandling {

    public static void main(String[] args) {
        System.out.println("=== EXCEPTION HANDLING DEMONSTRATION ===\n");

        // ===== BASIC TRY-CATCH =====
        System.out.println("1. Basic Try-Catch with Multiple Catch Blocks:");
        demonstrateBasicExceptionHandling();

        // ===== TRY-CATCH-FINALLY =====
        System.out.println("\n2. Try-Catch-Finally (Resource Cleanup):");
        demonstrateFinallyBlock();

        // ===== THROW KEYWORD =====
        System.out.println("\n3. Throw Keyword (Manually Throwing Exceptions):");
        try {
            checkAge(15); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Caught thrown exception: " + e.getMessage());
        }

        // ===== THROWS KEYWORD =====
        System.out.println("\n4. Throws Keyword (Method Declaration):");
        try {
            riskyOperation(); // Method declares it throws exception
        } catch (ArithmeticException e) {
            System.out.println("Caught exception from method that throws: " + e.getMessage());
        }

        // ===== CUSTOM EXCEPTION =====
        System.out.println("\n5. Custom Exception:");
        try {
            validatePassword("weak"); // This will throw custom exception
        } catch (InvalidPasswordException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

        // ===== EXCEPTION TYPES =====
        System.out.println("\n6. Common Exception Types:");
        demonstrateExceptionTypes();

        System.out.println("\n=== EXCEPTION HANDLING BEST PRACTICES ===");
        System.out.println("✓ Catch specific exceptions first, general Exception last");
        System.out.println("✓ Use finally for resource cleanup");
        System.out.println("✓ Don't catch Exception unless necessary");
        System.out.println("✓ Provide meaningful error messages");
        System.out.println("✓ Log exceptions for debugging");
        System.out.println("✓ Consider checked vs unchecked exceptions");
    }

    // METHOD: Demonstrates basic try-catch with multiple catch blocks
    // WHAT: Shows how different exception types are caught separately
    // WHY: Specific handling for different error types
    public static void demonstrateBasicExceptionHandling() {
        try {
            // POTENTIAL EXCEPTIONS:
            int[] nums = {1, 2, 3};
            System.out.println("Accessing array element: " + nums[10]); // ArrayIndexOutOfBoundsException

            int result = 10 / 0; // ArithmeticException (division by zero)

            // This line won't execute if exception occurs above
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            // SPECIFIC CATCH: Handles array index errors
            // WHAT: Executed when array index is out of bounds
            System.out.println("Array Index Out of Bounds Exception caught: " + e.getMessage());

        } catch (ArithmeticException e) {
            // SPECIFIC CATCH: Handles math errors
            // WHAT: Executed when arithmetic operations fail
            System.out.println("Arithmetic Exception caught: " + e.getMessage());

        } catch (Exception e) {
            // GENERAL CATCH: Catches any remaining exceptions
            // WHAT: Safety net for unexpected exceptions
            // WHY: Always last, as it's the parent class of all exceptions
            System.out.println("General Exception caught: " + e.getMessage());
        }
    }

    // METHOD: Demonstrates try-catch-finally
    // WHAT: Shows resource cleanup with finally block
    // WHY: Finally always executes, even if exception occurs
    public static void demonstrateFinallyBlock() {
        try {
            System.out.println("In try block - about to divide by zero");
            int result = 5 / 0; // This will cause ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Exception caught in catch block: " + e.getMessage());

        } finally {
            // FINALLY BLOCK: Always executes regardless of exception
            // WHAT: Used for resource cleanup (closing files, connections, etc.)
            // WHY: Ensures cleanup happens even if exception occurs
            System.out.println("Finally block executed - cleanup happens here");
        }
    }

    // METHOD: Demonstrates throw keyword
    // WHAT: Manually throws an exception when condition is met
    // WHY: Validate input and signal errors to calling code
    public static void checkAge(int age) {
        if (age < 18) {
            // THROW KEYWORD: Creates and throws exception object
            // WHAT: Signals that something went wrong
            // WHY: Caller must handle this checked exception
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("Age is valid: " + age);
    }

    // METHOD: Demonstrates throws keyword in method signature
    // WHAT: Declares that method might throw an exception
    // WHY: Compiler knows to expect this exception from method calls
    public static void riskyOperation() throws ArithmeticException {
        // THROWS KEYWORD: In method signature, not the code
        // WHAT: Tells compiler this method might throw ArithmeticException
        // WHY: Calling code must handle or declare this exception
        System.out.println("About to perform risky calculation...");
        int result = 100 / 0; // This will throw ArithmeticException
    }

    // CUSTOM EXCEPTION CLASS: User-defined exception
    // WHAT: Extends Exception class for application-specific errors
    // WHY: Create meaningful exception types for your application
    static class InvalidPasswordException extends Exception {
        // CONSTRUCTOR: Creates custom exception with message
        public InvalidPasswordException(String message) {
            super(message); // Call parent Exception constructor
        }
    }

    // METHOD: Uses custom exception
    // WHAT: Validates password and throws custom exception if invalid
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            // THROW CUSTOM EXCEPTION: Application-specific error
            throw new InvalidPasswordException("Password must be at least 8 characters long");
        }
        System.out.println("Password is valid");
    }

    // METHOD: Demonstrates different types of exceptions
    // WHAT: Shows checked vs unchecked exceptions
    public static void demonstrateExceptionTypes() {

        // UNCHECKED EXCEPTIONS (RuntimeException subclasses):
        // Don't need to be declared or caught, but should be handled
        try {
            // NullPointerException - accessing null object
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            // NumberFormatException - invalid number conversion
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        // CHECKED EXCEPTIONS:
        // Must be either caught or declared in method signature
        // Example: IOException (file operations), SQLException (database)
        // Note: Not demonstrated here as it would require file/database operations
        System.out.println("Checked exceptions require try-catch or throws declaration");
    }
}
