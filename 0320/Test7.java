/*
���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
���Ժܿ���������Ǹ�����������1���ֵĴ�����
*/
public class Test7{
    public int NumberOf1Between1AndN_Solution(int n) {
    
        int sum = 0;
        int k = 1;
        while(n/k != 0){
            int high = n/(k*10);
            int cur = n/k-high*10;
            int low = n%k;
            
            if(cur<1){
                sum += high*k;
            }else if(cur == 1){
                sum += high*k+low+1;
            }else 
                sum += (high+1)*k;
            k *= 10;
        }
        return sum;
    }
}