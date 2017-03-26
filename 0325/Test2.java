/*
约瑟夫环问题
*/
public class Test2{
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) return -1;
        if(n==1) return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }
}