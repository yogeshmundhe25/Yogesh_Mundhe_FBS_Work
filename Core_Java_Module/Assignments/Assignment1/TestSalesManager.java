class SalesManager
{
    int id;
    String name;
    double salary;
    double incentive;
    double target;

    // Default Constructor
    SalesManager()
    {
        id = 102;
        name = "Sujit";
        salary = 55000;
        incentive = 12000;
        target = 70000;
    }

    // Parameterized Constructor
    SalesManager(int id, String name, double salary, double incentive, double target)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
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

    void setIncentive(double incentive)
    {
        this.incentive = incentive;
    }

    void setTarget(double target)
    {
        this.target = target;
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

    double getIncentive()
    {
        return incentive;
    }

    double getTarget()
    {
        return target;
    }

    // Display method
    void display()
    {
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
        System.out.println("Incentive   : " + incentive);
        System.out.println("Target     : " + target);
    }
}

class TestSalesManager
{
    public static void main(String args[])
    {
        // Using Default Constructor
        SalesManager s1 = new SalesManager();

        s1.display();

        System.out.println();

        // Using Parameterized Constructor
        SalesManager s2 = new SalesManager(
            101,
            "Rahul",
            50000,
            10000,
            100000
        );

        s2.display();
    }
}