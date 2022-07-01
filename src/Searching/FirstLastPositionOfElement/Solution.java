package Searching.FirstLastPositionOfElement;

/*
    Time Complexity: O(log(N))
    Space Complexity: O(1)
    Where N is the size of the sorted array.
*/

import java.util.ArrayList;

public class Solution {
    public static <Pair> Pair findFirstLastPosition(ArrayList<Integer> arr, int n, int x) {
        int idx1 = -1, idx2 = -1;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if ((mid == 0 || x > arr.get(mid - 1)) && arr.get(mid) == x) {
                idx1 = mid;
                break;
            }
            else if (x > arr.get(mid)) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if ((mid == (n - 1) || x < arr.get(mid + 1)) && arr.get(mid) == x) {
                idx2 = mid;
                break;
            }
            else if (x < arr.get(mid)) {
                hi = mid - 1;
            }
            else {

                lo = mid + 1;
            }

        }
/*
        Pair sol = new Pair();
        sol.first = idx1;
        sol.second = idx2;
        return sol;

 */
        return null;
    }
}
