package Interview.Array.MergeArray;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n*k];
        for(int i=0; i<n*k; i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0; i<n*k; i++)
            System.out.print(a[i]+" ");
    }
}
