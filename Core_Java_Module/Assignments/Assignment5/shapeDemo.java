class Shape {

    double area;

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void calculateArea() {
        area = 0.5 * base * height;
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculateArea() {
        area = length * breadth;
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 6);
        Rectangle rectangle = new Rectangle(8, 4);

        circle.calculateArea();
        triangle.calculateArea();
        rectangle.calculateArea();

        System.out.println("----- Circle -----");
        circle.displayArea();

        System.out.println("\n----- Triangle -----");
        triangle.displayArea();

        System.out.println("\n----- Rectangle -----");
        rectangle.displayArea();
    }
}