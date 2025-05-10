import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(System.in);
            System.out.println("Length of string = " + str.length());
        }
        catch (Exception e) {
            System.out.println("Exception Occured " + e.getMessage());
        }
        finally {
            System.out.println("In Finally block... Doing cleanup");
            scanner.close();
        }
        
        System.out.println("Product of 100 and 5 = " +  100*5);
    }
}
