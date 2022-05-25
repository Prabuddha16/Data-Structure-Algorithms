package BinaryTree.BalancedTree;

import BinaryTree.Mirror_InvertTree.TreeNode;

public class Main {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

        int lh = height(root.left);
        int rh = height(root.right);

        int diff = Math.abs(lh-rh);
        if(diff > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    int height(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
}
