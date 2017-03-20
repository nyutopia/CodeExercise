/*
输入一个复杂链表
（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。
（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
*/
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Test1{
    public RandomListNode Clone(RandomListNode pHead){
        RandomListNode p = pHead;
        RandomListNode q = pHead;
        while(p!=null){
            RandomListNode tmp = new RandomListNode(p.label);
            tmp.next = p.next;
            p.next = tmp;
            
            p=tmp.next;
        }
        
        while(q!=null){
            RandomListNode tmp = q.next;
            if(q.random!=null){
                tmp.random = q.random.next;
            }
            q=tmp.next;
        }
        RandomListNode s = new RandomListNode(0);
        RandomListNode s1 = s;
        while(pHead!=null){
            RandomListNode tmp=pHead.next;
            pHead.next = tmp.next;
            
            tmp.next=null;
            s.next=tmp;
            s=s.next;
            pHead=pHead.next;
            
        }
        return s1.next;
        
    }
}