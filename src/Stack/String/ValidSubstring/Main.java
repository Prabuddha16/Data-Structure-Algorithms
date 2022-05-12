package Stack.String.ValidSubstring;

import java.util.Stack;

public class Main {
    static int findMaxLen(String S) {
        int max = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }
                else{
                    max = Math.max(max,i-st.peek());
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(findMaxLen(s));
    }
}
