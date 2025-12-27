import java.util.Scanner;

public class Palindrome {
    //  Compare characters from both ends

    static boolean isPalindrome(String str, int i, int j) {

        // base case
         // If pointers are cross each other then string is palindrome
        if (i >= j) {
            return true;
        }

        // If characters at both ends don't match
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }

        /* recursive call
            moves inward from both ends */
        return isPalindrome(str, i + 1, j - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean result = isPalindrome(str, 0, str.length() - 1);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}
