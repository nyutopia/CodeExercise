/*
�����һ��������
�����ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
·�����ԴӾ����е�����һ�����ӿ�ʼ��ÿһ�������ھ���������
���ң����ϣ������ƶ�һ�����ӡ����һ��·�������˾����е�ĳһ�����ӣ�
���·�������ٽ���ø��ӡ� ����[a b c e s f c s a d e e]��3*4����
������ַ���"bcced"��·�������Ǿ����в�������abcb��·����
��Ϊ�ַ����ĵ�һ���ַ�bռ���˾����еĵ�һ�еڶ�������֮��
·�������ٴν���ø��ӡ�
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