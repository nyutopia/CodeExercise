/*
ţţ��N���ַ��������뽫��Щ�ַ������࣬����Ϊ�����ַ���A��B����ͬһ����Ҫ��������������
A�н�������λ�õ������ַ������տ��Եõ�B�������Ĵ������ޡ����磺abc��bca����ͬһ���ַ�����
����ţţ��֪����N���ַ������Էֳɼ��ࡣ 
��������:
��������һ��������N��1 <= N <= 50��������������N���ַ�����ÿ���ַ������Ȳ�����50��


�������:
���һ��������ʾ����ĸ�����

��������:
4
abcd
abdc
dabc
bacd

�������:
1
*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;
public class Test2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<String>();
        for(int i = 0 ;i< n;i++){
            String str = sc.next();
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            set.add(String.valueOf(ch));
        }
        System.out.println(set.size());
    }
}