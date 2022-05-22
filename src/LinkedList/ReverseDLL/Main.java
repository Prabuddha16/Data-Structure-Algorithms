package LinkedList.ReverseDLL;

class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Main {
    public static Node reverseDLL(Node  head)
    {
        if(head == null || head.next == null)
            return head;

        Node curr = head, prev = null;

        while(curr != null){
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            curr = curr.prev;
        }
        return prev.prev;
    }
}
