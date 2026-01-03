public class QuickSort {
    
    // function to display array
    static void displayArr(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    // swaps elements at index x and y
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end){
        
        int pivot = arr[st];     // choosing first element as pivot
        int cnt = 0;             // counts elements smaller than pivot

        // count elements smaller than pivot
        for(int i = st+1; i <= end; i++){
            if(arr[i] < pivot) cnt++;
        }

        // place pivot at its correct position
        int pivotIdx = st + cnt; // final index where pivot should be placed
        swap(arr, st, pivotIdx); // move pivot to correct position

        int i = st;              // pointer starting from left
        int j = end;             // pointer starting from right

        // elements lesser or equal left of pivotIdx, greater --> right side of pivotIndx
        while(i < pivotIdx && j > pivotIdx){
            
            // move i until an element greater than pivot is found
            while (arr[i] <= pivot) i++;

            // move j until an element smaller or equal to pivot is found
            while (arr[j] > pivot) j--;

            // swap misplaced elements on left and right side
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;   // return final position of pivot
    }    
        
    static void quickSort(int[] arr, int st, int end){
        
        // base case- if array has one or no element
        if(st >= end) return;

        // partition the array and get pivot index
        int pi = partition(arr, st, end);

        // recursively sort left part of pivot
        quickSort(arr, st, pi-1);

        // recursively sort right part of pivot
        quickSort(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 5, 4};

        System.out.println("Array before sorting"); // 6 3 1 5 4
        displayArr(arr);

        System.out.println();

        // calling quick sort on full array
        quickSort(arr, 0, arr.length-1);

        System.out.println("Array after sorting"); // 1 3 4 5 6
        displayArr(arr);
    }
}
