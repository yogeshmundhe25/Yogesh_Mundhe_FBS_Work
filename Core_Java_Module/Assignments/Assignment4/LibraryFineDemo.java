class LibraryUser {

    // Static member - same for all users
    static double finePerDay = 5.0;

    // Non-static members - different for each user
    String userName;
    int daysLate;

    // Default constructor
    LibraryUser() {
        userName = "Unknown";
        daysLate = 0;
    }

    // Parameterized constructor
    LibraryUser(String userName, int daysLate) {
        this.userName = userName;
        this.daysLate = daysLate;
    }

    // Non-static method
    double calculateFine() {
        return daysLate * finePerDay;
    }

    void display() {
        System.out.println("User Name: " + userName);
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine Per Day: Rs." + finePerDay);
        System.out.println("Total Fine: Rs." + calculateFine());
        System.out.println("-------------------------");
    }
}

public class LibraryFineDemo {

    public static void main(String[] args) {

        LibraryUser user1 = new LibraryUser("Rahul", 4);
        LibraryUser user2 = new LibraryUser("Amit", 7);

        user1.display();
        user2.display();
    }
}