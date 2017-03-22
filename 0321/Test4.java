/*
输入两个链表，找出它们的第一个公共结点。
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Test4{
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
 		if(pHead1==null||pHead2==null) return null;
        ListNode list1 = pHead1;
        ListNode list2 = pHead2;
        int m = 0;
        int n = 0;
        while(list1!=null){
            m++;
            list1=list1.next;
        }
        while(list2!=null){
            n++;
            list2=list2.next;
        }
        if(m>n){
            list1=pHead1;
            list2=pHead2;
        }else{
            list1=pHead2;
            list2=pHead1;
        }
        for(int i=0;i<Math.abs(m-n);i++){
            list1=list1.next;
        }
        while(list1!=null){
            if(list1==list2){
                break;
            }
            list1=list1.next;
            list2=list2.next;
        }
        return list1;
    }
}