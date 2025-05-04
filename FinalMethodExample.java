public class FinalMethodExample {

}

class Vehicle {
    public final void showType() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    // ❌ Cannot override final method
    public void showType() {
        System.out.println("This is a car.");
    }
}
