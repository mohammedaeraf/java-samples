// Pascal Casing
// Camel Casing - printAge() 
// WAP to create an array of 5 numbers. 
// Find the lowest number in the array.
public class ArraysDemo {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 40;
        ages[3] = 28;
        ages[4] = 30;

        // int[] ages2 = {25, 30, 42};
        int index;
        for (int i = 0; i <= ages.length - 1; i++) {
            index = i + 1;
            System.out.println("Age of Person " + index + " = " + ages[i]);
        }

        for (int age : ages) {
            System.out.println(age);
        }

        // complete the program to find average age

    }
}
