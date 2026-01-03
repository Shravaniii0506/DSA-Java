public class MergeSort {
   
    // this function prints all elements of the array
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // this function merges two sorted subarrays into one sorted array
       // 1st subarray: arr[l ... mid]
       // 2nd subarray: arr[mid+1 ... r]
    static void merge(int[] arr, int l, int mid, int r){

        // size of left and right subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // temporary arrays to store left and right parts
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        // copy elements from original array to left subarray
        for(i = 0; i < n1; i++)
            left[i] = arr[l + i];

        // copy elements from original array to right subarray
        for(j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        // initial indexes for left, right and merged array
        i = 0;
        j = 0;
        k = l;

        // compares elements from left and right arrays and place smaller one into original array
        while(i < n1 && j < n2){
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        // copy remaining elements of left array (if any)
        while(i < n1)
            arr[k++] = left[i++];

        // copy remaining elements of right array (if any)
        while(j < n2)
            arr[k++] = right[j++];
    }

    // this function recursively divides the array and sorts it
    static void mergeSort(int[] arr, int l, int r){

        // base condition- if array has one or no element
        if(l >= r) return;

        // find the middle index
        int mid = (l + r) / 2;

        // recursively sort left half
        mergeSort(arr, l, mid);

        // recursively sort right half
        mergeSort(arr, mid + 1, r);

        // merge the two sorted halves
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 2};
        int n = arr.length;

        System.out.println("Array before sorting");
        displayArr(arr);       // 4 1 3 5 2

        // calls merge sort
        mergeSort(arr, 0, n - 1);

        System.out.println("Array after sorting");
        displayArr(arr);       // 1 2 3 4 5
    }
}
