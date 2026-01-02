package Ds.Sets;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet Notes for Beginners:
 * - What it is: LinkedHashSet is a hash table and linked list implementation of
 * Set that maintains insertion order.
 * - When to use: Use LinkedHashSet when you need unique elements with fast
 * operations and want to preserve the order of insertion.
 * - Why use: It combines HashSet's O(1) performance with predictable iteration
 * order, unlike regular HashSet.
 * - Other things: Slightly more memory overhead than HashSet due to linked
 * list. Allows one null element. Not thread-safe.
 */
public class LinkedHashSetJava {

    public static void main(String[] args) {
        // Create a LinkedHashSet for Integer type (maintains insertion order)
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add unique elements using add() (order preserved)
        set.add(10);
        set.add(20);
        set.add(30);

        // Print the set in insertion order
        System.out.println(set);

        // Check if 20 is in the set using contains()
        System.out.println(set.contains(20));
        // Get the size of the set using size()
        System.out.println(set.size());

        // Remove 20 from the set using remove()
        set.remove(20);
        // Print the set after removal
        System.out.println(set);

        // Clear all elements using clear()
        set.clear();
        // Print the empty set
        System.out.println(set);
    }
}
