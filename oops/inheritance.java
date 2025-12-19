package oops;

// INHERITANCE: Mechanism where one class acquires properties of another class
// WHY USE: 
//   1. Code Reusability - Don't write same code again
//   2. Method Overriding - Customize parent behavior
//   3. Relationship - Represents IS-A relationship (Dog IS-A Animal)
// WHEN USE: When classes have common properties/behavior (Car, Bike both are Vehicles)
// PARENT CLASS (Super class / Base class)
class Vehicle {

    String brand;
    int speed;

    // Parent constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }

    void start() {
        System.out.println(brand + " is starting...");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// CHILD CLASS (Sub class / Derived class)
// 'extends' keyword establishes inheritance
class Car extends Vehicle {

    int doors;

    // Child constructor - must call parent constructor
    Car(String brand, int speed, int doors) {
        super(brand, speed); // Calling parent constructor
        this.doors = doors;
        System.out.println("Car constructor called");
    }

    // Child-specific method
    void openTrunk() {
        System.out.println("Trunk opened");
    }

    // Overriding parent method to add more functionality
    @Override
    void displayInfo() {
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Doors: " + doors);
    }
}

// Another child class
class Bike extends Vehicle {

    boolean hasCarrier;

    Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    void ringBell() {
        System.out.println("Ring Ring!");
    }
}

// TYPES OF INHERITANCE:
// 1. Single: Car extends Vehicle (one parent, one child)
// 2. Multilevel: GrandChild extends Child extends Parent
// 3. Hierarchical: Car, Bike both extend Vehicle (one parent, multiple children)
// 4. Multiple: Java doesn't support (one child, multiple parents) - Use interfaces instead
public class inheritance {

    public static void main(String[] args) {
        System.out.println("=== CAR OBJECT ===");
        Car car = new Car("Toyota", 180, 4);
        car.start();           // Inherited from Vehicle
        car.displayInfo();     // Overridden in Car
        car.openTrunk();       // Car-specific method

        System.out.println("\n=== BIKE OBJECT ===");
        Bike bike = new Bike("Hero", 80, true);
        bike.start();          // Inherited from Vehicle
        bike.displayInfo();    // Inherited from Vehicle
        bike.ringBell();       // Bike-specific method

        // BENEFIT: Code reusability - start() and displayInfo() not written twice
    }
}
