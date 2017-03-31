/*
������һ��m�к�n�еķ���
һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ��
���ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ� 
���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18��
���ǣ������ܽ��뷽��35,38������Ϊ3+5+3+8 = 19��
���ʸû������ܹ��ﵽ���ٸ����ӣ�
*/

public class Test2{
    public int movingCount(int threshold, int rows, int cols){
        int[][] flag = new int[rows][cols];
        return helper(0,0,rows,cols,flag,threshold);
    }
    public int helper(int i,int j,int rows,int cols,int[][] flag,int threshold){
        if(i<0||i>=rows||j<0||j>=cols||flag[i][j]==1||numSum(i)+numSum(j)>threshold){
            return 0;
        }
        flag[i][j]=1;
        return 1+helper(i-1,j,rows,cols,flag,threshold)+
            helper(i+1,j,rows,cols,flag,threshold)+
            helper(i,j-1,rows,cols,flag,threshold)+
            helper(i,j+1,rows,cols,flag,threshold);
    }
    public int numSum(int i){
        int sum = i%10;
        while(i/10!=0){
            i = i/10;
            sum+=i%10;
        }
        return sum;
    }
}