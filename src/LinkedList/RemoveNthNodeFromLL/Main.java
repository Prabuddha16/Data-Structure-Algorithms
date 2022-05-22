package LinkedList.RemoveNthNodeFromLL;

import LinkedList.Merge2List.ListNode;

public class Main {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return null;

        ListNode f = head;
        ListNode s = head;

        for(int i=0; i<n; i++){
            s = s.next;
        }

        if(s == null){
            head = head.next;
            return head;
        }

        while(s.next != null){
            f = f.next;
            s = s.next;
        }

        f.next = f.next.next;
        return head;
    }
}
