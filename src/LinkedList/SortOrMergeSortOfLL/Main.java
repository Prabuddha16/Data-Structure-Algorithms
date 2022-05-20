package LinkedList.SortOrMergeSortOfLL;

class Node{
    int data;
    Node next;
    Node(int v){
        data = v;
        next = null;
    }
}

public class Main {
    public Node mergeSort(Node head)
    {
        if(head == null || head.next==null)
            return head;
        Node slow=head;
        Node fast=head;
        Node prev=head;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        head = mergeSort(head);
        slow = mergeSort(slow);
        head = merge(head, slow);
        return head;
    }

    public Node merge(Node l1, Node l2) {
        if(l1==null && l2==null) return null;
        Node t = new Node(0);
        Node head = t;
        while(l1!=null || l2!=null){
            if(l1==null){
                t.next=l2;
                break;
            }
            else if(l2==null){
                t.next=l1;
                break;
            }else{
                if(l1.data<l2.data){
                    t.next=l1;
                    l1=l1.next;
                }else{
                    t.next=l2;
                    l2=l2.next;
                }
                t=t.next;
            }
        }
        return head.next;
    }
}
