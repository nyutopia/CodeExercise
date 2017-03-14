/*
牛牛新买了一本算法书，算法书一共有n页，页码从1到n。牛牛于是想了一个算法题目：在这本算法书页码中0~9每个数字分别出现了多少次？ 
输入描述:
输入包括一个整数n(1 ≤ n ≤ 1,000,000,000)


输出描述:
输出包括一行10个整数，即0~9这些数字在页码中出现的次数，以空格分隔。行末无空格。

输入例子:
999

输出例子:
189 300
*/
/*
这道题假设N = abcde这里a、b、c、d、e分别是十进制数N 的各个数位上的数字。如果要计算百位上出现1的次数，
则 如果百位上的数字小于1，可知，百位上可能出现1的次数由更高位决定，比如12013，百位出现1的情况可能是100-199,1100-1199......11100-11199
一共12000个，也就是由数字（12）决定，并且等于更高位数字（12）乘以当前位数（100）
如果百位上数字等于1，
如果百位上数字大于1

注意0要特殊考虑
*/
import java.util.Scanner;

public class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ret = new int[10];
		String str = "";
		for(int i=0;i<10;i++){
			ret[i]=calculateCount(num,i);
		}
		for(int i=0;i<9;i++){
			str += ret[i]+" ";
		}
		str+=ret[9];
		System.out.println(str);
	}
	
	private static int calculateCount(int n,int i){
		int iCount = 0;
		int iFactor = 1;
		int iLowerNum = 0;
		int iCurrNum = 0;
		int iHigherNum = 0;
		
		while(n / iFactor != 0){
			iLowerNum = n - (n/iFactor)*iFactor;
			iCurrNum = (n/iFactor)%10;
			iHigherNum = n/(iFactor*10);
			if(i>0){
				if(iCurrNum<i){
					iCount+=iHigherNum*iFactor;
				}else if(iCurrNum == i){
					iCount+=iHigherNum*iFactor+iLowerNum+1;
				}else{
					iCount+=(iHigherNum+1)*iFactor;
				}
			}else{
				if(iCurrNum==0){
					iCount+=(iHigherNum-1)*iFactor+iLowerNum+1;
				}else
					iCount+=iHigherNum*iFactor;
			}
			
			iFactor*=10;
		}
		return iCount;
	}
}