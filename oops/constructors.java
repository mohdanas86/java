// package oops;

// CLASS: Blueprint for creating objects
// WHY USE: To group related data and behaviors together
// WHEN USE: When you need multiple objects with same structure (e.g., multiple students)
class Student { // class

    // INSTANCE VARIABLES: Each object has its own copy
    // WHY USE: To store unique data for each object
    // WHEN USE: When each object needs different values (each student has different id/name)
    int id;
    int roll;
    String name;

    // CONSTRUCTOR: Special method with same name as class (no return type)
    // WHY USE: To initialize object with values when created
    // WHEN USE: When you want to ensure every object starts with proper values
    // NOTE: Without constructor, you'd need to set each field manually after creating object
    Student(int Id, int r, String n) {
        this.name = n;   // 'this' keyword differentiates parameter from instance variable
        this.id = Id;    // this.id = object's field, Id = parameter
        this.roll = r;
    }

    // METHOD: Defines behavior/actions for the object
    // WHY USE: To perform operations on object's data
    // WHEN USE: When you need to reuse code for all objects (all students can display info)
    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}

public class constructors {

    public static void main(String[] args) {
        // OBJECT CREATION: 'new' keyword allocates memory and calls constructor
        // WHY: To create actual instance from class blueprint
        // WHEN: When you need to work with actual data (not just class definition)
        Student s1 = new Student(1, 38, "anas alam");

        // You can create multiple objects from same class
        // Student s2 = new Student(2, 39, "john"); // Each has own data
        // CALLING METHOD: Access object's behavior
        s1.display();
    }
}
