@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo2 {
    public static void main(String[] args) {

        MathOperation multiply = (a, b) -> { return a * b;};
        System.out.println("Result: " + multiply.operate(4, 5)); // Output: Result: 20
    }
}