import java.util.TreeMap;

/**
 * TreeMap Notes for Beginners:
 * - What it is: TreeMap is a sorted map in Java that stores key-value pairs in
 * a sorted order based on the keys (natural order or custom comparator).
 * - When to use: Use TreeMap when you need keys to be sorted automatically,
 * like for ordered data storage or performing range queries.
 * - Why use: It provides sorted access and navigation methods (e.g., first/last
 * key), making it ideal for ordered operations, though it's slower than HashMap
 * (O(log n) time).
 * - Other things: Keys must be comparable (implement Comparable); no null keys
 * allowed (unlike HashMap). Values can be null. Not thread-safe (use
 * ConcurrentSkipListMap for concurrency).
 */
public class TreeMapJava {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values (keys will be sorted)
        TreeMap<Integer, String> map = new TreeMap<>();

        // Add key-value pairs using put() method
        map.put(0, "Anas");
        map.put(1, "Alice");
        map.put(2, "John");

        // Print the entire sorted map
        System.out.println(map);

        // Retrieve value for key 0 using get() method
        System.out.println(map.get(0));

        // Remove entry with key 1 using remove() method
        map.remove(1);
        // Print the map after removal
        System.out.println(map);

        // Get the smallest key using firstKey()
        System.out.println(map.firstKey());
        // Get the largest key using lastKey()
        System.out.println(map.lastKey());

        // Get the smallest key greater than 0 using higherKey()
        System.out.println(map.higherKey(0));
        // Get the largest key less than 2 using lowerKey()
        System.out.println(map.lowerKey(2));

        // Get the smallest key >= 0 using ceilingKey()
        System.out.println(map.ceilingKey(0));
        // Get the largest key <= 2 using floorKey()
        System.out.println(map.floorKey(2));
    }
}
