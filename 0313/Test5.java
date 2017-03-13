/*如果一个数字能表示为p^q(^表示幂运算)且p为一个素数,q为大于1的正整数就称这个数叫做超级素数幂。现在给出一个正整数n,如果n是一个超级素数幂需要找出对应的p,q。 
输入描述:
输入一个正整数n(2 ≤ n ≤ 10^18)


输出描述:
如果n是一个超级素数幂则输出p,q,以空格分隔,行末无空格。
如果n不是超级素数幂，则输出No

输入例子:
27

输出例子:
3 3
*/
import java.util.Scanner;
public class Test5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		double p = 1.0/2;
		int q = 1;
		boolean f = false;
		//注意1.0/2和1/2的区别
		for(int i = 2;i <= Math.pow(n,1.0/2);i++){
			p = Math.pow(n,1.0/i);
			if((long)p==p && sushu((long)p)){
				q=i;
				f=true;
				break;
			}
		} 
		if(f) System.out.println((long)p+" "+q);
		else System.out.println("No");
			
	}
	private static boolean sushu(long k){
		
		boolean flag = true;
		for(long i = 2;i<=(long)Math.pow(k,1.0/2);i++){
			if(k%i==0){
				flag = false;
				break;
			}
				
		}
		return flag;
		
	}
}