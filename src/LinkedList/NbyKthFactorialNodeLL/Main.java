package LinkedList.NbyKthFactorialNodeLL;

import LinkedList.ReverseLL.Node;

public class Main {
    public static int nknode(Node head, int k)
    {
        if (k <= 0 || head == null)
            return head.data;

        Node fractionalNode = null;

        int n = 0;
        for (Node temp = head; temp != null; temp = temp.next){
            if (n % k == 0){
                if (fractionalNode == null)
                    fractionalNode = head;
                else
                    fractionalNode = fractionalNode.next;
            }
            n++;
        }
        return fractionalNode.data;
    }
}
