package Array.ReverseArrayInGroups;

import java.util.ArrayList;

class Main{
    //Method-1
    //Function to reverse any part of the array.
    void reverse(ArrayList<Integer> arr, int n,int left, int right)
    {
        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left+=1;
            right-=1;
        }
    }

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for (int i = 0; i < n; i += k) {
            if(i+k < n){
                reverse(arr,n,i,i+k-1);
            }
            else{
                reverse(arr,n,i,n-1);
            }
        }
    }

    //Method-2
    void solve(int[] a,int n,int k){
        for(int i=0; i<n; i+=k){
            int l = i;
            int r = Math.min(i+k-1,n-1);
            int t;
            while (l<r){
                t=a[l];
                a[l]=a[r];
                a[r]=t;
                l+=1;
                r-=1;
            }
        }
    }
}


