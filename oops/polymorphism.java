package oops;

// POLYMORPHISM: "Many forms" - Same name, different behavior
// WHY USE: 
//   1. Flexibility - Same method name for related operations
//   2. Readability - Intuitive method names
//   3. Extensibility - Easy to add new implementations
// WHEN USE: When same action has different implementations based on context
// ============================================================
// METHOD OVERLOADING (Compile-time Polymorphism / Static Binding)
// ============================================================
// WHAT: Same method name, different parameters (number, type, or order)
// WHY: Convenience - same operation on different data types
// WHEN: When operation is same but input varies (add 2 numbers, 3 numbers, etc.)
class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        System.out.println("Adding 2 integers");
        return a + b;
    }

    // Method 2: Add three integers (different number of parameters)
    int add(int a, int b, int c) {
        System.out.println("Adding 3 integers");
        return a + b + c;
    }

    // Method 3: Add two doubles (different type of parameters)
    double add(double a, double b) {
        System.out.println("Adding 2 doubles");
        return a + b;
    }

    // Method 4: Different order of parameters
    String add(String a, int b) {
        return a + b;
    }

    int add(int a, String b) {
        return Integer.parseInt(a + b);
    }
}

// ============================================================
// METHOD OVERRIDING (Runtime Polymorphism / Dynamic Binding)
// ============================================================
// WHAT: Child class provides specific implementation of parent's method
// WHY: Customize parent behavior for specific child class
// WHEN: When child needs different implementation than parent
// RULES: 
//   - Same method name, same parameters, same return type
//   - Child method cannot be more restrictive (if parent is public, child must be public)
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    // Overriding parent's method
    @Override // Annotation - tells compiler this is overriding
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }

    // Not overriding, using parent's eat() as-is
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows: Meow Meow!");
    }

    @Override
    void eat() {
        System.out.println("Cat eats fish");
    }
}

class Cow extends Animal {

    @Override
    void sound() {
        System.out.println("Cow moos: Moo Moo!");
    }
}

public class polymorphism {

    public static void main(String[] args) {
        System.out.println("=== METHOD OVERLOADING ===");
        Calculator calc = new Calculator();

        System.out.println("Result: " + calc.add(5, 10));           // Calls method 1
        System.out.println("Result: " + calc.add(5, 10, 15));       // Calls method 2
        System.out.println("Result: " + calc.add(5.5, 10.5));       // Calls method 3

        System.out.println("\n=== METHOD OVERRIDING ===");

        // Creating child objects
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound(); // Calls Dog's overridden method
        cat.sound(); // Calls Cat's overridden method
        cow.sound(); // Calls Cow's overridden method

        System.out.println("\n=== RUNTIME POLYMORPHISM ===");
        // Parent reference, child object - decides at runtime which method to call
        Animal animal1 = new Dog(); // Animal reference, Dog object
        Animal animal2 = new Cat(); // Animal reference, Cat object

        animal1.sound(); // Calls Dog's sound() - Runtime decision
        animal2.sound(); // Calls Cat's sound() - Runtime decision

        // BENEFIT: Can treat different objects uniformly using parent reference
    }
}
