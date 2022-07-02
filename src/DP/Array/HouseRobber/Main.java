package DP.Array.HouseRobber;
/*
o(n) / o(1)
 */
public class Main {
    public int rob(int[] arr) {
        int n = arr.length;
        int inc = arr[0];
        int exc = 0;
        for(int i = 1; i < n; i++){
            int ninc = exc + arr[i];
            int nexc = Math.max(exc,inc);
            inc = ninc;
            exc = nexc;
        }
        return Math.max(inc,exc);
    }
}

/*
o(n) / o(n)
 */
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        dp[0]=nums[0];
        if(n==1){
            return nums[0];
        }

        dp[1] = Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(nums[i]+dp[i-2],dp[i-1]);
        }

        return dp[n-1];
    }
}
