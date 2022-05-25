package BinaryTree.Height_MaxDepth;

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class Main {
    int height(Node root)
    {
        if(root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
}
