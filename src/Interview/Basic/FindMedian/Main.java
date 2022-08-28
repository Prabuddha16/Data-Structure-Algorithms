package Interview.Basic.FindMedian;

import java.util.Arrays;

public class Main {
    public int find_median(int[] v)
    {
        int ans = 0;
        Arrays.sort (v);
        int n = v.length;
        if (n % 2 != 0)
        {
            ans = v[n / 2];
        }
        else
        {
            ans = (v[n / 2] + v [(n - 1) / 2]) / 2;
        }
        return ans;
    }
}

/*
Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)
*/