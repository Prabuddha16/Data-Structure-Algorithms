package Array.MinimizeSumOfProduct;

/*
You are given two arrays, A and B, of equal size N. The task is to
 find the minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[N-1] * B[N-1],
 where shuffling of elements of arrays A and B is allowed.
*/

import java.util.Arrays;

public class Main {
    public long minValue(long[] a, long[] b, long n)
    {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i]*b[(int)n-1-i];
        }
        return sum;
    }
}
