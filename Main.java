public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = bank.createAccount("Alice");
        Customer customer2 = bank.createAccount("Bob");

        bank.deposit(customer1.getAccountId(), 1000);
        bank.withdraw(customer1.getAccountId(), 500);
        bank.checkBalance(customer1.getAccountId());

        bank.deposit(customer2.getAccountId(), 2000);
        bank.withdraw(customer2.getAccountId(), 1500);
        bank.checkBalance(customer2.getAccountId());
    }
}