package Interview.BasicRecursion.NthTermGP;

public class SolutionII {

/*
    Time complexity: O(logN)
    Space complexity: O(logN)

    Where N is the term of GP required.
*/

    public static int nthTermOfGP(int N, int A, int R) {
        int mod = 1000000007;
        long ans = (A * power(R, N - 1, mod)) % mod;
        return (int) ans;
    }

    public static long power(int R, int N, int mod) {
        if (N == 0) {
            return 1;
        }
        long temp = power(R, N / 2, mod) % mod;
        if (N % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (((temp * temp) % mod) * R) % mod;
        }
    }
}
