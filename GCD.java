// Program: Find GCD of two numbers using Euclidean Algorithm and Iterative Method
// GCD (Greatest Common Divisor) is the largest number that divides both numbers without leaving a remainder

import java.util.Scanner;

public class GCD {

    /* recursion method
     Euclidean Algorithm :
       gcd(x, y) = gcd(y, x % y)
      The algorithm keeps replacing the larger number with the remainder until the remainder is 0 */
    static int gcd(int x, int y) {

        // base case
         // When y becomes 0, recursion stops and at this point, x is the GCD
        if (y == 0) {
            return x;
        }

        /* recursive call
          The function calls itself with:
            y is the first argument
            x % y is the second argument
          Each call reduces the problem size */
        return gcd(y, x % y);
    }

    /* Iterative method
       This method also performs the same Euclidean algorithm but without recursion (using a loop) */
    static int iGCD(int x, int y) {

        /* Loop continues until remainder becomes 0
          When x % y == 0, y is the GCD */
        while (x % y != 0) {

            int rem = x % y;

            /* Assign current y to x
               Assign remainder to y */
            x = y;
            y = rem;
        }

        return y; // When loop ends, y contains the GCD
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.println("GCD is: " + iGCD(x, y)); // calls iterative gcd

        // System.out.println("GCD is: " + gcd(x, y)); // for recursive

        sc.close();
    }
}
