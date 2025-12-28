// package oops;

// ABSTRACTION: Hiding implementation details, showing only essential features
// WHY USE:
//   1. Simplicity - User doesn't need to know "how", just "what"
//   2. Security - Hide complex logic
//   3. Flexibility - Change implementation without affecting users
// WHEN USE: When you want to define a template that subclasses must follow
// EXAMPLE: You know car "starts" but don't know engine details
// ============================================================
// ABSTRACT CLASS (0-100% abstraction)
// ============================================================
// WHAT: Class with 'abstract' keyword - cannot create objects directly
// WHY USE: When classes share common code + need some specific implementations
// WHEN USE: When you have common implementation + abstract methods
// NOTE: Can have both abstract and concrete methods
abstract class Shape {

    String color; // Concrete variable

    // Concrete method (has implementation)
    void setColor(String color) {
        this.color = color;
    }

    // Abstract method (no implementation) - MUST be overridden by child
    abstract double calculateArea();

    abstract void draw();
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Must implement abstract methods
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing circle with radius: " + radius);
    }
}

class Rectangle extends Shape {

    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void draw() {
        System.out.println("Drawing rectangle " + length + "x" + width);
    }
}

// ============================================================
// INTERFACE (100% abstraction - before Java 8)
// ============================================================
// WHAT: Pure abstraction - only method signatures (no implementation)
// WHY USE: 
//   1. Multiple inheritance (class can implement multiple interfaces)
//   2. Contract - force classes to implement specific methods
// WHEN USE: When completely unrelated classes need same functionality
// NOTE: Variables are public, static, final by default
//       Methods are public, abstract by default
interface Drawable {

    // All variables are public static final
    String TYPE = "2D"; // Constant

    // All methods are public abstract (before Java 8)
    void draw();

    void resize(double scale);
}

interface Printable {

    void print();
}

// Class can implement multiple interfaces (Multiple inheritance)
class Square implements Drawable, Printable {

    double side;

    Square(double side) {
        this.side = side;
    }

    // Must implement all interface methods
    @Override
    public void draw() {
        System.out.println("Drawing square with side: " + side);
    }

    @Override
    public void resize(double scale) {
        side *= scale;
        System.out.println("Resized to: " + side);
    }

    @Override
    public void print() {
        System.out.println("Printing square...");
    }
}

// ============================================================
// ABSTRACT CLASS vs INTERFACE
// ============================================================
// ABSTRACT CLASS:
//   - Can have abstract + concrete methods
//   - Can have constructors
//   - Can have instance variables
//   - Single inheritance (extends one class)
//   - Use when: Classes are related, share common code
// INTERFACE:
//   - All methods abstract (before Java 8)
//   - No constructors
//   - Only constants (public static final)
//   - Multiple inheritance (implements many interfaces)
//   - Use when: Unrelated classes need same behavior
public class abstraction {

    public static void main(String[] args) {
        System.out.println("=== ABSTRACT CLASS ===");

        // Shape shape = new Shape(); // ERROR! Cannot instantiate abstract class
        Circle circle = new Circle(5);
        circle.setColor("Red");
        circle.draw();
        System.out.println("Area: " + circle.calculateArea());

        Rectangle rect = new Rectangle(4, 6);
        rect.setColor("Blue");
        rect.draw();
        System.out.println("Area: " + rect.calculateArea());

        System.out.println("\n=== INTERFACE ===");

        Square square = new Square(4);
        square.draw();
        square.print();
        square.resize(2);

        System.out.println("Type: " + Drawable.TYPE); // Accessing interface constant

        // BENEFIT: Can use parent reference for all shapes
        System.out.println("\n=== POLYMORPHISM WITH ABSTRACTION ===");
        Shape[] shapes = {new Circle(3), new Rectangle(5, 10)};
        for (Shape s : shapes) {
            s.draw();
            System.out.println("Area: " + s.calculateArea());
        }
    }
}
