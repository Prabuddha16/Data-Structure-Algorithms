package Backtracking_Recursion.Recursion.TowerHanoi.ArrayList;

/*
    Time Complexity: O(2 ^ N)
    Space Complexity: O(N)

    Where 'N' is the number of disks.
*/

import java.util.ArrayList;

public class Solution
{
    private static void moveDisks(int n, int toRod, int fromRod, ArrayList < ArrayList<Integer>> moves)
    {
        if (n == 1)
        {
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(fromRod);
            ans.add(toRod);
            moves.add(ans);
            return;
        }
        int rem = 1 ^ 2 ^ 3 ^ toRod ^ fromRod;
        moveDisks(n - 1, rem, fromRod, moves);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(fromRod);
        ans.add(toRod);
        moves.add(ans);
        moveDisks(n - 1, toRod, rem, moves);
    }

    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n)
    {
        ArrayList < ArrayList<Integer>> moves = new ArrayList<>();
        moveDisks(n, 2, 1, moves);
        return moves;
    }
}
