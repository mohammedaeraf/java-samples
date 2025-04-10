// Program to print Multiplication Table
public class ForLoop {
    public static void main(String[] args) {
        printTable(5);
        printTable(97);
        printTable(25);
    }

    public static void printTable(int n) {
        System.out.println("***** Print Table of " + n + " *****");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        System.out.println();
    }
}
