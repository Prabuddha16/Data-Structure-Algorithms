package DP.Tree.CountBalancedTree;

public class Main {
    static long countBT(int h){
        long m=1000000007;
        long[] dp = new long[h+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= h; ++i)
            dp[i] = (dp[i - 1] * ((2 * dp [i - 2])% m + dp[i - 1]) % m) % m;
        return dp[h];
    }
}

/*
count(h) = count(h-1) * count(h-2) +
           count(h-2) * count(h-1) +
           count(h-1) * count(h-1)
         = 2 * count(h-1) * count(h-2) + count(h-1) * count(h-1)
         = count(h-1) * (2*count(h - 2) + count(h - 1))
*/
