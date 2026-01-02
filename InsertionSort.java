public class InsertionSort {
    
    // this method is for insertion sort on the array
    static void insertionSort(int[] a){
        int n = a.length;   // store length of array

        // we start from index 1 because the first element is already considered sorted
        for(int i = 1; i < n; i++){
            
            int j = i;  // j is used to move the current element to its correct position

            // it compares current element with previous elements and shift it left until it reaches its correct place
            while(j > 0 && a[j] < a[j-1]){
                
                // swap a[j] and a[j-1]
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;

                j--;  // move one step left
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 6, 5, 4, 2};

        // call insertion sort function
        insertionSort(a);

        // prints the sorted array
        for(int val : a){
            System.out.print(val + " ");
        }
    }
}
