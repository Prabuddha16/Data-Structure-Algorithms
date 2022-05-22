package LinkedList.RemoveLLElements;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

//Delete all occurrences of a given key in a linked list
//Remove LL Elements
public class Main {
    public static Node deleteAllOccurances(Node head, int key)
    {
        if(head==null)
            return head;
        Node curr = deleteAllOccurances(head.next,key);
        if(head.data == key){
            return curr;
        }else{
            head.next = curr;
            return head;
        }
    }
}
