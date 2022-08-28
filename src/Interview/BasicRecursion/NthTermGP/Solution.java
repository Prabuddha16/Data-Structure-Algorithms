package Interview.BasicRecursion.NthTermGP;

import java.lang.*;

class Main
{
    public static int Nth_of_GP(int a, int r, int N)
    {
        return ( a * (int)(Math.pow(r, N - 1)) );
    }

    public static void main(String[] args)
    {
        int a = 2;
        int r = 3;
        int N = 5;
        System.out.print("The "+ N + "th term of the" + " series is : " + Nth_of_GP(a, r, N));
    }
}

/*
    Time complexity: O(N)
    Space complexity: O(1)

    Where N is the term of GP required.
*/

public class Solution {
    public static int nthTermOfGP(int N, int A, int R) {
        int mod = 1000000007;
        long ans = (A * power(R, N - 1, mod)) % mod;
        return (int) ans;
    }

    public static long power(int R, int N, int mod) {
        if(N == 0) {
            return 1;
        }
        int i = 0;
        long pow = 1;
        while(i < N) {
            pow = (pow * R) % mod;
            i++;
        }
        return pow;
    }
}

