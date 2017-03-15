/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int i = strStr(str1,str2);
		System.out.println(i);
	}
    private static int strStr(String haystack, String needle) {
        for(int i = 0;;i++){
            for(int j = 0;;j++){
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1;
                if(haystack.charAt(i+j)!=needle.charAt(j)) break;
            }
        }
        
    }
}