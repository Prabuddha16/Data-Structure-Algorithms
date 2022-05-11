package Stack.Array.LargestAreaHistogram;

import java.util.Stack;
import java.util.*;
import java.lang.*;

public class Main
{
    public static long getMaxArea(long[] arr, long n)
    {
        Stack<Integer> s = new Stack<>();
        s.push(-1);

        long max_area = arr[0];
        int[] ls = new int[(int)n];
        int[] rs = new int[(int)n];

        for (int i = 0; i < n; i++){
            ls[i] = -1;
            rs[i] = (int)n;
        }

        int i = 0;
        while (i < n)
        {
            while(!s.empty() && s.peek() != -1 && arr[i] < arr[s.peek()]){
                rs[s.peek()] = (int)i;
                s.pop();
            }
            if(i>0 && arr[i] == arr[(i-1)]){
                ls[i] = ls[(int)(i-1)];
            }else{
                ls[i] = s.peek();
            }
            s.push(i);
            i++;
        }
        for(i = 0; i<n; i++){
            max_area = Math.max(max_area, arr[i]*(rs[i] - ls[i] - 1));
        }
        return max_area;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long[] hist = new long[(int)n];
        for(int i=0;i<n;i++){
            hist[i]= sc.nextInt();
        }
        System.out.println(getMaxArea(hist,n));
    }
}



