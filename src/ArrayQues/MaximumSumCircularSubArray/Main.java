package ArrayQues.MaximumSumCircularSubArray;

public class Main {
    public static int maxSubarraySumCircular(int[] array) {
        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        for (int k : array) {

            currentSum = Math.max(currentSum + k, k);
            maxSum = Math.max(maxSum, currentSum);

        }

        if(maxSum < 0) return maxSum;

        currentSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int j : array) {

            currentSum = Math.min(currentSum + j, j);
            minSum = Math.min(minSum, currentSum);

        }

        int totalSum = 0;
        for(int element : array) totalSum += element;

        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int[] a = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(a));
    }
}
