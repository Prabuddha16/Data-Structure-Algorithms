package Stack.LinkedList.PalindromeOrNot;

import LinkedList.Merge2List.ListNode;

import java.util.Stack;

public class Main {
    //p1  t=o(n) s=o(n)
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st = new Stack<ListNode>();

        ListNode temp = head;

        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }

        boolean res = false;

        while(head != null && st.isEmpty() == false){
            if(st.pop().val == head.val){
                res = true;
            }
            else{
                return false;
            }

            head = head.next;
        }

        return res;
    }


//p2 t=o(n) s=o(1)
    public boolean isPalindromeII(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // now slow points at the middle element

        // from slow.next onwards we have to reverse our list

        ListNode curr = slow.next;
        ListNode prev = null;

        while(curr != null)
        {
            ListNode temp = curr.next;

            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        // now prev points at the reverse list's head

        while(prev != null)
        {
            if(head.val != prev.val)
            {
                return false;
            }

            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}
