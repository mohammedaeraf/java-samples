import java.util.Scanner;

public class TernaryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // String result;
        // if (number % 2 == 0) {
        //     result = "Even";
        // }
        // else {
        //     result = "Odd";
        // }

        // Using the ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result + ".");
        
        scanner.close();
    }
}