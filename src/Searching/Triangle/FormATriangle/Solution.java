package Searching.Triangle.FormATriangle;

/*
    Time Complexity: O(N * log(N))
    Space Complexity: O(log N)

    Where 'N' is the number of elements in the given array/list.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution{
    public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){

        Collections.sort(arr);

        int n = arr.size();
        for (int i = 0; i < n - 2; i++){
            if (arr.get(i) + arr.get(i + 1) > arr.get(i + 2)){
                return true;
            }
        }
        return false;
    }
}
