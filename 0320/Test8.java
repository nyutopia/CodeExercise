/*
输入一个正整数数组，
把数组里所有数字拼接起来排成一个数，
打印能拼接出的所有数字中最小的一个。
例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
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