package Testing.projects.Easy.Calculator;

import java.util.Scanner;

public class EasyCal {
    // addition
    static double addition(double a, double b) {
        return a + b;
    }

    // substraction
    static double substract(double a, double b) {
        return a - b;
    }

    // multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error : You cannot divide by 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double n = sc.nextDouble();

        System.out.print("Enter second number : ");
        double m = sc.nextDouble();

        System.out.print("Enter operator +, -, *, /) : ");
        char operator = sc.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = addition(n, m);
                break;
            case '-':
                result = substract(n, m);
                break;
            case '/':
                result = divide(n, m);
                break;
            case '*':
                result = multiply(n, m);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println("Result : " + result);
        sc.close();
    }
}
