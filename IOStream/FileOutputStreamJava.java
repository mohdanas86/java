// FILE OUTPUT STREAM: Writing binary data to files
// WHAT IS THIS: Demonstrates FileOutputStream for writing bytes to files and file copying
// WHY USE:
//   1. Binary file writing - handles any file type (images, videos, executables)
//   2. Byte-level control - write exact byte values to files
//   3. File copying - combine with FileInputStream for copying files
//   4. Data persistence - save binary data permanently
// WHEN USE: When you need to write binary files or copy files byte-by-byte
//
// FILE OUTPUT STREAM CHARACTERISTICS:
// • Writes raw bytes (0-255 values)
// • Overwrites existing files by default
// • No character encoding applied
// • Suitable for binary files (images, executables)
// • Can be slow for large files (byte-by-byte writing)
//
// WHEN TO USE FILE OUTPUT STREAM:
// ✓ Writing binary files (images, videos, PDFs)
// ✓ Creating encrypted or compressed files
// ✓ File copying operations
// ✓ Writing custom binary formats
// ✓ Low-level file creation and modification
//
// FILE OUTPUT STREAM MODES:
// • Default: Overwrites existing file
// • Append mode: FileOutputStream(file, true) - adds to existing file
// • Create mode: FileOutputStream(file, false) - overwrites (default)
//
// PERFORMANCE CONSIDERATIONS:
// • Use BufferedOutputStream for better performance
// • Consider writing larger byte arrays for speed
// • Flush streams periodically for large writes
// • Close streams promptly to ensure data is written
// • Handle large files carefully to avoid memory issues

package IOStream;

import java.io.FileInputStream; // For reading bytes from source file
import java.io.FileOutputStream; // For writing bytes to destination file
import java.io.IOException; // For handling I/O operation exceptions

public class FileOutputStreamJava {

    public static void main(String[] args) {
        // FILE COPYING WITH BYTE STREAMS: Copy file using input and output streams
        // WHAT: Reads bytes from input file and writes them to output file
        // WHY: Essential for copying any type of file (binary or text)
        // NOTE: Preserves exact byte content, works with all file formats

        // TRY-WITH-RESOURCES: Automatic resource management for both streams
        // WHAT: Both FileInputStream and FileOutputStream are automatically closed
        // WHY: Prevents resource leaks and ensures both files are properly closed
        try (FileInputStream input = new FileInputStream("./file/sample.txt");
                FileOutputStream output = new FileOutputStream("./file/fileoutput.txt")) {

            // BYTE STORAGE VARIABLE: Holds each byte read from input file
            // WHAT: Temporarily stores byte value during copy operation
            // WHY: int type because FileInputStream.read() returns -1 for end-of-file
            int i = 0;

            // COPY LOOP: Read from input and write to output byte by byte
            // WHAT: Continues until input.read() returns -1 (end of input file)
            // WHY: Ensures complete file copy with exact byte preservation
            while ((i = input.read()) != -1) {

                // WRITE BYTE: Write the read byte to output file
                // WHAT: Copies each byte from input stream to output stream
                // WHY: Maintains exact binary content of the original file
                output.write(i);
            }

            // SUCCESS MESSAGE: Confirm file copy operation completed
            // WHAT: Indicates the copying process finished without errors
            System.out.println("File copied successfully: sample.txt → fileoutput.txt");

        } catch (IOException e) {
            // ERROR HANDLING: Handle I/O exceptions during file operations
            // WHAT: Catches IOException for file not found, permission denied, disk full,
            // etc.
            // WHY: File copy operations can fail for various system reasons
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
