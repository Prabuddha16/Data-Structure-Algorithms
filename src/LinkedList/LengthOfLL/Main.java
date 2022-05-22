package LinkedList.LengthOfLL;

import LinkedList.ReverseLL.Node;

public class Main {

    //Array.Recursion
    public static int getCount(Node head)
    {
        if(head==null)
            return 0;
        return 1+getCount(head.next);
    }

    //Iteration
    public  int length(Node head){
        if(head==null)
            return 0;
        int c=0;
        Node curr = head;
        while(curr != head){
            c++;
            curr = curr.next;
        }
        return c;
    }
}
