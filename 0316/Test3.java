/*
����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
*/
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Test3{
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
         
        
        if(listNode!=null){
            this.printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
         
        return list;
    }
}