interface Shape {
    double getArea();

    double getPerimeter();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double PI = 3.142;
        return PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        double PI = 3.142;
        return 2 * PI * this.radius;
    }

}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

}

public class A12 {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        circle.getArea();

        double circleArea = circle.getArea();
        double circlePerimeter = circle.getPerimeter();

        System.out.println("Area of Circle = " + circleArea);
        System.out.println("Perimeter of Circle = " + circlePerimeter);

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of Rectangle = " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle = " + rectangle.getPerimeter());

    }
}