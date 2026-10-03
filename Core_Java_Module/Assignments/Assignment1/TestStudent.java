class Student {
    int frn;
    String studentName;
    double distanceCovered;

    void setFrn(int f) {
        this.frn = f;
    }

    void setStudentName(String s) {
        this.studentName = s;
    }

    void setDistanceCovered(double d) {
        this.distanceCovered = d;
    }

    double getDistanceCovered() {
        return this.distanceCovered;
    }

    void display() {
        System.out.println("FRN is: " + this.frn);
        System.out.println("Student Name is: " + this.studentName);
        System.out.println("Distance Covered is: " + this.distanceCovered);
    }
}

class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setFrn(19);
        s1.setStudentName("Yogesh");
        s1.setDistanceCovered(5);

        Student s2 = new Student();
        s2.setFrn(20);
        s2.setStudentName("Ram");
        s2.setDistanceCovered(6);

        s1.display();
        s2.display();

        if (s1.getDistanceCovered() > s2.getDistanceCovered()) {
            System.out.println("Yogesh covered more distance");
        } else {
            System.out.println("Ram covered more distance");
        }
    }
}
