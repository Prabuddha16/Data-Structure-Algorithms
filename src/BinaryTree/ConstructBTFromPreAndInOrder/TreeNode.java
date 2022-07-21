package BinaryTree.ConstructBTFromPreAndInOrder;

//o(n) / o(n)
import java.util.HashMap;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

    TreeNode(int val) {
          this.val = val;
      }
      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }
 }

class Solution {
    int preIdx;
    HashMap<Integer,Integer> inIdx;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        preIdx = 0;
        inIdx = new HashMap<>();
        for(int i=0; i<n; i++){
            inIdx.put(inorder[i], i);
        }
        return arrToTree(preorder,0,n-1);
    }

    private TreeNode arrToTree(int[] preorder, int l, int r){
        if(l>r)
            return null;
        int rootValue = preorder[preIdx++];
        TreeNode root = new TreeNode(rootValue);
        root.left = arrToTree(preorder, l, inIdx.get(rootValue)-1);
        root.right = arrToTree(preorder, inIdx.get(rootValue)+1, r);
        return root;
    }
}
