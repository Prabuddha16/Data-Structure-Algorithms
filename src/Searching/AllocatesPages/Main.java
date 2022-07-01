package Searching.AllocatesPages;

public class Main {
    public static int findPages(int[]A,int N,int M)
    {
        int s = 0;
        int ans = 0;
        for(int i=0; i<N; i++)
            s += A[i];

        int lb = 0;
        int ub = s;
        while(lb <= ub){
            int mid = (lb+ub)/2;
            if(solve(A,N,mid,M)){
                ans = mid;
                ub = mid-1;
            }else{
                lb = mid+1;
            }
        }
        return ans;
    }
    static boolean solve(int[] arr, int n, int mid, int m){
        int sum = 0;
        int stu=1;
        for(int i=0; i<n; i++){
            if(arr[i]>mid)
                return false;
            if(arr[i]+sum > mid){
                stu++;
                sum = arr[i];
                if(stu>m)
                    return false;
            }
            else
                sum += arr[i];
        }
        return true;
    }
}
