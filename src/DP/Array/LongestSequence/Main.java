package DP.Array.LongestSequence;

public class Main {
    static int longestSubsequence(int n, int[] arr)
    {
        int[] dp = new int[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(Math.abs(arr[i] - arr[j]) == 1){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
