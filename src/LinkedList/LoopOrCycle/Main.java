package LinkedList.LoopOrCycle;

class Node{
    int data;
    Node next;
    Node(int d){
        data =d;
        next=null;
    }
}

// Floyd's Cycle Detection Algo.

public class Main {
    public static boolean detectLoop(Node head){
        if(head==null || head.next==null)
            return false;
        Node fast = head;
        Node slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
