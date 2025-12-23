// OPERATORS: Symbols that perform operations on variables/values
// WHY USE:
//   1. Perform calculations (arithmetic)
//   2. Make decisions (comparison)
//   3. Control logic (logical)
//   4. Assign values (assignment)
// WHEN USE: In expressions to manipulate data

public class operators {

    public static void main(String[] args) {
        System.out.println("=== ARITHMETIC OPERATORS ===");

        int a = 10, b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: a + b = " + (a + b));         // 13
        System.out.println("Subtraction: a - b = " + (a - b));      // 7
        System.out.println("Multiplication: a * b = " + (a * b));   // 30
        System.out.println("Division: a / b = " + (a / b));         // 3 (integer division)
        System.out.println("Modulus: a % b = " + (a % b));          // 1 (remainder)

        // Floating point division
        double x = 10.0, y = 3.0;
        System.out.println("Float division: x / y = " + (x / y));   // 3.333...

        System.out.println("\n=== RELATIONAL OPERATORS (Comparison) ===");

        // Return boolean (true/false)
        // WHY: Used in conditions (if, loops)
        System.out.println("Equal to: a == b -> " + (a == b));           // false
        System.out.println("Not equal: a != b -> " + (a != b));         // true
        System.out.println("Greater than: a > b -> " + (a > b));        // true
        System.out.println("Less than: a < b -> " + (a < b));           // false
        System.out.println("Greater/equal: a >= b -> " + (a >= b));     // true
        System.out.println("Less/equal: a <= b -> " + (a <= b));        // false

        System.out.println("\n=== LOGICAL OPERATORS ===");

        boolean p = true, q = false;

        System.out.println("p = " + p + ", q = " + q);
        System.out.println("AND (&&): p && q -> " + (p && q));      // false (both must be true)
        System.out.println("OR (||): p || q -> " + (p || q));       // true (at least one true)
        System.out.println("NOT (!): !p -> " + (!p));               // false (opposite)

        // SHORT-CIRCUIT evaluation
        // && stops if first is false, || stops if first is true
        System.out.println("Short-circuit: false && (1/0 > 0) -> " + (false && (1 / 0 > 0))); // false (no division by zero)

        System.out.println("\n=== ASSIGNMENT OPERATORS ===");

        int num = 10;
        System.out.println("Initial: num = " + num);

        num += 5;   // num = num + 5
        System.out.println("+= : num = " + num);

        num -= 3;   // num = num - 3
        System.out.println("-= : num = " + num);

        num *= 2;   // num = num * 2
        System.out.println("*= : num = " + num);

        num /= 4;   // num = num / 4
        System.out.println("/= : num = " + num);

        num %= 3;   // num = num % 3
        System.out.println("%= : num = " + num);

        System.out.println("\n=== UNARY OPERATORS ===");

        int unary = 5;
        System.out.println("unary = " + unary);

        System.out.println("Positive: +unary = " + (+unary));       // 5
        System.out.println("Negative: -unary = " + (-unary));       // -5
        System.out.println("Increment: ++unary = " + (++unary));    // 6 (pre-increment)
        System.out.println("After pre-increment: " + unary);        // 6

        unary = 5; // Reset
        System.out.println("Decrement: unary-- = " + (unary--));    // 5 (post-decrement)
        System.out.println("After post-decrement: " + unary);       // 4

        System.out.println("\n=== TERNARY OPERATOR (Conditional) ===");

        // SYNTAX: condition ? valueIfTrue : valueIfFalse
        // WHY: Shorter if-else for simple assignments
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + age + " -> " + status);

        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);

        System.out.println("\n=== OPERATOR PRECEDENCE ===");

        // Order of evaluation (highest to lowest):
        // 1. Postfix (x++, x--)
        // 2. Unary (++x, --x, +, -, !)
        // 3. Multiplicative (*, /, %)
        // 4. Additive (+, -)
        // 5. Relational (<, >, <=, >=)
        // 6. Equality (==, !=)
        // 7. Logical AND (&&)
        // 8. Logical OR (||)
        // 9. Ternary (?:)
        // 10. Assignment (=, +=, etc.)
        int result = 2 + 3 * 4;     // Multiplication first: 2 + 12 = 14
        System.out.println("2 + 3 * 4 = " + result);

        result = (2 + 3) * 4;       // Parentheses override: 5 * 4 = 20
        System.out.println("(2 + 3) * 4 = " + result);

        System.out.println("\n=== STRING CONCATENATION ===");

        // + operator with strings
        String first = "Hello";
        String second = "World";
        String combined = first + " " + second + "!";
        System.out.println("Concatenation: " + combined);

        // Number + String = String
        System.out.println("Number + String: " + (5 + " apples"));

        System.out.println("\n=== TYPE CASTING WITH OPERATORS ===");

        // Automatic promotion in expressions
        byte byte1 = 10, byte2 = 20;
        // byte resultByte = byte1 + byte2; // ERROR! Result is int
        int resultInt = byte1 + byte2;     // OK - promoted to int
        System.out.println("byte + byte = int: " + resultInt);

        // Explicit casting needed
        byte resultByte = (byte) (byte1 + byte2);
        System.out.println("Cast to byte: " + resultByte);
    }
}
