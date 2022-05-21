package LinkedList.RemoveDupliSortedLL;

import LinkedList.Merge2List.ListNode;

public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode curr = head;
        while(curr.next != null) {
            if(curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}
