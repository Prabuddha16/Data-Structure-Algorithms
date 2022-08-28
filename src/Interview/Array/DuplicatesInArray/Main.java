package Interview.Array.DuplicatesInArray;

import java.util.*;

public class Main {

    //m-1 o(n) (1)
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num:nums)
        {
            hmap.put(num,hmap.getOrDefault(num,0)+1);
            if(hmap.get(num)==2)
                list.add(num);
        }
        return list;
    }

    //m-2 o(nlogn) o(1)
    public boolean containsDuplic(int[] a){
        Arrays.sort(a);
        int i=0;
        while(i<a.length-1) {
            if (a[i] == a[i + 1])
                return true;
            i++;
        }
        return false;
    }

    //m-3  o(n)/o(1)
        public List<Integer> findDupli(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                int n = Math.abs(nums[i]);
                if(nums[n-1]<0){
                    list.add(n);
                }else{
                    nums[n-1] = -nums[n-1];
                }
            }
            return list;
        }
}
