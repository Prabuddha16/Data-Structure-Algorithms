package Stack.String.ParenthesisChecker;

import java.util.Scanner;
import java.util.Stack;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- >0)
        {
            String st = sc.next();
            new Solution();
            if(Solution.ispar(st))
                System.out.println("balanced");
            else
                System.out.println("not balanced");

        }
    }
}

class Solution
{
    static boolean ispar(String x)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='(' || x.charAt(i)=='[' ||  x.charAt(i)=='{')
                st.push(x.charAt(i));

            else if((!st.empty() && x.charAt(i)==')' && st.peek()=='(') ||
                    (!st.empty() && x.charAt(i)==']' && st.peek()=='[') ||
                    (!st.empty() && x.charAt(i)=='}' && st.peek()=='{')  )
                st.pop();

            else return false;

        }
        return st.empty();
    }
}

