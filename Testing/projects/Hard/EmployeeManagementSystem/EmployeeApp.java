package Testing.projects.Hard.EmployeeManagementSystem;

// Main application demonstrating abstraction and polymorphism
public class EmployeeApp {
    public static void main(String[] args) {
        // Upcasting: Employee references pointing to concrete subclass objects
        // Runtime polymorphism: The actual method called depends on the object type at
        // runtime
        Employee e1 = new Developer("Alice", 500, 120);
        Employee e2 = new Manager("Anas Alam", 80000);

        // Polymorphic calls - behavior determined by actual object type
        e1.displayName();
        System.out.println("Salary: " + e1.calculateSalary());

        System.out.println();

        e2.displayName();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}
