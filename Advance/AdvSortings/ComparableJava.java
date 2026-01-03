package Advance.AdvSortings;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparable Notes for Beginners:
 * - What it is: Comparable interface allows objects to define their natural
 * sorting order.
 * - When to use: For default sorting of objects (e.g., by a key field like ID
 * or name).
 * - Why use: Enables automatic sorting with Collections.sort() without extra
 * parameters.
 * - Other things: Implement compareTo() in the class. Only one natural order
 * per class.
 */

// Define a Car class which implements Comparable for natural sorting by year
class Car implements Comparable<Car> {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Define natural order: compare by year
    public int compareTo(Car other) {
        if (year < other.year)
            return -1; // This car is older
        if (year > other.year)
            return 1; // This car is newer
        return 0; // Same year
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year;
    }
}

public class ComparableJava {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Sort the cars using natural order (by year)
        Collections.sort(myCars);

        // Display the sorted cars
        for (Car c : myCars) {
            System.out.println(c);
        }
    }
}
