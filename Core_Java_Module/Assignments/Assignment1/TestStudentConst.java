class Student {
    int frn;
    String studentName;
    double distanceCovered;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor called");
        this.frn = 0;
        this.studentName = "Unknown";
        this.distanceCovered = 0.0;
    }

    // Parameterized Constructor
    Student(int frn, String studentName, double distanceCovered) {
        System.out.println("Parameterized Constructor called");
        this.frn = frn;
        this.studentName = studentName;
        this.distanceCovered = distanceCovered;
    }

    void display() {
        System.out.println("FRN is: " + this.frn);
        System.out.println("Student Name is: " + this.studentName);
        System.out.println("Distance Covered is: " + this.distanceCovered);
    }
}
class TestStudentConst{
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student(19, "Yogesh", 5.0);
        s2.display();

        Student s3 = new Student(20, "Ram", 6.0);
        s3.display();

        // Comparison
        if (s2.distanceCovered > s3.distanceCovered) {
            System.out.println(s2.studentName + " covered more distance");
        } else {
            System.out.println(s3.studentName + " covered more distance");
        }
    }
}
