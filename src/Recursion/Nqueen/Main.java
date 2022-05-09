package Recursion.Nqueen;

import java.util.*;

public class Main {
    static int c = 0;
    public static void count(int[][] a, int i, int N) {
        if(i == a.length){
            c++;
            return;
        }
        for(int j=0;j<a.length;j++){
            if(isQueue(a,i,j,N)){
                a[i][j] = 1;
                count(a,i+1,N);
                a[i][j] = 0;
            }
        }
    }
    public static boolean isQueue(int[][] a, int cr, int cc,int N){
        for(int i = 0;i<=cr-1;i++){
            if(a[i][cc] == 1){
                return false;
            }
        }
        int i = cr;
        int j = cc;

        while(i>= 0 && j<N){
            if(a[i][j] == 1){
                return false;
            }
            i--;
            j++;
        }
        i = cr;
        j = cc;

        while(i>=0 && j>=0){
            if(a[i][j] == 1){
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] board = new int[N][N];
        count(board,0,N);
        System.out.println(c);
    }
}
