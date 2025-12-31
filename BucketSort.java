import java.util.ArrayList;  // ArrayList is used to dynamically store elements (like a resizable array).
import java.util.Collections; // Collections.sort() is used to sort each bucket individually.

public class BucketSort {
    
    static void bucketSort(float[] arr){
        int n = arr.length;
        if (n <= 0) return;  // edge case

        // Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        // create empty buckets
        for(int i = 0; i < n; i++){
            buckets[i] = new ArrayList<Float>();
        }

        // Add elements into our buckets
        for(int i = 0; i < n; i++){
            int bucketIndex = (int)(arr[i] * n); // fixed
            buckets[bucketIndex].add(arr[i]);
        }

        // sort each bucket individually
        for(int i = 0; i < n; i++){
            Collections.sort(buckets[i]);
        }

        // Merge all buckets into arr
        int index = 0;
        for(int i = 0; i < buckets.length; i++){
            ArrayList<Float> currBucket = buckets[i];
            for(int j = 0; j < currBucket.size(); j++){  // fixed
                arr[index++] = currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        for(float val : arr){
            System.out.print(val + " ");
        }
    }
}
