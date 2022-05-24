package Stack.Stack.GetMinAtPop;

import java.util.Stack;
/*
Input:
N = 5
A = {1 2 3 4 5}
Output:
1 1 1 1 1

Input:
N = 7
A = {1 6 43 1 2 0 5}
Output:
0 0 1 1 1 1 1
*/
public class Main {
    public static Stack<Integer> _push(int[] arr, int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            s.push(arr[i]);
        }
        return s;
    }

    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s)
    {
        while(!s.isEmpty())
        {
            int min=Integer.MAX_VALUE;
            for(int x : s)
            {
                if(x<min)
                {
                    min=x;
                }
            }
            s.pop();
            System.out.print(min+" ");
        }
    }
}
