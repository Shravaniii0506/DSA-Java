import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4, 4};

        // HashMap is to store frequency of each element
          // key -> element, value -> number of times it appears
        Map<Integer, Integer> freq = new HashMap<>();

        // counts frequency of each element
        for (int el : arr) {
            if (!freq.containsKey(el)) {
                // first time element is coming
                freq.put(el, 1);
            } else {
                // element already present0 then increase count
                freq.put(el, freq.get(el) + 1);
            }
        }

        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());

        int MxFreq = 0;     // stores maximum frequency
        int ansKey = -1;    // stores element with max frequency

        // traverse map to find element with maximum frequency
        for (var e : freq.entrySet()) {
            if (e.getValue() > MxFreq) {
                MxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        /*  // this loop is another way to find the element which has the maximum frequency,
          here we are iterating only over keys of the HashMap 
        for (var key : freq.keySet()) {      // loop through all keys present in map
            if (freq.get(key) > MxFreq) {    // freq.get(key) gives frequency of current key compare it with current maximum frequency
                MxFreq = freq.get(key);      // update maximum frequency
                ansKey = key;                // store the key which has max frequency
            }
        }    */

        System.out.printf(
            "%d has max frequency and it occurs %d times",
            ansKey, MxFreq
        );
    }
}
