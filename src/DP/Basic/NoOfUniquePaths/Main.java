package DP.Basic.NoOfUniquePaths;

public class Main {
    public static int NumberOfPath(int a, int b)
    {
        int[][] dp = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0 || j==0){
                    dp[i][j] = 1;
                }else{
                    int up = 0;
                    int left = 0;
                    if(i>0)
                        up = dp[i-1][j];
                    if(j>0)
                        left = dp[i][j-1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[a-1][b-1];
    }
}
