package Testing.projects.Easy.StudentManagementSystem;

// Student class represents a student with id, name, and marks
public class Student {
    // Private fields to store student information
    // Why fields are private: Encapsulation - prevents direct access from outside
    // the class,
    // ensuring data integrity and allowing controlled access through methods
    private int id;
    private String name;
    private double marks;

    // Constructor to initialize a Student object with id, name, and marks
    // What is constructor: A special method called when an object is created,
    // used to initialize the object's state
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getter method to retrieve the student's marks
    // Why methods instead of direct access: Provides controlled access to private
    // fields,
    // allows validation, computation, or logging if needed, and maintains
    // encapsulation
    public double getMarks() {
        return marks;
    }

    // Method to display the student's details
    public void displayStudent() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}
