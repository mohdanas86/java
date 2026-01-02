import java.util.LinkedHashMap;

/**
 * LinkedHashMap Notes for Beginners:
 * - What it is: LinkedHashMap is a map in Java that stores key-value pairs and
 * maintains the insertion order of keys (order in which they were added).
 * - When to use: Use LinkedHashMap when you need fast lookups like HashMap but
 * also want to preserve the order of insertion for iteration.
 * - Why use: It combines HashMap's O(1) performance with predictable iteration
 * order, making it great for caches, LRU implementations, or any scenario
 * needing ordered access.
 * - Other things: Allows one null key and multiple null values. Not thread-safe
 * (use ConcurrentHashMap for concurrency). Slightly slower than HashMap due to
 * maintaining links.
 */
public class LinkedHashMapJava {
    public static void main(String[] args) {
        // Create a LinkedHashMap with Integer keys and String values (maintains
        // insertion order)
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Add key-value pairs using put() method
        map.put(0, "Anas");
        map.put(1, "Alice");
        map.put(2, "John");

        // Print the entire map in insertion order
        System.out.println(map);

        // Retrieve value for key 0 using get() method
        System.out.println(map.get(0));

        // Remove entry with key 1 using remove() method
        map.remove(1);
        // Print the map after removal (order preserved)
        System.out.println(map);

        // Get all keys as a Set in insertion order using keySet()
        System.out.println(map.keySet());
        // Get all values as a Collection in insertion order using values()
        System.out.println(map.values());

        // Get all key-value pairs as a Set of entries in insertion order using
        // entrySet()
        System.out.println(map.entrySet());
    }
}
