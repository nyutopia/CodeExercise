/*���һ������ͨ��ѭ�����ƻ�õĵ��ʣ����ǳ���Щ���ʶ�Ϊһ��ѭ�����ʡ� ���磺picture �� turepic ��������ͬһ��ѭ�����ʡ� ���ڸ���n�����ʣ���Ҫͳ�����n���������ж�����ѭ�����ʡ� 
��������:
�������n+1�У�

��һ��Ϊ���ʸ���n(1 �� n �� 50)

��������n�У�ÿ��һ������word[i]������length(1 �� length �� 50)����Сд��ĸ����


�������:
���ѭ�����ʵ�����

��������:
5
picture
turepic
icturep
word
ordw

�������:
2
*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Test2a{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			ArrayList<String> list = new ArrayList<>();
			for(int i = 0;i<n;i++){
				String str = sc.next();
				list.add(str);
			}
			
			int count = 0;
			while(list.size()>1){
				String s1 = list.get(0);
				
				for(int i = 1;i<list.size();i++){
					String s2=list.get(i);
					if(s1.equals(s2)){
						
						list.remove(i);i--;
					}else if(test(s1,s2)){
						list.remove(i);
						i--;
					}
				}
				count++;
				list.remove(0);
				
			}
			if(list.size()!=0) count++;
			
			System.out.println(count);
			
		}
	}
	
	private static boolean test(String s1,String s2){
		if(s1.length() != s2.length())
			return false;
		int k = s1.length();
		boolean flag = false;
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for(int i = 0;i < k -1 ;i++){
			char temp = ch1[k-1];
			for(int j = k -1;j>=1;j--){
				ch1[j]=ch1[j-1];
			}
			ch1[0]=temp;
			if(Arrays.equals(ch1,ch2)){
				flag = true;
				break;
			}
		}
		return flag;
	}
}