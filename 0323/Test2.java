/*
��Ŀ����
С����ϲ����ѧ,��һ����������ѧ��ҵʱ,
Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck! 
�������:
������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
*/
import java.util.ArrayList;
public class Test2{
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        if(sum<3) return listAll;
        int nMax = (int)(Math.sqrt(8*sum+1)-1)/2;
        for(int n=nMax;n>1;n--){
            int tmp = sum-(n*(n-1)/2);
            if(tmp%n==0){
                ArrayList<Integer> list = new ArrayList<>();
                int a = tmp/n;
                for(int i = 0;i<n;i++){
                    list.add(a+i);
                }
                listAll.add(list);
            }
        }
        return listAll;
    }
}


import java.util.ArrayList;
public class Test2{
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       
        ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        if(sum<3) return listAll;
        int small=1;
        int big = 2;
        int curSum = small+big;
        while(small<(sum+1)/2){
            
            
            while(curSum>sum&&small<big&&(small<(sum+1)/2)){
                curSum -= small;
                small++;
            }
            if(curSum==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = small;i<=big;i++){
                    
                    list.add(i);
                    
                }
                listAll.add(list);
            }
            
            big++;
            curSum+=big;
            
        }
        
        return listAll;
    }
}