package Searching.ExistOrNot;

import java.util.*;
public class Main {

    private static boolean solve(int[] a, int k)
    {
        Arrays.sort(a);
        int ans = Arrays.binarySearch(a, k);
        return ans > 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int l = sc.nextInt();
            int [] a = new int[l];
            for(int i=0; i<l; i++){
                a[i]=sc.nextInt();
            }
            int q = sc.nextInt();

            while(q--!=0){
                int n = sc.nextInt();
                if(solve(a,n)){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }
}