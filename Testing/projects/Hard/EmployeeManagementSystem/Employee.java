package Testing.projects.Hard.EmployeeManagementSystem;

// Abstract class representing a general Employee
// What is abstract class: A class that cannot be instantiated directly and may contain abstract methods
// that must be implemented by subclasses. Used for defining common behavior.
public abstract class Employee {
    // Protected field - accessible in subclasses
    protected String name;

    // Constructor for Employee
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method - must be implemented by subclasses
    // Why abstract method: Forces subclasses to provide their own implementation,
    // ensuring that specific salary calculation logic is defined for each employee
    // type
    public abstract double calculateSalary();

    // Concrete method - can be used as-is or overridden
    public void displayName() {
        System.out.println("Employee: " + name);
    }
}
