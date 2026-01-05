package Testing.projects.Easy.StudentManagementSystem;

// Main application class for demonstrating Student management
public class StudentApp {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create two Student objects with sample data
        Student s1 = new Student(0, "Anas Alam", 9.35);
        Student s2 = new Student(1, "John Doe", 7.5);

        // Display details of first student
        s1.displayStudent();
        System.out.println();
        // Display details of second student
        s2.displayStudent();

        // Calculate average marks of both students
        double avg = (s1.getMarks() + s2.getMarks()) / 2;
        // Print the average marks formatted to 2 decimal places
        System.out.printf("\nAverage Marks : %.2f", avg);
    }
}
