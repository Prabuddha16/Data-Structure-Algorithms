package LinkedList.GetNthNodeFromLL;

import LinkedList.ReverseLL.Node;

public class Main {
    int getNthFromLast(Node head, int n)
    {
        Node f = head , s = head;

        while(n!=0) {
            if(f==null) {
                return -1;
            }
            f = f.next;
            n--;
        }

        while(f!=null) {
            s = s.next;
            f = f.next;
        }

        if(s!=null)
            return s.data;
        else
            return -1;
    }
}
