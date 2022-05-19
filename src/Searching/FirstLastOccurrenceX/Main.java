package Searching.FirstLastOccurrenceX;

import java.util.ArrayList;

class Main
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList<Long> a1 = new ArrayList<Long>();
        int a = firstOccurrence(arr,n,x);
        int b  = lastOccurence(arr,n,x);
        a1.add((long)a);
        a1.add((long)b);
        return a1;
    }
    public static int  firstOccurrence(long[] arr, int n , int k) {
        int start = 0;
        int end = n-1;
        int ans = -1;
        int mid = start+(end-start)/2;
        while(start<=end) {
            if(arr[mid]==k) {
                ans = mid;
                end=mid-1;
            }else if(arr[mid]>k) {
                end=mid-1;
            }else {
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
    public static int lastOccurence(long[] arr, int n , int k) {
        int start = 0;
        int end= n-1;
        int ans = -1;
        int mid = start+(end-start)/2;
        while(start<=end) {
            if(arr[mid]==k) {
                ans = mid;
                start = mid+1;
            }else if(arr[mid]>k) {
                end=mid-1;
            }else {
                start = mid+1;
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
}
