/*
¹é²¢ÅÅÐò
Sort a linked list in O(n log n) time using constant space complexity.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Test2{
    public ListNode sortList(ListNode head) {
        if(head == null||head.next==null) return head;
        ListNode middle = findMiddle(head);
        ListNode right = sortList(middle.next);
        middle.next = null;
        ListNode left = sortList(head);
        return merge(left,right);
    }
    public ListNode findMiddle(ListNode head){
        if(head == null||head.next==null) return head;
        ListNode chaser = head;
        ListNode runner = head.next;     
        while(runner!=null&&runner.next!=null){
            chaser = chaser.next;
            runner = runner.next.next;
        }
        return chaser;
    }
    
    public ListNode merge(ListNode list1,ListNode list2){
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode ret = new ListNode(0);
        ListNode tmp = ret;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                tmp.next = list2;
                tmp = tmp.next;
                list2 = list2.next;
            }else{
                tmp.next = list1;
                tmp = tmp.next;
                list1 = list1.next;
            }
        }
        if(list1!=null){
            tmp.next = list1;
        }
        if(list2!=null){
            tmp.next = list2;
        }
        
        return ret.next;
        
    }
}