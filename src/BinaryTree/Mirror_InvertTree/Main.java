package BinaryTree.Mirror_InvertTree;

public class Main {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
    void mirror(TreeNode root) {
        if(root == null)
            return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }
}
