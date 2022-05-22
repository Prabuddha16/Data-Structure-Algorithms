package Array.TwoPointer.CountPossibleTriangle;

import java.io.*;
import java.util.*;

//t=n^2 s=1
class Main
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}

class Solution
{
    static int findNumberOfTriangles(int[] A, int n)
    {
        Arrays.sort(A);
        int count = 0;
        for (int i = n - 1; i >= 1; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (A[l] + A[r] > A[i]) {
                    count += r - l;
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return count;
    }
}
