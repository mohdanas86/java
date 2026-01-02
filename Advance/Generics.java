package Advance;

/**
 * Generics Notes for Beginners:
 * - What it is: Generics in Java allow you to write type-safe, reusable code by
 * using type parameters (like <T>) in classes, interfaces, and methods.
 * - When to use: Use generics when you want to create collections or classes
 * that work with any type, ensuring compile-time type checking.
 * - Why use: They provide type safety (prevent ClassCastException), eliminate
 * casting, and make code more readable and reusable.
 * - Other things: Type parameters are placeholders for actual types (e.g.,
 * String, Integer). You can have bounded types (e.g., <T extends Number>).
 * Autoboxing/unboxing happens automatically with primitives and wrappers.
 */
public class Generics {
    public static void main(String[] args) {
        // Autoboxing: Converting primitives to wrapper objects automatically
        // Wrapper classes allow primitives to be used where objects are required

        // int to Integer
        int x = 10;
        Integer intObj = x; // Autoboxing
        System.out.println("Integer: " + intObj);

        // char to Character
        char a = 'a';
        Character charObj = a; // Autoboxing
        System.out.println("Character: " + charObj);

        // byte to Byte
        byte b = 5;
        Byte byteObj = b;
        System.out.println("Byte: " + byteObj);

        // short to Short
        short s = 100;
        Short shortObj = s;
        System.out.println("Short: " + shortObj);

        // long to Long
        long l = 1000L;
        Long longObj = l;
        System.out.println("Long: " + longObj);

        // float to Float
        float f = 3.14f;
        Float floatObj = f;
        System.out.println("Float: " + floatObj);

        // double to Double
        double d = 2.718;
        Double doubleObj = d;
        System.out.println("Double: " + doubleObj);

        // boolean to Boolean
        boolean bool = true;
        Boolean boolObj = bool;
        System.out.println("Boolean: " + boolObj);

        // Example of generic method
        printValue(intObj);
        printValue(charObj);
        printValue(byteObj);
    }

    // Generic method: Can accept any type T
    public static <T> void printValue(T value) {
        System.out.println("Generic print: " + value);
    }
}
