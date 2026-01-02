package Advance;

/**
 * Annotations Notes for Beginners:
 * - What it is: Annotations in Java are special markers (starting with @) that
 * provide metadata about code, used by compilers, IDEs, or frameworks.
 * - When to use: Use annotations to mark methods for overriding, suppress
 * warnings, configure dependencies, or provide runtime information.
 * - Why use: They enable better code analysis, reduce errors (e.g., @Override
 * prevents typos), and support frameworks like Spring or JUnit.
 * - Other things: Annotations can have parameters, retention policies
 * (source/class/runtime), and can be custom-defined. Common
 * ones: @Override, @Deprecated, @SuppressWarnings.
 */
public class Annotations {

    @Override
    public String toString() {
        // @Override ensures this method overrides a superclass method
        return "Custom toString";
    }

    @Deprecated
    public void oldMethod() {
        // @Deprecated marks this method as outdated, compiler warns when used
        System.out.println("This is deprecated");
    }

    @SuppressWarnings("unchecked")
    public void suppressWarning() {
        // @SuppressWarnings tells compiler to ignore specific warnings
        System.out.println("Warning suppressed");
    }

    public static void main(String[] args) {
        Annotations ann = new Annotations();

        // Demonstrate @Override
        System.out.println("toString with @Override: " + ann.toString());

        // Demonstrate @Deprecated (will show warning in IDE)
        ann.oldMethod();

        // Demonstrate @SuppressWarnings
        ann.suppressWarning();

        // Custom annotation example
        MyAnnotationExample example = new MyAnnotationExample();
        example.display();
    }
}

// Custom annotation definition
@interface MyCustomAnnotation {
    String value() default "default"; // Annotation parameter

    int priority() default 1;
}

// Using custom annotation
@MyCustomAnnotation(value = "example", priority = 5)
class MyAnnotationExample {
    public void display() {
        System.out.println("Method with custom annotation");
    }
}
