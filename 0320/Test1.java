/*
����һ����������
��ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
���ؽ��Ϊ���ƺ��������head��
��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
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