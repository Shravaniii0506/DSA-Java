import java.util.Scanner;

class Factorial {

    // Recursive function to calculate factorial
    static int factorial(int n) {
        if (n == 0) return 1;           // base case
        return n * factorial(n - 1);    // recursive relation
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = factorial(n);  // Calling recursive function

        // Printing result
        System.out.println("Factorial of " + n + " is: " + result);

        sc.close();
    }
}
