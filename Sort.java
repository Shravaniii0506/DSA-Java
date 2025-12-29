public class Sort {

    // This method is used to print the elements of the array
    static void displayArr(int[] num){

        // for loop to print each value
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // This method sorts an array containing only 0s, 1s and 2s
    static void sort012_(int[] num){

        // variables is counts the number of 0s, 1s and 2s
        int count_0 = 0, count_1 = 0, count_2 = 0;

        // this loop counts how many 0s, 1s and 2s are present
        for (int j : num){
            if(j == 0) {
                count_0++;
            } else if (j == 1){
                count_1++;
            } else {
                // if element is not 0 or 1, it must be 2
                count_2++;
            }
        }

        // index variable for placing elements back into array
        int k = 0;

        // place all 0s at the beginning
        while(count_0 > 0){
            num[k++] = 0;   // put 0 at current index and move ahead
            count_0--;     // decrease count of 0s
        }

        // place all 1s after 0s
        while(count_1 > 0){
            num[k++] = 1;   // put 1 at current index
            count_1--;
        }

        // place all 2s at the end
        while(count_2 > 0){
            num[k++] = 2;   // put 2 at current index
            count_2--;
        }
    }

    public static void main(String[] args) {

        int[] num2_ = {2, 2, 1, 2, 2, 0, 1, 0, 2, 0};

        sort012_(num2_);  // calling function to sort the array

        displayArr(num2_); // displaying the sorted array
    }
}
