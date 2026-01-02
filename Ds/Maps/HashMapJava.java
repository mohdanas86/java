import java.util.HashMap;

/**
 * HashMap Notes for Beginners:
 * - What it is: HashMap is a data structure in Java that stores key-value
 * pairs. It's like a dictionary where each key is unique and maps to a value.
 * - When to use: Use HashMap when you need to store data that can be quickly
 * accessed using a unique key, like storing student IDs with names or caching
 * data.
 * - Why use: It's fast for lookups, insertions, and deletions (average O(1)
 * time). Better than arrays or lists when you need key-based access instead of
 * index-based.
 * - Other things: Keys must be unique; values can be duplicated. Not
 * thread-safe (use ConcurrentHashMap for multi-threading). Allows null keys and
 * values.
 */
class HashMapJava {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs using put() method
        map.put(0, "Anas");
        map.put(1, "Alice");
        map.put(2, "John");

        // Print the entire map
        System.out.println(map);

        // Retrieve value for key 0 using get() method
        System.out.println(map.get(0));

        // Remove entry with key 2 using remove() method
        map.remove(2);
        System.out.println(map);

        // Check if key 0 exists using containsKey()
        System.out.println(map.containsKey(0));
        // Check if value "Anas" exists using containsValue()
        System.out.println(map.containsValue("Anas"));

        // Get all keys as a Set using keySet()
        System.out.println(map.keySet());
        // Get all values as a Collection using values()
        System.out.println(map.values());
    }
}