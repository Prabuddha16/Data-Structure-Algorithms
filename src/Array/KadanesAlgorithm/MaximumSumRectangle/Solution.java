package Array.KadanesAlgorithm.MaximumSumRectangle;

public class Solution
{
    public static int maxSumRectangle(int[][] arr, int n, int m)
    {
        int ma = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int a[] = new int[m];
            for(int j=i; j<n; j++){
                for(int col=0; col<m; col++){
                    a[col] += arr[j][col];
                }
                ma =Math.max(ma, kadane(a,m));
            }

        }

        return ma;

    }

    public static int kadane(int a[], int n){

        int sum=0, max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){

            sum += a[i];

            max = Math.max(max,sum);

            if(sum < 0) sum = 0;

        }

        return max;
    }
}

