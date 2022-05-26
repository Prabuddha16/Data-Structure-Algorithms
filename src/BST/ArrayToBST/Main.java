package BST.ArrayToBST;

import BinaryTree.Mirror_InvertTree.TreeNode;

public class Main {
    //o(n)/o(n)
    public TreeNode binarysearch(int[] nums, int start, int end){
        if(start>end){
            return null;
        }

        int mid=(start+end)/2;
        TreeNode temp = new TreeNode(nums[mid]);

        temp.left = binarysearch(nums,start,mid-1);
        temp.right = binarysearch(nums,mid+1,end);
        return temp;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length - 1;
        return binarysearch(nums, 0, n);
    }
}


/*  Method 2nd with Array using recursion => o(n)/o(n)

    private int[] ans;
    private int id=0;

    private void BST_Preorder(int[] nums, int start, int end)
    {
        if(start>end) return;

        int mid=(start+end)/2;

        ans[id++]=nums[mid];

        BST_Preorder(nums, start, mid-1);
        BST_Preorder(nums, mid+1, end);
    }

    public int[] sortedArrayToBST(int[] nums)
    {
        int n = nums.length;
        ans = new int[n];

        BST_Preorder(nums, 0, n-1);

        return ans;
    }
 */
