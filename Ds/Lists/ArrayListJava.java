package Ds.Lists;

import java.util.ArrayList;

/**
 * ArrayList Notes for Beginners:
 * - What it is: ArrayList is a resizable array implementation in Java that can
 * grow and shrink dynamically as elements are added or removed.
 * - When to use: Use ArrayList when you need fast random access to elements,
 * frequent reads, and don't know the size upfront.
 * - Why use: It provides O(1) access time, maintains insertion order, is
 * type-safe with generics, and has a rich API for manipulation.
 * - Other things: Amortized O(1) for adding to end, but O(n) for
 * insertions/removals in the middle. Not thread-safe (use Vector or
 * Collections.synchronizedList for concurrency).
 */
class ArrayListJava {

    public static void main(String[] args) {
        // Create an ArrayList for Integer type (dynamic array)
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the end using add()
        list.add(10);
        list.add(20);
        list.add(30);

        // Print the entire list
        System.out.println(list);

        // Remove element at index 1 (value 20) using remove(index)
        list.remove(1);

        // Print the list after removal
        System.out.println(list);

        // Get element at index 0 using get()
        System.out.println("Get : " + list.get(0));

        // Print current list before set
        System.out.println(list);

        // Replace element at index 1 with 20 using set(), returns old value
        System.out.println("Set : " + list.set(1, 20));

        // Get the current size of the list using size()
        System.out.println("Size : " + list.size());

        // Print the final list
        System.out.println(list);
    }
}