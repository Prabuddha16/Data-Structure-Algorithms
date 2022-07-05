package Hashing.Array.LongestConsecutiveSequence;

import java.util.HashSet;

public class Main {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }

        int ans = 0;

        for (int i : hs) {
            if (!hs.contains(i-1)) {
                int currentNum = i;
                int currentStreak = 1;

                while (hs.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                ans = Math.max(ans, currentStreak);
            }
        }
        return ans;
    }

    static int findLongestConseqSubseq(int[] arr, int n)
    {
        HashSet<Integer> S = new HashSet<Integer>();
        int ans = 0;
        for (int i = 0; i < n; ++i)
            S.add(arr[i]);

        for (int i = 0; i < n; ++i)
        {
            if (!S.contains(arr[i] - 1))
            {
                int j = arr[i];
                while (S.contains(j))
                    j++;

                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}
