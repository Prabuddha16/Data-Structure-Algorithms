package DP.Array.KnapsackWIthDuplicates;

public class Main {
    static int knapSack(int N, int W, int[] val, int[] wt)
    {
        int[] dp = new int[W+1];
        int ans =0;

        for(int i=0; i<W+1; i++)
            for (int j=0; j<N; j++)
                if(wt[j]<= i)
                    dp[i] = Math.max(dp[i], dp[i - wt[j]] + val[j]) ;
        return dp[W];
    }
}

class Solution{
    static int knapSack(int n, int W, int[] val, int[] wt)
    {
        int[][] K = new int[n + 1][W + 1];
        //building table K[][] in bottom up manner.
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                //base case
                if (i == 0 || j == 0)
                    K[i][j] = 0;
                    //if weight of current item is more than Knapsack capacity W
                    //then this item cannot be included in the optimal solution.
                else if (wt[i - 1] <= j)
                    K[i][j] = Math.max(val[i - 1] + K[i][j - wt[i - 1]], K[i - 1][j]);
                    //else updating K[i][w] as K[i-1][w].
                else
                    K[i][j] = K[i - 1][j];
            }
        }
        //returning the result.
        return K[n][W];
    }
}
