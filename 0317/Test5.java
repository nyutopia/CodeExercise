/*
����һ���������飬
ʵ��һ�����������������������ֵ�˳��
��ʹ�����е�����λ�������ǰ�벿�֣�
���е�ż��λ��λ������ĺ�벿�֣�����֤������������
ż����ż��֮������λ�ò��䡣
*/
public class Test5 {
    public void reOrderArray(int [] array) {
        
        
        for(int i = 0;i<array.length;i++){
            if(array[i]%2==0){
                for(int j = i+1;j<array.length;j++){
                    if(array[j]%2!=0){
                        int t=array[j];
                        for(int k=j;k>i;k--){
                            array[k]=array[k-1];
                        }
                        array[i]=t;
                        break;
                    }
                    
                }
            }
        }
    }
}