/*
Implement int sqrt(int x).

Compute and return the square root of x.
*/
/*
ÄâÅ£¶Ù·¨

*/
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		int i = mySqrt(x);
		System.out.println(i);
	}
    private static int mySqrt(long x) {
        long r=x;
        while(r*r>x){
            r = (r*r+x)/(2*r);
        }
        return (int)r;
    }
}