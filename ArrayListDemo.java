import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Core Java");
        courses.add("Graphic Design usign Canva");
        courses.add("Advanced Web Design");

        // boolean courseContains = courses.contains("React");
        // System.out.println(courseContains);
        courses.add(1, "Programming in C");
        courses.set(1, "C Programming");
        // courses.remove(0);

        // for each loop
        for (String course : courses) {
            System.out.println(course);
        }

        courses.clear();

        System.out.println("Printing after clear..");
        for (String course : courses) {
            System.out.println(course);
        }
        
    }
    
}
