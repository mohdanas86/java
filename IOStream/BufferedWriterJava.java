// BUFFERED WRITER: Efficient character-based file writing
// WHAT IS THIS: Demonstrates BufferedWriter for writing text to files efficiently
// WHY USE:
//   1. Performance - buffers data for faster writing than FileWriter alone
//   2. Line-based writing - convenient newLine() method for text files
//   3. Memory efficient - writes chunks of data instead of character by character
//   4. Character encoding support - handles different text encodings
// WHEN USE: When writing large amounts of text or when you need line-based output
//
// BUFFERED WRITER CHARACTERISTICS:
// • Wraps any Writer (FileWriter, OutputStreamWriter, etc.)
// • Uses internal buffer (default 8192 characters) for efficiency
// • write() method for writing strings, chars, or char arrays
// • newLine() method writes platform-specific line separator
// • flush() method forces buffer to be written to underlying stream
//
// WHEN TO USE BUFFERED WRITER:
// ✓ Writing large text files efficiently
// ✓ Creating text files with line breaks
// ✓ When performance is important for text writing
// ✓ Writing to character streams (not binary files)
// ✓ Generating text-based output files
//
// PERFORMANCE CONSIDERATIONS:
// • Much faster than writing character by character
// • Good default buffer size (8192 chars) for most cases
// • Can specify custom buffer size in constructor
// • Always flush() or close() to ensure data is written
// • Use try-with-resources for automatic closing

package IOStream;

import java.io.BufferedWriter; // For efficient character-based writing
import java.io.FileWriter; // For writing character files
import java.io.IOException; // For handling I/O exceptions

public class BufferedWriterJava {

    public static void main(String[] args) {
        // BUFFERED FILE WRITING: Efficient text file writing with buffering
        // WHAT: Uses BufferedWriter wrapped around FileWriter for optimal performance
        // WHY: BufferedWriter provides much better performance than FileWriter alone
        // NOTE: Automatically handles file closing with try-with-resources

        // TRY-WITH-RESOURCES: Automatic resource management
        // WHAT: BufferedWriter is automatically closed (and flushed) when try block
        // ends
        // WHY: Prevents resource leaks and ensures all data is written to file
        try (BufferedWriter wr = new BufferedWriter(new FileWriter("./files/output.txt"))) {

            // WRITE TEXT: Write string content to file
            // WHAT: Writes the string "Hello" to the buffered writer
            // WHY: Demonstrates basic text writing functionality
            wr.write("Hello");

            // WRITE NEW LINE: Add platform-specific line separator
            // WHAT: Inserts a new line character appropriate for the operating system
            // WHY: Ensures proper line breaks in text files across different platforms
            wr.newLine();

            // WRITE MORE TEXT: Continue writing to file
            // WHAT: Writes the string "world" on the new line
            // WHY: Shows how to write multiple pieces of text with line breaks
            wr.write("world");

            // NOTE: No explicit flush() needed - try-with-resources calls close() which
            // flushes

        } catch (IOException e) {
            // ERROR HANDLING: Handle file writing exceptions
            // WHAT: Catches IOException for file creation issues, permission denied, disk
            // full, etc.
            // WHY: File operations can fail for various system reasons
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
