
import java.util.ArrayList;
import java.util.List;

class Student {

    private int id;
    private String name;
    private int roll;

    Student(int ID, String n, int r) {
        this.id = ID;
        this.name = n;
        this.roll = r;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    // Setters for modification
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    void display() {
        System.out.printf("Id : %d, Name: %s, Roll: %d\n", id, name, roll);
    }
}

class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        int[] id = {1, 2, 3};
        int[] roll = {38, 39, 40};
        String[] name = {"Anas", "Alice", "John"};

        for (int i = 0; i < id.length; i++) {
            Student student = new Student(id[i], name[i], roll[i]);
            students.add(student);
            student.display();
        }

        // Example: Modify a student later (e.g., change name of student with id 2)
        for (Student s : students) {
            if (s.getId() == 2) {
                s.setName("Bob");
                break;
            }
        }

        System.out.println("\nAfter modification:");
        for (Student s : students) {
            s.display();
        }
    }
}
