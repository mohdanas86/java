// JAVA FILE DELETION: Deleting files and directories
// WHAT IS THIS: Demonstrates how to delete files using Java File class
// WHY USE: Applications need to clean up temporary files, remove old data, manage storage
// WHEN USE: When your program needs to remove files that are no longer needed

package Files;

import java.io.File; // For file path representation and operations

public class DeleteFile {

    public static void main(String[] args) {
        // CREATE FILE OBJECT: Specify which file to delete
        // WHAT: Creates File object pointing to the file to delete
        // NOTE: "./filename.txt" means filename.txt in current directory
        File delFile = new File("./filename.txt");

        // ATTEMPT FILE DELETION: Use delete() method
        // WHAT: Attempts to delete the file from the file system
        // RETURNS: true if deletion successful, false if failed
        // NOTE: File must exist and program must have delete permissions
        if (delFile.delete()) {
            // SUCCESS MESSAGE: File was deleted successfully
            // WHAT: Confirms the deletion operation completed
            System.out.println("File deleted successfully.");
        } else {
            // FAILURE MESSAGE: File could not be deleted
            // WHAT: Indicates deletion failed (file doesn't exist, no permissions, etc.)
            System.out.println("Failed to delete the file.");
        }

        System.out.println("\n=== FILE DELETION BEST PRACTICES ===");
        System.out.println("✓ Always check return value of delete() method");
        System.out.println("✓ Verify file exists before attempting deletion");
        System.out.println("✓ Check file permissions before deletion");
        System.out.println("✓ Cannot delete non-empty directories with delete()");
        System.out.println("✓ Use Files.delete() for more control and better error handling");
        System.out.println("✓ Consider backup before deleting important files");
    }
}
