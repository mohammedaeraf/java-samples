public class A2 {
    public static void main(String[] args) {
        int[] numbers = { 3, 6, 9, 10, 15, 12, 14 };
        int odd = 0, even = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even nos = " + even);
        System.out.println("Odd nos = " + odd);
    }
}
