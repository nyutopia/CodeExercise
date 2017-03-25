/*
题目描述
一个整型数组里除了两个数字之外，
其他的数字都出现了两次。
请写程序找出这两个只出现一次的数字。*
*/
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
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