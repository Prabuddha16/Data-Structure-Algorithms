package LinkedList.ReverseSublistOfLL;

import LinkedList.ReverseLL.Node;

public class Main {
    public static Node reverseBetween(Node head, int left, int right)
    {
        Node dummy = new Node(0);

        Node prev;
        Node tail;
        Node temp;

        prev = dummy;
        dummy.next = head;

        for(int i=0; i<left-1; i++)
        {
            prev = prev.next;
        }

        tail = prev.next;

        for(int i=0; i<right-left; i++)
        {
            temp = prev.next;
            prev.next = tail.next;
            tail.next = tail.next.next;
            prev.next.next = temp;
        }

        return dummy.next;
    }
}
