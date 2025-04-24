// OOP
// 1. Class - a blueprint / model to create an object
// 2. Object - an instance of a class
// 3. Static - belongs to the class
// 4. Non-Static - belongs to the object
// 5. Constructor - it initializes the object

// 6. Encapsulation 
// a. Wrapping up of data (properties) and function in a class
// b. Controlled modification from outside by
//         - declaring properties as private
//         - definiting get and set methods

// 7. Inheritance
// 8. Abstraction
// 9. Polymorphism

public class EncapsulationDemo {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(20);
        person1.displayInfo();
    }
}

class Person {
    // 1. Properties/Attributes
    private String name;
    private int age;

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
        // HW: Add a check to allow only alphabets and space
        this.name = n;
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
