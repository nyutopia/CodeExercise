/*
����һ���������飬
�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
����������Yes,�������No��
�������������������������ֶ�������ͬ��
*/
import java.util.Arrays;
public class Test2{
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null||sequence.length==0) return false;
        return VerifySquence0fBST(sequence,0,sequence.length-1);
    }
    private boolean VerifySquence0fBST(int[] sequence,int start,int end){
        if(start>=end) return true;
        int root = sequence[end];

        int i =start;
        for(;i<=end-1;i++){
            if(sequence[i]>root){
               
                break;
            }
        }
        
        for(int j=i;j<=end-1;j++){
            if(sequence[j]<root)
                return false;
        }
        
        return VerifySquence0fBST(sequence,start,i-1)&&VerifySquence0fBST(sequence,i,end-1);
    }
}