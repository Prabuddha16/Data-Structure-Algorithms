package Interview.Mathematics.FibonacciNoSum;

public class Main {
    public int fib1(int n) {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int fib2(int n) {
        if(n <= 1) return n;
        return fib2(n-1) + fib2(n-2);
    }

    public int fib3(int n) {
        int dp[] = new int[n+1];
        if(n <= 1) return n;
        if(dp[n] != 0) return n;
        return dp[n] = fib3(n-1) + fib3(n-2);
    }

    public int fib4(int n) {
        int dp[] = new int[n+1];
        if(n <= 1) return n;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public int fib(int n) {

        if(n<=1)return n;
        int prev1=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr_i=prev1+prev2;
            prev2=prev1;
            prev1=curr_i;
        }
        return prev1;
    }
}
