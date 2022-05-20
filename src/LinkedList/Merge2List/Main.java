package LinkedList.Merge2List;


public class Main {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)
            return null;
        ListNode t = new ListNode(0);
        ListNode head = t;
        while(l1!=null || l2!=null){
            if(l1==null){
                t.next=l2;
                break;
            }
            else if(l2==null){
                t.next=l1;
                break;
            }else{
                if(l1.val<l2.val){
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
