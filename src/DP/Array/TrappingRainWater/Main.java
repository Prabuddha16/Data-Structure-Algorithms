package DP.Array.TrappingRainWater;

public class Main {
    static long trappingWater(int arr[], int n) {
        long result = 0;
        long left_max = 0, right_max = 0;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)
                    left_max = arr[lo];
                else
                    result += left_max - arr[lo];
                lo++;
            }
            else {
                if (arr[hi] > right_max)
                    right_max = arr[hi];
                else
                    result += right_max - arr[hi];
                hi--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {3,0,0,2,0,4};
        int n = a.length;
        long ans = trappingWater(a,n);
        System.out.println(ans);
    }
}
