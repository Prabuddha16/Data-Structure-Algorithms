package DP.Array.PartationSubsetSum;

// 1-D Array

public class Solution {
    /*
        Time Complexity: O(N * S)
        Space Complexity: O(S)

        Where 'N' is the size of the array,
        and 'S' is the sum of all elements in the given array.
    */
    public static boolean canPartition(int[] arr, int n) {
        // It stores the sum of all array element.
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        // If sum is odd, then it can't be partitioned into equal sum subsets.
        if (totalSum % 2 != 0) {
            return false;
        }
        // One subset sum will always be totalSum/2.
        int subsetSum = totalSum / 2;
        boolean[] dp = new boolean[subsetSum + 1];
        dp[0] = true;
        // Traversing the given array.
        for (int i = 1; i <= n; i++) {
            for (int j = subsetSum; j >= 0; j--) {
                if (j - arr[i - 1] >= 0) {
                    dp[j] = dp[j - arr[i - 1]] || dp[j];
                }
            }
        }
        return dp[subsetSum];
    }

}
