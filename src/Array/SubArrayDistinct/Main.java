package Array.SubArrayDistinct;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //SubArray with Distinct elements
    public static int subarrays(int[] arr, int n){
        Set<Integer> s = new HashSet<>();
        int j = 0, ans = 0;
        for (int i = 0; i < n; i++)
        {
            while (j < n && !s.contains(arr[j]))
            {
                s.add(arr[j]);
                j++;
            }
            ans += ((j - i) * (j - i + 1)) / 2;
            s.remove(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int res;
        res = subarrays(a,n);
        System.out.println(res);
    }
}
