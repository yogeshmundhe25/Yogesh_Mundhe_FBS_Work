class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Manager extends Employee {

    int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeTypeDemo {

    public static void main(String[] args) {

        Developer developer =
                new Developer("Rahul", 101, "Java");

        Manager manager =
                new Manager("Amit", 102, 8);

        System.out.println("----- Developer -----");
        developer.displayDeveloper();

        System.out.println("\n----- Manager -----");
        manager.displayManager();
    }
}