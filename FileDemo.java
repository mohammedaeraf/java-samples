import java.io.*;

// This class demonstrates basic file writing and reading in Java.
public class FileDemo {

    // Constant for the file name to be used for reading and writing.
    static final String FILE_NAME = "test-file.txt";

    public static void main(String[] args) {
        writeToFile();   // Write sample lines to the file.
        readFromFile();  // Read and print lines from the file.
    }

    // Reads lines from the file and prints them to the console.
    private static void readFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_NAME); // Open the file for reading.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Read and print each line until the end of the file is reached.
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Print the current line.
            }

            bufferedReader.close(); // Close the reader to free resources.
        } catch (IOException e) {
            // Print error message if reading fails.
            System.out.println("Error while reading from file " + e.getMessage());
        }
    }

    // Writes sample lines to the file.
    private static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME); // Open the file for writing.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write two lines to the file.
            bufferedWriter.write("Test line written by Java Code - May 11 2025");
            bufferedWriter.newLine();
            bufferedWriter.write("Another line written by Java Code...");

            bufferedWriter.close(); // Close the writer to save changes and free resources.
        } catch (IOException e) {
            // Print error message if writing fails.
            System.out.println("Error while writing to file " + e.getMessage());
        }
    }
}