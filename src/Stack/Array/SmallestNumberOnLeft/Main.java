package Stack.Array.SmallestNumberOnLeft;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.add(-1);
        for(int i=0;i<a.length;i++){
            while(s.peek()>=a[i]){
                s.pop();
            }
            ans.add(s.peek());
            s.add(a[i]);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {1,6,2};
        int n = a.length;
        List<Integer> res = new ArrayList<>();
        res = leftSmaller(n,a);
        for(int i=0;i<n;i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
