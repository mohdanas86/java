// JAVA FILE CREATION: Creating files and directories
// WHAT IS THIS: Demonstrates how to create files and directories using Java File class
// WHY USE: Applications often need to create files for data storage, logs, configuration
// WHEN USE: When your program needs to create new files or directories

package Files;

import java.io.File; // Import File class for file operations
import java.io.IOException; // For handling file operation exceptions

public class CreateFile {

    public static void main(String[] args) {
        System.out.println("=== JAVA FILE CREATION DEMONSTRATION ===\n");

        // CREATE FILE OBJECT: Specify the file to create
        File newFile = new File("myNewFile.txt");

        // CREATE NEW FILE: Use createNewFile() method
        // WHAT: Creates an empty file if it doesn't exist
        // RETURNS: true if created, false if already exists
        // THROWS: IOException if operation fails
        try {
            if (newFile.createNewFile()) {
                System.out.println("File created successfully: " + newFile.getName());
            } else {
                System.out.println("File already exists: " + newFile.getName());
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        // CHECK FILE PROPERTIES: Verify the created file
        if (newFile.exists()) {
            System.out.println("File exists: " + newFile.getName());
            System.out.println("File size: " + newFile.length() + " bytes");
            System.out.println("Can read: " + newFile.canRead());
            System.out.println("Can write: " + newFile.canWrite());
        }
    }
}
