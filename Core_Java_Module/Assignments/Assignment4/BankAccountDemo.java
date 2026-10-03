class BankAccount {

    // Static member - common for all accounts
    static double interestRate = 5.0;

    // Non-static members - different for each account
    String accountHolder;
    int accountNumber;
    double balance;

    // Default constructor
    BankAccount() {
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 0.0;
    }

    // Parameterized constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Non-static method
    double calculateInterest() {
        return balance * interestRate / 100;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: Rs." + calculateInterest());
        System.out.println("-------------------------");
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Rahul", 101, 30000);

        BankAccount account2 =
                new BankAccount("Amit", 102, 50000);

        account1.display();
        account2.display();
    }
}