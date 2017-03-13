
/*牛牛的好朋友羊羊在纸上写了n+1个整数，羊羊接着抹除掉了一个整数，给牛牛猜他抹除掉的数字是什么。牛牛知道羊羊写的整数神排序之后是一串连续的正整数，牛牛现在要猜出所有可能是抹除掉的整数。例如：
10 7 12 8 11 那么抹除掉的整数只可能是9
5 6 7 8 那么抹除掉的整数可能是4也可能是9

输入描述:
输入包括2行：

第一行为整数n(1 <= n <= 50)，即抹除一个数之后剩下的数字个数

第二行为n个整数num[i] (1 <= num[i] <= 1000000000)


输出描述:
在一行中输出所有可能是抹除掉的数,从小到大输出,用空格分割,行末无空格。如果没有可能的数，则输出mistake

输入例子:
2
3 6

输出例子:
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