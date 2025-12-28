package ThisSuper;

// THIS KEYWORD: Refers to current object
// WHY USE: To differentiate between instance variables and parameters with same name
// WHEN USE: In constructors, methods when parameter name = field name
class Employee {

    String name;
    int salary;

    // WITHOUT 'this' - confusing, both refer to parameter
    // Employee(String name, int salary) {
    //     name = name; // WRONG! This assigns parameter to itself
    //     salary = salary;
    // }
    
    // WITH 'this' - clear distinction
    Employee(String name, int salary) {
        this.name = name;       // this.name = instance variable, name = parameter
        this.salary = salary;   // this.salary = instance variable, salary = parameter
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}


public class thisKey {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        emp.display();
    }
}
