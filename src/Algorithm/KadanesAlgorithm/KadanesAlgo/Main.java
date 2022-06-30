package Algorithm.KadanesAlgorithm.KadanesAlgo;

//Kadane's Algo.
//Largest Sum Contiguous Subarray

public class Main{

    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = 0;
        long curSum = 0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
}

