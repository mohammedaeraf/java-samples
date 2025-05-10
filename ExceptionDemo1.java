public class ExceptionDemo1 {
    public static void main(String[] args) {
        int a = 20, b = 0;

        try {
            int result = divide(a, b);
            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception Occured " + e.getMessage());
        }
        System.out.println("After Division the main method continues..");
        
    }

    public static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
}
