import java.util.Scanner;

public class ArrayInsertDelete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];     // Declaring array with spaces

        int size = 5;                // Initial size of array

        // Taking initial array elements
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing original array
        System.out.print("Original Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


        /* --------- INSERT OPERATION -------- */

        // Taking position and value to insert
        System.out.print("\nEnter position to insert: ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        for (int i = size; i > pos; i--) {     // Shifting elements to the right
            arr[i] = arr[i - 1];
        }

        // Inserting new value
        arr[pos] = value;
        size++;

        // Printing array after insertion
        System.out.print("Array after insertion: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }


        /* ------- DELETE OPERATION -------- */

        // Taking position to delete
        System.out.print("\nEnter position to delete: ");
        int del = sc.nextInt();

        // Shifting elements to the left
        for (int i = del; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.print("Array after deletion: ");    // Printing array after deletion
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
