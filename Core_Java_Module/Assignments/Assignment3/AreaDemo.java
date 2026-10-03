class Shape {
    double area;
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {

    // Triangle
    double calculateArea(Triangle t) {
        return 0.5 * t.base * t.height;
    }

    // Rectangle
    double calculateArea(Rectangle r) {
        return r.length * r.breadth;
    }

    // Circle
    double calculateArea(Circle c) {
        return Math.PI * c.radius * c.radius;
    }
}

public class AreaDemo {
    public static void main(String[] args) {

        Triangle t = new Triangle(10, 5);
        Rectangle r = new Rectangle(10, 6);
        Circle c = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Triangle Area: " + calculator.calculateArea(t));

        System.out.println("Rectangle Area: " + calculator.calculateArea(r));

        System.out.println("Circle Area: " + calculator.calculateArea(c));
    }
}