/*���һ�������ܱ�ʾΪp^q(^��ʾ������)��pΪһ������,qΪ����1���������ͳ�������������������ݡ����ڸ���һ��������n,���n��һ��������������Ҫ�ҳ���Ӧ��p,q�� 
��������:
����һ��������n(2 �� n �� 10^18)


�������:
���n��һ�����������������p,q,�Կո�ָ�,��ĩ�޿ո�
���n���ǳ��������ݣ������No

��������:
27

�������:
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
		//ע��1.0/2��1/2������
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