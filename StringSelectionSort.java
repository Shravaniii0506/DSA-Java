public class StringSelectionSort {
    
    // this function sorts the fruits array in alphabetical order using Selection Sort
    static void sortFruits(String[] fruits){
        
        int n = fruits.length;   // store length of array

        // outer loop- fixes one position at a time
        for(int i = 0; i < n-1; i++){
            
            // assume current index has minimum value
            int min_index = i;

            // inner loop- finds the smallest string alphabetically
            for(int j = i+1; j < n; j++){
                
                /* compareTo() compares two strings lexicographically
                 < 0 means fruits[j] comes before fruits[min_index] */
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;   // update index of smallest element
                }
            }

            // swap the smallest fruit with the current position
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        
        // input array
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};

        // call sorting function
        sortFruits(fruits);

        // prints sorted array
        for(String val : fruits) {
            System.out.print(val + " ");
        }
    }
}
