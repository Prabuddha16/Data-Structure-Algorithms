package BinaryTree.ReverseLevelOrder;
import BinaryTree.LevelOrder.TreeNode;

import java.util.*;

public class Main {
    public ArrayList<Integer> reverseLevelOrder(Node node)
    {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(node);
        while(q.size()!=0){
            Node temp = q.remove();
            ans.add(0,temp.data);
            if(temp.right!=null)
                q.add(temp.right);
            if(temp.left!=null)
                q.add(temp.left);
        }
        return ans;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        if(root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> level = new LinkedList<>();
            for(int i = q.size() ; i > 0; i--){
                TreeNode n = q.peek();
                if(n.left != null)
                    q.offer(n.left);
                if(n.right != null)
                    q.offer(n.right);
                level.add(q.poll().val);
            }
            ans.add(0, level);
        }
        return ans;
    }

    void reverselevelOrder(Node node)
    {
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        Q.add(node);
        while (Q.isEmpty() == false)
        {
            node = Q.peek();
            Q.remove();
            S.push(node);
            if (node.right != null)
                Q.add(node.right);
            if (node.left != null)
                Q.add(node.left);
        }
        while (S.empty() == false)
        {
            node = S.peek();
            System.out.print(node.data + " ");
            S.pop();
        }
    }
}

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
