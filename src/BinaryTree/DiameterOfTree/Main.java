package BinaryTree.DiameterOfTree;

import BinaryTree.Mirror_InvertTree.TreeNode;

public class Main {
    int sol;
    public int fun(TreeNode root){
        if(root==null)
            return 0;
        int x = fun(root.left);
        int y = fun(root.right);
        sol = Math.max(sol,x+y);
        return (Math.max(x,y)+1);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        sol = Integer.MIN_VALUE;
        fun(root);
        return sol;
    }
}
