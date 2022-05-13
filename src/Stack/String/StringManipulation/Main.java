package Stack.String.StringManipulation;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

    //Method-1
    static int removeConsecutive(Vector<String> v)
    {
        Stack<String> stack= new Stack<>();
        stack.push(v.get(0));
        for(int i=1;i<v.size();i++)
        {
            if(!stack.isEmpty())
            {
                if(v.get(i).equals(stack.peek()))
                {

                    stack.pop();
                }
                else
                {
                    stack.add(v.get(i));
                }
            }
            else
            {
                stack.add(v.get(i));
            }
        }

        return stack.size();
    }


    //Method-2
    static int removeConsecutiveSame(Vector <String > v)
    {
        Stack<String> stack=new Stack<String>();
        stack.push(v.get(0));
        for(int i=1;i<v.size();i++){
            String str=v.get(i);
            if(stack.size()>0 && stack.peek().equals(str)){
                stack.pop();
            }else{
                stack.push(str);
            }
        }

        return stack.size();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //String[] v = {"ab", "aa", "aa", "bcd", "ab"};
        Vector<String> v = new Vector<>();
        for(int i=0;i<n;i++){
            v.addElement(sc.next());
        }
        int ans = removeConsecutive(v);
        int sol = removeConsecutiveSame(v);
        System.out.println(ans);
        System.out.println(sol);
    }
}
