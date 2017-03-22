/*
统计一个数字在排序数组中出现的次数
*/

public class Test1{
    public int GetNumberOfK(int [] array , int k) {
        if(array==null||array.length==0) return 0;
        int left = getFirstOfK(array,k);
        int right = getLastOfK(array,k);
        if(left==-1||right==-1) return 0;
        return right-left+1;
    }
    private int getFirstOfK(int[] array,int k){
        int left = 0;
        int right = array.length-1;
        int ret = -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]>k){
                right= mid-1;
            }else if(array[mid]<k){
                left = mid+1;
            }else{
                if(mid==0||array[mid-1]!=k){
                    ret = mid;
                    break;
                }else{
                    right = mid -1;
                }
            }
        }
        return ret;
    }
    private int getLastOfK(int[] array,int k){
        int left = 0;
        int right = array.length-1;
        int ret = -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(array[mid]>k){
                right= mid-1;
            }else if(array[mid]<k){
                left = mid+1;
            }else{
                if(mid==array.length-1||array[mid+1]!=k){
                    ret = mid;
                    break;
                }else{
                    left = mid +1;
                }
            }
        }
        return ret;
    }
}