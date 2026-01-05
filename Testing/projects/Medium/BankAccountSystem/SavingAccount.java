package Testing.projects.Medium.BankAccountSystem;

// SavingsAccount class extends Account - demonstrates inheritance
public class SavingAccount extends Account {
    // Constructor calls superclass constructor
    public SavingAccount(double balance) {
        super(balance);
    }

    // Method overriding: Subclass provides specific implementation of withdraw
    // What is method overriding: When a subclass redefines a method from its
    // superclass
    // with the same signature to provide specific behavior
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            super.withdraw(amount);
        }
    }
}