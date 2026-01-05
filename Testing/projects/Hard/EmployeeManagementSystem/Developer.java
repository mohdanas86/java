package Testing.projects.Hard.EmployeeManagementSystem;

// Developer class extends Employee - demonstrates inheritance
public class Developer extends Employee {
    // Private fields for developer's pay structure
    private double hourlyRate;
    private int hoursWorked;

    // Constructor initializes name from parent and sets rate and hours
    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Method overriding: Calculates salary based on hours worked
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
