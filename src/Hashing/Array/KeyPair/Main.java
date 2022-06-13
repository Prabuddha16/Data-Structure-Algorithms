package Hashing.Array.KeyPair;

import java.util.HashMap;

public class Main {
    boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int numberToFind = x - arr[i];
            if (hash.containsKey(numberToFind)) {
                return true;
            }
            hash.put(arr[i],i);
        }
        return false;
    }
}
