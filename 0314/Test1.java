/*
给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
例如 N = 18 L = 2：
5 + 6 + 7 = 18 
3 + 4 + 5 + 6 = 18
都是满足要求的，但是我们输出更短的 5 6 7

输入描述:
输入数据包括一行：
两个正整数N(1 ≤ N ≤ 1000000000),L(2 ≤ L ≤ 100)


输出描述:
从小到大输出这段连续非负整数，以空格分隔，行末无空格。如果没有这样的序列或者找出的序列长度大于100，则输出No

输入例子:
18 2

输出例子:
5 6 7
*/
/*等差数列公式的运用*/
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