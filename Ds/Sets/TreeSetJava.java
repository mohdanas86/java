// TREESET: Red-Black tree-based NavigableSet implementation in Java
// WHAT IS THIS: Self-balancing binary search tree that maintains sorted order
// WHY USE:
//   1. Sorted elements - automatically maintains natural ordering
//   2. Unique elements - no duplicates allowed
//   3. Navigation methods - higher, lower, ceiling, floor operations
//   4. Range operations - subset, headSet, tailSet available
//   5. Predictable performance - log n time for operations
// WHEN USE: When you need sorted unique elements with navigation capabilities
//
// TIME COMPLEXITY (Big O):
// • Add(element): O(log n) - Tree insertion with balancing
// • Remove(element): O(log n) - Tree deletion with balancing
// • Contains(element): O(log n) - Binary search
// • First/Last: O(log n) - Tree traversal to ends
// • Higher/Lower/Ceiling/Floor: O(log n) - Binary search operations
// • Size: O(1) - Maintains size counter
// • IsEmpty: O(1) - Just checks size field
//
// SPACE COMPLEXITY: O(n) - Stores n elements in tree nodes
//
// COMMON METHODS:
// • add(element) - Add element in sorted order, O(log n)
// • remove(element) - Remove specific element, O(log n)
// • contains(element) - Check if element exists, O(log n)
// • first() - Get smallest element, O(log n)
// • last() - Get largest element, O(log n)
// • higher(element) - Get smallest element > given value, O(log n)
// • lower(element) - Get largest element < given value, O(log n)
// • ceiling(element) - Get smallest element >= given value, O(log n)
// • floor(element) - Get largest element <= given value, O(log n)
// • pollFirst() - Remove and return first element, O(log n)
// • pollLast() - Remove and return last element, O(log n)
// • size() - Get number of elements, O(1)
// • isEmpty() - Check if set is empty, O(1)

package Ds.Sets;

import java.util.TreeSet; // Import TreeSet class for sorted unique elements

public class TreeSetJava {

    public static void main(String[] args) {
        // CREATE TREESET: Generic TreeSet for Integer type
        // WHAT: Creates empty TreeSet that maintains natural ordering
        // WHY: Type-safe sorted collection with automatic duplicate prevention
        TreeSet<Integer> set = new TreeSet<>();

        // ADD ELEMENTS: Insert elements in random order
        // WHAT: Adds 30, 10, 20 (will be stored as 10, 20, 30)
        // WHY: TreeSet automatically sorts elements in natural order
        System.out.println("Adding elements: 30, 10, 20");
        set.add(30);
        set.add(10);
        set.add(20);

        // DISPLAY SORTED SET: Elements appear in sorted order
        System.out.println("Sorted TreeSet: " + set);

        // CHECK CONTAINS: Test if element exists
        // WHAT: Returns true if 10 is in the set
        // WHY: O(log n) time complexity using binary search
        System.out.println("Contains 10? " + set.contains(10));

        // REMOVE ELEMENT: Remove specific element
        // WHAT: Removes element 20 from the set
        // WHY: O(log n) time complexity with tree rebalancing
        System.out.println("Removing 20...");
        set.remove(20);
        System.out.println("After removal: " + set);

        // NAVIGATION METHODS: TreeSet's unique capabilities
        // FIRST AND LAST: Get smallest and largest elements
        System.out.println("Smallest element (first): " + set.first());
        System.out.println("Largest element (last): " + set.last());

        // ADD MORE ELEMENTS FOR BETTER DEMO
        set.add(5);
        set.add(15);
        set.add(25);
        set.add(35);
        System.out.println("After adding more elements: " + set);

        // HIGHER AND LOWER: Find elements relative to a value
        // WHAT: higher(20) finds smallest element > 20
        // WHY: Useful for finding next element in sorted order
        System.out.println("Element higher than 20: " + set.higher(20));
        System.out.println("Element lower than 20: " + set.lower(20));

        // CEILING AND FLOOR: Find elements with inclusive bounds
        // WHAT: ceiling(10) finds smallest element >= 10
        // WHY: ceiling includes equal values, higher excludes them
        System.out.println("Ceiling of 10 (>= 10): " + set.ceiling(10));
        System.out.println("Floor of 20 (<= 20): " + set.floor(20));
    }
}
