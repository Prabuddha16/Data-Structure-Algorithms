package Backtracking_Recursion.Backtracking.NQueenProblem;

/*
    Time Complexity : O(N!)
    Space Complexity : O(N)

    Where 'N' is the number of Queens.
*/

import java.util.ArrayList;

public class Solution
{
    public static void addSolution(int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> queensInRows)
    {
        ArrayList<Integer> currentAnswer = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (queensInRows.get(j) == i)
                {
                    currentAnswer.add(1);
                }
                else
                {
                    currentAnswer.add(0);
                }
            }
        }
        ans.add(currentAnswer);
    }

    public static void nQueensHelper(int col, int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> queensInRows, ArrayList<Integer> queensInDiag1, ArrayList<Integer> queensInDiag2)
    {
        if (col == n)
        {
            addSolution(n, ans, queensInRows);
            return;
        }
        for (int i = 0; i < n; i++)
        {
            if ((queensInRows.get(i) != -1) || (queensInDiag1.get(col - i + n - 1) != -1) || (queensInDiag2.get(col + i) != -1))
            {
                continue;
            }
            queensInRows.set(i, col);
            queensInDiag1.set(col - i + n - 1, col);
            queensInDiag2.set(col + i, col);
            nQueensHelper(col + 1, n, ans, queensInRows, queensInDiag1, queensInDiag2);
            queensInRows.set(i, -1);
            queensInDiag1.set(col - i + n - 1, -1);
            queensInDiag2.set(col + i, -1);
        }
        return;
    }

    public static ArrayList<ArrayList<Integer>> nQueens(int n)
    {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> queensInRows = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            queensInRows.add(-1);
        }
        ArrayList<Integer> queensInDiag1 = new ArrayList<>();
        for (int i = 0; i < 2*n; i++)
        {
            queensInDiag1.add(-1);
        }
        ArrayList<Integer> queensInDiag2 = new ArrayList<>();
        for (int i = 0; i < 2*n; i++)
        {
            queensInDiag2.add(-1);
        }
        nQueensHelper(0, n, ans, queensInRows, queensInDiag1, queensInDiag2);
        return ans;
    }
}

