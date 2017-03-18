/*
输入一个链表，反转链表后，输出链表的所有元素
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Test7{
    public ListNode ReverseList(ListNode head) {
		if(head == null) return null;
        if(head.next==null) return head;
        
        ListNode last = null;
        ListNode cur = head;
        ListNode nxt = head.next;
        while(nxt!=null){
            cur.next = last;
            last = cur;
            cur=nxt;
            nxt=cur.next;
        }
        cur.next=last;
        return cur;
    }
}