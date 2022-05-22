package LinkedList.ReverseLL;

public class Node{
    public int data;
    public Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

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
