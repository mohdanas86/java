// package strings;

public class stringOperations {

    public static void main(String[] args) {
        String name = "Java Programming Language";

        System.out.println("Original String: " + name);

        // ============================================
        // ========= comman string operations =========
        // ============================================
        // ======= length =======
        String s = "anas";
        System.out.println("Length of the string: " + s.length());

        // ======= charAt =======
        System.out.println("\nCharacter at index 4: " + s.charAt(3));

        // ======= uppercase / lowercase =======
        System.out.println("\nUppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // ======= equals / equalsIgnoreCase =======
        String s1 = "Anas";
        System.out.println("\nEquals: " + s.equals(s1));
        System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase(s1));

        // ======= compareTo =======
        String str1 = "apple";
        String str2 = "banana";
        System.out.println("\nCompareTo: " + str1.compareTo(str2));

        // ======= contains =======
        System.out.println("\nContains 'Programming': " + name.contains("Programming"));

        // ======= indexOf / lastIndexOf =======
        System.out.println("\nIndex of 'Programming': " + name.indexOf("Programming"));
        System.out.println("Last index of 'a': " + name.lastIndexOf('a'));

        // ======= substring =======
        System.out.println("\nSubstring (5 to 16): " + name.substring(5, 16));

        // ======= replace =======
        System.out.println("\nReplace 'a' with 'o': " + name.replace('a', 'o'));

        // ======= trim =======
        String nameWithSpaces = "   Java Programming Language   ";
        System.out.println("\nTrimmed String: '" + nameWithSpaces.trim() + "'");
        // ======= split =======
        String[] words = name.split(" ");
        System.out.println("\nSplit by space:");
        for (String word : words) {
            System.out.println(word);
        }

        // ======= startsWith / endsWith =======
        System.out.println("\nStarts with 'Java': " + name.startsWith("Java"));
        System.out.println("Ends with 'Language': " + name.endsWith("Language"));

        // ======= concat =======
        String greet = "Hello, ";
        String fullGreet = greet.concat("World!");
        System.out.println("\nConcatenated String: " + fullGreet);

    }
}
