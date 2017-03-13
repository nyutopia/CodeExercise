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