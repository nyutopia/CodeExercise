/*
����һ��������N�ͳ���L���ҳ�һ�γ��ȴ��ڵ���L�������Ǹ����������ǵĺ�ǡ��ΪN���𰸿����ж������������Ҫ�ҳ�������С���Ǹ���
���� N = 18 L = 2��
5 + 6 + 7 = 18 
3 + 4 + 5 + 6 = 18
��������Ҫ��ģ���������������̵� 5 6 7

��������:
�������ݰ���һ�У�
����������N(1 �� N �� 1000000000),L(2 �� L �� 100)


�������:
��С���������������Ǹ��������Կո�ָ�����ĩ�޿ո����û�����������л����ҳ������г��ȴ���100�������No

��������:
18 2

�������:
5 6 7
*/
/*�Ȳ����й�ʽ������*/
import java.util.Scanner;

public class Test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int a = 0;
		boolean flag = false;
		for(int i=L;i<=100;i++){
			int k = N - i*(i-1)/2;
			if(k%i==0){
				flag = true;
				a=k/i;
				L = i;
				break;
			}
		}
		String str = "";
		if(flag){
			for(int i= 0;i<L-1;i++){
				str += a+i+" ";
			}
			str += a+L-1;
			System.out.println(str);
		}else System.out.println("No");
	}
}