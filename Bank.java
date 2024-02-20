import java.util.*;

public class Bank {
    private Map<String, Customer> customers;

    public Bank() {
        customers = new HashMap<>();
    }

    public Customer createAccount(String name) {
        String accountId = UUID.randomUUID().toString();
        BankAccount newAccount = new BankAccount(accountId);
        Customer newCustomer = new Customer(name, newAccount);
        customers.put(accountId, newCustomer);
        System.out.println("Account created successfully for " + name + " with Account ID: " + accountId);
        return newCustomer;
    }

    public void deposit(String accountId, double amount) {
        Customer customer = customers.get(accountId);
        if (customer != null) {
            customer.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(String accountId, double amount) {
        Customer customer = customers.get(accountId);
        if (customer != null) {
            customer.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void checkBalance(String accountId) {
        Customer customer = customers.get(accountId);
        if (customer != null) {
            System.out.println("The balance for account ID " + accountId + " is " + customer.checkBalance());
        } else {
            System.out.println("Account not found");
        }
    }

}
