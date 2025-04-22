public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        person1.displayInfo();

        Person person2 = new Person("Mohammed", 22);
        person2.displayInfo();
    }

}

class Person {
    // 1. Properties/Attributes
    String name;
    int age;

    // Constructor (Function)

    // Default Constructor
    Person() {
        this.name = "Person X";
        this.age = 1;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // Functions/Methods

}
