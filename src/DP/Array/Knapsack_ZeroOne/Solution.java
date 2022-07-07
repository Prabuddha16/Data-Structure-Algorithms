package DP.Array.Knapsack_ZeroOne;

public class Solution {
    static int knapSack(int W, int[] wt, int[] val, int n) {

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
                    K[i][j] = Math.max(val[i - 1] + K[i - 1][j - wt[i - 1]], K[i - 1][j]);

                    //else updating K[i][w] as K[i-1][w].
                else
                    K[i][j] = K[i - 1][j];
            }
        }
        //returning the result.
        return K[n][W];
    }
}
