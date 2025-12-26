
import java.util.*;

class Student {

    int id;
    int roll;
    String name;

    Student(int i, int r, String n) {
        this.id = i;
        this.roll = r;
        this.name = n;
    }

    void setName(String n) {
        this.name = n;
    }

    void setRoll(int r) {
        this.roll = r;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }

    int getId(int i) {
        return id;
    }

    void display() {
        System.out.printf("Id : %d, Name: %s, Roll: %d\n", id, name, roll);
    }
}

class Main {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        int[] id = {1, 2, 3};
        int[] roll = {38, 39, 40};
        String[] name = {"Anas", "Alice", "John"};

        for (int i = 0; i < id.length; i++) {
            Student student = new Student(id[i], roll[i], name[i]);
            list.add(student);
            // student.display();
        }

        int idx = 2;

        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i).id == idx) {
        //         list.get(i).display();
        //         list.get(i).setName("Anas Alam");
        //         list.get(i).setRoll(1);
        //         System.out.println(list.get(i).getName());
        //         System.out.println(list.get(i).getRoll());
        //         list.get(i).display();
        //     }
        // }
        for (Student val : list) {
            if (val.getId(val.id) == idx) {
                val.display();
                val.setName("Anas Alam");
                val.setRoll(38);
                val.display();
            }
        }
    }
}
