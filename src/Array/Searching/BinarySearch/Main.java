package Array.Searching.BinarySearch;

import java.io.*;
import java.util.*;
//o(nlogn)
//o(1)
public class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            int key =sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr,n,key));
            T--;
        }
    }
}

class Solution {
    int binarysearch(int[] arr, int n, int k){
        int L=0;
        int H=n-1;
        while(L<=H){
            int M = (L+H)/2;
            if(arr[M]==k){
                return M;
            }else if(arr[M]>k){
                H=M-1;
            }else{
                L=M+1;
            }
        }
        return -1;
    }
}
