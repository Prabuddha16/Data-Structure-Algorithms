package Array.TwoPointer.ShortUnsortConti;

import java.util.Scanner;

public class Main{

    public static int solve(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];
        int high = 0, low = 1;

        for(int i=0, j=n-1; i < n; i++, j--){
            if(nums[i] < max)
                high = i;
            if(nums[j] > min)
                low = j;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[j]);
        }
        return high - low + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(solve(a));
    }
}