/*
��һ����ά�����У�
ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳������
�����һ������������������һ����ά�����һ��������
�ж��������Ƿ��и�������

*/

public class Test1{
    public boolean Find(int target, int[][] array) {
    	if(array.length==0 || array[0].length==0) return false;
        int m = array.length;
        int n = array[0].length;
        int i=m-1;
        int j=0;
        boolean flag= false;
        while(i>=0&&j<n){
            if(target==array[i][j]){
                flag = true;
                break;
            }else if(target>array[i][j])
                j++;
            else i--;
        }
        return flag;
    

    }
}