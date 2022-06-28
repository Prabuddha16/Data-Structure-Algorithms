package Backtracking_Recursion.Backtracking.PathsInAMaze;

/*
    Time Complexity: O(3^( N^2))
    Space Complexity: O(3^( N^2))

    Where 'N' is the number of rows and columns in the given matrix.
*/

import java.util.ArrayList;

public class Solution
{

    //    Direction notations
    private static int di[] = {1, -1, 0, 0};
    private static int dj[] = {0, 0, 1, -1};
    private static char d[] = {'D', 'U', 'R', 'L'};

    private static boolean isValidMove(int i, int j, ArrayList<ArrayList<Boolean>> visited, ArrayList<ArrayList<Integer>> arr)
    {
        return (i >= 0 && j >= 0 && i < arr.size() && j < arr.get(i).size() && arr.get(i).get(j) == 1 && !visited.get(i).get(j));
    }

    private static void allPossiblePaths(int i, int j, StringBuilder currentPath, ArrayList<String> allPaths, ArrayList<ArrayList<Boolean>> visited, ArrayList<ArrayList<Integer>> arr)
    {
        if (arr.get(i).get(j) == 0)
        {
            return;
        }
        int n = arr.size();
        if (i == n - 1 && j == n - 1)
        {
            allPaths.add(currentPath.toString());
            return;
        }
        //    Mark the current cell as visited
        visited.get(i).set(j, true);
        for (int x = 0 ; x < 4; x++)
        {
            int newI = i + di[x];
            int newJ = j + dj[x];

            if (isValidMove(newI , newJ, visited, arr))
            {
                //    Push corresponding direction to the current path.
                currentPath.append(d[x]);
                //    Recursively traverse all paths from (i+1, j).
                allPossiblePaths(newI, newJ, currentPath, allPaths, visited, arr);
                //    Pop 'D' from the current path
                currentPath.deleteCharAt(currentPath.length() - 1);
            }
        }
        //    Mark the current cell as unvisited.
        visited.get(i).set(j, false);
    }

    public static ArrayList<String> findAllPaths(ArrayList<ArrayList<Integer>> arr)
    {
        //    For storing all paths from (0,0) to (N-1, N-1)
        ArrayList<String> allPaths = new ArrayList<>();

        int n = arr.size();

        //    For marking all visited cells
        ArrayList<ArrayList<Boolean>> visited = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
        {
            visited.add(new ArrayList<Boolean>(n));
            for (int j = 0; j < n; j++)
            {
                visited.get(i).add(false);
            }
        }

        //    For storing the current path
        StringBuilder currentPath = new StringBuilder();
        allPossiblePaths(0, 0, currentPath, allPaths, visited, arr);
        return allPaths;
    }
}
