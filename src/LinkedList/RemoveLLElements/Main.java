package LinkedList.RemoveLLElements;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

public class Main {
    public static Node deleteAllOccurances(Node head, int x)
    {
        if(head==null)
            return head;
        Node curr = deleteAllOccurances(head.next,x);
        if(head.data == x){
            return curr;
        }else{
            head.next = curr;
            return head;
        }
    }
}
