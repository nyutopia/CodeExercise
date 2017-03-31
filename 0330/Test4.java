/*
����һ������ͻ������ڵĴ�С��
�ҳ����л�����������ֵ�����ֵ��
���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3��
��ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}�� 
�������{2,3,4,2,6,2,5,1}�Ļ�������������6���� 
{[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;

public class Test4{
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> ret = new ArrayList<>();
        if(size == 0) return ret;
        Deque<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0;i<num.length;i++){
            int begin = i - size +1;
            if(q.isEmpty()){
                q.addLast(i);
            }else if(begin>q.peekFirst()){
                q.pollFirst();
            }
            
            while(!q.isEmpty()&&num[q.peekLast()]<=num[i])
                q.pollLast();
            q.addLast(i);
            
            if(begin>=0){
                ret.add(num[q.peekFirst()]);
            }
            
        }
        return ret;
    }
}