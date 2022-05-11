package Stack.Array.MaximumAreaHistogram;

import java.util.*;
import java.lang.*;

//largest area histogram
//T=O(n) S=O(n)

public class Main
{

    //Method-1
    public static int getMaxArea(int[] arr, int n)
    {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int max_area = arr[0];
        int[] left_smaller = new int[n];
        int[] right_smaller = new int[n];
        for (int i = 0; i < n; i++){
            left_smaller[i] = -1;
            right_smaller[i] = n;
        }

        int i = 0;
        while (i < n)
        {
            while(!s.empty()&&s.peek()!=-1&&arr[i]<arr[s.peek()]){
                right_smaller[s.peek()] = i;
                s.pop();
            }
            if(i>0&&arr[i]==arr[(i-1)]){
                left_smaller[i] = left_smaller[i-1];
            }else{
                left_smaller[i] = s.peek();
            }
            s.push(i);
            i++;
        }

        for(i = 0; i<n; i++){
            max_area = Math.max(max_area, arr[i]*(right_smaller[i] - left_smaller[i] - 1));
        }
        return max_area;
    }

    //Method-2
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;

        Stack<Integer> s = new Stack<>();
        s.push(-1);

        int max_area = arr[0];
        int[] ls = new int[n];
        int[] rs = new int[n];

        for (int i = 0; i < n; i++){
            ls[i] = -1;
            rs[i] = n;
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
        int n = sc.nextInt();
        int[] hist = new int[n];
        for(int i=0;i<n;i++){
            hist[i]= sc.nextInt();
        }

        System.out.println(getMaxArea(hist, hist.length));

        System.out.println(largestRectangleArea(hist));
    }
}


