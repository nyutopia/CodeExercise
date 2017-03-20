/*
数组中有一个数字出现的次数超过数组长度的一半，
请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，
因此输出2。如果不存在则输出0。
*/
public class Test4{
    public int MoreThanHalfNum_Solution(int [] array) {
        int ret=array[0];
        int count = 1;
        for(int i = 1;i<array.length;i++){
            if(count == 0){
                ret=array[i];
                count++;
            }else if(array[i]==ret){
                count++;
            }else if(array[i]!=ret)
                count--;
        }
        
        int k = 0;
        for(int i = 0;i<array.length;i++){
            if(ret == array[i])
                k++;
        }
        if(k<=array.length/2){
            ret = 0;
        }
        return ret;
    }
}