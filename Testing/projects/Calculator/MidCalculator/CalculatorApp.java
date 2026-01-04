package Testing.projects.Calculator.MidCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();

        boolean running = true;

        while (running) {
            System.out.println("===== Calcualtor Running ======");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = sc.nextInt();

                if (choice == 5) {
                    System.out.println("Exiting...");
                    running = false;
                    continue;
                }

                System.out.print("Enter first number : ");
                double n = sc.nextDouble();

                System.out.print("Enter second number : ");
                double m = sc.nextDouble();

                double result;

                switch (choice) {
                    case 1:
                        result = cal.addition(n, m);
                        break;
                    case 2:
                        result = cal.substraction(n, m);
                        break;
                    case 3:
                        result = cal.multiplication(n, m);
                        break;
                    case 4:
                        result = cal.division(n, m);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        continue;
                }
                if (result != Double.POSITIVE_INFINITY && result != Double.NEGATIVE_INFINITY) {
                    System.out.println("Result : " + result);
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: Divide by zero is not allowed");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter valid number only.");
                sc.next(); // clear the invalid input
            } catch (Exception e) {
                System.out.println("Something went wrong: " + e.getMessage());
            }
        }
        sc.close();
    }
}