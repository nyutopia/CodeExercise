
/*DNA��������4������������Ϊ��λ���Ӷ��ɵĳ�������4������������ֱ���A,T,C,G���ּ��������������ԭ��A��T����Եģ�C��G����Եġ���������������������ͬ�Ĳ���ÿ��λ�õļ������Եģ���ô���ǾͿ�����Ժϳ�ΪDNA��˫�����ṹ�����ڸ������������������������һ�������滻�������������ϵ�ĳ��λ�õļ������Ϊ����һ�ּ������������Ҫ���ٴ��������������Գɹ� 
��������:
�������һ�У�
���������ַ���,�ֱ��ʾ������,�����ַ���������ͬ�ҳ��Ⱦ�С�ڵ���50��


�������:
���һ����������������Ҫ���ٴ��������������Գɹ�

��������:
ACGT TGCA

�������:
0
*/
import java.util.Scanner;
public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		int count = 0;
		for(int i = 0;i<s1.length();i++){
			if(s1.charAt(i) == 'A'){
				if(s2.charAt(i) != 'T')
					count++;
			}
				
			else if(s1.charAt(i) =='T'){
				if(s2.charAt(i) != 'A')
					count++;
			}
				
			else if(s1.charAt(i) == 'C'){
				if(s2.charAt(i) != 'G')
					count++;
			}
				
			else if(s1.charAt(i) == 'G'){
				if(s2.charAt(i) != 'C')
					count++;
			}
				
		}
		System.out.println(count);
	}
}