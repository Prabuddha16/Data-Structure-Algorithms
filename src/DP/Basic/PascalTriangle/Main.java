package DP.Basic.PascalTriangle;

//o(n^2) / o(n^2)

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList();
        int [][] dp = new int [n][n];
        dp[0][0]=1;

        for(int i=1;i<n;i++){
            dp[i][0] = 1;
            dp[i][i] = 1;
            for(int j=1;j<i;j++){
                dp[i][j]= dp[i-1][j-1]+dp[i-1][j];
            }
        }

        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList();
            for(int j=0;j<=i;j++){
                list.add(dp[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}

class Solution {
    public static void printPascal(int n)
    {
        int[][] arr = new int[n][n];
        for (int line = 0; line < n; line++)
        {
            for (int i = 0; i <= line; i++)
            {
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }

    public static void main (String[] args) {
        int n = 5;
        printPascal(n);
    }

}
