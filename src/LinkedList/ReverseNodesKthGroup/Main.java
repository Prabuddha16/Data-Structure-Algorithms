package LinkedList.ReverseNodesKthGroup;

/*

import LinkedList.Merge2List.ListNode;

public class Main {

    //method-1

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null)
            return null;
        ListNode curr = head;
        int count =0;
        while(curr!=null &&count!=k){
            curr =curr.next;
            count++;
        }
        if(count==k){   //c<=k also if k reverses in all cases
            curr = reverseKGroup(curr,k);

            while(count-- >0){
                ListNode temp = head.next;
                head.next= curr;
                curr = head;
                head = temp;
            }
            head = curr;
        }
        return head;
    }


    //method-2

    public ListNode reverseKGroup(ListNode node, int k) {
        ListNode curr = node, prev = null, next = null;
        int count = 0;

        while(curr != null && count < k)
        // reversing k elements :
        {
            next = curr.next;                 // marking next node
            curr.next = prev;                 // reversing link
            prev = curr;                      // updating prev
            curr = next;                      // updating current
            count++;
        }

        if (next != null)         // checking if there are nodes ahead
            node.next = reverseKGroup(next, k);     // reversing those recursively

        return prev;
    }
}

*/