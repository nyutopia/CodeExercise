/*
ţţ������N��ľ��,�ֱ���Ϊ1~N,��������N������ȡ������ľ����ʹ������ľ������һ��������,���ܼ����ţţ�ж�����ȡ����?(��������ȡ����ʹ�õ�ľ�������һ����һ������Ϊ�ǲ�ͬ��ȡ��)�� 
��������:
��������һ��������N����������һ�й���N����������ʾÿ��ľ���ĳ��ȡ�

N �� 50, ľ���ĳ��� �� 10000.


�������:
���һ��������ʾ��������

��������:
5
1 2 3 4 5

�������:
3
*/
import java.util.Scanner;

public class Test1{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]&&arr[i]+arr[k]>arr[j]&&arr[k]+arr[j]>arr[i])
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}