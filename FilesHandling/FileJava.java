// JAVA FILE HANDLING: Working with files and directories
// WHAT IS THIS: Introduction to Java File class for basic file operations
// WHY USE: File handling is essential for reading/writing data in applications
// WHEN USE: When your program needs to work with files on the system
//
// File handling is an important part of any application.
// Java has several methods for creating, reading, updating, and deleting files.
//
// JAVA FILE HANDLING
// The File class from the java.io package, allows us to work with files.
//
// To use the File class, create an object of the class, and specify the filename or directory name:
// Example: File myObj = new File("filename.txt");
//
// If you don't know what a package is, read our Java Packages Tutorial.
//
// The File class has many useful methods for creating and getting information about files:
//
// FILE CLASS METHODS REFERENCE:
// • canRead() → Boolean: Tests whether the file is readable or not
// • canWrite() → Boolean: Tests whether the file is writable or not
// • createNewFile() → Boolean: Creates an empty file
// • delete() → Boolean: Deletes a file
// • exists() → Boolean: Tests whether the file exists
// • getName() → String: Returns the name of the file
// • getAbsolutePath() → String: Returns the absolute pathname of the file
// • length() → Long: Returns the size of the file in bytes
// • list() → String[]: Returns an array of the files in the directory
// • mkdir() → Boolean: Creates a directory

package FilesHandling;

import java.io.File; // Import File class for file operations

public class FileJava {

    public static void main(String[] args) {
        // CREATE FILE OBJECT: Make a File instance to work with
        File exampleFile = new File("example.txt");

        // CHECK FILE EXISTENCE: Test if file exists and show different info
        if (exampleFile.exists()) {
            System.out.println("File exists: " + exampleFile.getName());
            System.out.println("File size: " + exampleFile.length() + " bytes");
        } else {
            System.out.println("File does not exist: " + exampleFile.getName());
        }

        // CHECK FILE PERMISSIONS: Show read/write permissions
        System.out.println("Can read: " + exampleFile.canRead());
        System.out.println("Can write: " + exampleFile.canWrite());
    }
}
