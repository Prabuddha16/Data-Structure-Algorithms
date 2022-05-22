package LinkedList.DeleteNodeUsingValue;

import LinkedList.ReverseLL.Node;

public class Main {
    public static void main(String[] args) {

    }
    public void delete(Node node){
        if(node.next == null){
            node = null;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }
}
