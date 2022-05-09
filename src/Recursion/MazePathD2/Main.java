package Recursion.MazePathD2;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = path(1, 1, n, n, "");
        System.out.println();
        System.out.println(a);
    }

    public static int path(int i, int j, int n, int m, String s) {
        if(i == n && j == m) {
            System.out.print(s+" ");
            return 1;
        }

        if(i>n || j>m)
            return 0;

        int res = 0;
        res += path(i+1, j, n, m, s+"V");
        res += path(i, j+1, n, m, s+"H");

        if(i == j || i+j == n+1)
            res += path(i+1, j+1, n, m, s+"D");
        return res;
    }
}
