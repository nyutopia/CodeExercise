/*
��Ŀ����
һ�����������������������֮�⣬
���������ֶ����������Ρ�
��д�����ҳ�������ֻ����һ�ε����֡�*
*/
//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Test1{
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
        int tmp = 0;
        for(int i = 0;i<array.length;i++){
            tmp ^=array[i];
        }
        int index = findIndex(tmp);
        for(int i = 0;i<array.length;i++){
            if(isBit1(array[i],index)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
        
    }
    
    public int findIndex(int num){
        int index = 0;
        while(((num & 1) == 0)&&index < 8*4){
            num>>=1;
            index++;
        }
        return index;
    }
    
    public boolean isBit1(int num,int index){
        num = num>>index;
        return (num & 1)!=0?true:false;
    }
    
    
}