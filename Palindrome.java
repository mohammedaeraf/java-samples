// Program to find if a number is Palindrome

// 13531 x 13531  [Palindrome]
// 1456 x 6541 [Not a Palindrome]

// IF YOU FAIL TO PLAN, YOU PLAN TO FAIL

// Step 1 => Reverse the number
// Step 2 => Compare original and reversed number

public class Palindrome {

    public static void main(String[] args) {
        int originalNo = 135;
        int reverseNo = reverse(originalNo); // step 1
        checkIfPalindrome(originalNo, reverseNo);
    }

    private static void checkIfPalindrome(int originalNo, int reverseNo) {
        System.out.println("Original No = " + originalNo);
        System.out.println("Reversed No = " + reverseNo);
        if (originalNo == reverseNo) {
            System.out.println(originalNo + " is a Palindrome");
        } else {
            System.out.println(originalNo + " is not a Palindrome");
        }
    }

    private static int reverse(int n) {
        int resersedNo = 0, remainder;

        while (n != 0) {
            // System.out.println("n = " + n);
            remainder = n % 10;
            n = n / 10;
            resersedNo = resersedNo * 10 + remainder;
            // System.out.println("Remainder = " + remainder);
            // System.out.println("Reversed No = " + resersedNo);
        }
        return resersedNo;

    }

}
