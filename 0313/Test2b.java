/*如果一个单词通过循环右移获得的单词，我们称这些单词都为一种循环单词。 例如：picture 和 turepic 就是属于同一种循环单词。 现在给出n个单词，需要统计这个n个单词中有多少种循环单词。 
输入描述:
输入包括n+1行：

第一行为单词个数n(1 ≤ n ≤ 50)

接下来的n行，每行一个单词word[i]，长度length(1 ≤ length ≤ 50)。由小写字母构成


输出描述:
输出循环单词的种数

输入例子:
5
picture
turepic
icturep
word
ordw

输出例子:
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
  
	  
  
   