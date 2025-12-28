// package oops;

// ACCESS MODIFIERS: Keywords that control visibility/accessibility of classes, methods, variables
// WHY USE: 
//   1. Security - Restrict access to sensitive data
//   2. Encapsulation - Control what's exposed to outside world
//   3. Maintainability - Hide internal implementation
// WHEN USE: Always! Choose appropriate access level for each member
// ============================================================
// 4 TYPES OF ACCESS MODIFIERS
// ============================================================
// 1. PUBLIC    - Accessible everywhere (same class, package, subclass, outside package)
// 2. PROTECTED - Accessible in same package + subclasses in other packages
// 3. DEFAULT   - Accessible only in same package (no keyword)
// 4. PRIVATE   - Accessible only within same class

class AccessDemo {
    
    // PUBLIC: Accessible from anywhere
    public String publicVar = "Public - Accessible everywhere";
    
    // PROTECTED: Accessible in same package + child classes in other packages
    protected String protectedVar = "Protected - Same package + subclasses";
    
    // DEFAULT (no keyword): Accessible only in same package
    String defaultVar = "Default - Same package only";
    
    // PRIVATE: Accessible only in this class
    private String privateVar = "Private - Only in this class";

    // PUBLIC METHOD: Can be called from anywhere
    public void publicMethod() {
        System.out.println("Public method - accessible everywhere");
        // Can access all variables here (same class)
        System.out.println(privateVar);
    }

    // PROTECTED METHOD: Accessible in same package + subclasses
    protected void protectedMethod() {
        System.out.println("Protected method - same package + subclass");
    }

    // DEFAULT METHOD: Accessible in same package
    void defaultMethod() {
        System.out.println("Default method - same package");
    }

    // PRIVATE METHOD: Accessible only in this class
    private void privateMethod() {
        System.out.println("Private method - only in this class");
    }

    // Public method to access private method
    public void callPrivateMethod() {
        privateMethod(); // OK - same class
    }
}

// Child class in SAME PACKAGE
class ChildInSamePackage extends AccessDemo {
    void testAccess() {
        System.out.println("\n=== CHILD CLASS IN SAME PACKAGE ===");
        
        System.out.println(publicVar);      // ✓ Accessible
        System.out.println(protectedVar);   // ✓ Accessible (parent + same package)
        System.out.println(defaultVar);     // ✓ Accessible (same package)
        // System.out.println(privateVar);  // ✗ NOT accessible (private)
        
        publicMethod();      // ✓ Accessible
        protectedMethod();   // ✓ Accessible
        defaultMethod();     // ✓ Accessible
        // privateMethod();  // ✗ NOT accessible
    }
}

// Unrelated class in SAME PACKAGE
class UnrelatedInSamePackage {
    void testAccess() {
        AccessDemo obj = new AccessDemo();
        System.out.println("\n=== UNRELATED CLASS IN SAME PACKAGE ===");
        
        System.out.println(obj.publicVar);      // ✓ Accessible
        System.out.println(obj.protectedVar);   // ✓ Accessible (same package)
        System.out.println(obj.defaultVar);     // ✓ Accessible (same package)
        // System.out.println(obj.privateVar);  // ✗ NOT accessible
        
        obj.publicMethod();      // ✓ Accessible
        obj.protectedMethod();   // ✓ Accessible (same package)
        obj.defaultMethod();     // ✓ Accessible (same package)
        // obj.privateMethod();  // ✗ NOT accessible
    }
}

// ============================================================
// PRACTICAL USE CASES
// ============================================================
class BankAccount {
    // PRIVATE: Sensitive data - no direct access
    private double balance;
    private String accountNumber;

    // PUBLIC: Constructor - needs to be accessible
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // PUBLIC: Methods to interact with account
    public void deposit(double amount) {
        if (validateAmount(amount)) { // Private method for validation
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (validateAmount(amount) && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // PUBLIC: Safe read access
    public double getBalance() {
        return balance;
    }

    // PRIVATE: Internal validation - users don't need to know
    private boolean validateAmount(double amount) {
        return amount > 0;
    }
}

// ============================================================
// SUMMARY TABLE
// ============================================================
// Modifier    | Same Class | Same Package | Subclass | Outside Package
// ------------|------------|--------------|----------|----------------
// PUBLIC      |     ✓      |      ✓       |    ✓     |       ✓
// PROTECTED   |     ✓      |      ✓       |    ✓     |       ✗
// DEFAULT     |     ✓      |      ✓       |    ✗     |       ✗
// PRIVATE     |     ✓      |      ✗       |    ✗     |       ✗

public class accessModifiers {

    public static void main(String[] args) {
        System.out.println("=== SAME CLASS ACCESS ===");
        AccessDemo demo = new AccessDemo();
        
        // From same class - all accessible
        System.out.println(demo.publicVar);
        System.out.println(demo.protectedVar);
        System.out.println(demo.defaultVar);
        // System.out.println(demo.privateVar); // ✗ NOT accessible even here
        
        demo.publicMethod();
        demo.protectedMethod();
        demo.defaultMethod();
        demo.callPrivateMethod(); // Indirect access to private method

        // Test child class
        ChildInSamePackage child = new ChildInSamePackage();
        child.testAccess();

        // Test unrelated class
        UnrelatedInSamePackage unrelated = new UnrelatedInSamePackage();
        unrelated.testAccess();

        System.out.println("\n=== PRACTICAL EXAMPLE: BANK ACCOUNT ===");
        BankAccount account = new BankAccount("12345", 1000);
        
        // account.balance = 50000; // ✗ Cannot access - private!
        // account.validateAmount(100); // ✗ Cannot access - private method!
        
        account.deposit(500);     // ✓ Public method
        account.withdraw(200);    // ✓ Public method
        System.out.println("Balance: " + account.getBalance()); // ✓ Controlled access
        
        // BENEFIT: Internal implementation hidden, only safe operations exposed
    }
}
