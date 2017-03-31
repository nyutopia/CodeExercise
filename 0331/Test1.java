/*
请设计一个函数，
用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，
向右，向上，向下移动一个格子。如果一条路径经过了矩阵中的某一个格子，
则该路径不能再进入该格子。 例如[a b c e s f c s a d e e]是3*4矩阵，
其包含字符串"bcced"的路径，但是矩阵中不包含“abcb”路径，
因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，
路径不能再次进入该格子。
*/

public class Test1{
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str){
   
        if(matrix==null||matrix.length==0||str==null||str.length==0||rows<=0||cols<=0){
            return false;
        }
        boolean[] visited = new boolean[rows*cols];
        int[] pathLength = {0};
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(hasPath(matrix,i,j,rows,cols,str,visited,pathLength))
                    return true;
            }
        }
        return false;
        
    }
    public boolean hasPath(char[] matrix,int row,int col,int rows,int cols,char[] str,boolean[] visited,int[] pathlength){
        boolean flag = false;
        if(row<rows&&row>=0&&col<cols&&col>=0&&!visited[row*cols+col]&&matrix[row*cols+col]==str[pathlength[0]]){
            pathlength[0]++;
            visited[row*cols+col]=true;
            if(pathlength[0]==str.length) return true;
            flag=hasPath(matrix,row+1,col,rows,cols,str,visited,pathlength)||
                hasPath(matrix,row-1,col,rows,cols,str,visited,pathlength)||
				hasPath(matrix,row,col+1,rows,cols,str,visited,pathlength)||
                hasPath(matrix,row,col-1,rows,cols,str,visited,pathlength);
            if(!flag){
                pathlength[0]--;
                visited[row*cols+col]=false;
            }
        }
        return flag;
    }
}