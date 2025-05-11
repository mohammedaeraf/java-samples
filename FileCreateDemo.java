import java.io.File;
import java.io.IOException;

// This class demonstrates how to create a new file in Java.
public class FileCreateDemo {
    public static void main(String[] args) {
        File file; // Declare a File object

        try {
            // Initialize the File object with the desired file path
            file = new File("C:\\code\\aeraf.txt");

            // Attempt to create the file
            if (file.createNewFile()) {
                // If the file was created successfully
                System.out.println("File created: " + file.getName());
            } else {
                // If the file already exists
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) {
            // Handle any IO exceptions that may occur during file creation
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        finally{
            file = null; // Clean up the file reference
        }
    }
}