package Queue.ReverseFirstK_element;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            while (n--> 0) {
                q.add((int)sc.nextInt());
            }
            Solve g = new Solve();
            Queue<Integer> ans = g.modifyQueue(q, k);
            while (!ans.isEmpty()) {
                int a = ans.peek();
                ans.poll();
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
class Solve {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int count=0;
        while(!q.isEmpty()){
            count++;
            st.push(q.poll());
            if(count==k){
                break;
            }
        }
        while(!st.empty()){
            ans.add(st.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;
    }
}

