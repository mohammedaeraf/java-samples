public class StaticDemo {
    public static void main(String[] args) {
        // static - belongs to the class
        MathUtils.square(7);

        int fact = MathUtils.factorial(4);
        System.out.printf("Factorial of 4 = %d", fact);

        boolean prime = MathUtils.isPrime(11);
        if (prime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not a prime");
        }
    }
}

class MathUtils {

    // square of 5 = 5 * 5 = 25
    static void square(int n) {
        int sq = n * n;
        System.out.printf("Square of %d = %d", n, sq);
    }

    // 4! = 1 * 2 * 3 * 4 = 24
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean isPrime(int n) {
        return true;
    }
}
