package Testing.projects.Medium.BankAccountSystem;

// CurrentAccount class extends Account - demonstrates inheritance
public class CurrentAccount extends Account {
    // Private field - only accessible within this class
    private double overdraftLimit = 5000;

    // Constructor calls superclass constructor
    public CurrentAccount(double balance) {
        super(balance);
    }

    // Method overriding: Provides overdraft functionality
    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Overdraft limit exceeded!");
        } else {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        }
    }
}