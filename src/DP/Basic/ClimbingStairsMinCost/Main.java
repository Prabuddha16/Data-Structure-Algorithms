package DP.Basic.ClimbingStairsMinCost;

public class Main {
    public int minCostClimbingStairs(int[] cost) {
        int dpOne = cost[0];
        int dpTwo = cost[1];

        for(int i = 2; i < cost.length; i++) {
            int current = cost[i] + Math.min(dpTwo, dpOne);
            dpOne = dpTwo;
            dpTwo = current;
        }
        return Math.min(dpOne, dpTwo);
    }
}
