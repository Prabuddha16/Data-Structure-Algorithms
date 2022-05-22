package LinkedList.UnionOf2LL;

import LinkedList.ReverseLL.Node;

import java.util.HashSet;

public class Main {
    public static Node findUnion(Node head1,Node head2)
    {
        Node cur=null,start=null;

        HashSet<Integer> s = new HashSet<Integer>();

        while(head1!=null)
        {
            s.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null)
        {
            s.add(head2.data);
            head2=head2.next;
        }
        for(Integer i : s)
        {
            Node ptr=new Node(i);
            if(start==null)
            {
                start=ptr;
                cur=ptr;
            }
            else
            {
                cur.next=ptr;
                cur=ptr;
            }
        }
        return start;
    }
}
