import java.util.Scanner;

public class PrintIncreasingDecreasing {

    // static void printIncreasing(int n){    // 1, 2, ..... n-1,n
            // base Case
    //     // if(n == 1){                      // if we comment this if block then our code is run infinite times(infinite recursion)
    //     //     System.out.println(n);       // this block is a base case
    //     //     return;
    //     // }

            // recursive work
    //     printIncreasing(n - 1);     // 1, 2, ..... n-1       // Smaller Subproblem

            // self work
    //     System.out.println(n);              // SelfWork 
    // }

    static void printDecreasing(int n){
        // base Case
        if(n == 1){
            System.out.println(1);
            return;
        }

        // self work
        System.out.println(n);

        // recursive work
        printDecreasing(n-1);      // n-1, n-2, ........... 1
    }    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    //    printIncreasing(n);
        printDecreasing(n);
    }
}
