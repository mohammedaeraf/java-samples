
import java.util.Scanner;

public class A15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // Get the first number
        while (!validInput) {
            try {
                System.out.print("Enter the first number: ");
                num1 = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
            }
        }

        validInput = false;

        // Get the second number
        while (!validInput) {
            try {
                System.out.print("Enter the second number: ");
                num2 = Integer.parseInt(scanner.nextLine());
                int result = num1 / num2;
                System.out.println("Result: " + result);
                validInput = true;
            } 
            catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter an integer.");
            }
            catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed. Please enter a valid number.");
            }
        }
        scanner.close();
    }
}