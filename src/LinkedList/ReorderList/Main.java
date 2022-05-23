package LinkedList.ReorderList;

import LinkedList.Merge2List.ListNode;
import LinkedList.ReverseLL.Node;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if(head == null)
            return;

        ListNode sp = head;
        ListNode fp = head.next;

        // find the middle
        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }

        //split 2nd half list
        ListNode second = sp.next;
        sp.next = null;
        ListNode prev = null;

        //reverse split list
        while(second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        //root
        ListNode first = head;
        second = prev;

        // start creating link - 1 from first half and another form second half
        while( second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }

    Node reorderlist(Node head) {
        if(head == null)
            return head;

        Node sp = head;
        Node fp = head.next;

        // find the middle
        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
        }

        //split 2nd half list
        Node second = sp.next;
        sp.next = null;
        Node prev = null;

        //reverse split list
        while(second != null) {
            Node temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        //root
        Node first = head;
        second = prev;

        // start creating link - 1 from first half and another form second half
        while( second != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        return head;
    }
}
