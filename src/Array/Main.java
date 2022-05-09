package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static int highest(int[] arr, int n){
        Map<Integer, Integer> hp =
                new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            int key = arr[i];
            if(hp.containsKey(key))
            {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            }
            else
            {
                hp.put(key, 1);
            }
        }

        // find max frequency.
        int max_count = 0, res = -1;

        for(Entry<Integer, Integer> val : hp.entrySet())
        {
            if (max_count < val.getValue())
            {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return res;
    }

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
        int ans,res;
        ans = highest(a,n);
        res = subarrays(a,n);
        System.out.println(ans);
        System.out.println(res);
    }
}