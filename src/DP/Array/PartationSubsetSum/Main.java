package DP.Array.PartationSubsetSum;

// Dynamic Programming

/*
    Time Complexity: O(N * S)
    Space Complexity: O(N * S)

    Where 'N' is the size of the array,
    and 'S' is the sum of all elements in the given array.
*/

    public class Main {
        static int equalPartition(int n, int[] nums)
        {
            int sum = 0;
            for(int i : nums)
                sum+=i;
            if(sum%2!=0)
                return 0;
            sum /= 2;
            boolean[][] dp = new boolean[n+1][sum+1];
            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    if(i==0 || j==0)
                        dp[i][j] = false;
                    else if(nums[i-1] > j)     // if curr sum value is greater than the current element value then just skip(take previous value)
                        dp[i][j] = dp[i-1][j];
                    else if(nums[i-1]==j)  // we got required sum
                        dp[i][j] = true;
                    else
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
            return dp[n][sum] ? 1 : 0;
        }
        public static boolean canPartition(int[] nums, int n) {
            int sum = 0;

            for(int i : nums)
                sum+=i;

            if(sum%2!=0) return false;

            sum /= 2;

            boolean[][] dp = new boolean[n+1][sum+1];

            for(int i=0;i<=n;i++){
                for(int j=0;j<=sum;j++){
                    if(i==0 || j==0)
                        dp[i][j] = false;
                    else if(nums[i-1] > j)     // if curr sum value is greater than the current element value then just skip(take previous value)
                        dp[i][j] = dp[i-1][j];
                    else if(nums[i-1]==j)  // we got required sum
                        dp[i][j] = true;
                    else
                        dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
            return dp[n][sum];
        }
    }
