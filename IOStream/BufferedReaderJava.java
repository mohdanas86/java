// BUFFERED READER: Efficient character-based file reading
// WHAT IS THIS: Demonstrates BufferedReader for reading text files line by line efficiently
// WHY USE:
//   1. Performance - buffers data for faster reading than FileReader alone
//   2. Line-based reading - convenient readLine() method for text files
//   3. Memory efficient - reads chunks of data instead of character by character
//   4. Character encoding support - handles different text encodings
// WHEN USE: When reading large text files or when you need line-by-line processing
//
// BUFFERED READER CHARACTERISTICS:
// • Wraps any Reader (FileReader, InputStreamReader, etc.)
// • Uses internal buffer (default 8192 characters) for efficiency
// • readLine() method returns lines without line terminators
// • Returns null when end of stream is reached
// • Automatically handles different line separator styles (\n, \r, \r\n)
//
// WHEN TO USE BUFFERED READER:
// ✓ Reading large text files efficiently
// ✓ Processing files line by line
// ✓ When performance is important for text reading
// ✓ Reading from character streams (not binary files)
// ✓ Parsing text-based data formats
//
// PERFORMANCE CONSIDERATIONS:
// • Much faster than reading character by character
// • Good default buffer size (8192 chars) for most cases
// • Can specify custom buffer size in constructor
// • Always use try-with-resources for automatic closing
// • Consider Scanner for more parsing features

package IOStream;

import java.io.BufferedReader; // For efficient character-based reading
import java.io.FileReader; // For reading character files
import java.io.IOException; // For handling I/O exceptions

public class BufferedReaderJava {

    public static void main(String[] args) {
        // BUFFERED FILE READING: Efficient text file reading with buffering
        // WHAT: Uses BufferedReader wrapped around FileReader for optimal performance
        // WHY: BufferedReader provides much better performance than FileReader alone
        // NOTE: Automatically handles file closing with try-with-resources

        // TRY-WITH-RESOURCES: Automatic resource management
        // WHAT: BufferedReader is automatically closed when try block ends
        // WHY: Prevents resource leaks and ensures file handles are released
        try (BufferedReader br = new BufferedReader(new FileReader("./files/sample.txt"))) {

            // LINE STORAGE VARIABLE: Holds each line read from file
            // WHAT: Stores the string returned by readLine() method
            // WHY: String type because readLine() returns text lines
            String line;

            // LINE-BY-LINE READING LOOP: Read entire file content
            // WHAT: Continues reading until readLine() returns null (end of file)
            // WHY: Processes file line by line, which is natural for text files
            while ((line = br.readLine()) != null) {

                // DISPLAY LINE: Output each line to console
                // WHAT: Shows the content read from the file
                // WHY: Demonstrates successful line-by-line reading
                System.out.println(line);
            }

        } catch (IOException e) {
            // ERROR HANDLING: Handle file reading exceptions
            // WHAT: Catches IOException for file not found, permission denied, etc.
            // WHY: File operations can fail for various system reasons
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
