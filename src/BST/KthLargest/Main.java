package BST.KthLargest;

//t=o(n) s=o(1)

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

public class Main {
    int ans = 0;
    int count = 0;
    public int kthLargest(Node root,int K)
    {
        revInOrder(root,K);
        return ans;
    }
    public void revInOrder(Node root,int k){
        if(root == null)
            return;
        revInOrder(root.right,k);
        count++;
        if(count==k){
            ans=root.data;
            return;
        }
        revInOrder(root.left,k);
    }
}

