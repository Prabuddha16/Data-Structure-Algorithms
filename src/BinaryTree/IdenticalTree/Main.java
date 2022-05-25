package BinaryTree.IdenticalTree;

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

public class Main {
    boolean isIdentical(Node p, Node q)
    {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.data != q.data)
            return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
}
