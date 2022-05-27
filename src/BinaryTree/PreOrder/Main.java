package BinaryTree.PreOrder;

import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        order(root, ans);
        return ans;
    }
    private static void order(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }

        list.add(root.data);
        order(root.left, list);
        order(root.right, list);
    }

}

class Node{
  int data;
  Node left,right;
  Node(int d){
    data=d;
    left=right=null;
   }
}
