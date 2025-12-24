import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements: ");  // Takes elements of array from user
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");  // for how many times array should rotate
        int r = sc.nextInt();

        // for left rotation
        // Each time first element goes to last position
        for (int i = 0; i < r; i++) {

            int temp = arr[0];   // Store first element temporarily

            // Shift all elements to the left by one position
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[n - 1] = temp;   // Put first element at last position
        }

        // Prints array after rotation
        System.out.print("Array after left rotation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
