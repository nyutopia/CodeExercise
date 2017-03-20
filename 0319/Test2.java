/*
输入一个整数数组，
判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。
假设输入的数组的任意两个数字都互不相同。
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