package LinkedList.InsertionSort;

import LinkedList.Merge2List.ListNode;

public class Main {
    public ListNode insertionSortList(ListNode head) {
        ListNode n = new ListNode(-1);
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            ListNode prev = n;
            ListNode node = n.next;

            while(node != null) {
                if(node.val > curr.val)
                    break;
                prev = node;
                node = node.next;
            }

            curr.next = node;
            prev.next = curr;
            curr = temp;
        }

        return n.next;
    }
}
