package BinaryTree.DiagonalSum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class Tree {
    public static ArrayList<Integer> diagonalSum(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.offer(root);
        while (!q1.isEmpty())
        {
            int sum = 0;
            while (!q1.isEmpty())
            {
                Node n = q1.poll();
                if(n.right != null)
                    q1.offer(n.right);
                sum += n.data;
                q2.offer(n);
            }
            list.add(sum);
            while (!q2.isEmpty())
            {
                Node n = q2.poll();
                if (n.left != null)
                    q1.offer(n.left);
            }
        }
        return list;
    }
}
