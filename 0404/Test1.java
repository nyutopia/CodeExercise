/*
牛牛手里有N根木棒,分别编号为1~N,现在他从N根里想取出三根木棒，使得三根木棒构成一个三角形,你能计算出牛牛有多少种取法吗?(考虑两种取法中使用的木棒编号有一个不一样就认为是不同的取法)。 
输入描述:
首先输入一个正整数N，接下来的一行共有N个正整数表示每个木棒的长度。

N ≤ 50, 木棒的长度 ≤ 10000.


输出描述:
输出一个整数表示方法数。

输入例子:
5
1 2 3 4 5

输出例子:
3
*/
import java.util.Scanner;

public class Test1{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]>arr[k]&&arr[i]+arr[k]>arr[j]&&arr[k]+arr[j]>arr[i])
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}