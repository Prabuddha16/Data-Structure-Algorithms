package Array.MaxMinSum_Type.MaxConsecutive;

import java.util.Arrays;

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int n = special.length;
        Arrays.sort(special);
        int ans = 0;
        for (int j : special) {
            ans = Math.max(ans, j - bottom);
            bottom = j + 1;
        }
        ans = Math.max(ans , top - special[n-1]);
        return ans;
    }
}
