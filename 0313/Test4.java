
/*ţţ�ĺ�����������ֽ��д��n+1���������������Ĩ������һ����������ţţ����Ĩ������������ʲô��ţţ֪������д������������֮����һ����������������ţţ����Ҫ�³����п�����Ĩ���������������磺
10 7 12 8 11 ��ôĨ����������ֻ������9
5 6 7 8 ��ôĨ����������������4Ҳ������9

��������:
�������2�У�

��һ��Ϊ����n(1 <= n <= 50)����Ĩ��һ����֮��ʣ�µ����ָ���

�ڶ���Ϊn������num[i] (1 <= num[i] <= 1000000000)


�������:
��һ����������п�����Ĩ��������,��С�������,�ÿո�ָ�,��ĩ�޿ո����û�п��ܵ����������mistake

��������:
2
3 6

�������:
mistake
*/
import java.util.Scanner;
import java.util.Arrays;
public class Test4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i = 0;i <n; i++){
			int a = sc.nextInt();
			num[i] = a;
		}
		Arrays.sort(num);
		int count = 0;
		int m = 0;
		boolean flag = false;
		for(int i = 1;i<n;i++){
			if(num[i] - num[i-1]>2){
				flag = true;
				break;
			}else if(num[i] - num[i-1] == 2){
				count++;
				if(count == 2){flag = true;break;}
				m = i;
			}
		}
		if(flag)
			System.out.println("mistake");
		else{
			if(count != 0)
				System.out.println(num[m]-1);
			else
				if(num[0]==1){
					System.out.println(num[n-1]+1);
				}else
					System.out.println((num[0]-1)+" "+ (num[n-1]+1));
					
		}
	}
}