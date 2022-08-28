package Array.PosiNega_No.AlternatePosiNegaNo;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int[] rearrangeArray(int[] arr) {
        Queue<Integer> pos = new LinkedList<Integer>();
        Queue<Integer> neg = new LinkedList<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);

            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (!pos.isEmpty()) {
                    arr[i] = pos.remove();
                } else {
                    arr[i] = neg.remove();
                }
            } else {
                if (!neg.isEmpty()) {
                    arr[i] = neg.remove();
                } else {
                    arr[i] = pos.remove();
                }
            }
        }
        return arr;
    }
}
