// JAVA FILE WRITING: Writing data to files
// WHAT IS THIS: Demonstrates how to write text data to files using FileWriter
// WHY USE: Applications need to save data persistently (logs, configuration, user data)
// WHEN USE: When your program needs to store information that persists after execution

package Files;

import java.io.FileWriter; // For writing character data to files
import java.io.IOException; // For handling file I/O exceptions

public class WriteFile {

    public static void main(String[] args) {
        // FILE WRITING WITH FILEWRITER: Basic text file writing
        // WHAT: FileWriter writes character data to files
        // WHY: Simple way to write text content to files
        // NOTE: Overwrites existing content by default
        try {
            // CREATE FILEWRITER: Open file for writing
            // PARAMETER: "./filename.txt" - relative path to file
            // NOTE: "./" means current directory
            FileWriter myObj = new FileWriter("./filename.txt");

            // WRITE CONTENT: Write text to the file
            // WHAT: Writes the string to the file
            // NOTE: Content is buffered, not immediately written to disk
            myObj.write(
                    "Hello everyone my name is anas alam, i'm a software developer i wanna do somthing that create value in everyone's life.");

            // CLOSE FILEWRITER: Important - flush and close the file
            // WHAT: Ensures all data is written and releases system resources
            // WHY: Prevents resource leaks and ensures data integrity
            myObj.close();

            // SUCCESS MESSAGE: Confirm file was written
            System.out.println("Successfully wrote to file: filename.txt");

        } catch (IOException e) {
            // ERROR HANDLING: Handle file I/O exceptions
            // WHAT: Catches any IOException during file operations
            // WHY: File operations can fail (permissions, disk space, etc.)
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace(); // Print detailed error information
        }
    }
}
