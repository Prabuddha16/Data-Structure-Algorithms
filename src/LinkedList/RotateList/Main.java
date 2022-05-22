package LinkedList.RotateList;

import LinkedList.Merge2List.ListNode;
import LinkedList.ReverseLL.Node;

public class Main {

    //P1
    public Node rotate(Node head, int k) {


        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        current.next = head;
        current = head;

        for (int i = 0; i < k - 1; i++){
            current = current.next;
        }

        head = current.next;
        current.next = null;
        return head;
    }

    //P2
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        int l=0;
        ListNode node = head;
        ListNode last=null;
        while(node!=null){
            last = node;
            node = node.next;
            l++;
        }
        k = k%l;
        k = l-k;
        node = head;
        while(k-->1){
            node = node.next;
        }
        last.next = head;
        head = node.next;
        node.next = null;
        return head;
    }
}
