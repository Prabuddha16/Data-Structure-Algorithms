package Stack.Tree.SpiralOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Main {
    ArrayList<Integer> findSpiral(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);
        Node cur;

        while(!s1.isEmpty() || !s2.isEmpty()){

            while(!s1.isEmpty()){
                cur = s1.pop();
                ans.add(cur.data);
                if(cur.right != null)
                    s2.push(cur.right);
                if(cur.left != null)
                    s2.push(cur.left);
            }

            while(!s2.isEmpty()){
                cur = s2.pop();
                ans.add(cur.data);
                if(cur.left != null)
                    s1.push(cur.left);
                if(cur.right != null)
                    s1.push(cur.right);
            }
        }

        return ans;
    }
}
