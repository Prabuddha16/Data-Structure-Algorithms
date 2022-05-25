package Backtracking_Recursion.Recursion.BoardPath;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = path(n,m,0,"");
        System.out.println();
        System.out.println(a);
    }
    public static int path(int n,int m, int pre, String s){
        if(pre==n){
            System.out.print(s+" ");
            return 1;
        }
        if(pre > n){
            return 0;
        }
        int c=0;
        for(int i=1;i<=m;i++){
            c+=path(n,m,pre+i,s+i);
        }
        return c;
    }
}

