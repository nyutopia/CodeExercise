/*
如何得到一个数据流中的中位数？
如果从数据流中读出奇数个数值，
那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，
那么中位数就是所有数值排序之后中间两个数的平均值。
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