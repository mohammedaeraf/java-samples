
// Definition - An interface with only function is called Functional Interface
@FunctionalInterface
interface IGreeting {
    void greet();
}

class MyGreeting implements IGreeting {
    @Override
    public void greet() {
        System.out.println("Hello from MyGreeting Class");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {

        MyGreeting myGreeting = new MyGreeting();
        myGreeting.greet();

        // Anonymous Class
        // new Greeting() => creating an object of an anonymous class that implements Greeting interface
        IGreeting greeting = new IGreeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous class");
            }
        };
        greeting.greet(); // Output: Hello, World!

        
        // Using a Lambda Expression
        // Brevity
        IGreeting lambdaGreeting = () -> System.out.println("Greeting from Lambda Function!"); 
        lambdaGreeting.greet(); 
    }
}

