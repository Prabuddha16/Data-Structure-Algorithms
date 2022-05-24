package Stack.Stack.SpecialStack;

import java.util.Stack;

public class Main {
    public int min = Integer.MAX_VALUE;
    public void push(int a, Stack<Integer> s)
    {
        min = Math.min(a, min);
        s.push(a);
    }
    public int pop(Stack<Integer> s)
    {
        return s.pop();
    }
    public int min(Stack<Integer> s)
    {
        return min;
    }
    public boolean isFull(Stack<Integer>s, int n)
    {
        return (s.size()==n)?true: false;
    }
    public boolean isEmpty(Stack<Integer>s)
    {
        return s.isEmpty();
    }
}
