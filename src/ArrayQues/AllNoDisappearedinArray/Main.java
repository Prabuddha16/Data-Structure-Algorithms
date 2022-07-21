package ArrayQues.AllNoDisappearedinArray;

import java.util.ArrayList;
import java.util.List;
//[4,3,2,7,8,2,3,1]
//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.
//[5,6]
public class Main {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]>0){
                nums[n-1] = -1*nums[n-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;                                                     //[5,6]
    }

    public List<Integer> findDisappearedNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]<0){
                nums[n-1] = -1*nums[n-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;                                                  //[1,2,3,4,5,6,7,8]
    }
}
