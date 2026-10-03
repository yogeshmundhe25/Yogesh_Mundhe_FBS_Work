class PlacedStudent
{
    int frn;
    String studentName;
    double distanceCovered;
    String companyName;
    String designation;

    // Constructor
    PlacedStudent(int frn, String studentName, double distanceCovered,
                  String companyName, String designation)
    {
        this.frn = frn;
        this.studentName = studentName;
        this.distanceCovered = distanceCovered;
        this.companyName = companyName;
        this.designation = designation;
    }

    // Setter methods
    void setFrn(int frn)
    {
        this.frn = frn;
    }

    void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    void setDistanceCovered(double distanceCovered)
    {
        this.distanceCovered = distanceCovered;
    }

    void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    void setDesignation(String designation)
    {
        this.designation = designation;
    }

    // Getter methods
    int getFrn()
    {
        return frn;
    }

    String getStudentName()
    {
        return studentName;
    }

    double getDistanceCovered()
    {
        return distanceCovered;
    }

    String getCompanyName()
    {
        return companyName;
    }

    String getDesignation()
    {
        return designation;
    }

    // Display method
    void display()
    {
        System.out.println("FRN              : " + frn);
        System.out.println("Student Name     : " + studentName);
        System.out.println("Distance Covered : " + distanceCovered);
        System.out.println("Company Name     : " + companyName);
        System.out.println("Designation      : " + designation);
    }
}

class TestPlaceStudent
{
    public static void main(String args[])
    {
        PlacedStudent s1 = new PlacedStudent(
            101,
            "Rahul",
            25.5,
            "TCS",
            "Software Developer"
        );

        s1.display();

        // Using Setter
        s1.setCompanyName("Infosys");

        // Using Getter
        System.out.println("\nUpdated Company: " + s1.getCompanyName());
    }
}