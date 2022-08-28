package Interview.Array.ContainsDuplicates;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public boolean containsDuplicate(int[] nums) {
        HashSet set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length-1) {
            if(nums[i] == nums[i+1])
                return true;
            i++;
        }
        return false;
    }
}

// T = O(n)
// S = O(1)
