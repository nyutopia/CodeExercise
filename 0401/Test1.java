/*
ţţ�������ַ��������ܰ����ո�,ţţ���ҳ�������Ĺ��������Ӵ�,ϣ�����ܰ�����,������䳤�ȡ� 
��������:
����Ϊ�����ַ��������ܰ����ո񣩣����Ⱦ�С�ڵ���50.


�������:
���Ϊһ����������ʾ����������Ӵ��ĳ��ȡ�

��������:
abcde
abgde

�������:
2
*/
import java.util.Scanner;

public class Test1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if(str1.length()==0||str2.length()==0){
            System.out.println(0);
            return;
        } 
        int max = 0;
        int[][] dp = new int[str1.length()][str2.length()];
        for(int i = 0;i<str1.length();i++){
            if(str2.charAt(0)==str1.charAt(i)){
                dp[i][0]=1;
                max = 1;
            }
        }
        for(int i = 0;i<str2.length();i++){
            if(str1.charAt(0)==str2.charAt(i)){
                dp[0][i]=1;
                max = 1;
            }
        }
        
        for(int i = 1;i<str1.length();i++){
            for(int j = 1;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j))
                    dp[i][j]=dp[i-1][j-1]+1;
                max=Math.max(max,dp[i][j]);
            }
        }
        System.out.println(max);
    }
}