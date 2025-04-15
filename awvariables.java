public class awvariables {

    public static void main(String[] args) {
        greet();

        int result = add(13, 29);
        System.out.println("the sum of two numbers is = " + result);

    }

    public static int add(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    public static void greet() {
        System.out.println("Hello, Welcome to java programming!");
    }

}
