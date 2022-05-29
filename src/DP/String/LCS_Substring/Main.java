package DP.String.LCS_Substring;

public class Main {
    int longestCommonSubstr(String S1, String S2, int n, int m){
        int dp[][] = new int[n+1][m+1];
        int max_len = 0;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                char ch1 = S1.charAt(i-1);
                char ch2 = S2.charAt(j-1);
                if(ch1==ch2)
                {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else
                {
                    dp[i][j] = 0;
                }

                max_len = Math.max(max_len, dp[i][j]);

            }
        }

        return max_len;
    }
}
