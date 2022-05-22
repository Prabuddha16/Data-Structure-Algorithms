package LinkedList.FlatteningLL;

class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}

public class Main {
    Node merge(Node first, Node second){
        if(first==null) return second;
        if(second==null) return first;

        Node res = null;
        if(first.data>second.data){
            res = second;
            res.bottom = merge(first,second.bottom);
        }
        else{
            res = first;
            res.bottom = merge(first.bottom,second);
        }
        return res;
    }
    Node flatten(Node root)
    {
        Node curr = root;
        while(curr.next!=null){
            Node next = curr.next.next;
            curr = merge(curr,curr.next);
            curr.next = next;
        }
        return curr;
    }
}
