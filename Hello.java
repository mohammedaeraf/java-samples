public class Hello {
    public static void main(String[] args) {
        int sales = 15000;

        // Conditional Statement
        if (sales > 10000) {
            System.out.println("Good Sales");
        } else {
            System.out.println("Bad Sales");
        }

        greet("Mohammed, Shawoor, Arshad, Imran, Abdul Wahab");

        int sum = add(10, 20);
        System.out.println(sum);

        printNumbers(30, 40);
        printTable(5, 100);
        printTable(12, 10);

        System.out.println("Back to main");
    }

    public static void greet(String name) {
        System.out.println("As salam alaykum " + name + "!");
        System.out.println("Today is a wonderful day with pleasant atmosphere!");
    }

    public static int add(int m, int n) {
        int sum = m + n;
        return sum;
    }

    public static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void printTable(int n, int till) {
        System.out.println("***** Printing Table of " + n + " ******");
        for (int i = 1; i <= till; i++) {
            System.out.printf("%d x %d = %d", n, i, n * i);
            System.out.println();
        }
        System.out.println();
    }

}
