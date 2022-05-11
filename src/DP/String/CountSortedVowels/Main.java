package DP.String.CountSortedVowels;

import java.util.Scanner;

class Main{
    static int solve1(int n)
    {
        int[][] DP = new int [n + 1][6];
        DP[1][1] = 1;

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < 6; j++)
            {
                if (i == 1)
                {
                    DP[i][j] = DP[i][j - 1] + 1;
                }
                else
                {
                    DP[i][j] = DP[i][j - 1] + DP[i - 1][j];
                }
            }
        }
        return DP[n][5];
    }

    static int solve2(int n)
    {
        return (n+1)*(n+2)*(n+3)*(n+4)/24;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // T=O(N*5) S=O(N*5)
        System.out.println(solve1(N));

        // T=O(1) S=O(1)
        System.out.println(solve2(N));
    }
}


