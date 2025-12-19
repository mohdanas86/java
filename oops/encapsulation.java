package oops;

// ENCAPSULATION: Wrapping data (variables) and code (methods) together as a single unit
// WHY USE: 
//   1. Data Hiding - protect data from direct access
//   2. Control - validate data before setting values
//   3. Security - prevent unauthorized modification
// WHEN USE: Always in real applications to protect sensitive data (passwords, balance, etc.)
class Student {

    // PRIVATE: Access modifier - variable accessible only within this class
    // WHY USE: To hide data from outside world (other classes cannot access directly)
    // WHEN USE: For sensitive data that needs validation or controlled access
    private int id;
    private int roll;

    // SETTER METHODS: Used to set/modify private variables
    // WHY USE: To control how values are set (can add validation)
    // WHEN USE: When you want controlled access to modify private data
    public void setid(int id) {
        // Example validation: if (id > 0) this.id = id;
        this.id = id;
    }

    // GETTER METHODS: Used to read/access private variables
    // WHY USE: Provides controlled read access to private data
    // WHEN USE: When other classes need to read the value (but not modify directly)
    public int getId() {
        return id;
    }

    // Setter for roll - can add validation like: if (roll > 0 && roll <= 100)
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // Getter for roll
    public int getRoll() {
        return roll;
    }

    void display() {
        System.out.println(id);
        System.out.println(roll);
    }
}

public class encapsulation {

    public static void main(String[] args) {
        Student s1 = new Student();

        // CANNOT ACCESS: s1.id = 1; // ERROR! id is private
        // MUST USE SETTER: Controlled way to set values
        s1.setid(1);
        s1.setRoll(38);

        // BENEFIT: If we change internal implementation, external code still works
        // Example: Can add validation in setter without breaking existing code
        s1.display();

        // Can also use getter: System.out.println(s1.getId());
    }
}
