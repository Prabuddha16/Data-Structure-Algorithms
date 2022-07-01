package Searching.FirstEndElementofX;

class Solution {
    public int[] searchRange(int[] arr, int x) {
        int n = arr.length;
        int[] ar = new int[]{-1, -1};
        ar[0] = firstOccurrence(arr,n,x);
        ar[1] = lastOccurrence(arr,n,x);
        return ar;
    }
    public static int  firstOccurrence(int[] arr, int n , int k) {
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
    public static int lastOccurrence(int[] arr, int n , int k) {
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
