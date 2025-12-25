import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking rows and columns
        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Taking matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Prints original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Printing transpose matrix
        System.out.println("\nTranspose Matrix:");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
