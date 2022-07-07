package DP.Basic.NCR_combinations;

public class Main {
    static int nCr(int n, int r)
    {
        int[][] dp = new int[n+1][r+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=Math.min(r,i); j++)  {
                if(j==0 || i==j){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j]) % 1000000007;
                }
            }
        }
        return dp[n][r];
    }
}
