import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Condition for matrix multiplication is that
        // Number of columns of first matrix must be equal to number of rows of second matrix
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        // Declaring matrices
        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {          // i represents row of first matrix
            for (int j = 0; j < c1; j++) {      // j represents column of first matrix
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {          // i represents row of second matrix
            for (int j = 0; j < c2; j++) {      // j represents column of second matrix
                b[i][j] = sc.nextInt();
            }
        }

        // Printing first matrix (before multiplication)
        System.out.println("\nFirst Matrix:");
        for (int i = 0; i < r1; i++) {          // Loop for rows
            for (int j = 0; j < c1; j++) {      // Loop for columns
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Printing second matrix (before multiplication)
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < r2; i++) { 
            for (int j = 0; j < c2; j++) {      
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        /* -------- MATRIX MULTIPLICATION LOGIC -------- */

        // i is row of result matrix
        for (int i = 0; i < r1; i++) {

            // j is column of result matrix
            for (int j = 0; j < c2; j++) {

                // k is for multiplying row of first matrix with column of second matrix
                for (int k = 0; k < c1; k++) {

                    // Multiply and add values
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Printing result matrix (after multiplication)
        System.out.println("\nResultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
