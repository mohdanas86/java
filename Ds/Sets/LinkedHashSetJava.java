// LINKEDHASHSET: Hash table + linked list implementation of Set interface
// WHAT IS THIS: HashSet that maintains insertion order using doubly-linked list
// WHY USE:
//   1. Unique elements only - prevents duplicates automatically
//   2. Maintains insertion order - unlike regular HashSet
//   3. Fast operations - O(1) average time for add/remove/contains
//   4. Predictable iteration - elements returned in insertion order
//   5. Memory efficient - slightly more overhead than HashSet but ordered
// WHEN USE: When you need unique elements with both fast access AND insertion order
//
// TIME COMPLEXITY (Big O):
// • Add(element): O(1) average - Hash function + linked list insertion
// • Remove(element): O(1) average - Hash lookup and linked list removal
// • Contains(element): O(1) average - Hash-based search
// • Size: O(1) - Just returns a field value
// • IsEmpty: O(1) - Just checks size field
// • Clear: O(1) - Resets internal structure
// • Iteration: O(n) - Must visit all elements in insertion order
//
// SPACE COMPLEXITY: O(n) - Stores n unique elements plus linked list overhead
//
// COMMON METHODS:
// • add(element) - Add element if not present, O(1) average
// • remove(element) - Remove specific element, O(1) average
// • contains(element) - Check if element exists, O(1) average
// • size() - Get number of elements, O(1)
// • isEmpty() - Check if set is empty, O(1)
// • clear() - Remove all elements, O(1)
// • iterator() - Get iterator for insertion-order traversal, O(1)
// • toArray() - Convert to array in insertion order, O(n)
// • addAll(collection) - Add all elements from collection, O(m)
// • retainAll(collection) - Keep only elements in collection, O(n)
// • removeAll(collection) - Remove all elements in collection, O(m)

package Ds.Sets;

import java.util.LinkedHashSet; // Import LinkedHashSet for ordered unique elements

public class LinkedHashSetJava {

    public static void main(String[] args) {
        // CREATE LINKEDHASHSET: Generic LinkedHashSet for Integer type
        // WHAT: Creates empty LinkedHashSet that maintains insertion order
        // WHY: Type-safe collection with uniqueness and predictable iteration
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // ADD ELEMENTS: Insert unique elements in order
        // WHAT: Adds 10, 20, 30 to the set in insertion order
        // WHY: O(1) average time complexity with hash + linked list
        set.add(10);
        set.add(20);
        set.add(30);

        // DISPLAY SET: Elements appear in insertion order
        System.out.println(set);

        // CHECK CONTAINS AND SIZE: Basic operations
        // WHAT: Checks if 20 exists and gets current size
        // WHY: O(1) average time complexity for both
        System.out.println(set.contains(20));
        System.out.println(set.size());

        // REMOVE ELEMENT: Remove specific element
        // WHAT: Removes element 20 from the set
        // WHY: O(1) average time complexity
        set.remove(20);
        System.out.println(set);

        // CLEAR SET: Remove all elements
        // WHAT: Empties the entire set
        // WHY: O(1) time complexity
        set.clear();
        System.out.println(set);
    }
}
