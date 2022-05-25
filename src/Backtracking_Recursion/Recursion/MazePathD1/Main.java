package Backtracking_Recursion.Recursion.MazePathD1;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int ans = path(1, 1, x, y, "");
        System.out.println();
        System.out.println(ans);
    }
    public static int path(int sx, int sy, int dx, int dy, String s) {
        if(sx == dx && sy == dy) {
            System.out.print(s+" ");
            return 1;
        }
        if(sx>dx || sy>dy)
            return 0;
        return  path(sx+1, sy, dx, dy, s+"V") +
                path(sx, sy+1, dx, dy, s+"H") +
                path(sx+1, sy+1, dx, dy, s+"D");
    }
}
