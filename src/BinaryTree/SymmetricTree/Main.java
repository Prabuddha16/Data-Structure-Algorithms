package BinaryTree.SymmetricTree;

class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
}

public class Main {
    public static boolean isSymmetric(Node A)
    {
        if(A==null || (A.left==null && A.right==null))
            return true;
        if(A.left==null || A.right==null)
            return false;
        if(isMirror(A.left,A.right))
            return true;
        else
            return false;
    }
    public static boolean isMirror(Node A, Node B) {
        if(A==null && B==null)
            return true;
        if(A==null || B==null)
            return false;
        return A.data==B.data && isMirror(A.left,B.right) && isMirror(A.right,B.left);
    }
}
