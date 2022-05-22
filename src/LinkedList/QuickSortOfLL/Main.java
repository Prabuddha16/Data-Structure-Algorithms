package LinkedList.QuickSortOfLL;

import LinkedList.ReverseLL.Node;

public class Main {
    static void SwapValue (Node a , Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    static Node Partition(Node start ,Node end){
        int pivotValue = start.data;
        Node p = start;
        Node q = start.next;
        while(q != end){
            if (q.data < pivotValue){
                p = p.next;
                SwapValue(p,q);
            }
            q = q.next;
        }
        SwapValue(p,start);
        return p;
    }

    static void QuickSort(Node start ,Node end){
        if (start != end){
            Node mid = Partition(start ,end);
            QuickSort(start,mid);
            QuickSort(mid.next,end);
        }

    }

    public static Node quickSort(Node head)
    {
        QuickSort(head,null);
        return head;
    }

}
