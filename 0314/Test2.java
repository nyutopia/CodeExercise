/*
ţţ������һ���㷨�飬�㷨��һ����nҳ��ҳ���1��n��ţţ��������һ���㷨��Ŀ�����Ȿ�㷨��ҳ����0~9ÿ�����ֱַ�����˶��ٴΣ� 
��������:
�������һ������n(1 �� n �� 1,000,000,000)


�������:
�������һ��10����������0~9��Щ������ҳ���г��ֵĴ������Կո�ָ�����ĩ�޿ո�

��������:
999

�������:
189 300
*/
/*
��������N = abcde����a��b��c��d��e�ֱ���ʮ������N �ĸ�����λ�ϵ����֡����Ҫ�����λ�ϳ���1�Ĵ�����
�� �����λ�ϵ�����С��1����֪����λ�Ͽ��ܳ���1�Ĵ����ɸ���λ����������12013����λ����1�����������100-199,1100-1199......11100-11199
һ��12000����Ҳ���������֣�12�����������ҵ��ڸ���λ���֣�12�����Ե�ǰλ����100��
�����λ�����ֵ���1��
�����λ�����ִ���1

ע��0Ҫ���⿼��
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