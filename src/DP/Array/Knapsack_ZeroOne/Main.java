package DP.Array.Knapsack_ZeroOne;

public class Main {
    static int knapSack(int W, int[] wt, int[] val, int n)
    {
        int []dp = new int[W + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int w = W; w >= 0; w--) {
                if (wt[i - 1] <= w)
                    dp[w] = Math.max(dp[w], dp[w - wt[i - 1]] + val[i - 1]);
            }
        }
        return dp[W];
    }
}

