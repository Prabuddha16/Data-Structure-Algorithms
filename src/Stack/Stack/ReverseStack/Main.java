package Stack.Stack.ReverseStack;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            list.add(s.peek());
            s.pop();
        }
        return list;
    }
}

