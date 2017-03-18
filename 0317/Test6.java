/*
输入一个链表，输出该链表中倒数第k个结点。
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Test6 {
    public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k==0) return null;
        
        ListNode l1=head;
        ListNode l2=head;
        
        for(int i = 1;i<k;i++){
            if(l1.next == null) return null;
            l1=l1.next;
        }
        while(l1.next!=null){
            l2=l2.next;
            l1=l1.next;
        }
        return l2;
    }
}