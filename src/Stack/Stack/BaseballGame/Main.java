package Stack.Stack.BaseballGame;

import java.util.Stack;

public class Main {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        int x=0;
        for(int i=0;i<ops.length;++i)
        {
            String s= ops[i];

            if(s.equals("+"))
            {
                x= st.pop();
                int y= st.peek()+x;
                st.push(x);
                st.push(y);
            }
            else if(s.equals("D"))
            {
                x=st.peek();
                st.push(2*x);
            }
            else if(s.equals("C"))
            {
                st.pop();
            }
            else
            {
                st.push(Integer.parseInt(s));
            }

        }
        int sum=0;
        while(!st.empty())
            sum+=st.pop();
        return sum;
    }
}
