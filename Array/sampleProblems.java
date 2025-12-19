
public class sampleProblems {

    public static void FibonacciExample(int n) {
        int first = 0, sec = 1;
        System.out.printf("fabonaci series : %d %d", first, sec);

        for (int i = 2; i < n; i++) {
            int next = first + sec;
            System.err.print(" " + next);
            first = sec;
            sec = next;
        }
    }

    // factorial 
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // prime number
    public static void primeCheck(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.printf("\n%d this is a prime number", n);
        } else {
            System.out.printf("\n%d this is not a prime number", n);
        }
    }

    public static void main(String[] args) {
        int n = 5;

        FibonacciExample(n);

        int factorialTotal = factorial(n);
        System.out.printf("\nFactoal of %d : %d", n, factorialTotal);

        primeCheck(1);
        primeCheck(2);
        primeCheck(3);
        primeCheck(4);
        primeCheck(n);

    }
}
