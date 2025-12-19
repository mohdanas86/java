package oops;

// THIS KEYWORD: Refers to current object
// WHY USE: To differentiate between instance variables and parameters with same name
// WHEN USE: In constructors, methods when parameter name = field name
class Employee {

    String name;
    int salary;

    // WITHOUT 'this' - confusing, both refer to parameter
    // Employee(String name, int salary) {
    //     name = name; // WRONG! This assigns parameter to itself
    //     salary = salary;
    // }
    // WITH 'this' - clear distinction
    Employee(String name, int salary) {
        this.name = name;       // this.name = instance variable, name = parameter
        this.salary = salary;   // this.salary = instance variable, salary = parameter
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

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

public class thisSuper {

    public static void main(String[] args) {
        System.out.println("=== THIS KEYWORD EXAMPLE ===");
        Employee emp = new Employee("Anas", 50000);
        emp.display();

        System.out.println("\n=== SUPER KEYWORD EXAMPLE ===");
        Dog dog = new Dog();
        dog.sound();
        dog.showType();
    }
}
