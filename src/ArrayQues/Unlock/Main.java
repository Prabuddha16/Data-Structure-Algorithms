package ArrayQues.Unlock;

import java.util.*;

public class Main {

    private static void solve(int[] a, int n, int k)
    {
        int[] p = new int[n + 1];

        for (int i = 0; i < n; ++i)
            p[a[i]] = i;

        for (int i = 0; i < n && k > 0; ++i) {
            if (a[i] == n - i)
                continue;
            int temp = p[n - i];
            p[a[i]] = p[n - i];
            p[n - i] = i;
            int tmp = a[temp];
            a[temp] = a[i];
            a[i] = tmp;
            --k;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        solve(a,n,k);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
