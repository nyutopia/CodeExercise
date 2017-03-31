/*
题目描述
请实现一个函数用来找出字符流中第一个只出现一次的字符。
例如，当从字符流中只读出前两个字符"go"时，
第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，
第一个只出现一次的字符是"l"。 
输出描述:
如果当前字符流没有存在出现一次的字符，返回#字符。
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