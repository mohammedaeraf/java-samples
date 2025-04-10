/* Byte Code */
public class Variables {
    public static void main(String[] args) {
        greet();

        int result = add(100, 50);
        System.out.println("Sum = " + result);

        float result2 = divide(7, 2);
        System.out.println("Result of divsion = " + result2);

    }

    public static void greet() {
        System.out.println("Java is Fun!");
    }

    public static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static float divide(float a, float b) {
        float result = a / b;
        return result;
    }

}
