public class Test1{
    public int Add(int num1,int num2) {
        
        int num=num1^num2;
        int carry=(num1&num2)<<1;
        while(carry!=0){
            num1 = num;
            num2 = carry;
            num = num1^num2;
            carry = (num1&num2)<<1;
        }
        return num;
    }
}