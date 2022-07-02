package DP.Array.GoldMineProblem;

public class Main {
    static int maxGold(int n, int m, int[][] a)
    {
        for (int j = 1;j<m;j++){
            for(int i = 0;i<n;i++){
                a[i][j] += Math.max(Math.max(a[i][j-1], (i!=n-1) ? a[i+1][j-1]:0), (i!=0) ? a[i-1][j-1]:0);
            }
        }
        int ans = 0;
        for (int i = 0;i<n;i++){
            ans = Math.max(ans, a[i][m-1]);
        }
        return ans;
    }
}
