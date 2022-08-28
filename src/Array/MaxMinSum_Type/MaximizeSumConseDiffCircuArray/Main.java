package Array.MaxMinSum_Type.MaximizeSumConseDiffCircuArray;

import java.util.Arrays;

public class Main {
    int maxSum(int[] a, int n){
        int s=0;
        Arrays.sort(a);
        for (int i=0;i<n/2;i++){
            s-=(2*a[i]);
            s+=(2*a[n-i-1]);
        }
        return s;
    }
}
