package LinkedList.Implementation;

class MyLinkedList {
    Node head;
    Node tail;

    static class Node{
        int val;
        Node next;

        Node(int v){
            this.val=v;
            next = null;
        }
    }

    public MyLinkedList() {
        head=null;
    }

//find Node at given index
    public int get(int index) {
        if(head==null) return -1;
        if(index==0) return head.val;
        Node current = head;
        while(index>1 && current!=null) {
            current=current.next;
            index--;
        }
        if(current!=null && current.next!=null) {
            return current.next.val;
        }
        return -1;
    }

//insert node at top
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head==null) {
            head=node;
        }
        else {
            node.next=head;
            head=node;
        }
    }

//insert node at last
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(head==null) {
            head=node;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp=temp.next;
            }
            temp.next = node;
        }
    }

//insert at given position
    public void addAtIndex(int index, int val) {
        if(index==0) {
            addAtHead(val);
            return;
        }
        Node temp = new Node(val);
        Node current = head;
        while(index>1 && current!=null) {
            current=current.next;
            index--;
        }
        if(current!=null) {
            Node node = current.next;
            current.next=temp;
            temp.next=node;
        }
    }

//delete at given index
    public void deleteAtIndex(int index) {
        if(head==null) return;
        if(index==0){
            head=head.next;
        }
        else{
            Node curr = head;
            while(index>1 && curr!=null) {
                curr=curr.next;
                index--;
            }
            if(curr!=null && curr.next!=null) {
                curr.next=curr.next.next;
            }
        }
    }

    //traversal
    public void display() {
        Node current = head;
        while(current!=null) {
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();
    }
}

/*
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

