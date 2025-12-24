import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");   
        int n = sc.nextInt();

        int[] arr = new int[n];       // Declaring array of given size

        // Taking array elements as input
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prints original array
        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Updating an element at a specific index
        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        arr[index] = sc.nextInt();

        // Prints an array after update
        System.out.print("Updated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Finds minimum and maximum element in array
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Prints minimum and maximum values
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
