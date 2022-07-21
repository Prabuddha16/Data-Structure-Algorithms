package ArrayQues.KadanesAlgorithm.MaximumSubArray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int m = Integer.MIN_VALUE;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            c += nums[i];
            if (c > m) {
                m = c;
            }
            if (c < 0) {
                c = 0;
            }
        }
        return m;
    }
}
