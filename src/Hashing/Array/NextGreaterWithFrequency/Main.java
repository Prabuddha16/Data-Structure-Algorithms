package Hashing.Array.NextGreaterWithFrequency;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    static int[] print_next_greater_freq(int[] arr, int n)
    {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0 ; i<n ; i++ )
            if( freq.containsKey(arr[i]) )
                freq.put(arr[i], freq.get(arr[i])+1 );
            else
                freq.put(arr[i],1);

        Stack<Integer> stak = new Stack<Integer>();
        int[] ngf = new int[n];

        for(int i=0; i<n; i++)
        {
            int temp = freq.get(arr[i]);
            while(!stak.empty())
                if( temp > freq.get( arr[stak.peek()] ) )
                    ngf[stak.pop()] = arr[i];
                else
                    break;
            stak.push(i);
        }
        while(!stak.empty())
            ngf[stak.pop()] = -1;

        return ngf;
    }

    public static void main(String[] args) {
        int[] a = {2,1,1,3,2,1};
        int n = a.length;
        int[] sol = print_next_greater_freq(a,n);
        for(int i=0;i< sol.length;i++){
            System.out.print(sol[i]+" ");
        }
    }
}
