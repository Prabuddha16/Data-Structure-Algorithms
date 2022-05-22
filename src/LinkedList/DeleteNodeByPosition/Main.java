package LinkedList.DeleteNodeByPosition;

import LinkedList.ReverseLL.Node;

public class Main {
    class GfG
    {
        //Method-1
        Node deleteNode(Node head, int x)
        {
            if (head == null)
                return null;

            Node temp = head;

            if (x == 1)
            {
                head = temp.next;
                return head;
            }

            for (int i=1; temp!=null && i<x-1; i++)
            {
                temp = temp.next;
            }

            if (temp == null || temp.next == null)
                return null;

            if(temp.next.next == null)
                temp.next = null;
            else
                temp.next = temp.next.next;
            return head;
        }

        //Method-2
        void deleteByPosi(Node head,int position)
        {
            if (head == null)
                return;
            Node temp = head;
            if (position == 0) {
                head = temp.next;
                return;
            }
            for (int i = 0; temp != null && i < position - 1;
                 i++)
                temp = temp.next;
            if (temp == null || temp.next == null)
                return;
            Node next = temp.next.next;

            temp.next = next;
        }
    }
}
