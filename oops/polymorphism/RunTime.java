// RUN-TIME POLYMORPHISM (METHOD OVERRIDING): Child class provides specific implementation of parent method
// WHAT IS THIS: Demonstrates method overriding where Dog class overrides Animal's sound() method
// WHY USE:
//   1. Dynamic behavior - method called depends on actual object type at runtime
//   2. Extensibility - subclasses can customize inherited behavior
//   3. IS-A relationship with specific implementations
// WHEN USE: When subclasses need different behavior for inherited methods

package polymorphism;

// PARENT CLASS: Base class with general behavior
class Animal {
    // METHOD: General sound method that can be overridden by subclasses
    void sound() {
        System.out.println("Animal Make Sound....");
    }
}

// CHILD CLASS: Inherits from Animal and provides specific implementation
class Dog extends Animal {
    // OVERRIDDEN METHOD: Provides dog-specific sound (run-time polymorphism)
    @Override
    void sound() {
        System.out.println("Dog Make Sound.....");
    }
}

// MAIN CLASS: Demonstrates run-time polymorphism
public class RunTime {
    public static void main(String[] args) {
        // Create Dog object (reference type Dog, object type Dog)
        Dog d1 = new Dog();

        // Call sound() method - at runtime, Dog's version is executed
        d1.sound();
    }
}
