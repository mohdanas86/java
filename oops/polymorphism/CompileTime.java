// COMPILE-TIME POLYMORPHISM (METHOD OVERLOADING): Multiple methods with same name but different parameters
// WHAT IS THIS: Demonstrates method overloading where Calculator class has multiple add() methods
// WHY USE:
//   1. Same operation name for different data types - cleaner code
//   2. Type safety - compiler chooses correct method based on arguments
//   3. Readability - users don't need to remember different method names
// WHEN USE: When you want same functionality for different parameter types/signature

package oops.polymorphism;

// CALCULATOR CLASS: Contains overloaded add methods for different data types
class Calculator {
    // METHOD OVERLOAD 1: Adds two integers
    // PARAMETERS: a, b - integers to add
    // RETURNS: int - sum of two integers
    int add(int a, int b) {
        return a + b;
    }

    // METHOD OVERLOAD 2: Adds two doubles (overloaded method)
    // PARAMETERS: a, b - doubles to add
    // RETURNS: double - sum of two doubles
    double add(double a, double b) {
        return a + b;
    }
}

// MAIN CLASS: Demonstrates compile-time polymorphism
class CompileTime {
    public static void main(String[] args) {
        // Create Calculator object
        Calculator cal = new Calculator();

        // Call overloaded method with integers - compiler chooses int add(int, int)
        System.out.println(cal.add(1, 2));

        // Call overloaded method with doubles - compiler chooses double add(double, double)
        System.out.println(cal.add(1.0, 2.0));
    }
}