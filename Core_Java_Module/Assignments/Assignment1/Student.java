import java.util.Scanner;

class Students {
    int frn;
    String studentName;
    double distanceCovered;

    void display() {
        System.out.println("FRN is: " + frn);
        System.out.println("Student Name is: " + studentName);
        System.out.println("Distance Covered is: " + distanceCovered);
    }
}

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello Java!!");

        // Create object of Students class
        Students s1 = new Students();

        // Take input from user
        System.out.print("Enter FRN: ");
        s1.frn = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        s1.studentName = sc.nextLine();

        System.out.print("Enter Distance Covered: ");
        s1.distanceCovered = sc.nextDouble();

        // Display details
        System.out.println("\n--- Student Details ---");
        s1.display();

        sc.close();
    }
}
