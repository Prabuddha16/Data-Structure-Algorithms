package LinkedList.MiddleElement;


import LinkedList.Merge2List.ListNode;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}

public class Main {
    //Type-1
    int getMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    //Type-2
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
