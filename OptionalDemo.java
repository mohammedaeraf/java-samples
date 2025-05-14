import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = getCatByName("Max");

        if (optionalCat.isEmpty()) {
            System.out.println("Cat not found");
        } else {
            Cat cat = optionalCat.get();
            cat.printInfo();
        }
    }

    public static Optional<Cat> getCatByName(String name) {
        Cat cat = new Cat("Max", 1);
        return Optional.ofNullable(cat);
        // return Optional.ofNullable(null);
    }
}

class Cat {
    String name;
    int age;

    public Cat(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void printInfo() {
        System.out.println("Cat's Name - " + this.name);
        System.out.println("Cat's Age - " + this.age);
    }
}