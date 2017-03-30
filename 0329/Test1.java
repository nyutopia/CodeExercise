/*
一个链表中包含环，请找出该链表的环的入口结点。
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
public class Test1{

    public ListNode EntryNodeOfLoop(ListNode pHead){
        ListNode meetingNode = MeetingNode(pHead);
        if(meetingNode==null) return null;
        int count = 1;
        ListNode tmp = meetingNode;
        while(tmp.next!=meetingNode){
            tmp=tmp.next;
            count++;
        }
        
        ListNode pNode1 = pHead;
        ListNode pNode2 = pHead;
        for(int i = 0;i<count;i++){
            pNode1 = pNode1.next;
        }
        while(pNode1!=pNode2){
            pNode1=pNode1.next;
            pNode2=pNode2.next;
        }
        return pNode2;
    }
    
//判断是否有环，返回环中的节点。
    public ListNode MeetingNode(ListNode pHead){
        if(pHead==null) return null;
        ListNode pSlow = pHead.next;
        if(pSlow == null) return null;
        ListNode pFast = pSlow.next;
        while(pFast != null&&pSlow!=null){
            if(pFast == pSlow){
                return pFast;
            }
            pSlow=pSlow.next;
            
            pFast=pFast.next;
            if(pFast!=null)
                pFast = pFast.next;
        }
        return null;
    }
}