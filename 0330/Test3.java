/*
��εõ�һ���������е���λ����
������������ж�����������ֵ��
��ô��λ������������ֵ����֮��λ���м����ֵ��
������������ж���ż������ֵ��
��ô��λ������������ֵ����֮���м���������ƽ��ֵ��
*/

import java.util.LinkedList;
public class Test3{
	LinkedList<Integer> list = new LinkedList<>();
    public void Insert(Integer num) {
    	if(list==null){
            list.addFirst(num);
            return;
        }
            
        for(Integer e:list){
            if(num<e){
                int index = list.indexOf(e);
                list.add(index,num);
                return;
            }
        }
        list.addLast(num);
    }

    public Double GetMedian() {
        if(list.size()%2==0){
            return ((double)(list.get(list.size()/2)+list.get(list.size()/2-1)))/2.0;
        }else{
            return (double)(list.get(list.size()/2));
        }
    }
}