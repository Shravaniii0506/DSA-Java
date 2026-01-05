public class FirstOccurence {
    
    // this function finds the FIRST occurrence of element x using binary search
    static int firstOcc(int[] a, int x){
        
        int n = a.length;        // length of array
        int st = 0;              // starting index
        int end = n - 1;         // ending index
        int fo = -1;             // stores first occurrence index

        // binary search loop
        while(st <= end){
            
            // calculates mid index
            int mid = st + (end - st) / 2;

            // if element found at mid
            if(a[mid] == x){
                fo = mid;        // store index as possible answer
                end = mid - 1;   // move left to find earlier or first occurrence
            }

            // if target is smaller then search left half
            else if(x < a[mid]){
                end = mid - 1;
            }

            // if target is greater then search right half
            else {
                st = mid + 1;
            }
        }

        // return first occurrence index, or -1 if not found
        return fo;
    }

    public static void main(String[] args) {
        
        int[] a = {1, 2, 4, 5, 5, 5, 6};

        // target element
 //        int x = 5;     // Output: 1
        int x = 15;      // Output: -1

        // function call and result print
        System.out.println(firstOcc(a, x));
    }
}
