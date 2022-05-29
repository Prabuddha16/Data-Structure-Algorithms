package DP.String.LIS_Subsequence;

import java.io.*;
import java.util.*;

//Function to find length of longest increasing subsequence.
//O(nlogn) / O(n)

class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    }
}
class Solution
{
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