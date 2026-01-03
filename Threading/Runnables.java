package Threading;

/**
 * Runnables Notes for Beginners:
 * - What it is: Runnable is an interface in Java used to create threads by
 * implementing run() method, allowing better flexibility than extending Thread.
 * - When to use: Use Runnable when your class already extends another class, or
 * for better design (composition over inheritance).
 * - Why use: It separates the task (Runnable) from the thread execution,
 * allowing reuse and avoiding single inheritance limits.
 * - Other things: Implement Runnable and pass to Thread constructor. Still need
 * synchronization for shared data. Good for functional programming.
 */
class Runnable1 implements Runnable {
    public void run() {
        // This method defines the task to run in the thread
        while (true) {
            System.out.println("Runnable 1 running....");
            // Infinite loop to keep printing
        }
    }
}

class Runnable2 implements Runnable {
    public void run() {
        // This method defines the task to run in the thread
        while (true) {
            System.out.println("Runnable 2 running....");
            // Infinite loop to keep printing
        }
    }
}

public class Runnables {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable1 r1 = new Runnable1();
        Runnable2 r2 = new Runnable2();

        // Create Thread objects and pass Runnables
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start the threads
        t1.start();
        t2.start();
        // Note: This will run forever; use Ctrl+C to stop
    }
}
