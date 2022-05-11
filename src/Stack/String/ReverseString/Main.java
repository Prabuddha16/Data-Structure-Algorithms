package Stack.String.ReverseString;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String reverse(String S){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverse(s);
        System.out.println(ans);
    }
}
