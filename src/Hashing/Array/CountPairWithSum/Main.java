package Hashing.Array.CountPairWithSum;

import java.util.HashMap;

public class Main {
    int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(map.containsKey(k-arr[i])){
                count = count + map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
