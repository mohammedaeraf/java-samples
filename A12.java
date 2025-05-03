interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        double PI = 3.142;
        return PI * this.radius * this.radius;
    }

    double getPerimeter() {
        double PI = 3.142;
        return 2 * PI * this.radius;
    }

}

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return this.length * this.width;
    }

    double getPerimeter() {
        return 2 * (this.length + this.width);
    }

}

public class A12 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
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