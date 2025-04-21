
public class A1 {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 13, 100 };
        int total = 0;
        for (int n : nums) {
            System.out.println(n);
            total = total + n;
        }
        System.out.println("Total = " + total);
    }
}
