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
import java.util.*;  
public class Test2b{  
	public static void main(String[] args) {  
		Scanner sc = new Scanner(System.in);  
		while (sc.hasNext()) {  
			int num = sc.nextInt();  
			sc.nextLine();  
			Set<String> set = new HashSet<String>();  
			int count = 0;  
			for (int i = 0; i < num; i++) {  
				String a = sc.nextLine();  
				if (!set.contains(a)) {  
					count++;  
					set.add(a);  
					String b = change(a);  
					while (!b.equals(a)) {  
						set.add(b);  
						b = change(b);  
					}  
				}  
			}		  
			System.out.println(count);  
		}  
    }
    public static String change(String a) {  
		String b = a.substring(a.length() - 1) + a.substring(0,a.length() - 1);  
		return b;  
     }
  
}
  
	  
  
   