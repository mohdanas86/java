// INNER CLASSES: Classes defined inside another class
// WHAT ARE THEY: Inner classes are nested classes that provide better encapsulation and organization
// WHY USE:
//   1. Logical grouping - related classes together
//   2. Encapsulation - inner class can access outer class members
//   3. Code organization - keeps related code close
//   4. Anonymous classes - for one-time use implementations
// TYPES: Member, Static Nested, Local, Anonymous

public class innerClass {

    // MEMBER INNER CLASS: Non-static nested class
    // WHAT: Can access outer class members (including private)
    // WHEN USE: When inner class needs to access outer class instance variables
    class MemberInner {
        void display() {
            System.out.println("Member Inner Class: Can access outer class members");
        }
    }

    // STATIC NESTED CLASS: Static nested class
    // WHAT: Cannot access non-static outer class members, but can access static ones
    // WHEN USE: When inner class doesn't need outer class instance variables
    static class StaticNested {
        void display() {
            System.out.println("Static Nested Class: Independent of outer class instance");
        }
    }

    // METHOD WITH LOCAL INNER CLASS: Inner class inside a method
    // WHAT: Defined inside a method, can access method's final/local variables
    // WHEN USE: When inner class is only used within that method
    void demonstrateLocalInner() {
        final int localVar = 10; // Must be final or effectively final

        // LOCAL INNER CLASS: Defined inside method
        class LocalInner {
            void display() {
                System.out.println("Local Inner Class: localVar = " + localVar);
            }
        }

        LocalInner local = new LocalInner();
        local.display();
    }

    // METHOD WITH ANONYMOUS INNER CLASS: Class without name implementing interface
    // WHAT: Creates object of anonymous class implementing interface or extending class
    // WHEN USE: For one-time use, like event handlers or simple implementations
    void demonstrateAnonymousInner() {
        // ANONYMOUS INNER CLASS: Implementing Runnable interface
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Inner Class: Implementing Runnable");
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        innerClass outer = new innerClass();

        // Create member inner class instance
        innerClass.MemberInner member = outer.new MemberInner();
        member.display();

        // Create static nested class instance
        innerClass.StaticNested nested = new innerClass.StaticNested();
        nested.display();

        // Demonstrate local inner class
        outer.demonstrateLocalInner();

        // Demonstrate anonymous inner class
        outer.demonstrateAnonymousInner();
    }
}
