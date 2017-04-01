/*
牛牛有两个字符串（可能包含空格）,牛牛想找出其中最长的公共连续子串,希望你能帮助他,并输出其长度。 
输入描述:
输入为两行字符串（可能包含空格），长度均小于等于50.


输出描述:
输出为一个整数，表示最长公共连续子串的长度。

输入例子:
abcde
abgde

输出例子:
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