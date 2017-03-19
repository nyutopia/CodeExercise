/*
输入一个矩阵，
按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
import java.util.ArrayList;
public class Test3 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null||matrix.length==0) return null;
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        while(m>start*2&&n>start*2){
            int endX = n-1-start;
            int endY = m-1-start;
            if(endX>=start){
                for(int i = start;i<=endX;i++){
                    list.add(matrix[start][i]);
                }
            }
            if(endY>start){
                for(int i=start+1;i<=endY;i++){
                    list.add(matrix[i][endX]);
                }
            }
            if(start<endX&&start<endY){
                for(int i=endX-1;i>=start;i--){
                    list.add(matrix[endY][i]);
                }
            }
            if(start<endX&&start<endY-1){
                for(int i=endY-1;i>=start+1;i--){
                    list.add(matrix[i][start]);
                }
            }
            start++;
        }
        return list;
    }
}