public class InheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student("John", 25, "1089");
        student.displayInfo();
    }

}

class Person {
    // 1. Properties/Attributes
    protected String name;
    protected int age;

    // Constructor (Function)

    // Default Constructor
    Person() {
        this.name = "Person X";
        this.age = 0;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {

        String trimmedName = n.trim();

        boolean isNameValid = trimmedName.matches("^[A-Za-z ]+$");

        if (isNameValid == true) {
            this.name = n;
        } else {
            System.out.println(n + " is not a valid name");
        }
    }

    int getAge() {
        return this.age;
    }

    void setAge(int a) {
        if (a < 0) {
            System.out.println("Age cannot be less than zero");
            return;
        }
        if (a > 150) {
            System.out.println("Age cannot be greater than 150");
            return;
        }

        this.age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Functions/Methods

}

class Student extends Person {
    protected String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Student Id: " + studentId);
    }
}

