import java.util.*;

public class Hashmap {
    static void HashMapMethods() {
        // syntax
        Map<String, Integer> mp = new HashMap();

        // adding elements
        mp.put("Kavya", 21);
        mp.put("Tanvi", 16);
        mp.put("Anvi", 17);
        mp.put("Navya", 19);
        mp.put("Harry", 18);

        // from the HashMap getting value of a key
        System.out.println(mp.get("Tanvi"));  // 16
        System.out.println(mp.get("Yash"));  // null

        // changing value of a key in the HashMap
        mp.put("Kavya", 25);  // Kavya --> 25
        System.out.println(mp.get("Kavya"));  // 25

        // removing a pair from the HashMap
        System.out.println(mp.remove("Kavya")); // 25
        System.out.println(mp.remove("riya"));  // null

        // checking if a key is in thr HashMap
        System.out.println(mp.containsKey("Kavya")); // false
        System.out.println(mp.containsKey("Tanvi")); // True

        // adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("Yashika", 30);   // will enter
        mp.putIfAbsent("Tanvi", 30);     // will not enter

        // gets all keys in the HashMap
        System.out.println(mp.keySet());

        // gets all vlaues in the HashMap
        System.out.println(mp.values());
        
        // gets all entries in the HashMap
        System.out.println(mp.entrySet());

        // traversing all entries of Hashmap - multiple methods (all methods gives same outputs)
        for(String key: mp.keySet()){
            System.out.printf("Age of %s is %d\n", key, mp.get(key));
        }
        System.out.println();
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
