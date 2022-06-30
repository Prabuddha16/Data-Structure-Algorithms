package Algorithm.KadanesAlgorithm.MaxiSubarrSumAfterKconcat;

/*
    Time Complexity: O(N)
    Space Complexity: O(1)

    where 'N' is the size of vector/list 'ARR'.
*/

import java.util.*;

public class Solution {

    public static long kadane(ArrayList <Integer> arr, int n, int k)
    {
        long maxSum = Long.MIN_VALUE;
        long curSum = 0;

        for (int i = 0; i < n * k; i++)
        {
            curSum += arr.get(i % n);
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0)
            {
                curSum = 0;
            }
        }

        return maxSum;
    }

    public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
        long maxSubSum;

        if (k == 1)
        {
            maxSubSum = kadane(arr, n, k);

            return maxSubSum;
        }

        int arrSum = 0;

        for (int i = 0; i < n; i++)
        {
            arrSum += arr.get(i);
        }

        if (arrSum <= 0)
        {
            // Finding the maximum subarray sum for k = 2.
            maxSubSum = kadane(arr, n, 2);
        }
        else
        {
            // Finding the maximum subarray sum for k = 2.
            maxSubSum = kadane(arr, n, 2);
            maxSubSum += (long)(k - 2) * (long)arrSum;
        }

        return maxSubSum;
    }
}
