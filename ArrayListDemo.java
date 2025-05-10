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
        courses.removeLast();

        // for each loop
        for (String course : courses) {
            System.out.println(course);
        }

        Collections.sort(courses);

        System.out.println();
        System.out.println("Printing after sorting..");
        for (String course : courses) {
            System.out.println(course);
        }
        
    }
    
}
