package BST.InsertNode;

public class Main {
    Node insert(Node root, int Key) {
        if(root == null)
            return new Node(Key);
        if(root.data == Key)
            return root;
        if(root.data>Key)
            root.left=insert(root.left,Key);
        else
            root.right=insert(root.right,Key);
        return root;
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
