package String.GenerateParenthesis;

import java.util.*;

public class Main {

    static void parenth(char[] str, int a , int n, int b, int c){
        if(c==n){
            for (char value : str) {
                System.out.print(value);
            }
            System.out.println();
        }else{
            if(b>c){
                str[a]=')';
                parenth(str,a+1,n,b,c+1);
            }
            if(b<n){
                str[a]='(';
                parenth(str,a+1,n,b+1,c);
            }
        }
    }

    static void parenthesis(char[] str, int n){
        if(n>0)
            parenth(str,0,n,0,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] str = new char[2*n];
        parenthesis(str,n);
    }
}
