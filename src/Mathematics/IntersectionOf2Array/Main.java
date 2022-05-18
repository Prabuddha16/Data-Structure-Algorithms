package Mathematics.IntersectionOf2Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            if (!map.contains(num)) {
                map.add(num);
            }
        }
        for (int num : nums2) {
            if (map.contains(num)) {
                list.add(num);
                map.remove(num);
            }
        }
//list of intersection elements
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int count = 0 ;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : a){
            map.put(i, map.getOrDefault(0, i) + 1);
        }

        for(int val : b){
            if(map.containsKey(val)){
                count++;
                map.remove(val);
            }
        }
        return count;
    }
}
