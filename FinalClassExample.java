public class FinalClassExample {

}

final class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double sqrt(double n) {
        // logic to calculate square root
        // 25 --> 5
    }
}

// ❌ Error: Cannot subclass final class
// class AdvancedCalculator extends Calculator { }
