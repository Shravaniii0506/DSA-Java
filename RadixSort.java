public class RadixSort {
    
    static int findMax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static void CountSort(int[] arr, int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];   // only 10 digits: 0-9

        // Count occurrences of digits
        for(int i = 0; i < n; i++){ 
            int digit = (arr[i] / place) % 10;
            count[digit]++;
        }

        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){ // TC --> max
            count[i] += count[i-1];
        }

        // Build the output array (stable sort, go from right to left)
        for(int i = n-1; i >= 0; i--){  // TC --> n
            int digit = (arr[i]/place)%10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // copy output back to arr
        for(int i = 0; i < n; i++){  // TC --> n
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);  // get maximum element
        // apply counting sort to sort elements based on place value
        for(int place = 1; max/place > 0; place *= 10){
            CountSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
