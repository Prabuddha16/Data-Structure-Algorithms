package Searching.CountSmallEqualElement;

/*
    Time Complexity: O((N + M) * log(M))
    Space complexity: O(1)

    where N and M are lengths of array A and B respectively
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    //method-1
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(b);
        for (int i = 0; i < n; i++) {
            int idx = upperBound(b, 0, m - 1, a[i]);
            arr.add(idx + 1);
        }
        return arr;
    }

    private static int upperBound(int[] arr, int l, int r, int element) {
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] <= element) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return r;
    }

    //method-2
    static int binarySearchCount(int[] arr, int n, int key)
    {
        int left = 0;
        int right = n - 1;
        int count = 0;
        while (left <= right)
        {
            int mid = (right + left) / 2;
            if (arr[mid] <= key)
            {
                count = mid + 1;
                left = mid + 1;
            }
            else
                right = mid - 1;
        }
        return count;
    }

    //method-3
    public long countOfElements(long[] arr, long n, long x)
    {
        long c=0;
        for(long i : arr){
            if(i<=x)
                c++;
            else
                break;
        }
        return c;
    }
}