// package oops;

class Student { // class

    int id;
    String name;
    int roll;

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
    }
}

public class classObj {

    public static void main(String[] args) {
        Student s1 = new Student(); // object

        s1.id = 1;
        s1.name = "anas";
        s1.roll = 38;

        s1.display();
    }
}
