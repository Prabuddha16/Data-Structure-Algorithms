package LinkedList.RemoveLoopInLL;

import LinkedList.ReverseLL.Node;

public class Main {
    public static void removeLoop(Node head){
        Node fast = head.next , slow = head;

        if(head == null)
            return;

        while(fast!=slow)
        {
            if(fast==null || fast.next==null)
                return;
            fast = fast.next.next;
            slow = slow.next;
        }
        Node p = head;
        while(slow.next!=p)
        {
            p = p.next;
            slow = slow.next;
        }
        //   cout<<p->data<<endl;
        slow.next = null;
    }
}
