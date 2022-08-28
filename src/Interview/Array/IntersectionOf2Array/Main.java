package Interview.Array.IntersectionOf2Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    //pattern-1
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
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    //pattern-2
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

    //pattern-3
    public int[] intersectII(int[] nums1, int[] nums2) {
        int[] arr = new int[1001];
        List<Integer> list = new ArrayList<>();
        for (int num : nums1)
            arr[num]++;
        for (int num : nums2)
            if (arr[num] > 0) {
                list.add(num);
                arr[num]--;
            }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);
        return ans;
    }

}
