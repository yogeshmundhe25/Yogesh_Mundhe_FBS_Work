class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs." + salary);
    }
}

class Admin extends Employee {

    double allowance;

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void displayAdmin() {
        displayEmployee();
        System.out.println("Allowance: Rs." + allowance);
    }
}

class SalesManager extends Employee {

    double incentive;
    int target;

    SalesManager(int id, String name, double salary,
                 double incentive, int target) {

        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void displaySalesManager() {
        displayEmployee();
        System.out.println("Incentive: Rs." + incentive);
        System.out.println("Target: " + target);
    }
}

class HR extends Employee {

    double commission;

    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    void displayHR() {
        displayEmployee();
        System.out.println("Commission: Rs." + commission);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Admin admin = new Admin(
                101, "Rahul", 30000, 5000);

        SalesManager salesManager = new SalesManager(
                102, "Amit", 40000, 8000, 100);

        HR hr = new HR(
                103, "Priya", 35000, 6000);

        System.out.println("----- Admin -----");
        admin.displayAdmin();

        System.out.println("\n----- Sales Manager -----");
        salesManager.displaySalesManager();

        System.out.println("\n----- HR -----");
        hr.displayHR();
    }
}