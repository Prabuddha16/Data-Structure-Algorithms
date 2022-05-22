package LinkedList.ReverseLL;

public class Main {
    Node reverseList(Node head)
    {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        Node newNode = reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return newNode;
    }
}
