public class BinarySearch {

    // this function returns true if target element is present otherwise false
    static boolean binarySearch(int[] a, int target){

        int n = a.length;

        // start index and end index of the array (0-based indexing)
        int st = 0, end = n - 1;

        while(st <= end){

            int mid = (st + end) / 2;  // calculate middle index of current range

            // if middle element is equal to target then returns true
            if(target == a[mid]){
                return true;
            }

            // if target is smaller than middle element then search in left part of array
            else if(target < a[mid]){
                end = mid - 1;
            }

            // if target is greater than middle element then search in right part of array
            else{
                st = mid + 1;
            }
        }
        return false;  // if loop ends target is not present in array
    }

    public static void main(String[] args) {

        // sorted array (binary search works only on sorted array)
        int[] a = {1, 2, 3, 4, 5};

        int target = 0;

        // checking values from 0 to 9
        while(target != 10){

            // prints the result of binary search
            System.out.printf(
                "%d exists in arr: %b\n",
                target,
                binarySearch(a, target)
            );

            target++;
        }
    }
}
