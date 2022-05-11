package Stack.SortStack;

import java.util.Stack;

public class Main {
    public Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> st = new Stack<>();
        while(!s.isEmpty())
        {
            int tmp = s.pop();
            while(!st.isEmpty() && st.peek()  > tmp){
                s.push(st.pop());
            }
            st.push(tmp);
        }
        return st;
    }

    public static void main(String[] args) {
        Main m = new Main();
        Stack<Integer> sc = new Stack<>();
        sc.push(3);
        sc.push(2);
        sc.push(1);
        Stack<Integer> ans = m.sort(sc);
        while (!ans.empty()){
            System.out.print(ans.peek()+" ");
            ans.pop();
        }
        System.out.println();
    }
}
