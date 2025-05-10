// Ternary Operator & Reading input from user

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(name + ", you are " + result);

        scanner.close();
    }
}
