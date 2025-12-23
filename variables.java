// VARIABLES: Named storage locations in memory
// WHY USE:
//   1. Store data for later use
//   2. Make code readable (meaningful names)
//   3. Reuse values throughout program
// WHEN USE: Whenever you need to store data temporarily or permanently

public class variables {

    // CLASS VARIABLES (Static variables)
    // WHY: Shared by all objects of the class
    // WHEN: When all objects need same value (constants, counters)
    static int objectCount = 0;

    // INSTANCE VARIABLES (Non-static)
    // WHY: Each object has its own copy
    // WHEN: When each object needs unique values
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("=== VARIABLE DECLARATION ===");

        // SYNTAX: dataType variableName;
        int number;           // Declaration only
        String text;          // Declaration only

        // SYNTAX: dataType variableName = value;
        int score = 95;       // Declaration + initialization
        String message = "Hello World"; // Declaration + initialization

        // Multiple variables of same type
        int a = 10, b = 20, c = 30;

        System.out.println("score: " + score);
        System.out.println("message: " + message);

        System.out.println("\n=== VARIABLE TYPES ===");

        // LOCAL VARIABLES: Declared inside methods
        // WHY: Temporary storage within method scope
        // WHEN: For calculations, loops, temporary data
        int localVar = 100;
        System.out.println("Local variable: " + localVar);

        // INSTANCE VARIABLES: Accessed through objects
        variables obj = new variables();
        obj.name = "Anas";    // Setting instance variable
        obj.age = 25;         // Setting instance variable
        System.out.println("Instance variables: " + obj.name + ", " + obj.age);

        // CLASS VARIABLES: Accessed through class name
        System.out.println("Class variable: " + variables.objectCount);

        System.out.println("\n=== VARIABLE SCOPE ===");

        // SCOPE: Where variable is accessible
        {
            int blockScope = 50; // Block scope - only inside this block
            System.out.println("Inside block: " + blockScope);
        }
        // System.out.println(blockScope); // ERROR! Out of scope

        for (int i = 0; i < 3; i++) { // Loop scope
            System.out.println("Loop variable i: " + i);
        }
        // System.out.println(i); // ERROR! i not accessible here

        System.out.println("\n=== VARIABLE NAMING RULES ===");

        // VALID names:
        int _underscore = 1;      // Can start with underscore
        int $dollar = 2;          // Can start with dollar
        int myVariable = 3;       // Camel case recommended
        int MY_CONSTANT = 4;      // Upper case for constants
        int number1 = 5;          // Can contain numbers (not at start)

        // INVALID names (would cause compile errors):
        // int 1number = 6;       // Cannot start with number
        // int my-variable = 7;   // Cannot use hyphens
        // int class = 8;         // Cannot use keywords
        System.out.println("Valid variables: " + _underscore + ", " + $dollar + ", " + myVariable);

        System.out.println("\n=== VARIABLE INITIALIZATION ===");

        // DEFAULT VALUES (for instance/class variables only)
        variables obj2 = new variables();
        System.out.println("Default String: '" + obj2.name + "'"); // null
        System.out.println("Default int: " + obj2.age);            // 0

        // Local variables MUST be initialized before use
        int mustInitialize;
        // System.out.println(mustInitialize); // ERROR! Not initialized

        mustInitialize = 42; // Now OK
        System.out.println("Initialized local: " + mustInitialize);

        System.out.println("\n=== FINAL VARIABLES (CONSTANTS) ===");

        // FINAL: Cannot be changed after initialization
        // WHY: For constants that shouldn't change
        // WHEN: Mathematical constants, configuration values
        final double PI = 3.14159;
        final int MAX_USERS = 100;
        final String APP_NAME = "MyApp";

        System.out.println("Constants: PI=" + PI + ", MAX_USERS=" + MAX_USERS + ", APP_NAME=" + APP_NAME);

        // PI = 3.14; // ERROR! Cannot modify final variable
        System.out.println("\n=== VARIABLE LIFETIME ===");

        // STATIC variables: Live entire program execution
        // INSTANCE variables: Live as long as object exists
        // LOCAL variables: Live only during method/block execution
        demonstrateLifetime();
    }

    static void demonstrateLifetime() {
        // This method demonstrates local variable lifetime
        int methodLocal = 200;
        System.out.println("Method local variable: " + methodLocal);
        // methodLocal dies when method ends
    }
}
