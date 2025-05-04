/* 
 Different Types of Casing
 1. Pascal Casing - VariableDemo - Used for class and interface names
 2. Camel Casing - fullName - Used for variables and functions
 3. Snake All Caps Casing - Used for Constants

*/


public class FinalVariableExample {
    public static void main(String[] args) {
        String fullName = "Aeraf Abuhuseina";
        final int MAX_SPEED = 120;
        System.out.println("Max Speed: " + MAX_SPEED);

        MAX_SPEED = 150; // ❌ Error: cannot assign a value to final variable
    }
}
