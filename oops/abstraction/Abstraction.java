// ABSTRACTION: Hiding implementation details and showing only essential features
// WHAT IS THIS: Abstract classes and methods that define what to do, but not how to do it
// WHY USE:
//   1. Hide complexity - users don't need to know implementation details
//   2. Code reusability - common behavior in abstract class
//   3. Framework design - define contracts that subclasses must follow
//   4. Polymorphism - treat different objects uniformly through abstract references
// WHEN USE: When you have common behavior but different implementations

package abstraction;

// ABSTRACT CLASS: Cannot be instantiated, serves as blueprint for subclasses
// WHAT: Contains abstract methods (without body) and concrete methods (with body)
abstract class Animal {

    // ABSTRACT METHOD: Must be implemented by all subclasses
    // WHAT: Declares method signature but no implementation
    // WHY: Forces subclasses to provide their own specific implementation
    abstract void sound();

    // CONCRETE METHOD: Has implementation, can be inherited as-is or overridden
    // WHAT: Common behavior shared by all animals
    void sleep() {
        System.out.println("Zzz... Animal is sleeping...");
    }

    // CONCRETE METHOD: Another common behavior
    void eat() {
        System.out.println("Animal is eating food...");
    }
}

// CONCRETE CLASS 1: Dog - provides specific implementation of abstract methods
class Dog extends Animal {

    // IMPLEMENTATION: Provides dog-specific sound
    @Override
    void sound() {
        System.out.println("Dog says: Woof Woof!");
    }

    // OVERRIDDEN METHOD: Dog-specific eating behavior
    @Override
    void eat() {
        System.out.println("Dog is eating dog food...");
    }
}

// CONCRETE CLASS 2: Cat - provides specific implementation of abstract methods
class Cat extends Animal {

    // IMPLEMENTATION: Provides cat-specific sound
    @Override
    void sound() {
        System.out.println("Cat says: Meow Meow!");
    }

    // OVERRIDDEN METHOD: Cat-specific eating behavior
    @Override
    void eat() {
        System.out.println("Cat is eating cat food...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("=== ABSTRACTION DEMONSTRATION ===\n");

        // ABSTRACTION IN ACTION: Using abstract reference to concrete objects
        // WHY: We can treat different animals uniformly through Animal reference
        System.out.println("1. Using Animal reference (Abstraction):");

        // Create Dog object but reference it as Animal (abstraction)
        Animal myDog = new Dog(); // Polymorphism: Animal reference, Dog object
        myDog.sound();  // Calls Dog's sound() - decided at runtime
        myDog.sleep();  // Calls Animal's sleep() - inherited
        myDog.eat();    // Calls Dog's eat() - overridden

        System.out.println();

        // Create Cat object but reference it as Animal
        Animal myCat = new Cat(); // Polymorphism: Animal reference, Cat object
        myCat.sound();  // Calls Cat's sound()
        myCat.sleep();  // Calls Animal's sleep()
        myCat.eat();    // Calls Cat's eat()

        System.out.println("\n2. Using concrete references (Direct access):");

        // DIRECT ACCESS: Using specific class references
        Dog dog = new Dog();
        dog.sound();  // Dog's sound
        dog.eat();    // Dog's eat

        Cat cat = new Cat();
        cat.sound();  // Cat's sound
        cat.eat();    // Cat's eat

        System.out.println("\n=== KEY BENEFITS OF ABSTRACTION ===");
        System.out.println("- Hide implementation details");
        System.out.println("- Force subclasses to implement required methods");
        System.out.println("- Enable polymorphism and flexible code");
        System.out.println("- Provide common behavior through inheritance");
    }
}
