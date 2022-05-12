package Stack.String.BackspaceStrCompare;

import java.util.Stack;

public class Main {
    static boolean solve(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char ch : s.toCharArray()) {
            if (ch == '#') {
                if (!s1.isEmpty()) {
                    s1.pop();
                    continue;
                }
                s1.push(ch);
            }
        }
        for (char ch : t.toCharArray()) {
                if (ch == '#') {
                    if (!s2.isEmpty()) {
                        s2.pop();
                        continue;
                    }
                    s2.push(ch);
                }
        }

            String s3="";
            String s4="";
            while(!s1.isEmpty()){
                s3 += s1.pop();
            }
            while(!s2.isEmpty()){
                s4 += s2.pop();
            }
            return s3.equals(s4);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean ans = solve(s,t);
        System.out.println(ans);
    }
}


