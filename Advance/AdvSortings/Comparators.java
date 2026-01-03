package Advance.AdvSortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Advanced Sorting Notes for Beginners:
 * - What it is: Sorting custom objects using Comparators for flexible ordering.
 * - When to use: When sorting lists of objects by different criteria.
 * - Why use: Allows custom sort logic beyond natural ordering.
 * - Other things: Use generics for type safety. Comparator is separate from the
 * class.
 */

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    @Override
    public String toString() {
        return brand + " " + model + " " + year;
    }
}

// Create a comparator for sorting by year
class SortByYear implements Comparator<Car> {
    public int compare(Car a, Car b) {
        // Compare the year of both cars
        if (a.year < b.year)
            return -1; // a comes before b
        if (a.year > b.year)
            return 1; // a comes after b
        return 0; // same year
    }
}

public class Comparators {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Use a comparator to sort the cars by year
        Comparator<Car> myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        // Display the sorted cars
        for (Car c : myCars) {
            System.out.println(c);
        }
    }
}
