package DP.Array.SubsetSumProblem;

public class Main {
    static boolean isSubsetSum(int N, int[] arr, int sum){
        // The value of subset[i][j] will be true if there is a subset of arr[0..j-1] with sum equal to i
        boolean[][] dp = new boolean[N + 1][sum + 1];
        // If sum is 0, then answer is true
        for (int i = 0; i <= N; i++)
            dp[i][0] = true;
        // If sum is not 0 and set is empty, then answer is false
        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;
        // Fill the subset table in botton up manner
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < arr[i - 1])
                    dp[i][j] = dp[i - 1][j];
                if (j >= arr[i - 1])
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
            }
        }
        return dp[N][sum];
    }
}
