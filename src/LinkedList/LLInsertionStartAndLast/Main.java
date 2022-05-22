package LinkedList.LLInsertionStartAndLast;

import LinkedList.ReverseLL.Node;

public class Main {
    Node insertAtBeginning(Node head, int x)
    {
        Node n = new Node(x);
        n.next=head;
        head=n;
        return head;
    }

    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node n = new Node(x);
        if(head == null){
            return n;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = n;
            n.next = null;
        }
        return head;
    }
}
