class Employee {

    // Static variable - common for all employees
    static double bonusRate = 10.0;

    // Non-static variables - employee specific
    String employeeName;
    double basicSalary;

    Employee(String employeeName, double basicSalary) {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Static method to update common bonus rate
    static void updateBonusRate(double newRate) {
        bonusRate = newRate;
    }

    // Non-static method to calculate total salary
    double calculateSalary() {
        return basicSalary + (basicSalary * bonusRate / 100);
    }

    void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Bonus Rate: " + bonusRate + "%");
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 30000);
        Employee e2 = new Employee("Amit", 40000);

        System.out.println("Before Bonus Rate Update");

        e1.display();

        System.out.println();

        e2.display();

        // Update common bonus rate
        Employee.updateBonusRate(15.0);

        System.out.println("\nAfter Bonus Rate Update");

        e1.display();

        System.out.println();

        e2.display();
    }
}