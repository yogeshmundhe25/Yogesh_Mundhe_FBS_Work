class BankAccount
{
    long accountNumber;
    String holderName;
    double currentBalance;
    double interestRate;

    // Default Constructor
    BankAccount()
    {
        accountNumber = 1234567890;
        holderName = "Ram";
        currentBalance = 500000;
        interestRate = 8;
    }

    // Parameterized Constructor
    BankAccount(long accountNumber, String holderName,
                double currentBalance, double interestRate)
    {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    // Setter methods
    void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    void setHolderName(String holderName)
    {
        this.holderName = holderName;
    }

    void setCurrentBalance(double currentBalance)
    {
        this.currentBalance = currentBalance;
    }

    void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    // Getter methods
    long getAccountNumber()
    {
        return accountNumber;
    }

    String getHolderName()
    {
        return holderName;
    }

    double getCurrentBalance()
    {
        return currentBalance;
    }

    double getInterestRate()
    {
        return interestRate;
    }

    // Display method
    void display()
    {
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Holder Name     : " + holderName);
        System.out.println("Current Balance : " + currentBalance);
        System.out.println("Interest Rate   : " + interestRate + "%");
    }
}

class TestBankAccount
{
    public static void main(String args[])
    {
        // Default Constructor
        BankAccount b1 = new BankAccount();

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println();

        // Parameterized Constructor
        BankAccount b2 = new BankAccount(
            1234567890L,
            "Rahul",
            50000,
            7.5
        );

        System.out.println("Parameterized Constructor:");
        b2.display();
    }
}