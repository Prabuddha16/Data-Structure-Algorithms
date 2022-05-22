package LinkedList.YShapedLL;

import LinkedList.Merge2List.ListNode;

public class Main {

    //Method-1 Easy
    public int getIntersection(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return headA.val;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p =  (p != null) ? p.next : headB;
            q =  (q != null) ? q.next : headA;
        }
        return p.val;
    }

    //Method-2 Medium
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;

        if (ptr1 == null || ptr2 == null) {
            return null;
        }

        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;

            if (ptr1 == ptr2) {
                return ptr1;
            }

            if (ptr1 == null) {
                ptr1 = head2;
            }

            if (ptr2 == null) {
                ptr2 = head1;
            }
        }
        return ptr1;
    }
}
