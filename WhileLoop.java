public class WhileLoop {
    public static void main(String[] args) {
        printTable(5);
        printTable(97);
        printTable(25);
    }

    public static void printTable(int n) {
        System.out.println("***** Print Table of " + n + " *****");

        int i = 1;
        while (i <= 10) {
            System.out.printf("%d x %d = %d", n, i, n * i);
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
