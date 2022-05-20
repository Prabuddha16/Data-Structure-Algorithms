package LinkedList.MergeKSortedList;

import java.util.PriorityQueue;

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
public class Main {
    Node mergeKList(Node[]arr,int k)
    {
        Node temp=new Node(-1);
        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2)->o1.data-o2.data); //Comparator
        for(Node node:arr) {
            if(node!=null) {
                queue.add(node);
            }
        }
        Node dummy = temp;
        while(!queue.isEmpty()) {
            temp.next=queue.poll();
            temp=temp.next;
            if(temp.next!=null) {
                queue.add(temp.next);
            }
        }

        return dummy.next;
    }
}
