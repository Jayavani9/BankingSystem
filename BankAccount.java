public class BankAccount {

    private String accountId;
    private double balance;

    public BankAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Heya!!, Deposited successfully !!, Your current balance:" + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal success!!, Your current balance:" + balance);
        } else {
            System.out.println("Please enter a valid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

}