package Array.Searching.DistanceBW2Array;

import java.util.Arrays;

public class Main {
    public static boolean isValid(int key, int[] arr, int d){
        int start = 0;
        int end = arr.length-1;
        int r1 = key - d;
        int r2 = key + d;
        while(start<=end){
            int mid = start + (end- start)/ 2;
            if(arr[mid] < r1)
                start = mid+1;
            else if (arr[mid] > r2)
                end= mid-1;
            else
                return false;
        }
        return true;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for (int item : arr1 ){
            if(isValid(item, arr2, d))
                count++;
        }
        return count;

    }
}
