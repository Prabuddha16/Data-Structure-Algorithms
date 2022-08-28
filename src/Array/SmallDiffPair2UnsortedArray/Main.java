package Array.SmallDiffPair2UnsortedArray;

import java.util.Arrays;

public class Main {
    static int solve(int[] A, int[] B, int m, int n){
        Arrays.sort(A);
        Arrays.sort(B);
        int a=0, b=0;
        int ans = Integer.MAX_VALUE;
        while (a<m && b<n){
            if(Math.abs(A[a]-B[b])<ans){
                ans= Math.abs(A[a]-B[b]);
            }
            if(A[a]<B[b])
                a++;
            else
                b++;
        }
        return ans;
    }
}
