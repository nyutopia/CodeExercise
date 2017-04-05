/*
牛牛在研究他自己独创的平衡数，平衡数的定义是：将一个数分成左右两部分，分别成为两个新的数。
左右部分必须满足以下两点：
1，左边和右边至少存在一位。
2，左边的数每一位相乘如果等于右边的数每一位相乘，则这个数称为平衡数。
例如：1221这个数，分成12和21的话，1*2=2*1，则称1221为平衡数，再例如：1236这个数，可以分成123和1*2*3=6，所以1236也是平衡数。而1234无论怎样分也不满足平衡数。 
输入描述:
输入一个正整数（int范围内）。


输出描述:
如果该数是平衡数，输出 "YES", 否则输出 "NO"。

输入例子:
1221
1234

输出例子:
YES
NO
*/

import java.util.Scanner;

public class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = String.valueOf(num);
        if(str.length()==0||str.length()==1){
            System.out.println("NO");
            return;
        }
        for(int i = 1 ;i<str.length();i++){
            int n1 = 1;
            int n2 = 1;
            for(int j=0;j<i;j++){
                n1*=str.charAt(j)-'0';
            }
            for(int j=i;j<str.length();j++){
                n2*=str.charAt(j)-'0';
            }
            if(n1==n2){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}