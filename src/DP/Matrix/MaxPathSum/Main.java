package DP.Matrix.MaxPathSum;

public class Main {
    static int maximumPath(int N, int[][] Matrix)
    {
        int[][] dp = new int[N][N];
        for(int i = 0;i < N;i++)
            dp[0][i] = Matrix[0][i];

        // calculating the path sums of the matrix
        for(int i = 1;i < N;i++){
            for(int j = 0;j < N;j++){
                if(j == 0 && j+1 < N)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],dp[i-1][j+1]);
                else if(j-1>=0 && j == N-1)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],dp[i-1][j-1]);
                else if(j > 0 && j+1 < N)
                    dp[i][j] = Matrix[i][j] + Math.max(dp[i-1][j],Math.max(dp[i-1][j-1],dp[i-1][j+1]));
                else
                    dp[i][j] = Matrix[i][j] + dp[i-1][j];
            }
        }

        // getting the maximum path sum
        int sum = 0;
        for(int i = 0;i < N;i++)
            sum = Math.max(sum, dp[N-1][i]);
        return sum;
    }
}
