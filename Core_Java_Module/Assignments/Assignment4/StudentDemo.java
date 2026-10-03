class Student {

    // Static members
    static String collegeName = "ABC College";
    static int studentCount = 0;

    // Non-static members
    String studentName;
    int rollNumber;

    // Default constructor
    Student() {
        studentName = "Unknown";
        rollNumber = 0;
        studentCount++;
    }

    // Parameterized constructor
    Student(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        studentCount++;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College Name: " + collegeName);
        System.out.println("-------------------------");
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 101);
        Student s2 = new Student("Amit", 102);
        Student s3 = new Student("Priya", 103);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total Students: " + Student.studentCount);
    }
}