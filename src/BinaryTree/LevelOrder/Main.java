package BinaryTree.LevelOrder;

import java.util.*;

public class Main {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new ArrayDeque<>();
        if(root == null){
            return lst;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < count; i++){
                TreeNode node = q.poll();
                res.add(node.val);

                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            lst.add(res);
        }
        return lst;
    }

    static ArrayList<Integer> levelorder(Node node) {
        ArrayList<Integer> res = new ArrayList<Integer>(0);
        if (node == null)
            return res;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (q.isEmpty() == false) {
            node = q.peek();
            res.add(node.data);
            q.poll();
            if (node.left != null)
                q.add(node.left);
            if (node.right != null)
                q.add(node.right);
        }
        return res;
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