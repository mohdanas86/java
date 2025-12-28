// SINGLE INHERITANCE: One parent class inherited by one child class
// WHAT IS THIS: Demonstrates single inheritance where Dog class inherits from Animal class
// WHY USE:
//   1. Code reusability - Child class can use parent's methods and properties
//   2. Method overriding - Child can provide specific implementation
//   3. IS-A relationship - Dog IS-A Animal
// WHEN USE: When you have a clear parent-child relationship with one child

package inheritance.single;

// PARENT CLASS: Base class that provides common functionality
class Animal {
    // METHOD: Makes a generic animal sound
    void sound() {
        System.out.println("Animal makes a sound");
    }

    // METHOD: Specific to cat behavior (though this is confusing naming)
    void cat() {
        System.out.println("Meow meow!");
    }
}

// CHILD CLASS: Inherits from Animal, can override methods and add new ones
class Dog extends Animal {
    // OVERRIDDEN METHOD: Provides specific implementation for Dog
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Animal object and call its method
        Animal a = new Animal();
        a.sound();

        // Create Dog object - inherits from Animal
        Dog d = new Dog();
        d.sound(); // Calls overridden method
        d.cat();   // Calls inherited method from Animal
    }
}
