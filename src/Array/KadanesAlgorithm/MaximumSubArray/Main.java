package Array.KadanesAlgorithm.MaximumSubArray;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> findSubarray(int[] a, int n) {
        long max_sum = -1;
        int max_left = -1;
        int max_right = -1;
        long cur_sum = 0;
        int cur_left = 0;
        int cur_right = 0;
        while (cur_right < n) {
            if (a[cur_right] < 0) {
                cur_left = cur_right + 1;
                cur_sum = 0;
            }
            else
            {
                cur_sum += (long)a[cur_right];
                if (cur_sum > max_sum) {
                    max_sum = cur_sum;
                    max_left = cur_left;
                    max_right = cur_right;
                }
                else if (cur_sum == max_sum) {
                    if (cur_right + 1 - cur_left > max_right + 1 - max_left) {
                        max_left = cur_left;
                        max_right = cur_right;
                    }
                }
            }
            cur_right++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (max_left == -1 || max_right == -1) {
            ans.add(-1);
            return ans;
        }

        for (int i = max_left; i <= max_right; ++i)
            ans.add(a[i]);
        return ans;
    }
}
