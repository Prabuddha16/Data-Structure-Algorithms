package Stack.Stack.StackDesigner;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static Stack<Integer> _push(ArrayList<Integer> arr, int n)
    {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            s.push(arr.get(i));
        }
        return s;
    }

    public static void _pop(Stack<Integer>s)
    {
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}
