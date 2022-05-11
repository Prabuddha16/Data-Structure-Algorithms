package Stack.String.LongestValidParenthesis;

import java.util.Stack;

public class Main {
    public static int longestValidParentheses(String S) {
        Stack<Integer> st = new Stack<>();
        int c = 0;
        st.push(-1);
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int m = i-st.peek();
                    c = Math.max(m,c);
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "()(()))))";
        System.out.println(longestValidParentheses(s));
    }
}
