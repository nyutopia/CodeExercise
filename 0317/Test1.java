/*
��Ҷ�֪��쳲��������У�
����Ҫ������һ������n��
�������쳲��������еĵ�n�
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
����1
һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
.�������������1�׻���2�ף���ô�ٶ���һ��������һ�ף���ôʣ�µ���n-1��̨�ף�������f(n-1);
b.�ٶ���һ��������2�ף���ôʣ�µ���n-2��̨�ף�������f(n-2)
c.��a\b������Եó�������Ϊ: f(n) = f(n-1) + f(n-2) 
d.Ȼ��ͨ��ʵ�ʵ�������Եó���ֻ��һ�׵�ʱ�� f(1) = 1 ,ֻ�����׵�ʱ������� f(2) = 2
e.���Է������յó�����һ��쳲��������У�
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
����2
���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ�
�ܹ��ж����ַ�����
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