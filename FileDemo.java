import java.io.*;

public class FileDemo {

    static final String FILE_NAME = "test-file.txt";

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    private static void readFromFile() {
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // TO DO - Read and print the lines to the console till the end of file
        } catch (IOException e) {
        }
    }

    private static void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Test line written by Java Code - May 11 2025");
            bufferedWriter.newLine();
            bufferedWriter.write("Another line written by Java Code...");
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file " + e.getMessage());
        }
    }



}
