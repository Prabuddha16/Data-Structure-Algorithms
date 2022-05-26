package BST.ValidateBST;

public class Main {
    boolean isBST(Node root)
    {
        return recursive(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean recursive(Node root,long left,long right){
        if(root == null)
            return true;

        if(root.data>=right || root.data<=left)
            return false;

        return recursive(root.right,root.data,right) && recursive(root.left,left,root.data);
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
