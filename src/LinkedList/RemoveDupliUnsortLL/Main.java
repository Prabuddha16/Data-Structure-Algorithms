package LinkedList.RemoveDupliUnsortLL;

import LinkedList.ReverseLL.Node;

import java.util.HashSet;

public class Main {
    public Node removeDuplicates(Node head)
    {
        HashSet<Integer> set = new HashSet<>();
        if(head==null)
            return null;
        Node temp = head;
        set.add(temp.data);

        while(temp.next!=null)
        {
            if(!set.contains(temp.next.data))
            {
                set.add(temp.next.data);
                temp=temp.next;
            }
            else
            {
                temp.next=temp.next.next;
            }
        }
        return head;
    }
}
