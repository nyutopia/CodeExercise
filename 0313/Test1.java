/*ţţ��һ����ס���������Ѿ���n���㣬ÿ����Ĵ�СΪfishSize[i] (1 �� i �� n,��Ϊ������)��ţţ��������²�׽���������ס�����ڴ����Ŵ����С��Ķ��ɡ������۲죬ţţ����һ����A�Ĵ�СΪ����һ����B��С��2����10��(����2����С��10����С)����A��Ե���B�����ǵ������ţţҪ����������Ҫ��֤��
1���Ž�ȥ�����ǰ�ȫ�ģ����ᱻ������Ե�
2��������Ž�ȥҲ���ܳԵ�������
��������Ѿ����ڵ����Ѿ��ദ�˺ܾã����������ǻ��ಶʳ������֪���·�����Ĵ�С��Χ[minSize,maxSize](������Ĵ�С����������ʾ),ţţ��֪���ж����ִ�С������Է��������ס� 
��������:
�������ݰ���3��.
��һ��Ϊ�·�����ĳߴ緶ΧminSize,maxSize(1 �� minSize,maxSize �� 1000)���Կո�ָ���

�ڶ���Ϊ��������Ѿ����������n(1 �� n �� 50)

������Ϊ�Ѿ��е���Ĵ�СfishSize[i](1 �� fishSize[i] �� 1000)���Կո�ָ���


�������:
����ж����ִ�С������Է��������ס�������Ĵ�С����������ʾ

��������:
1 12
1
1

�������:
3
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int min = sc.nextInt();
			int max = sc.nextInt();
			int n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0;i<n;i++){
				int size = sc.nextInt();
				list.add(size);
			}
			
			int count = 0;
			for(int i = min;i<=max;i++){
				boolean flag = true;
				for(int j = 0;j<n;j++){
					
					if((list.get(j)>=2*i && 10*i >= list.get(j))||(i >=2*list.get(j) && i <= 10*list.get(j)))
						flag = false;
						
				}
				if(flag) count++;
			}
			System.out.println(count);
			
		}
	}
}