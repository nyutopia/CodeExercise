/*
����һ�����������飬
����������������ƴ�������ų�һ������
��ӡ��ƴ�ӳ���������������С��һ����
������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
public class Test8{
    public String PrintMinNumber(int [] numbers) {

        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<numbers.length;i++){
            list.add(numbers[i]);
        }
        Collections.sort(list,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                String s1 = a+""+b;
                String s2 = b+""+a;
                return s1.compareTo(s2);
            }
             
        });
        for(int j:list){
            s+=j;
        }
        return s;
    }
}