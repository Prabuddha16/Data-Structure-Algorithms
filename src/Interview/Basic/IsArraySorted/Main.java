package Interview.Basic.IsArraySorted;

import java.util.Scanner;

public class Main {
    public static boolean sorted(int[] a,int n){
        if(n==1 || n==0){
            return true;
        }
        return a[n-1]>=a[n-2] && sorted(a,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(sorted(a, n));
    }
}

