package Advance.Threading;

/**
 * Threads Notes for Beginners:
 * - What it is: Threads in Java allow a program to run multiple tasks at the
 * same time by creating separate execution paths.
 * - When to use: Use threads when you need to perform tasks concurrently, like
 * handling user input while processing data.
 * - Why use: They improve performance for I/O operations or parallel tasks,
 * making apps more responsive.
 * - Other things: Threads share memory, so be careful with synchronization. Use
 * Thread class by extending it and overriding run(). Infinite loops can cause
 * issues.
 */
class Thread1 extends Thread {
    @Override
    public void run() {
        // This method runs when the thread starts
        while (true) {
            System.out.println("Thread 1...");
            // Infinite loop to keep printing
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        // This method runs when the thread starts
        while (true) {
            System.out.println("Thread 2...");
            // Infinite loop to keep printing
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // Create thread objects
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        // Start the threads (calls run() method)
        t1.start();
        t2.start();
        // Note: This will run forever; use Ctrl+C to stop
    }
}
