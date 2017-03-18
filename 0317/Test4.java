/*
给定一个double类型的浮点数base和int类型的整数exponent。
求base的exponent次方。
*/
/*
快速幂
*/
public class Test4{
    public double Power(double base, int exponent) {
        int n = Math.abs(exponent);
        if(n == 0) return 1.0;
        if(exponent<0&&base==0.0)
            throw new RuntimeException("分母不能为0");
        double ret=1,cur=base;
        while(n!=0){
            if((n&1)==1){
                ret*=cur;
            }
            cur=cur*cur;
            n>>=1;
            
            
            
        }
        return exponent>0?ret:1.0/ret;
  }
}