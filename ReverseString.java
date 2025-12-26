import java.util.Scanner;

public class ReverseString {
    // Break the string into smaller substrings and use recursion to reverse it

    static String reverse(String str) {

        // base case
         // If the string is empty, return it and stops recursive call
        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        /* Initial function call
            all recursive calls start from here */
        String reversed = reverse(str);

        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
