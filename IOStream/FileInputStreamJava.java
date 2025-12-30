// FILE INPUT STREAM: Reading binary data from files
// WHAT IS THIS: Demonstrates FileInputStream for reading bytes from files
// WHY USE:
//   1. Binary file reading - handles any file type (images, videos, executables)
//   2. Byte-level control - read exact byte values from files
//   3. Low-level I/O - direct access to file bytes without interpretation
//   4. Memory efficient - reads one byte at a time
// WHEN USE: When you need to read binary files or process files byte-by-byte
//
// FILE INPUT STREAM CHARACTERISTICS:
// • Reads raw bytes (0-255 values)
// • Returns -1 when end of file is reached
// • No character encoding interpretation
// • Suitable for binary files (images, executables)
// • Can be slow for large files (byte-by-byte reading)
//
// WHEN TO USE FILE INPUT STREAM:
// ✓ Reading binary files (images, videos, PDFs)
// ✓ Processing encrypted or compressed data
// ✓ When you need exact byte values
// ✓ Low-level file operations
// ✓ Custom file format parsing
//
// PERFORMANCE CONSIDERATIONS:
// • Use BufferedInputStream for better performance
// • Consider reading larger chunks for speed
// • Close streams promptly to free resources
// • Handle large files carefully to avoid memory issues

package IOStream;

import java.io.FileInputStream; // For reading bytes from files
import java.io.IOException; // For handling I/O operation exceptions

class FileInputStreamJava {

    public static void main(String[] args) {
        // FILE INPUT STREAM: Reading bytes from a file
        // WHAT: FileInputStream reads raw bytes from files
        // WHY: Essential for binary files that character streams can't handle
        // NOTE: Reads one byte at a time, returns -1 when end of file reached

        // TRY-WITH-RESOURCES: Automatic resource management
        // WHAT: FileInputStream is automatically closed when try block ends
        // WHY: Prevents resource leaks and ensures file handles are released
        try (FileInputStream file = new FileInputStream("./file/sample.txt")) {

            // BYTE STORAGE VARIABLE: Holds each byte read from file
            // WHAT: Stores the byte value returned by read() method
            // WHY: int type because read() returns -1 for end-of-file
            int i = 0;

            // BYTE-BY-BYTE READING LOOP: Read entire file content
            // WHAT: Continues reading until read() returns -1 (end of file)
            // WHY: Processes file one byte at a time for complete control
            while ((i = file.read()) != -1) {

                // DISPLAY BYTE VALUE: Print each byte as integer
                // WHAT: Shows the raw byte value (0-255 for valid bytes)
                // WHY: Demonstrates exact byte content of the file
                System.out.print(i + " ");
            }

            // COMPLETION MESSAGE: Confirm file reading finished
            // WHAT: Indicates all bytes have been successfully read
            System.out.println("\nFile reading completed successfully");

        } catch (IOException e) {
            // ERROR HANDLING: Handle file reading exceptions
            // WHAT: Catches IOException for file not found, permission denied, etc.
            // WHY: File operations can fail for various system reasons
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}