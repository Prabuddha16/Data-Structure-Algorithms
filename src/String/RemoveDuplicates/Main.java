package String.RemoveDuplicates;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String  remove(String s){
        String ans = "";
        for (int i=0;i<s.length();i++){
            if(!ans.contains(s.substring(i,i+1))){
                ans=ans + s.substring(i,i+1);
            }
        }
        return ans;
    }

    //remove all adjacent duplicates from string
    public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(st.size() != 0 && st.peek() == s.charAt(i))
                st.pop();
            else
                st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st)
            sb.append(c);
        return sb.toString();
    }

// Recursively remove all adjacent from string
    String rremove(String s) {
        if(s.length()<=1)
            return s;
        StringBuilder str = new StringBuilder();
        for(int i =0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                int j =i;
                while(j<s.length() && s.charAt(i)==s.charAt(j))
                    j++;
                i=j-1;
            }else
                str.append(s.charAt(i));
        }
        if(s.charAt(s.length()-2)!=s.charAt(s.length()-1))
            str.append(s.charAt(s.length()-1));
        if(s.length()==str.length())
            return s;
        return rremove(str.toString());
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       System.out.println(remove(s));
        System.out.println(removeDuplicates(s));
    }
}

