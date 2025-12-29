// JAVA FILE READING: Reading data from files
// WHAT IS THIS: Demonstrates how to read text data from files using Scanner
// WHY USE: Applications need to load saved data (configuration, user data, logs)
// WHEN USE: When your program needs to process information stored in files

package Files;

import java.io.File; // For file path representation
import java.io.IOException; // For handling file I/O exceptions
import java.util.Scanner; // For reading file content

public class ReadFile {

    public static void main(String[] args) {
        // CREATE FILE OBJECT: Specify which file to read
        // WHAT: Creates File object pointing to the file to read
        // NOTE: "./filename.txt" means filename.txt in current directory
        File file = new File("./filename.txt");

        // TRY-WITH-RESOURCES: Automatic resource management
        // WHAT: Scanner is automatically closed when try block ends
        // WHY: Prevents resource leaks, no need to manually call close()
        try (Scanner reader = new Scanner(file)) {

            // READ FILE LINE BY LINE: Process entire file content
            // WHAT: Loop continues while there are more lines to read
            // WHY: Processes file content line by line for memory efficiency
            while (reader.hasNextLine()) {

                // READ NEXT LINE: Get one line of text from file
                // WHAT: Reads next line including spaces but excluding newline
                // RETURNS: String containing the line content
                String data = reader.nextLine();

                // DISPLAY LINE: Output the read line to console
                // WHAT: Shows the content that was read from file
                System.out.println(data);
            }

        } catch (IOException e) {
            // ERROR HANDLING: Handle file reading exceptions
            // WHAT: Catches IOException if file cannot be read
            // WHY: File may not exist, no permissions, or other I/O errors
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace(); // Print detailed error information
        }
    }
}
