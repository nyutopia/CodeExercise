/*
ţţ�ڶ�ά����ϵ�л���N���㣬�Ҷ������㡣����ţţ�뻭��һ�����Σ�ʹ����N���㶼�ھ����ڻ����ھ����ϡ�
���εı߾�ƽ���������ᡣţţϣ�����ε������С���������ţţ��������С���ε������ 
��������:
��������һ��������N��ʾ��ĸ�����2 <= N <= 50��
  
������N��ÿ����������x, y����ʾ�õ�����ꡣ����ֵ��С�ڵ���100.


�������:
һ��������ʾ��С���ε������

��������:
2
0 1
1 0

�������:
1
*/
import java.util.Scanner;
import java.util.Arrays;
public class Test3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        for(int i = 0;i<n;i++){
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        int ret = (arrX[n-1]-arrX[0])*(arrY[n-1]-arrY[0]);
        System.out.println(ret);
    }
}