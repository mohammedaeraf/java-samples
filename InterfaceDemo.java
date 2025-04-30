
// Define the Interface
interface Animal {
    void makeSound(); // abstract method
    void eat(); // abstract method
}

// Dog implements the Animal interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Cat implements the Animal interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Main class to test
public class InterfaceDemo {
    public static void main(String[] args) {
        // Interface reference holding Dog object
        Animal dog = new Dog();
        work(dog);

        // Interface reference holding Cat object
        Animal cat = new Cat();
        work(cat);
    }

    static void work(Animal animal) {
        animal.eat();
        animal.makeSound();
    }
}
