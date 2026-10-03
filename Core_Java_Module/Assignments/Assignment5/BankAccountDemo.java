class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: Rs." + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    SavingsAccount(int accountNumber, String holderName,
                   double balance, double interestRate) {

        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    void displaySavings() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {

    double overdraftLimit;

    CurrentAccount(int accountNumber, String holderName,
                   double balance, double overdraftLimit) {

        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayCurrent() {
        displayAccount();
        System.out.println("Overdraft Limit: Rs." + overdraftLimit);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(101, "Rahul", 50000, 6.5);

        CurrentAccount current =
                new CurrentAccount(102, "Amit", 80000, 25000);

        System.out.println("----- Savings Account -----");
        savings.displaySavings();

        System.out.println("\n----- Current Account -----");
        current.displayCurrent();
    }
}