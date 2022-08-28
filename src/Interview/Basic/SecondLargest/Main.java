package Interview.Basic.SecondLargest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = print2largest(arr,n);
        System.out.println(ans);
    }
    static int print2largest(int[] arr, int n) {
        int f=-1,s=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>f){
                s=f;
                f=arr[i];
            }else if(arr[i]>s && arr[i]!=f){
                s=arr[i];
            }
        }
        return s;
    }
}
