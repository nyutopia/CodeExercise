/*
地上有一个m行和n列的方格
一个机器人从坐标0,0的格子开始移动，
每一次只能向左，右，上，下四个方向移动一格，
但是不能进入行坐标和列坐标的数位之和大于k的格子。 
例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
但是，它不能进入方格（35,38），因为3+5+3+8 = 19。
请问该机器人能够达到多少个格子？
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