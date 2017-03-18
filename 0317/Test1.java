/*
大家都知道斐波那契数列，
现在要求输入一个整数n，
请你输出斐波那契数列的第n项。
n<=39
*/

/*
public class Test1 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
		if(n==1||n==2) return 1;
        int a = 1,b=1,c;
        while(n-->2){
            c=a+b;
            b=a;
            a=c;
        }
        return a;
    }
}
*/
public class Test1 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
		if(n==1) return 1;
        int a=0,b=1;
        while(n-->1){
            b=a+b;
            a=b-a;
        }
        return b;
    }
}

/*
变形1
一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
.如果两种跳法，1阶或者2阶，那么假定第一次跳的是一阶，那么剩下的是n-1个台阶，跳法是f(n-1);
b.假定第一次跳的是2阶，那么剩下的是n-2个台阶，跳法是f(n-2)
c.由a\b假设可以得出总跳法为: f(n) = f(n-1) + f(n-2) 
d.然后通过实际的情况可以得出：只有一阶的时候 f(1) = 1 ,只有两阶的时候可以有 f(2) = 2
e.可以发现最终得出的是一个斐波那契数列：
public class Solution {
    public int JumpFloor(int target) {
		if(target==1) return 1;
        int a=1,b=1;
        while(target-->1){
            a=a+b;
            b=a-b;
        }
        return a;
    }
}
*/

/*
变形2
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，
总共有多少种方法？
public class Solution {
    public int RectCover(int target) {
        if(target==0) return 0;
		if(target==1) return 1;
        int a=1,b=1;
        while(target-->1){
            b=a+b;
            a=b-a;
        }
        return b;
    }
}
*/