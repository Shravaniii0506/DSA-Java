public class FindSquareRoot {
    
    // this function finds the integer square root of a number (only the floor value is returned)
    static int sqrt(int x){
        
        int st = 0;          // starting range
        int end = x;         // ending range
        int ans = -1;        // stores nearest square root value

        // binary search loop
        while(st <= end){
            
            int mid = st + (end - st) / 2;  // finds mid value

            // square of mid
            int val = mid * mid;

            // if perfect square found
            if(val == x){
                return mid;
            }

            // if mid*mid is smaller than x store mid as answer and move right
            else if(val < x){
                ans = mid;
                st = mid + 1;
            }

            // and if mid*mid is greater than x move to left side
            else {
                end = mid - 1;
            }
        }
        return ans;   // returns integer square root
    }

    public static void main(String[] args) {
        
        int x = 24;      // number whose square root is required

        // function call
        System.out.println(sqrt(x));   // output: 4
    }
}
