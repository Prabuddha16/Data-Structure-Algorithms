package Hashing.Array.DuplicatesInArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
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
}
