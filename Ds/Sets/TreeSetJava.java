package Ds.Sets;

import java.util.TreeSet;

/**
 * TreeSet Notes for Beginners:
 * - What it is: TreeSet is a red-black tree-based NavigableSet implementation
 * that maintains elements in sorted order.
 * - When to use: Use TreeSet when you need sorted unique elements and want
 * navigation methods like finding higher/lower values.
 * - Why use: It provides O(log n) operations with automatic sorting and range
 * queries, unlike HashSet.
 * - Other things: Elements must be comparable. No null elements allowed. Not
 * thread-safe (use Collections.synchronizedSortedSet for concurrency).
 */
public class TreeSetJava {

    public static void main(String[] args) {
        // Create a TreeSet for Integer type (maintains sorted order)
        TreeSet<Integer> set = new TreeSet<>();

        // Add elements using add() (automatically sorted)
        System.out.println("Adding elements: 30, 10, 20");
        set.add(30);
        set.add(10);
        set.add(20);

        // Print the sorted set
        System.out.println("Sorted TreeSet: " + set);

        // Check if 10 is in the set using contains()
        System.out.println("Contains 10? " + set.contains(10));

        // Remove 20 using remove()
        System.out.println("Removing 20...");
        set.remove(20);
        // Print after removal
        System.out.println("After removal: " + set);

        // Get smallest element using first()
        System.out.println("Smallest element (first): " + set.first());
        // Get largest element using last()
        System.out.println("Largest element (last): " + set.last());

        // Add more elements for demo
        set.add(5);
        set.add(15);
        set.add(25);
        set.add(35);
        // Print updated set
        System.out.println("After adding more elements: " + set);

        // Get smallest element > 20 using higher()
        System.out.println("Element higher than 20: " + set.higher(20));
        // Get largest element < 20 using lower()
        System.out.println("Element lower than 20: " + set.lower(20));

        // Get smallest element >= 10 using ceiling()
        System.out.println("Ceiling of 10 (>= 10): " + set.ceiling(10));
        // Get largest element <= 20 using floor()
        System.out.println("Floor of 20 (<= 20): " + set.floor(20));
    }
}
