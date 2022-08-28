package Interview.Array.DuplicatesInArray;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> duplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                ans.add(i);
                flag = 1;
            }
        }

        if (flag == 0)
            ans.add(-1);
        return ans;
    }
}
