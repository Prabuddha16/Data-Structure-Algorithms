package BST.InorderSuccessorInBST;
//tc=o(height of tree) sc=o(1)
public class Main {
    public Node inorderSuccessor(Node root,Node p)
    {
        Node successor = null;
        while(root != null){
            if(p.data >= root.data){
                root = root.right;
            }else{
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
}

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
