/*
��һ������������У�
�����ظ��Ľ�㣬
��ɾ�����������ظ��Ľ�㣬
�ظ��Ľ�㲻������
��������ͷָ�롣 
���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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