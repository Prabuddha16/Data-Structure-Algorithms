package LinkedList.RemoveAllOccurrencesOfDuplicate;

import LinkedList.ReverseLL.Node;

public class Main {
    public static Node removeAllDuplicates(Node head)
    {
        Node dummy = new Node(0);

        dummy.next = head;
        Node prev = dummy;
        Node curr = head;

        while (curr != null)
        {
            while (curr.next != null && prev.next.data == curr.next.data){
                curr = curr.next;
                if (prev.next == curr) {
                    prev = prev.next;
                }
                else {
                    prev.next = curr.next;
                }
            }
            curr = curr.next;
        }
        head = dummy.next;
        return head;
    }
}
