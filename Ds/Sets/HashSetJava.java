package Ds.Sets;

import java.util.HashSet;

/**
 * HashSet Notes for Beginners:
 * - What it is: HashSet is a hash table-based Set implementation in Java that
 * stores unique elements without any order.
 * - When to use: Use HashSet when you need to store unique elements and perform
 * fast lookups, without caring about order.
 * - Why use: It provides O(1) average time for add, remove, and contains
 * operations, automatically prevents duplicates.
 * - Other things: No guaranteed order (use LinkedHashSet for insertion order,
 * TreeSet for sorted order). Allows one null element. Not thread-safe (use
 * Collections.synchronizedSet for concurrency).
 */
public class HashSetJava {

    public static void main(String[] args) {
        // Create a HashSet for Integer type (unordered, unique elements)
        HashSet<Integer> set = new HashSet<>();

        // Add unique elements using add() (duplicates ignored)
        set.add(10);
        set.add(20);
        set.add(30);

        // Print the set (order not guaranteed)
        System.out.println(set);

        // Check if 20 is in the set using contains()
        System.out.println(set.contains(20));

        // Remove 10 from the set using remove()
        set.remove(10);
        // Print the set after removal
        System.out.println(set);

        // Check if set is empty using isEmpty()
        System.out.println(set.isEmpty());
        // Get the size of the set using size()
        System.out.println(set.size());

        // Clear all elements from the set using clear()
        set.clear();
        // Print the empty set
        System.out.println(set);
    }
}
