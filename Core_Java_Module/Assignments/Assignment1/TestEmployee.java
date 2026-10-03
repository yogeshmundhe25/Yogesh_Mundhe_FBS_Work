class Employee
{
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Setter methods
    void setId(int id)
    {
        this.id = id;
    }

    void setName(String name)
    {
        this.name = name;
    }

    void setSalary(double salary)
    {
        this.salary = salary;
    }

    // Getter methods
    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    double getSalary()
    {
        return salary;
    }

    // Display method
    void display()
    {
        System.out.println("Employee ID : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }
}

class TestEmployee
{
    public static void main(String args[])
    {
        Employee e1 = new Employee(101, "Yogesh", 50000);

        e1.display();

        // Setter
        e1.setSalary(60000);

        // Getter
        System.out.println("\nUpdated Salary: " + e1.getSalary());
    }
}