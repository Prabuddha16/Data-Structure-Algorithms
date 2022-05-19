package LinkedList.MiddleElement;


class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }

}

public class Main {
    int getMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
}
