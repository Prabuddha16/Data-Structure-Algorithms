package BinaryTree.SizeOfTree;

public class Main {
    public static int getSize(Node root)
    {
        if(root==null){
            return 0;
        }
        return getSize(root.left)+getSize(root.right)+1;
    }
}

class Node{
    int data;
    Node left,right;
}
