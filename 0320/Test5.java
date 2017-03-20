/*
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
*/
import java.util.ArrayList;
public class Test5{
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input==null||input.length==0||k>input.length||k==0) return list;
        int start = 0;
        int end = input.length-1;
        int index = Partition(input,start,end);
        while(index!=k-1){
        	if(index>k-1){
                end = index-1;
                index = Partition(input,start,end);
            }else{
                start = index+1;
                index = Partition(input,start,end);
            }
        }
        for(int i = 0;i<k;i++){
            list.add(input[i]);
        }
        return list;
    }
    private int Partition(int[] array,int start,int end){
        
        int index = start-1;
        for(int i = start;i<end;i++){
            if(array[i]<array[end]){
                index++;
                swap(array,i,index);
                
            }
            
        }
        index++;
        swap(array,index,end);
        return index;
    }
    private void swap(int[] array,int i,int j){
        if(i==j) return;
        int tmp=array[i];
        array[i]=array[j];
        array[j]=tmp;
    }
}