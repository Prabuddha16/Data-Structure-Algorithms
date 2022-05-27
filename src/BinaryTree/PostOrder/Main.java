package BinaryTree.PostOrder;

import java.util.ArrayList;

public class Main {
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        order(root, ans);
        return ans;
    }
    private void order(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        order(root.left, list);
        order(root.right, list);
        list.add(root.data);
    }
}

class Node {
    int data;
    Node left, right;
    Node(int item)    {
        data = item;
        left = right = null;
    }
}
