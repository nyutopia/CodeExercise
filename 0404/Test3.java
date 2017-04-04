/*
牛牛在二维坐标系中画了N个点，且都是整点。现在牛牛想画出一个矩形，使得这N个点都在矩形内或者在矩形上。
矩形的边均平行于坐标轴。牛牛希望矩形的面积最小。请你帮助牛牛计算下最小矩形的面积。 
输入描述:
首先输入一个正整数N表示点的个数（2 <= N <= 50）
  
接下来N行每行两个整数x, y，表示该点的坐标。绝对值均小于等于100.


输出描述:
一个整数表示最小矩形的面积。

输入例子:
2
0 1
1 0

输出例子:
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