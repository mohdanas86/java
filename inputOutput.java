
import java.util.*;

public class inputOutput {

    public static void main(String[] args) {
        // Taking input using Scanner
        Scanner sc = new Scanner(System.in);

        // ===== nextInt() =====
        System.out.print("\nEnter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("You entered integer: " + intValue);

        // ===== nextDouble() =====
        System.out.print("\nEnter a double: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered double: " + doubleValue);

        // ===== nextFloat() =====
        System.out.print("\nEnter a float: ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered float: " + floatValue);

        // ===== next() =====
        System.out.print("\nEnter a single word: ");
        String word = sc.next();
        System.out.println("You entered word: " + word);

        // ===== nextLine() =====
        sc.nextLine(); // Consume the leftover newline
        System.out.print("\nEnter a line of text: ");
        String line = sc.nextLine();
        System.out.println("You entered line: " + line);

        // ===== Output Formatting Using printf() =====
        System.out.printf("\nFormatted Output:\n");
        int num = 40;
        String str = "Sample";
        float f1 = 10.0000000f;
        System.out.printf("Integer: %d, String: %s, Float: %.4f", num, str, f1);
    }
}
