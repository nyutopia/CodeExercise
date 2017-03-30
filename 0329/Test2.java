/*
在一个排序的链表中，
存在重复的结点，
请删除该链表中重复的结点，
重复的结点不保留，
返回链表头指针。 
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
*/

/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
		if(pHead==null) return null;
        if(pHead.next == null) return pHead;
        
        ListNode ret = new ListNode(0);
        ret.next = pHead;
        ListNode preNode = ret;
        
        ListNode pNode = pHead;


        while(pNode != null){
            ListNode pNext = pNode.next;
            if(pNext==null) break;
            if(pNext.val == pNode.val){
                while(pNext!=null&&pNode.val==pNext.val){
                    pNode=pNext;
                    pNext=pNode.next;
                }
                pNode = pNext;
                preNode.next = pNode;
                
            }else{
           
                preNode.next=pNode;
                preNode=preNode.next;
                pNode = pNext;
            }
            
        }
        return ret.next;
    }
}