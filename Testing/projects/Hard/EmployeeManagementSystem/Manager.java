package Testing.projects.Hard.EmployeeManagementSystem;

// Manager class extends Employee - demonstrates inheritance
// Inheritance: Allows a class to inherit properties and methods from a parent class
public class Manager extends Employee {
    // Private field for manager's fixed salary
    private double fixedSalary;

    // Constructor initializes name from parent and sets fixed salary
    public Manager(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    // Method overriding: Provides specific implementation for salary calculation
    // Method overriding: Subclass provides its own version of a method defined in
    // the superclass
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
