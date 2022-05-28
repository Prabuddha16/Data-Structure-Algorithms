package BinaryTree.ZigZagTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayDeque<Node> s1 = new ArrayDeque<>();
        ArrayDeque<Node> s2 = new ArrayDeque<>();

        ArrayList<Integer> list = new ArrayList<>();

        s1.push(root);
        list.add(root.data);

        Node cur;

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                cur = s1.pop();
                if (cur.right != null) {
                    s2.push(cur.right);
                    list.add(cur.right.data);
                }
                if (cur.left != null) {
                    s2.push(cur.left);
                    list.add(cur.left.data);
                }
            }

            while (!s2.isEmpty()) {
                cur = s2.pop();
                if (cur.left != null) {
                    s1.push(cur.left);
                    list.add(cur.left.data);
                }
                if (cur.right != null) {
                    s1.push(cur.right);
                    list.add(cur.right.data);
                }
            }
        }
        return list;
    }

    //****
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        levelOrder(ans, root, 0);
        return ans;
    }

    public void levelOrder(List<List<Integer>> ans, TreeNode root, int level) {
        if(root == null){
            return;
        } else {
            if(level >= ans.size()){
                ans.add(new ArrayList<>());
            }
            if(level % 2 == 0){
                ans.get(level).add(root.val);
            } else {
                ans.get(level).add(0, root.val);
            }
            levelOrder(ans, root.left, level + 1);
            levelOrder(ans, root.right, level + 1);
        }
    }
}

class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}

class TreeNode
{
    int val;
    TreeNode left,right;
    TreeNode(int d)
    {
        val=d;
        left=right=null;
    }
}
