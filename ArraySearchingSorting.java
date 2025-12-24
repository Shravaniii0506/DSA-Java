import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchingSorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {30, 10, 50, 20, 40};        // Declare and initialize array

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 


        /* --------- LINEAR SEARCH ---------- */

        // Takes element for searching using linear search
        System.out.print("Enter element to search (Linear Search): ");
        int linearKey = sc.nextInt();

        boolean found = false;

        // it checks each element one by one
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == linearKey) {
                System.out.println("Linear Search: Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Linear Search: Element not found");
        }

        /* --------- SORTING --------- */

        // Sorts array before applying binary search
        Arrays.sort(arr);

        
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        /* --------- BINARY SEARCH --------- */

        // Takes element for searching using binary search
        System.out.print("Enter element to search (Binary Search): ");
        int binaryKey = sc.nextInt();

        // Binary search works only on sorted array
        int result = Arrays.binarySearch(arr, binaryKey);

        // Checking binary search result
        if (result >= 0) {
            System.out.println("Binary Search: Element found at index " + result);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }
}
