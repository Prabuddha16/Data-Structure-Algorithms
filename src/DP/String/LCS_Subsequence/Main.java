package DP.String.LCS_Subsequence;

public class Main {
    static int lcs(int m, int n, String text1, String text2)
    {
        int[][] dp = new int[m+1][n+1];

        for(int i=0; i<dp.length; i++){
            dp[i][0]=0;
        }

        for(int j=0; j<dp[0].length; j++){
            dp[0][j]=0;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

}
