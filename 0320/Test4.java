/*
��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬
���ҳ�������֡�
��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
��������2�������г�����5�Σ��������鳤�ȵ�һ�룬
������2����������������0��
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