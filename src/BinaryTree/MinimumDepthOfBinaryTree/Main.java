package BinaryTree.MinimumDepthOfBinaryTree;

import BinaryTree.LevelOrder.TreeNode;

public class Main {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int ldepth = minDepth(root.left);
        int rdepth = minDepth(root.right);

        if (root.left == null){
            return rdepth+1;
        }

        if (root.right == null){
            return ldepth+1;
        }

        return Math.min(ldepth,rdepth)+1;
    }
}
