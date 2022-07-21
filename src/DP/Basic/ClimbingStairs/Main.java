package DP.Basic.ClimbingStairs;

public class Main {
    //o(n)/o(n)
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int[] dp =new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }

    //o(n)/o(1)
    public int reachNthPoint(int n) {
        n = n + 1;
        if(n ==  1 || n == 2) {
            return 1;
        }
        int first = 1, second = 1;
        int next = 0;
        for(int i=2; i<n; i++) {
            next = (first + second);
            first = second;
            second = next;
        }
        return next;
    }
}


