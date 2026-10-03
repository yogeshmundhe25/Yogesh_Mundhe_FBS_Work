class Admin
{
    int id;
    String name;
    double salary;
    double allowance;

    // Default Constructor
    Admin()
    {
        id = 100;
        name = "Ajay";
        salary = 40000;
        allowance = 5000;
    }

    // Parameterized Constructor
    Admin(int id, String name, double salary, double allowance)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
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

    void setAllowance(double allowance)
    {
        this.allowance = allowance;
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

    double getAllowance()
    {
        return allowance;
    }

    // Display method
    void display()
    {
        System.out.println("ID        : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Salary    : " + salary);
        System.out.println("Allowance : " + allowance);
    }
}

class TestAdmin
{
    public static void main(String args[])
    {
        // Default Constructor
        Admin a1 = new Admin();

        System.out.println("Default Constructor:");
        a1.display();

        System.out.println();

        // Parameterized Constructor
        Admin a2 = new Admin(101, "Rahul", 50000, 8000);

        System.out.println("Parameterized Constructor:");
        a2.display();
    }
}