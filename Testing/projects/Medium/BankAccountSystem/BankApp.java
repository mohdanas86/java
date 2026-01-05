package Testing.projects.Medium.BankAccountSystem;

// Main application demonstrating polymorphism and inheritance
public class BankApp {
    public static void main(String[] args) {
        // Upcasting: Account reference pointing to SavingsAccount object
        // Why use Account acc = new SavingsAccount(): Allows treating subclass as
        // superclass,
        // enables runtime polymorphism where the actual method called depends on the
        // object type at runtime
        Account acc1 = new SavingAccount(10000);
        Account acc2 = new CurrentAccount(5000);

        // Runtime polymorphism: Method behavior determined at runtime based on actual
        // object type
        // Runtime polymorphism: The ability of a method to behave differently based on
        // the object
        // that invokes it at runtime, achieved through method overriding and upcasting
        acc1.displayBalance();
        acc1.withdraw(3000);
        acc1.displayBalance();

        System.out.println();

        acc2.displayBalance();
        acc2.withdraw(9000);
        acc2.displayBalance();
        acc2.withdraw(4000);
        acc2.displayBalance();
    }
}