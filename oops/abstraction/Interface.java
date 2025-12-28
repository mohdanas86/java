// INTERFACES: Contracts that define methods classes must implement
// WHAT ARE THEY: Pure abstraction - only method signatures, no implementation (until Java 8+)
// WHY USE:
//   1. Multiple inheritance - classes can implement multiple interfaces
//   2. Loose coupling - define what to do, not how to do it
//   3. Polymorphism - treat different objects uniformly through interface references
//   4. Design contracts - ensure classes provide required functionality
// WHEN USE: When you need multiple inheritance or pure abstraction without state

package abstraction;

// INTERFACE: Defines a contract for drawable objects
// WHAT: Contains abstract methods (must be implemented) and can have default/static methods
interface Drawable {

    // ABSTRACT METHOD: Must be implemented by all implementing classes
    // WHAT: Defines the contract - classes must provide draw implementation
    void draw();

    // ABSTRACT METHOD: Another required method
    void getArea();

    // DEFAULT METHOD (Java 8+): Optional implementation, can be overridden
    // WHAT: Provides default behavior that implementing classes can use or override
    default void displayInfo() {
        System.out.println("This is a drawable object");
    }

    // STATIC METHOD (Java 8+): Belongs to interface, not instances
    // WHAT: Utility methods that don't need object instances
    static void printDrawingTip() {
        System.out.println("Tip: Use draw() method to render objects");
    }
}

// INTERFACE: Another interface for resizable objects
interface Resizable {

    // ABSTRACT METHOD: Contract for resizing
    void resize(double factor);

    // DEFAULT METHOD: Common resize validation
    default boolean canResize(double factor) {
        return factor > 0 && factor <= 2.0; // Max 2x size
    }
}

// CONCRETE CLASS 1: Circle implements Drawable and Resizable (multiple inheritance)
class Circle implements Drawable, Resizable {

    private double radius;

    // CONSTRUCTOR: Initialize circle with radius
    Circle(double radius) {
        this.radius = radius;
    }

    // IMPLEMENTATION: Required by Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }

    // IMPLEMENTATION: Required by Drawable interface
    @Override
    public void getArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + String.format("%.2f", area));
    }

    // OVERRIDE: Custom implementation of default method
    @Override
    public void displayInfo() {
        System.out.println("Circle: A round 2D shape");
    }

    // IMPLEMENTATION: Required by Resizable interface
    @Override
    public void resize(double factor) {
        if (canResize(factor)) { // Using default method from Resizable
            radius *= factor;
            System.out.println("Circle resized! New radius: " + radius);
        } else {
            System.out.println("Invalid resize factor: " + factor);
        }
    }
}

// CONCRETE CLASS 2: Rectangle implements only Drawable
class Rectangle implements Drawable {

    private double width, height;

    // CONSTRUCTOR: Initialize rectangle
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // IMPLEMENTATION: Required by Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle " + width + "x" + height);
    }

    // IMPLEMENTATION: Required by Drawable interface
    @Override
    public void getArea() {
        double area = width * height;
        System.out.println("Rectangle area: " + area);
    }

    // USING DEFAULT: Not overriding displayInfo, so uses interface default
}

// CONCRETE CLASS 3: Triangle implements both interfaces
class Triangle implements Drawable, Resizable {

    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

    @Override
    public void getArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle area: " + area);
    }

    @Override
    public void resize(double factor) {
        if (canResize(factor)) {
            base *= factor;
            height *= factor;
            System.out.println("Triangle resized! New base: " + base + ", height: " + height);
        } else {
            System.out.println("Invalid resize factor: " + factor);
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println("=== INTERFACE DEMONSTRATION ===\n");

        // STATIC METHOD CALL: Call interface static method directly
        System.out.println("1. Interface Static Method:");
        Drawable.printDrawingTip();
        System.out.println();

        // POLYMORPHISM: Using interface references
        System.out.println("2. Polymorphism with Interface References:");

        // Create objects of different classes
        Drawable circle = new Circle(5.0);
        Drawable rectangle = new Rectangle(4.0, 6.0);
        Drawable triangle = new Triangle(3.0, 4.0);

        // Treat all as Drawable objects (polymorphism)
        Drawable[] shapes = {circle, rectangle, triangle};

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ":");
            shapes[i].draw();
            shapes[i].getArea();
            shapes[i].displayInfo(); // Default method
            System.out.println();
        }

        // MULTIPLE INHERITANCE: Using objects that implement multiple interfaces
        System.out.println("3. Multiple Interface Implementation:");

        // Circle implements both Drawable and Resizable
        Circle resizableCircle = new Circle(3.0);
        resizableCircle.draw();
        resizableCircle.resize(1.5); // Valid resize
        resizableCircle.resize(3.0); // Invalid resize

        System.out.println();

        Triangle resizableTriangle = new Triangle(2.0, 3.0);
        resizableTriangle.draw();
        resizableTriangle.resize(2.0); // Max allowed

        System.out.println("\n=== INTERFACES VS ABSTRACT CLASSES ===");
        System.out.println("- Interfaces: Multiple inheritance, pure contracts");
        System.out.println("- Abstract Classes: Single inheritance, can have state");
        System.out.println("- Both: Cannot instantiate directly, define contracts");
    }
}
