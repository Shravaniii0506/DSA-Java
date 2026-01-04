public class RotatedSortedArray {

    // This function searches target element in a rotated sorted array
    // and this array may contains DUPLICATE elements
    static int search_(int[] a, int target){
        
        int st = 0;                 // starting index
        int end = a.length - 1;     // ending index

        // binary search loop
        while(st <= end){
            
            int mid = st + (end - st) / 2;     // find mid index safely

            // if mid element is the target, return its index
            if(a[mid] == target){
                return mid;
            }

            /* if start, mid and end elements are same, we cannot decide which part is sorted
             So, we shrink the search space from both sides */
            else if(a[st] == a[mid] && a[end] == a[mid]){
                st++;      // move start forward
                end--;     // move end backward
            }

            // if mid to end is sorted (right half is sorted)
            else if (a[mid] < a[end]){
                
                // check if target lies in right sorted part
                if(target > a[mid] && target <= a[end]){
                    st = mid + 1;    // search in right half
                } 
                else {
                    end = mid - 1;   // search in left half
                }
            }

            // else start to mid is sorted (left half is sorted)
            else {
                
                // check if target lies in left sorted part
                if(target >= a[st] && target < a[mid]){
                    end = mid - 1;   // search in left half
                } 
                else {
                    st = mid + 1;    // search in right half
                }
            }
        }

        // if target not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 1, 2, 2, 3, 1};
        int target = 12;

        // function call
        System.out.println(search_(a, target));    // output: -1
    }
}
