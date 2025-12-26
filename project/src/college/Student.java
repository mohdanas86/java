package src.college;

public class Student {

    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}
