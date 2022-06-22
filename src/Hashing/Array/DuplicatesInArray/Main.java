package Hashing.Array.DuplicatesInArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {

    //m-1
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

    //m-2
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
}
