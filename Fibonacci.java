import java.util.Scanner;

class Fibonacci {

    /* This recursive function returns the nth Fibonacci number
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-1) + fib(n-2) */
    static int fibonacci(int n) {

        // base case is that If n is 0 or 1, then recursion stops and the value of n is returned directly
        if (n <= 1) {
            return n;
        }

        /* recursive call is that The function calls itself twice:
           1. fibonacci(n - 1)
           2. fibonacci(n - 2)
          These calls breaks the problem into smaller sub-problems until the base case is reached */
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        /* Function call starts here
          if n = 4:
          fibonacci(4)
            fibonacci(3) + fibonacci(2)
              fibonacci(2) + fibonacci(1)
                fibonacci(1) + fibonacci(0)
          Once base cases are reached, values start returning back to the caller */
        int result = fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);

        sc.close();
    }
}
