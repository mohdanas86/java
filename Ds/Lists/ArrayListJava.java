// ARRAYLIST: Dynamic array implementation in Java
// WHAT IS THIS: Resizable array that can grow and shrink dynamically
// WHY USE:
//   1. Dynamic sizing - no need to specify size upfront
//   2. Fast access - O(1) random access like arrays
//   3. Ordered collection - maintains insertion order
//   4. Generic support - type-safe with Java generics
//   5. Rich API - many built-in methods for manipulation
// WHEN USE: When you need fast access, frequent reads, and dynamic sizing
//
// TIME COMPLEXITY (Big O):
// • Access/get(index): O(1) - Direct array access
// • Add(end): O(1) amortized - Usually fast, occasional resize
// • Add(index): O(n) - Shifts elements after insertion point
// • Remove(index): O(n) - Shifts elements after removal point
// • Contains/search: O(n) - Linear search through elements
// • Size: O(1) - Just returns a field value
//
// SPACE COMPLEXITY: O(n) - Stores n elements in contiguous memory
//
// COMMON METHODS:
/*
• add(element) - Add to end, O(1) amortized
• add(index, element) - Insert at position, O(n)
• get(index) - Get element at index, O(1)
• set(index, element) - Replace at index, O(1)
• remove(index) - Remove at index, O(n)
• remove(element) - Remove first occurrence, O(n)
• size() - Get current size, O(1)
• isEmpty() - Check if empty, O(1)
• contains(element) - Check if element exists, O(n)
• indexOf(element) - Find first index of element, O(n)
• clear() - Remove all elements, O(1)
*/

package Ds.Lists;

import java.util.ArrayList; // Import ArrayList class for dynamic arrays

class ArrayListJava {

    public static void main(String[] args) {
        // CREATE ARRAYLIST: Generic ArrayList for Integer type
        // WHAT: Creates empty ArrayList that can store Integer objects
        // WHY: Type-safe collection, no casting needed
        ArrayList<Integer> list = new ArrayList<>();

        // ADD ELEMENTS: Append elements to the end
        // WHAT: Adds 10, 20, 30 to the list in order
        // WHY: O(1) amortized time complexity
        list.add(10);
        list.add(20);
        list.add(30);

        // DISPLAY LIST: Show current contents
        System.out.println(list);

        // REMOVE ELEMENT: Remove by index
        // WHAT: Removes element at index 1 (the second element, value 20)
        // WHY: O(n) time complexity due to element shifting
        list.remove(1);

        // DISPLAY AFTER REMOVAL: Show updated contents
        System.out.println(list);

        // GET ELEMENT: Access by index
        // WHAT: Retrieves element at index 0 (first element)
        // WHY: O(1) time complexity, direct array access
        System.out.println("Get : " + list.get(0));

        // DISPLAY CURRENT LIST: Show before set operation
        System.out.println(list);

        // SET ELEMENT: Replace at index
        // WHAT: Replaces element at index 1 with value 20
        // WHY: O(1) time complexity, direct array access
        System.out.println("Set : " + list.set(1, 20));

        // GET SIZE: Current number of elements
        // WHAT: Returns current size of the ArrayList
        // WHY: O(1) time complexity
        System.out.println("Size : " + list.size());

        // FINAL DISPLAY: Show final state of list
        System.out.println(list);
    }
}