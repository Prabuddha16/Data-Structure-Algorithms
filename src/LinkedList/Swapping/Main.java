package LinkedList.Swapping;

import LinkedList.Merge2List.ListNode;
import LinkedList.ReverseLL.Node;

public class Main {
    //Swapping By Position
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first, fast, slow;
        slow=head;
        fast=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        first=fast;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        int temp = slow.val;
        slow.val=first.val;
        first.val=temp;

        return head;
    }


    //PairWise Swapping
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode second = head.next;
        ListNode third = second.next;
        second.next = head;
        head.next = swapPairs(third);
        return second;
    }


    //Swapping By Data
    public void swap(Node head,int n1, int n2)
    {
        Node prevNode1 = null, prevNode2 = null, node1 = head, node2 = head;

        // Checks if list is empty
        if (head == null) {
            return;
        }

        // If n1 and n2 are equal, then
        // list will remain the same
        if (n1 == n2)
            return;

        // Search for node1
        while (node1 != null && node1.data != n1) {
            prevNode1 = node1;
            node1 = node1.next;
        }

        // Search for node2
        while (node2 != null && node2.data != n2) {
            prevNode2 = node2;
            node2 = node2.next;
        }

        if (node1 != null && node2 != null) {

            // If previous node to node1 is not null then,
            // it will point to node2
            if (prevNode1 != null)
                prevNode1.next = node2;
            else
                head = node2;

            // If previous node to node2 is not null then,
            // it will point to node1
            if (prevNode2 != null)
                prevNode2.next = node1;
            else
                head = node1;

            // Swaps the next nodes of node1 and node2
            Node temp = node1.next;
            node1.next = node2.next;
            node2.next = temp;
        }
        else {
            System.out.println("Swapping is not possible");
        }
    }
}
