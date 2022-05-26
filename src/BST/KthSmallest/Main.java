package BST.KthSmallest;

//tc=o(n) sc=O(1)

class Node
 {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }

public class Main {
    int ans=-1;
    int counter=0;
    public int KthSmallestElement(Node root, int K) {
        inOrder(root,K);
        return ans;
    }
    public void inOrder(Node root, int k){
        if(root.left!=null)
            inOrder(root.left,k);

        counter++;
        if(counter==k){
            ans=root.data;
            return;
        }

        if(root.right!=null)
            inOrder(root.right,k);
    }
}
