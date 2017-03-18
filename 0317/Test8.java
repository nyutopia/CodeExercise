/*
输入两个单调递增的链表，
输出两个链表合成后的链表，
当然我们需要合成后的链表满足单调不减规则。
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Test8{
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode mergeNode = new ListNode(0);
        ListNode temp = mergeNode;
        while(list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=new ListNode(list1.val);
                list1=list1.next;
            }else{
                temp.next=new ListNode(list2.val);
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1==null) temp.next=list2;
        if(list2==null) temp.next=list1;
        return mergeNode.next;
    }
}
/*
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode mergeNode = null;
        if(list1.val<list2.val){
            mergeNode = list1;
            mergeNode.next=Merge(list1.next,list2);
        }else{
            mergeNode = list2;
            mergeNode.next=Merge(list1,list2.next);
            
        }
        return mergeNode;
            
    }
}
*/
