package LinkedList.MoveLastNodeToFirstLL;

import LinkedList.ReverseLL.Node;

public class Main {
    public static Node moveToFront(Node head) {
        if(head == null || head.next == null)
            return head;
        Node sl = null; //secondlast
        Node l = head;  //last

        while (l.next != null)
        {
            sl = l;
            l = l.next;
        }

        sl.next = null;
        l.next = head;
        head = l;

        return head;
    }
}
