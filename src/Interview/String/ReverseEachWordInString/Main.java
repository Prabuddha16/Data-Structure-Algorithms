package Interview.String.ReverseEachWordInString;

import java.util.Stack;

public class Main {
    static void reverseWords(String str)
    {
        Stack<Character> st=new Stack<Character>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (!st.empty()) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (!st.empty()) {
            System.out.print(st.pop());
        }
    }
    public static void main(String[] args) {
        String s ="java code";
        reverseWords(s);
    }
}
