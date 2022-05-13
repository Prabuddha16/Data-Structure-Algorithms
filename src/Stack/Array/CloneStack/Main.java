package Stack.Array.CloneStack;

import java.util.Stack;

public class Main {
    static void solve(Stack<Integer> st, Stack<Integer> cl){
        for(int i : st){
            cl.push(i);
        }
        if(st.equals(cl)){
            System.out.println("Cloned");
        }else{
            System.out.println("Not Cloned");
        }
        System.out.println(cl);
    }
    public static void main(String[] args) {
        int[] s = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7};
        Stack<Integer> st = new Stack<>();
        Stack<Integer> cl = new Stack<>();
        for(int i = 0; i< s.length; i++){
            st.push(s[i]);
        }
        System.out.println(cl);
        solve(st,cl);
    }
}
