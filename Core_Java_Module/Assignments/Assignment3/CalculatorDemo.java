class Calculator {

    // Addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    // Subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double subtract(int a, double b) {
        return a - b;
    }

    double subtract(double a, int b) {
        return a - b;
    }

    // Multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double multiply(int a, double b) {
        return a * b;
    }

    double multiply(double a, int b) {
        return a * b;
    }

    // Division
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    double divide(int a, double b) {
        return a / b;
    }

    double divide(double a, int b) {
        return a / b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition:");
        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));
        System.out.println(c.add(10, 20.5));
        System.out.println(c.add(10.5, 20));

        System.out.println("\nSubtraction:");
        System.out.println(c.subtract(20, 10));
        System.out.println(c.subtract(20.5, 10.5));
        System.out.println(c.subtract(20, 10.5));
        System.out.println(c.subtract(20.5, 10));

        System.out.println("\nMultiplication:");
        System.out.println(c.multiply(10, 5));
        System.out.println(c.multiply(10.5, 2.0));
        System.out.println(c.multiply(10, 2.5));
        System.out.println(c.multiply(10.5, 2));

        System.out.println("\nDivision:");
        System.out.println(c.divide(20, 5));
        System.out.println(c.divide(20.0, 5.0));
        System.out.println(c.divide(20, 5.0));
        System.out.println(c.divide(20.0, 5));
    }
}