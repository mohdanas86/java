// MULTILEVEL INHERITANCE: Inheritance in multiple levels (grandparent -> parent -> child)
// WHAT IS THIS: Demonstrates multilevel inheritance: Animal -> Cat -> Dog
// WHY USE:
//   1. Hierarchical classification - more specific classes inherit from general ones
//   2. Step-by-step specialization of behavior
//   3. Avoids code duplication across inheritance levels
// WHEN USE: When you need gradual specialization through multiple inheritance levels

package inheritance.multilevel;

// GRANDPARENT CLASS: Most general class with basic animal behavior
class Animal {
    // METHOD: Basic sound method that can be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// PARENT CLASS: Inherits from Animal, adds cat-specific behavior
class Cat extends Animal {
    // METHOD: Cat-specific behavior
    void cat() {
        System.out.println("Meow Moew!");
    }
}

// CHILD CLASS: Inherits from Cat (which inherits from Animal), adds dog-specific behavior
class Dog extends Cat {
    // METHOD: Dog-specific behavior
    void dog() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Dog object - inherits from both Cat and Animal
        Dog d = new Dog();

        d.sound(); // Inherited from Animal (grandparent)
        d.cat();   // Inherited from Cat (parent)
        d.dog();   // Own method
    }
}
