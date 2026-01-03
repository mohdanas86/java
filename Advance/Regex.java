package Advance;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Regex Notes for Beginners:
 * - What it is: Regular expressions (regex) are simple patterns used to find or
 * match text in strings.
 * - When to use: Use regex for basic text searching, like finding words or
 * numbers in a sentence.
 * - Why use: They make it easy to check if text matches a pattern without
 * writing lots of code.
 * - Other things: Use Pattern and Matcher classes. Patterns are like search
 * templates.
 */
public class Regex {
    public static void main(String[] args) {
        // Example 1: Checking if text contains a word
        String text = "Hello world, this is Java.";
        Pattern pattern = Pattern.compile("Java"); // Simple pattern to match "Java"
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found 'Java' in the text!");
        } else {
            System.out.println("'Java' not found.");
        }

        // Example 2: Replacing simple text
        String original = "I like cats.";
        String replaced = original.replaceAll("cats", "dogs"); // Replace "cats" with "dogs"
        System.out.println("Original: " + original);
        System.out.println("Replaced: " + replaced);

        // Example 3: Splitting text
        String sentence = "apple,banana,cherry";
        String[] words = sentence.split(","); // Split by comma
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // Example 4: Checking if text matches exactly
        String number = "12345";
        boolean isNumber = Pattern.matches("\\d+", number); // Check if all digits
        System.out.println("Is '12345' all numbers? " + isNumber);

        // Example 5: Finding multiple matches
        String list = "cat dog cat bird";
        Pattern wordPattern = Pattern.compile("cat"); // Find "cat"
        Matcher wordMatcher = wordPattern.matcher(list);
        System.out.println("Finding 'cat':");
        while (wordMatcher.find()) {
            System.out.println("Found at position: " + wordMatcher.start());
        }
    }
}
