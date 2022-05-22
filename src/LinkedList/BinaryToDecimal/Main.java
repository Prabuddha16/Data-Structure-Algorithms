package LinkedList.BinaryToDecimal;

import LinkedList.Merge2List.ListNode;
import LinkedList.ReverseLL.Node;

public class Main {
    //P1
    long DecimalValue(Node head)
    {
        long n = 1000000007;
        long result = 0;
        while(head!=null){
            result = (result*2)%n + head.data;
            head = head.next;
        }
        return result%n;
    }

    //P2
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head!=null){
            result = result*2 + head.val;
            head = head.next;
        }
        return result;
    }
}
