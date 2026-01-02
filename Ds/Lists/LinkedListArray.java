package Ds.Lists;

import java.util.LinkedList;

/**
 * LinkedList Notes for Beginners:
 * - What it is: LinkedList is a doubly-linked list implementation in Java where
 * elements are stored in nodes linked together.
 * - When to use: Use LinkedList when you need frequent insertions/deletions,
 * especially at the beginning or end, and don't need fast random access.
 * - Why use: It provides O(1) time for add/remove at ends, maintains insertion
 * order, and implements both List and Deque interfaces.
 * - Other things: O(n) for random access and middle operations. Not thread-safe
 * (use Collections.synchronizedList for concurrency). Good for stacks/queues.
 */
public class LinkedListArray {

    public static void main(String[] args) {
        // Create a LinkedList for Integer type (doubly-linked list)
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the end using add()
        list.add(10);
        list.add(20);
        list.add(30);

        // Print the initial list
        System.out.println(list);

        // Add to the front and back using addFirst() and addLast()
        list.addFirst(1);
        list.addLast(-1);

        // Print the list after additions
        System.out.println(list);

        // Remove element at index 3 using remove(index)
        list.remove(3);
        // Print the list after removal
        System.out.println(list);

        // Remove from the front and back using removeFirst() and removeLast()
        list.removeFirst();
        list.removeLast();

        // Print the final list
        System.out.println(list);
    }
}
