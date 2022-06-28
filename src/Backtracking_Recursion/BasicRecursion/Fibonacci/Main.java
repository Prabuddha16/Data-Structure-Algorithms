package Backtracking_Recursion.BasicRecursion.Fibonacci;

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


    public static void main (String[] args)
    {
        int n = 9;
        System.out.println(fib(n));
        System.out.println(fibo(n));
    }
}
