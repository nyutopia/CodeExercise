/*
题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，
则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。
并将P对1000000007取模的结果输出。 即输出P%1000000007 
输入描述:
题目保证输入的数组中没有的相同的数字
数据范围：
	对于%50的数据,size<=10^4
	对于%75的数据,size<=10^5
	对于%100的数据,size<=2*10^5


输入例子:
1,2,3,4,5,6,7,0

输出例子:
7
*/
public class Test3{
    private long count;
    public int InversePairs(int [] array) {
        if(array==null||array.length==0) return 0;
        sort(array,0,array.length-1);
        return (int)(count%1000000007);
    }
    private void sort(int[] array,int low,int high){
        if(low>=high) return;
         
        int mid = (low+high)>>1;
        sort(array,low,mid);
        sort(array,mid+1,high);
        merge(array,low,mid,high);
    }
     
    private void merge(int[] array,int low,int mid,int high){
        int[] tmp = new int[high-low+1];
         
        int left = mid;
        int right = high;
        int k = tmp.length-1;
        while(left>=low&&right>mid){
            if(array[left]>array[right]){
                count +=(right-mid);
                tmp[k--]=array[left--];
            }else{
                tmp[k--]=array[right--];
            }
             
        }
        while(left>=low){
            tmp[k--]=array[left--];
        }
        while(right>mid){
            tmp[k--]=array[right--];
        }
        for(int k2 = 0;k2<=tmp.length-1;k2++){
            array[low+k2]=tmp[k2];
        }

    }
}