/*
��ֻ��������2��3��5��������������Ugly Number����
����6��8���ǳ�������14���ǣ���Ϊ����������7�� 
ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N������
*/
public class Test1{
    public int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int[] uglyNumber = new int[index];
        uglyNumber[0] = 1;
        int nextIndex = 1;
        int p2=0;
        int p3=0;
        int p5=0;
        while(nextIndex < index){
            
            uglyNumber[nextIndex] = Math.min(Math.min(uglyNumber[p2]*2,uglyNumber[p3]*3),uglyNumber[p5]*5);
            while(uglyNumber[p2]*2<=uglyNumber[nextIndex])
                p2++;
            while(uglyNumber[p3]*3<=uglyNumber[nextIndex])
                p3++;
            while(uglyNumber[p5]*5<=uglyNumber[nextIndex])
                p5++;
            
            nextIndex++;
        }
        
        return uglyNumber[index-1];
    }
}