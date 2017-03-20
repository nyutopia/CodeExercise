/*
求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
可以很快的求出任意非负整数区间中1出现的次数。
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