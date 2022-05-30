package DP.String.LIS_Subsequence;

import java.util.*;

//Function to find length of longest increasing subsequence.
//O(nlogn) / O(n)
class Main
{
    //method-1
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        for(int num : nums) {
            int index = Arrays.binarySearch(dp, 0, max, num);
            if(index < 0)
                index = Math.abs(index) - 1;
            dp[index] = num;
            if(index == max)
                ++max;
        }
        return max;
    }

    //method-2
    static int longestSubsequence(int size, int[] a)
    {
        int result = 0;
        if (size == 0)
            return 0;
        int[] dp = new int[size];
        Arrays.fill(dp, 1);
        for (int i=1; i<size; i++) {
            for (int j=0; j<i; j++) {
                if(a[j] < a[i])
                    dp[i] = Math.max(dp[i], (dp[j] + 1));
            }
        }
        for (int i=0; i<dp.length; i++) {
            if (result < dp[i])
                result = dp[i];
        }
        return result;
    }
}