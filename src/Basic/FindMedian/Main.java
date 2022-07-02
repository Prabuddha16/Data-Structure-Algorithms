package Basic.FindMedian;

import java.util.Arrays;

public class Main {
    public int find_median(int[] v)
    {
        int ans = 0;
        Arrays.sort (v);
        int mid = v.length;
        if (mid % 2 != 0)
        {
            ans = v[mid / 2];
        }
        else
        {
            ans = (v[mid / 2] + v [(mid - 1) / 2]) / 2;
        }
        return ans;
    }
}

/*
Expected Time Complexity: O(n * log(n))
Expected Space Complexity: O(1)
*/