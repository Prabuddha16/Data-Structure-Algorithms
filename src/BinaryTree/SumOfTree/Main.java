package BinaryTree.SumOfTree;

public class Main {
    static int sumBT(Node head){
        if(head==null)
            return 0;
        int sum = head.data;
        sum+=sumBT(head.left);
        sum+=sumBT(head.right);
        return sum;
    }
}

class Node{
    int data;
    Node left,right;
}
