package Sorting.KthElement2SortedArray;

import java.util.Arrays;

public class Main {
    public long kthElement(int[] arr1, int[] arr2, int n, int m, int k) {

        int[] ans = new int[m+n];
        int count=0;
        for(int i=0;i<n;i++){
            ans[count++] = arr1[i];
        }
        for(int i=0;i<m;i++){
            ans[count++] = arr2[i];
        }

        Arrays.sort(ans);

        return ans[k-1];
    }
}
