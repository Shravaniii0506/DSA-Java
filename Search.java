public class Search {

    // This function prints all indices where the target is found
    static void searchAll(int[] arr, int index, int target) {

        if (index == arr.length) {  // Base case- if index goes out of array
            return;
        }

        if (arr[index] == target) {  // If current element matches the target then print index
            System.out.println(index);
        }

        searchAll(arr, index + 1, target);  // Recursive call for checking next index
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;

        searchAll(arr, 0, target);
    }
}
