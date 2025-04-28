// honesty, bravery, emotion, carelessness, 
public class AbstractionDemo {
    public static void main(String[] args) {
        // Polymorphism: Parent reference, child object
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();

        // Calling methods
        myAnimal1.makeSound(); // Dog's makeSound()
        myAnimal2.makeSound(); // Cat's makeSound()

        // Concrete method from abstract class
        myAnimal1.sleep();
        myAnimal2.sleep();
    }
}

// Abstract class (Abstraction)
abstract class Animal {
    // Abstract method (no body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main class to test
