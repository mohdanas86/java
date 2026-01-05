package Testing.projects.Medium.BankAccountSystem;

// Base class for bank accounts
public class Account {
    // Protected field - accessible in same package and subclasses
    // protected vs private: protected allows access within package and subclasses,
    // while private restricts access to the same class only
    protected double balance;

    // Constructor to initialize account with balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money (can be overridden by subclasses)
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw: " + amount);
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}