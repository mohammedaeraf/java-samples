
interface Calculator {
    int add(int a, int b);

    int subtract(int a, int b);

    // Static method in the interface
    static boolean isPositive(int number) {
        boolean isGreaterThanZero = number > 0;
        return isGreaterThanZero;
    }

    default void printNumber(int n) {
        System.out.println("The number is " + n);
    }
}

class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

public class InterfaceStaticDemo {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        int result1 = calculator.add(10, 5);
        int result2 = calculator.subtract(10, 5);
        calculator.printNumber(result2);

        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);

        // Using the static method in the interface
        System.out.println("Is 10 positive? " + Calculator.isPositive(10));
        System.out.println("Is -5 positive? " + Calculator.isPositive(-5));
    }
}