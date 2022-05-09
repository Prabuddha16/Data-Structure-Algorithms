package Recursion.RatChases;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] mat = new int[x][y];
        String[] input = new String[x];
        sc.nextLine();
        for(int i = 0; i<x; i++) {
            input[i] = sc.nextLine();
        }
        boolean flag = path(input, 0, 0, x, y, mat);
        if(!flag)
            System.out.print("NO PATH FOUND");
    }
    public static boolean path(String[] input,int sx, int sy, int dx, int dy, int[][] mat) {
        if(sx == dx-1 && sy == dy-1) {
            mat[sx][sy] = 1;
            for(int i = 0; i<dx; i++) {
                for(int j = 0; j<dy;j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            return true;
        }

        if(sx>=dx || sy>=dy || sx<0 || sy<0 || input[sx].charAt(sy) == 'X' || mat[sx][sy] == 1) return false;

        mat[sx][sy] = 1;

        boolean flag = false;

        flag = path(input, sx+1, sy, dx, dy, mat) ||
                path(input, sx-1, sy, dx, dy, mat) ||
                path(input, sx, sy+1, dx, dy, mat) ||
                path(input, sx, sy-1, dx, dy, mat);

        mat[sx][sy] = 0;

        return flag;


    }
}
