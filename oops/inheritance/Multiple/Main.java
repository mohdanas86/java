// MULTIPLE INHERITANCE: One class implementing multiple interfaces
// WHAT IS THIS: Shows multiple inheritance using interfaces (Java doesn't support multiple class inheritance)
// WHY USE:
//   1. Achieve multiple inheritance behavior through interfaces
//   2. Classes can have multiple "types" or capabilities
//   3. Interfaces provide contracts without implementation
// WHEN USE: When a class needs to inherit behavior from multiple sources

package inheritance.Multiple;

// INTERFACE 1: Defines flying capability
interface CanFly {
    // ABSTRACT METHOD: Must be implemented by classes that implement this interface
    void fly();
}

// INTERFACE 2: Defines swimming capability
interface CanSwim {
    // ABSTRACT METHOD: Must be implemented by classes that implement this interface
    void swim();
}

// IMPLEMENTING CLASS: Inherits from both interfaces (multiple inheritance)
class Duck implements CanFly, CanSwim {
    // IMPLEMENTATION: Provides flying behavior
    public void fly() {
        System.out.println("Duck is flying...");
    }

    // IMPLEMENTATION: Provides swimming behavior
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Duck object that can both fly and swim
        Duck d = new Duck();
        d.fly();  // Calls implemented fly method
        d.swim(); // Calls implemented swim method
    }
}

