package DP.Array.HouseRobberII;

public class Main {

    public int rob(int[] nums) {
        if(nums.length <= 1)
            return nums.length == 0 ? 0 : nums[0];
        return Math.max(rob(nums, 0, nums.length - 1), rob(nums, 1, nums.length));
    }

    public int rob(int[] nums, int left, int right){
        int robEven = 0;
        int robOdd = 0;
        for(int i = left; i < right; i++){
            if(i % 2 == 0)
                robEven = Math.max(robEven + nums[i], robOdd);
            else
                robOdd = Math.max(robOdd + nums[i], robEven);
        }
        return Math.max(robEven, robOdd);
    }
}


class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(nums.length <= 1)
            return nums.length == 0 ? 0 : nums[0];
                                                                // Rob House from house 1 to house n-1
        int[] dp1 = new int[n+1];
        dp1[0] = 0;
        dp1[1] = nums[0];
        for(int i = 2; i <= nums.length; i++){
            dp1[i] = Math.max(dp1[i-1],nums[i-1]+dp1[i-2]);
        }
                                                                //Now Rob houses from house 2 to house n
        int[] dp2 = new int[n+1];
        dp2[0] = 0;
        dp2[1] = 0;                                           // here we cant take nums[0] just think about it, its easy
        for(int i = 2; i <= nums.length; i++){
            dp2[i] = Math.max(dp2[i-1],nums[i-1]+dp2[i-2]);
        }
        return Math.max(dp1[n-1],dp2[n]);
    }
}