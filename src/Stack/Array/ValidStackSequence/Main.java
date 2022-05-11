package Stack.Array.ValidStackSequence;

import java.util.*;

class Main
{
    static boolean validateStackSequence(int[] pushed, int[] popped, int len)
    {
        int j = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++)
        {
            st.push(pushed[i]);
            while (!st.empty() && j < len &&
                    st.peek() == popped[j])
            {
                st.pop();
                j++;
            }
        }
        return j == len;
    }

    public static void main(String[] args)
    {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        int len = pushed.length;
        System.out.println((validateStackSequence(pushed, popped, len) ? "True" : "False"));
    }
}


