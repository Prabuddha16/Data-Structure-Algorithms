package Interview.Array.MergeArrayWithoutExtraSpace;

import java.util.Arrays;

public class Main {
    public void merge(int[] arr1, int[] arr2, int n, int m) {
        int i=0, j=0,k=arr1.length-1;
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                int temp= arr1[k];
                arr1[k]=arr2[j];
                arr2[j]=temp;
                k--;
                j++;
            }
            else{
                i++;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
