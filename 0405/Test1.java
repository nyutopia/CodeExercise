/*
ţţ���о����Լ�������ƽ������ƽ�����Ķ����ǣ���һ�����ֳ����������֣��ֱ��Ϊ�����µ�����
���Ҳ��ֱ��������������㣺
1����ߺ��ұ����ٴ���һλ��
2����ߵ���ÿһλ�����������ұߵ���ÿһλ��ˣ����������Ϊƽ������
���磺1221��������ֳ�12��21�Ļ���1*2=2*1�����1221Ϊƽ�����������磺1236����������Էֳ�123��1*2*3=6������1236Ҳ��ƽ��������1234����������Ҳ������ƽ������ 
��������:
����һ����������int��Χ�ڣ���


�������:
���������ƽ��������� "YES", ������� "NO"��

��������:
1221
1234

�������:
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