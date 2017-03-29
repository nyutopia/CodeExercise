/*
��Ŀ����
����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]������ʹ�ó�����
*/

import java.util.ArrayList;
public class Test1{
    public int[] multiply(int[] A) {
		int[] B = new int[A.length];
        if(A==null||A.length==0) return B;
        B[0] = 1;
        for(int i = 1;i < A.length;i++){
        	B[i] = B[i-1]*A[i-1];
        }
        int tmp = 1;
        for(int i=A.length-2;i>=0;i--){
            tmp = tmp*A[i+1];
            B[i] = B[i]*tmp;
        }
        return B;
    }
}