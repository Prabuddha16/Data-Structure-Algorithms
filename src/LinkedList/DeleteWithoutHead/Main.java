package LinkedList.DeleteWithoutHead;

import LinkedList.ReverseLL.Node;

//t=o1 s=o1
public class Main {
    void deleteNode(Node del)
    {
        del.data = del.next.data;
        del.next = del.next.next;
    }
}
