/*
��Ŀ����
��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
��һ��ֻ����һ�ε��ַ���"g"��
���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ��
��һ��ֻ����һ�ε��ַ���"l"�� 
�������:
�����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
*/

public class Test4{
    //Insert one char from stringstream
    int[] c = new int[256];
    int count = 1;
    public void Insert(char ch){
        if(c[ch]==0){
            c[ch]=count++;
        }else{
            c[ch]=-1;
        }
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce(){
    	int tmp = Integer.MAX_VALUE;
        char ret = '#';
        for(int i = 0;i<256;i++){
            if(c[i]!=-1&&c[i]!=0&&c[i]<tmp){
                tmp = c[i];
                ret=(char)i;
            }
        }
        
        return ret;
    }
}