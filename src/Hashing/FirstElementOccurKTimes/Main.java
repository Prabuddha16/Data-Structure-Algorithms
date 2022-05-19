package Hashing.FirstElementOccurKTimes;

import java.util.HashMap;

public class Main {
    public int firstElementKTime(int[] a, int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            if(map.get(a[i]) == k)
                return a[i];
        }
        return -1;
    }
}
