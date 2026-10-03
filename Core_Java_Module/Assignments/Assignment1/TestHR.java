class HR
{
    int id;
    String name;
    double salary;
    double commission;

    // Constructor
    HR(int id, String name, double salary, double commission)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
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

    void setCommission(double commission)
    {
        this.commission = commission;
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

    double getCommission()
    {
        return commission;
    }

    // Display method
    void display()
    {
        System.out.println("HR ID        : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Salary       : " + salary);
        System.out.println("Commission   : " + commission);
    }
}

class TestHR
{
    public static void main(String args[])
    {
        HR h1 = new HR(101, "Priya", 60000, 10000);

        h1.display();

        // Setter
        h1.setCommission(15000);

        // Getter
        System.out.println("\nUpdated Commission: " + h1.getCommission());
    }
}