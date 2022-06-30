package Algorithm.KadanesAlgorithm.FlipBits;

public class Solution {
    public static int flipBits(int[] arr,int n) {
        int totalOnes = 0;
        int currSum = 0;
        int maxSum = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                totalOnes++;
            int val = arr[i] == 1 ? -1 : 1;
            currSum += val;
            if (currSum < 0)
                currSum = 0;
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }

        return totalOnes + maxSum;
    }
}

