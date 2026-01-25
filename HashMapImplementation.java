import java.util.LinkedList;

public class HashMapImplementation {

    static class MyHashMap<K, V> {

        // by default initial size of bucket array
        public static final int DEFAULT_CAPACITY = 4;

        // load factor (used for rehashing concept)
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        // node class to store key-value pair
        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;   // number of key-value pairs
        private LinkedList<Node>[] buckets; // array of linked lists

        // initialize buckets array
        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // hash function to get bucket index
        private int hashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        // search key inside a bucket and returns index if found else -1
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        // constructor
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        // return number of entries
        public int size() {
            return n;
        }

        // insert or update key-value pair
        public void put(K key, V value) {
            int bi = hashFunc(key);                  // bucket index
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) {
                // key not present --> add new node
                currBucket.add(new Node(key, value));
                n++;
            } else {
                // key present --> update value
                currBucket.get(ei).value = value;
            }
        }

        // get value of given key
        public V get(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) {
                return null;   // key not found
            }
            return currBucket.get(ei).value;
        }

        // remove key-value pair
        public V remove(K key) {
            int bi = hashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);

            if (ei == -1) {
                return null;   // key not found
            }

            V val = currBucket.get(ei).value;
            currBucket.remove(ei);
            n--;
            return val;
        }
    }

    public static void main(String[] args) {

        MyHashMap<String, Integer> mp = new MyHashMap<>();

        mp.put("India", 140);
        mp.put("USA", 330);
        mp.put("UK", 67);

        System.out.println(mp.get("India"));  // 140
        System.out.println(mp.get("USA"));    // 330

        mp.put("India", 150);                 // update value
        System.out.println(mp.get("India"));  // 150

        mp.remove("UK");
        System.out.println(mp.get("UK"));     // null

        System.out.println(mp.size());        // 2
    }
}
