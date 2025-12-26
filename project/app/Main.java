
// MAIN CLASS: Entry point for Java applications
// WHAT IS THIS: This is the main class that demonstrates object-oriented programming
//   by creating an instance of the Student class and calling its methods.
// WHY USE:
//   1. Entry point - Every Java application needs a main method to start execution
//   2. Object creation - Shows how to instantiate custom classes
//   3. Method calling - Demonstrates how to call methods on objects
// WHEN USE: This is the starting point for any Java program execution

import src.college.Student; // Import the Student class from the src.college package

public class Main {

    // MAIN METHOD: The entry point of any Java application
    // WHAT IT DOES: Creates a Student object and displays its information
    // PARAMETERS: String[] args - command line arguments (not used here)
    // RETURNS: void - doesn't return anything
    public static void main(String[] args) {
        // Create a new Student object using the constructor
        // Constructor takes two parameters: name (String) and rollNo (int)
        Student s1 = new Student("Anas", 38);

        // Call the displayInfo method on the Student object
        // This method prints the student's name and roll number to the console
        s1.displayInfo();
    }
}
