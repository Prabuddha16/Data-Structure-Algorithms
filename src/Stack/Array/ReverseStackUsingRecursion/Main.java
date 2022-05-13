package Stack.Array.ReverseStackUsingRecursion;

import java.util.ArrayList;
import java.util.Stack;

class Main {

    //Method-1
    static Stack<Character> st = new Stack<>();
    static void insert_at_bottom(char x)
    {
        if(st.isEmpty())
            st.push(x);

        else
        {
            char a = st.peek();
            st.pop();
            insert_at_bottom(x);
            st.push(a);
        }
    }

    static void reverse()
    {
        if(st.size() > 0)
        {
            char x = st.peek();
            st.pop();
            reverse();
            insert_at_bottom(x);
        }
    }


    //Method-2
    static ArrayList<Integer> reverse(Stack<Integer> s)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        return fun(s,ans);
    }
    static ArrayList<Integer> fun(Stack<Integer> s, ArrayList<Integer> ans){
        if(s.isEmpty()){
            return ans;
        }
        ans.add(s.pop());
        return fun(s,ans);
    }

    public static void main(String[] args)
    {
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");
        System.out.println(st);
        reverse();
        System.out.println("Reversed Stack");
        System.out.println(st);
    }
}
