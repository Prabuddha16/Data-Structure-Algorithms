package Array.MaximizeSumArray;

//write a program to find the maximum value of ∑arr[i]*i, where i = 0, 1, 2,…., n – 1.

import java.util.Arrays;

class Main{

    long Maximize(int[] arr, int n)
    {
        Arrays.sort(arr);
        long res = 0;

        for(int i=0;i<n;i++)
            res+= ((long)arr[i]*(long)i)%1000000007l;



        res = res%1000000007l;

        return res;
    }
}
