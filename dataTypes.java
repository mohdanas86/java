// DATA TYPES: Define what kind of data a variable can hold
// WHY USE: 
//   1. Memory allocation - tells JVM how much memory to allocate
//   2. Type safety - prevents wrong operations (can't add string to number)
//   3. Performance - different types have different memory/speed characteristics
// WHEN USE: Always when declaring variables - choose based on data requirements

public class dataTypes {

    public static void main(String[] args) {
        System.out.println("=== PRIMITIVE DATA TYPES ===");

        // INTEGER TYPES (whole numbers)
        // byte: 8-bit (-128 to 127) - Use for small numbers, save memory
        byte age = 25;
        System.out.println("byte age: " + age + " (range: -128 to 127)");

        // short: 16-bit (-32,768 to 32,767) - Use when byte is too small
        short year = 2025;
        System.out.println("short year: " + year);

        // int: 32-bit (-2.1B to 2.1B) - Most common integer type
        int population = 1400000000;
        System.out.println("int population: " + population);

        // long: 64-bit - Use for very large numbers (add L suffix)
        long worldPopulation = 8000000000L;
        System.out.println("long worldPopulation: " + worldPopulation);

        System.out.println("\n=== FLOATING POINT TYPES (decimal numbers) ===");

        // float: 32-bit decimal - Use when memory is concern (add F suffix)
        float temperature = 36.5F;
        System.out.println("float temperature: " + temperature);

        // double: 64-bit decimal - Most common for decimal calculations
        double pi = 3.14159265359;
        System.out.println("double pi: " + pi);

        System.out.println("\n=== CHARACTER AND BOOLEAN TYPES ===");

        // char: 16-bit Unicode character - Single character only
        char grade = 'A';
        char symbol = '@';
        System.out.println("char grade: " + grade + ", symbol: " + symbol);

        // boolean: true/false - Use for logical operations
        boolean isStudent = true;
        boolean hasPassed = false;
        System.out.println("boolean isStudent: " + isStudent + ", hasPassed: " + hasPassed);

        System.out.println("\n=== REFERENCE DATA TYPES ===");

        // String: Sequence of characters (NOT primitive!)
        String name = "Anas Alam";
        System.out.println("String name: " + name);

        // Array: Fixed-size collection of same type elements
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array numbers: " + java.util.Arrays.toString(numbers));

        // Object: Can hold any type (but loses type safety)
        Object anything = "Hello";
        anything = 42; // Can change type
        System.out.println("Object anything: " + anything);

        System.out.println("\n=== TYPE CONVERSION ===");

        // IMPLICIT CASTING (Widening): Smaller to larger type - automatic
        int smallNum = 100;
        long bigNum = smallNum; // int to long - OK
        System.out.println("Implicit casting: int " + smallNum + " -> long " + bigNum);

        // EXPLICIT CASTING (Narrowing): Larger to smaller type - manual
        double decimal = 99.99;
        int whole = (int) decimal; // double to int - data loss possible
        System.out.println("Explicit casting: double " + decimal + " -> int " + whole);

        System.out.println("\n=== WRAPPER CLASSES ===");

        // Primitive types have corresponding wrapper classes
        // WHY: Objects needed for collections, generics, etc.
        Integer intObj = 42;           // Autoboxing: primitive -> object
        int primitive = intObj;        // Unboxing: object -> primitive

        Double doubleObj = 3.14;
        Boolean boolObj = true;
        Character charObj = 'X';

        System.out.println("Wrapper classes: " + intObj + ", " + doubleObj + ", " + boolObj + ", " + charObj);

        System.out.println("\n=== MEMORY SIZES ===");
        System.out.println("byte: 1 byte, short: 2 bytes, int: 4 bytes, long: 8 bytes");
        System.out.println("float: 4 bytes, double: 8 bytes, char: 2 bytes, boolean: 1 bit");
    }
}
