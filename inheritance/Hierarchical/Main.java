// HIERARCHICAL INHERITANCE: One parent class inherited by multiple child classes
// WHAT IS THIS: Shows hierarchical inheritance where both Cat and Dog inherit from Animal
// WHY USE:
//   1. Multiple children share common parent functionality
//   2. Each child can have its own specific behavior
//   3. Promotes code reusability across different subclasses
// WHEN USE: When multiple classes need to inherit common behavior from one parent

package inheritance.Hierarchical;

// PARENT CLASS: Base class with common behavior for all animals
class Animal {
    // METHOD: Common eating behavior for all animals
    void eat() {
        System.out.println("Eating.....");
    }
}

// CHILD CLASS 1: Inherits from Animal, adds cat-specific behavior
class Cat extends Animal {
    // METHOD: Cat-specific sound
    void sound() {
        System.out.println("Meow Meow!");
    }
}

// CHILD CLASS 2: Inherits from Animal, adds dog-specific behavior
class Dog extends Animal {
    // METHOD: Dog-specific sound
    void sound() {
        System.out.println("Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Cat object and demonstrate inheritance
        Cat c = new Cat();
        c.eat();   // Inherited from Animal
        c.sound(); // Specific to Cat

        // Create Dog object and demonstrate inheritance
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.sound(); // Specific to Dog
    }
}
