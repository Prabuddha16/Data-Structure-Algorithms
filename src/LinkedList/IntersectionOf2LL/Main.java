package LinkedList.IntersectionOf2LL;

import LinkedList.ReverseLL.Node;

import java.util.HashSet;

public class Main {

    public static Node findIntersectionI(Node head1, Node head2)
    {
        HashSet<Integer> st = new HashSet<>();
        while(head2!=null)
        {
            st.add(head2.data);
            head2 = head2.next;
        }

        Node newHead=null, newTail=null;

        while(head1!=null)
        {
            if( st.contains(head1.data) )
            {
                if(newHead==null)
                    newHead = newTail = new Node(head1.data);
                else
                {
                    newTail.next = new Node(head1.data);
                    newTail = newTail.next;
                }
            }
            head1 = head1.next;
        }
        return newHead;
    }

    public static Node findIntersection(Node a, Node b)
    {
        if (a == null || b == null)
            return null;

        if (a.data < b.data)
            return findIntersection(a.next, b);

        if (a.data > b.data)
            return findIntersection(a, b.next);

        Node temp = new Node(0);
        temp.data = a.data;
        temp.next = findIntersection(a.next,b.next);
        return temp;
    }
}
