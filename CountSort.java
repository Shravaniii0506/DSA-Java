public class CountSort {

    // This function finds the maximum element in the array
    // We used max to deciding the size of count array
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;   // store smallest possible integer initially
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];          // update max if current element is bigger
            }
        }
        return mx;                    // return the largest element
    }

    // this is the basic version of Counting Sort
    // it works only for non-negative integers
    static void basicCountSort(int[] arr){  
        
        // first find the maximum element in the array
        int max = findMax(arr);

        // 2nd create count array of size (max + 1)
        // each index represents the value, and value at index represents frequency
        int[] count = new int[max + 1];

        // 3rd store frequency of each element
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;   // increment count of that value
        }

        // 4th modify original array using count array
        int k = 0;  // pointer for original array
        for(int i = 0; i < count.length; i++){
            // repeat the value 'i' count[i] times
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;  // place sorted element and move pointer
            }
        }
    }

    // this function prints all elements of the array
    static void display(int[] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};

        // calling counting sort
        basicCountSort(arr);

        // display sorted array
        display(arr);
    }
}
