// HASHSET: Hash table-based Set implementation in Java
// WHAT IS THIS: Unordered collection that stores unique elements using hashing
// WHY USE:
//   1. Unique elements only - automatically prevents duplicates
//   2. Fast operations - O(1) average time for add/remove/contains
//   3. No ordering needed - when order doesn't matter
//   4. Memory efficient for large datasets
//   5. Implements Set interface - mathematical set operations
// WHEN USE: When you need unique elements with fast lookup, no duplicates allowed
//
// TIME COMPLEXITY (Big O):
// • Add(element): O(1) average - Hash function + array access
// • Remove(element): O(1) average - Hash lookup and removal
// • Contains(element): O(1) average - Hash-based search
// • Size: O(1) - Just returns a field value
// • IsEmpty: O(1) - Just checks size field
// • Clear: O(1) - Resets internal structure
// • Iteration: O(n) - Must visit all elements
//
// SPACE COMPLEXITY: O(n) - Stores n unique elements in hash table
//
// COMMON METHODS:
// • add(element) - Add element if not present, O(1) average
// • remove(element) - Remove specific element, O(1) average
// • contains(element) - Check if element exists, O(1) average
// • size() - Get number of elements, O(1)
// • isEmpty() - Check if set is empty, O(1)
// • clear() - Remove all elements, O(1)
// • iterator() - Get iterator for traversal, O(1)
// • toArray() - Convert to array, O(n)
// • addAll(collection) - Add all elements from collection, O(m) where m is collection size
// • retainAll(collection) - Keep only elements in collection, O(n)
// • removeAll(collection) - Remove all elements in collection, O(m)

package Ds.Sets;

import java.util.HashSet; // Import HashSet class for unique element storage

public class HashSetJava {

    public static void main(String[] args) {
        // CREATE HASHSET: Generic HashSet for Integer type
        // WHAT: Creates empty HashSet that stores unique Integer objects
        // WHY: Type-safe collection with automatic duplicate prevention
        HashSet<Integer> set = new HashSet<>();

        // ADD ELEMENTS: Insert unique elements
        // WHAT: Adds 10, 20, 30 to the set (duplicates automatically ignored)
        // WHY: O(1) average time complexity due to hashing
        set.add(10);
        set.add(20);
        set.add(30);

        // DISPLAY SET: Show current unique elements (order not guaranteed)
        System.out.println(set);

        // CHECK CONTAINS: Test if element exists
        // WHAT: Returns true if 20 is in the set
        // WHY: O(1) average time complexity with hash lookup
        System.out.println(set.contains(20));

        // REMOVE ELEMENT: Remove specific element
        // WHAT: Removes element 10 from the set
        // WHY: O(1) average time complexity
        set.remove(10);
        System.out.println(set);

        // CHECK EMPTY AND SIZE: Basic set properties
        // WHAT: Checks if set is empty and gets current size
        // WHY: O(1) time complexity for both operations
        System.out.println(set.isEmpty());
        System.out.println(set.size());

        // CLEAR SET: Remove all elements
        // WHAT: Empties the entire set
        // WHY: O(1) time complexity
        set.clear();
        System.out.println(set);
    }
}
