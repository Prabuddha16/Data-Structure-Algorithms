package LinkedList.DeleteMiddleElement;

import LinkedList.Merge2List.ListNode;

public class Main {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        ListNode prev=null;
        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        prev.next=s.next;
        return head;
    }
}
