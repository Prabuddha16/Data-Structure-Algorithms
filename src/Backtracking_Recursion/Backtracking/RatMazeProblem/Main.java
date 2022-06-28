package Backtracking_Recursion.Backtracking.RatMazeProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    /*
    Time Complexity: O(3^(n^2));
    Space Complexity: O(1);
     */
    static ArrayList<String> res;
    public static ArrayList<String> findPath(int[][] m, int n) {
        res = new ArrayList<>();
        int[] dx = { 1,  0, 0, -1 };
        int[] dy = { 0, -1, 1,  0 };
        if (m[0][0] == 1) {
            m[0][0] = 2;
            findPathHelper(m, n, 0, 0, dx, dy, "");
        }
        return res;
    }

    private static void findPathHelper(int[][] m, int n, int x, int y, int[] dx, int[] dy, String path) {
        if (x == n - 1 && y == n - 1) {
            res.add(path);
            return;
        }
        String dir = "DLRU";
        for (int i = 0; i < 4; i++) {
            int row = x + dx[i];
            int col = y + dy[i];
            if (isValid(row, col, m, n)) {
                m[row][col] = 2;                // used to track visited cells of matrix
                findPathHelper(m, n, row, col, dx, dy, path + dir.charAt(i));
                m[row][col] = 1;                // mark it unvisited yet explorable
            }
        }
    }

    private static boolean isValid(int row, int col, int[][] m, int n) {
        if (row >= 0 && row < n && col >= 0 && col < n && m[row][col] == 1) {
            return true;
        }
        return false;
    }
}

class Solution {
    public static int[][] visited = new int[5][5];
    public static ArrayList<String> result = new ArrayList<>();
    public static void path(int[][] m, int x, int y, String dir, int n) {
        if (x == n - 1 && y == n - 1) {
            result.add(dir);
            return;
        }
        if (m[x][y] == 0 || visited[x][y] == 1) {
            return;
        }
        visited[x][y] = 1;
        if (x > 0) {
            path(m, x - 1, y, dir + 'U', n);
        }
        if (y > 0) {
            path(m, x, y - 1, dir + 'L', n);
        }
        if (x < n - 1) {
            path(m, x + 1, y, dir + 'D', n);
        }
        if (y < n - 1) {
            path(m, x, y + 1, dir + 'R', n);
        }
        visited[x][y] = 0;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        try {
            Arrays.fill(visited, 0);
        }
        catch (ArrayStoreException ex) {
        }
        result.clear();
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0) {
            return result;
        }
        path(m, 0, 0, "", n);
        Collections.sort(result);
        return result;
    }
}
