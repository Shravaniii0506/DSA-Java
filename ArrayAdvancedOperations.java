import java.util.Scanner;

public class ArrayAdvancedOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array A: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];   // Declares first array

        System.out.print("Enter elements of Array A: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("\nEnter size of Array B: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];   // Declares second array

        System.out.print("Enter elements of Array B: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int choice;
        int[] c = null; // This array will store merged result

        do {
            System.out.println("\n------ ARRAY ADVANCED OPERATIONS ------");
            System.out.println("1. Merge Arrays");
            System.out.println("2. Reverse Merged Array");
            System.out.println("3. Find Sum of Merged Array");
            System.out.println("4. Find Average of Merged Array");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Merging both arrays into one
                    c = new int[n1 + n2];
                    int k = 0;

                    for (int i = 0; i < n1; i++) {    // Copying elements of array A
                        c[k++] = a[i];
                    }

                    for (int i = 0; i < n2; i++) {    // Copying elements of array B
                        c[k++] = b[i];
                    }

                    System.out.print("Merged Array: ");  // Prints merged array
                    for (int i = 0; i < c.length; i++) {
                        System.out.print(c[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:   // Reversing merged array
                    if (c == null) {
                        System.out.println("Please merge arrays first!");
                    } else {
                        System.out.print("Reversed Array: ");
                        for (int i = c.length - 1; i >= 0; i--) {
                            System.out.print(c[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:   // Finds sum of merged array
                    if (c == null) {
                        System.out.println("Please merge arrays first!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < c.length; i++) {
                            sum += c[i];
                        }
                        System.out.println("Sum = " + sum);
                    }
                    break;

                case 4:  // Finds average of merged array
                    if (c == null) {
                        System.out.println("Please merge arrays first!");
                    } else {
                        int sum = 0;
                        for (int i = 0; i < c.length; i++) {
                            sum += c[i];
                        }
                        System.out.println("Average = " + (sum / (double) c.length));
                    }
                    break;

                case 0:  // for program existing
                    System.out.println("Exiting program...");
                    break;

                default:  // If user enters wrong choice
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0); //is used to repeat operations until the user chooses 0 to exit the program.
    }
}
