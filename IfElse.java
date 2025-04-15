// Prints Odd or Even
// Even Nos - 2,4,6,8....100, 150, 1000
// Odd Nos - 1,3,5,7,9,15
public class IfElse {
    public static void main(String[] args) 
{
                printOddorEven(7);
                    printOddorEven(100);
printOddorEven(2016);
                            printOddorEven(109);
                                                }

    public static void printOddorEven(int n) {
        int remainder = n % 2;
        if (remainder == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }
}
