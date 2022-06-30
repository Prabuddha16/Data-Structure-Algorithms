package Array.Sorting._All_Sorting.CountingSort;

/*
    Time Complexity: O(N + K)
    Space Complexity: O(N + K)

    where 'N' is the length of the input array 'ARR' and 'K' is the input range.
*/

public class Solution {

    public static int[] sort(int n, int[] arr) {

        // Initialize a variable 'MAX' to store the maximum element of the input array.
        int max = Integer.MIN_VALUE;

        // Initialize a variable 'MIN' to store the minimum element of the input array.
        int min = Integer.MAX_VALUE;

        // Iterate 'I' in 0 to 'N':
        for (int i = 0; i < n; i++) {

            // Set 'MAX' as the maximum of 'MAX' and 'ARR[I]'.
            max = Math.max(max, arr[i]);

            // Set 'MIN' as the minimum of 'MAX' and 'ARR[I]'.
            min = Math.min(min, arr[i]);
        }

        // Set 'RANGE' as 'MAX' - 'MIN' + 1.
        int range = max - min + 1;

        // Initialize an array 'COUNT' of size 'RANGE'.
        int[] count = new int[range];

        // Initialize an array 'ANS' of size 'N'.
        int[] ans = new int[n];

        // Iterate 'I' in 0 to 'N':
        for (int i = 0; i < n; i++) {

            // Increment 'COUNT[ARR[I] - MIN]' by 1.
            count[arr[i] - min]++;
        }

        // Iterate 'I' in 1 to 'COUNT.LENGTH':
        for (int i = 1; i < count.length; i++) {

            // Set 'COUNT[I]' as 'COUNT[I]' + 'COUNT[I - 1]'.
            count[i] += count[i - 1];
        }

        // Iterate 'I' in 'N - 1' to 0:
        for (int i = n - 1; i >= 0; i--) {

            // Set 'ANS[COUNT[ARR[I] - MIN] - 1]' as 'ARR[I]'.
            ans[count[arr[i] - min] - 1] = arr[i];

            // Decrement 'COUNT[ARR[I] - MIN]' by 1.
            count[arr[i] - min]--;
        }

        // Finally, return 'ANS'.
        return ans;
    }
}

