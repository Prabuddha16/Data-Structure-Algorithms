package Array.MinimumSumFormedByDigits;

import java.util.Arrays;

//t=o(nlogn)

public class Main {
    public static long minSum(int a[], int n)
    {
        Arrays.sort(a);
        long num1 = 0;
        long num2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                num1 = num1 * 10 + a[i];
            else
                num2 = num2 * 10 + a[i];
        }
        return num2 + num1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {5,3,0,7,4};
        long ans = minSum(a,n);
        System.out.println(ans);
    }
}
