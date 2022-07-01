package DP.Basic.NthFibonacciNumber;

public class Main {
    static long mod=1000000007;
    static long nthFibonacci(long n){
        long[] dp =new long[(int)n+1];
        for(int i=0;i<=n;i++)
        {
            dp[i]=-1;
        }
        return nthFibonacci(n,dp);
    }

    static long nthFibonacci(long n,long [] dp)
    {
        if(n<=1)
            return n%mod;

        if(dp[(int)n]!=-1)
            return dp[(int)n]%mod;

        return dp[(int)n] = (nthFibonacci(n-1,dp) + nthFibonacci(n-2,dp))%mod;
    }
}
