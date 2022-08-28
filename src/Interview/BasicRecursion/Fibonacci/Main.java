package Interview.BasicRecursion.Fibonacci;

public class Main {

    //recursion
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    //iterative
    static int fibo(int n)
    {
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

    //method-3
    public static long[] printFibb(int n)
    {
        long[] res = new long[n];
        res[0] = 1;
        if(n==1){
            return res;
        }
        res[1] = 1;
        if(n==2){
            return res;
        }
        for(int i=2;i<n;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res;
    }

    public static void main (String[] args)
    {
        int n = 9;
        System.out.println(fib(n));
        System.out.println(fibo(n));
    }
}
