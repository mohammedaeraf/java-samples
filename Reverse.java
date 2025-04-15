public class Reverse {

    public static void main(String[] args) {
        printPalidndrome(14578);
    }

    public static void printPalidndrome(int n) {
        int palindromeNo = 0, remainder;
        int nCopy = n;
        while (n != 0) {
            remainder = n % 10;
            palindromeNo = palindromeNo * 10 + remainder;
            n = n / 10;
            System.out.println("Remainder = " + remainder);
            System.out.println("n = " + n);
            System.out.println("Palindrome = " + palindromeNo);
        }
        System.out.println("Palindrome of " + nCopy + " = " + palindromeNo);
    }
}

// 8768763531524351 15
