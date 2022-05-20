package Hashing.Array.ElementOccurKTimes;

import java.util.HashMap;

class Main
{
    public int firstElementKTime(int[] arr, int n, int k) {
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(s.containsKey(arr[i])) {
                s.put(arr[i], s.get(arr[i]) + 1);
            } else {
                s.put(arr[i], 1);
            }
            if(s.get(arr[i])==k){
                return arr[i];
            }
        }
        return -1;
    }
}