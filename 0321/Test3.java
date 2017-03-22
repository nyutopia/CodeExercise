/*
��Ŀ����
�������е��������֣����ǰ��һ�����ִ��ں�������֣�
���������������һ������ԡ�
����һ������,�����������е�����Ե�����P��
����P��1000000007ȡģ�Ľ������� �����P%1000000007 
��������:
��Ŀ��֤�����������û�е���ͬ������
���ݷ�Χ��
	����%50������,size<=10^4
	����%75������,size<=10^5
	����%100������,size<=2*10^5


��������:
1,2,3,4,5,6,7,0

�������:
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