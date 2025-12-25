class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative. Balance not updated.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("----------------------------");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("A1001", "Ashik", 500.0);
        BankAccount account2 = new BankAccount("A1002", "Arman", 1000.0);
        BankAccount account3 = new BankAccount("A1003", "Ziku", 750.0);

        account1.setBalance(600.0);
        account2.setBalance(-200.0);
        account3.setBalance(900.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();
    }
}
