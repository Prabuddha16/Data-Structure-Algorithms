package LinkedList.LLCycleII;

import LinkedList.Merge2List.ListNode;

import java.util.HashSet;

public class Main {
    //Method-1 o(n)/o(n)
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(head != null) {
            if(set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }
        return head;
    }

    //Method-2 o(n)/o(1)
    public ListNode detectCycles(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }
}
