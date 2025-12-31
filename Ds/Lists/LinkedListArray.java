// LINKEDLIST: Doubly-linked list implementation in Java
// WHAT IS THIS: Dynamic data structure where elements are linked via nodes
// WHY USE:
//   1. Efficient insertions/deletions - no element shifting needed
//   2. Dynamic sizing - grows and shrinks as needed
//   3. Ordered collection - maintains insertion order
//   4. Implements both List and Deque interfaces
//   5. Good for frequent modifications at both ends
// WHEN USE: When you need frequent insertions/deletions, especially at ends
//
// TIME COMPLEXITY (Big O):
/*
• Access/get(index): O(n) - Must traverse from head/tail
• Add(end): O(1) - Direct access to last node
• Add(index): O(n) - Traverse to insertion point
• AddFirst/AddLast: O(1) - Direct node manipulation
• Remove(index): O(n) - Traverse to removal point
• RemoveFirst/RemoveLast: O(1) - Direct node manipulation
• Contains/search: O(n) - Linear traversal
• Size: O(1) - Maintains size counter
*/
// SPACE COMPLEXITY: O(n) - Stores n elements plus node overhead
//
// COMMON METHODS:
// • add(element) - Add to end, O(1)
// • add(index, element) - Insert at position, O(n)
// • addFirst(element) - Add to beginning, O(1)
// • addLast(element) - Add to end, O(1)
// • get(index) - Get element at index, O(n)
// • getFirst() - Get first element, O(1)
// • getLast() - Get last element, O(1)
// • remove(index) - Remove at index, O(n)
// • removeFirst() - Remove first element, O(1)
// • removeLast() - Remove last element, O(1)
// • size() - Get current size, O(1)
// • isEmpty() - Check if empty, O(1)
// • contains(element) - Check if element exists, O(n)
// • clear() - Remove all elements, O(1)

package Ds.Lists;

import java.util.LinkedList; // Import LinkedList class for doubly-linked lists

public class LinkedListArray {

    public static void main(String[] args) {
        // CREATE LINKEDLIST: Generic LinkedList for Integer type
        // WHAT: Creates empty LinkedList that can store Integer objects
        // WHY: Type-safe collection with efficient end operations
        LinkedList<Integer> list = new LinkedList<>();

        // ADD ELEMENTS: Append elements to the end
        // WHAT: Adds 10, 20, 30 to the list in order
        // WHY: O(1) time complexity for end additions
        list.add(10);
        list.add(20);
        list.add(30);

        // DISPLAY INITIAL LIST: Show current contents
        System.out.println(list);

        // ADD TO FRONT AND BACK: Efficient operations for LinkedList
        // WHAT: Adds 1 to front and -1 to back
        // WHY: O(1) time complexity for both operations
        list.addFirst(1);
        list.addLast(-1);

        // DISPLAY AFTER ADDITIONS: Show updated contents
        System.out.println(list);

        // REMOVE BY INDEX: Remove element at specific position
        // WHAT: Removes element at index 3 (the fourth element)
        // WHY: O(n) time complexity due to traversal
        list.remove(3);
        System.out.println(list);

        // REMOVE FROM ENDS: Efficient removal operations
        // WHAT: Removes first and last elements
        // WHY: O(1) time complexity for both operations
        list.removeFirst();
        list.removeLast();

        // DISPLAY FINAL LIST: Show final state
        System.out.println(list);
    }
}
