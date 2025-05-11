import java.io.File;

// This class demonstrates how to delete a file in Java.
public class FileDeleteDemo {
    public static void main(String[] args) {
        // Create a File object for the file to be deleted
        File file = new File("example.txt");

        // Attempt to delete the file
        if (file.delete()) {
            // If deletion was successful
            System.out.println("Deleted the file: " + file.getName());
        } else {
            // If deletion failed (file may not exist or is in use)
            System.out.println("Failed to delete the file.");
        }
    }
}