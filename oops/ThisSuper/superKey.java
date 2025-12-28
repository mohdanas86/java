package ThisSuper;

// SUPER KEYWORD: Refers to parent class
// WHY USE: To access parent class members (variables, methods, constructor)
// WHEN USE: In inheritance when child class needs parent's features
class Animal {

    String type = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    String type = "Dog";

    Dog() {
        super(); // Calls parent (Animal) constructor - must be first line
        System.out.println("Dog constructor called");
    }

    void sound() {
        super.sound(); // Calls parent's sound method
        System.out.println("Dog barks");
    }

    void showType() {
        System.out.println("Child type: " + type);        // Dog
        System.out.println("Parent type: " + super.type); // Animal
    }
}

public class superKey {

    public static void main(String[] args) {
        System.out.println("\n=== SUPER KEYWORD EXAMPLE ===");
        Dog dog = new Dog();
        dog.sound();
        dog.showType();
    }
}
