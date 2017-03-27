/*
×Ö·û´®×ªÊý×Ö
*/
public class Test2{
    public int StrToInt(String str) {
        boolean g_nStatus = true; 
        if(str==null){
            g_nStatus = false;
            return 0;
        }
        str = str.trim();
        if(str.length() == 0){
            g_nStatus = false;
            return 0;
        }
        if(str.length()==1&&(str.charAt(0)=='+'||str.charAt(0)=='-')){
            g_nStatus = false;
            return 0;
        }
        
        int count = 1;
        long sum = 0;
        boolean minus = false;
        for(int i=str.length()-1;i>=0;i--){
            if(i!=0&&!Character.isDigit(str.charAt(i))){
                g_nStatus=false;
                return 0;
            }
            if(i==0&&!(str.charAt(0)=='+'||str.charAt(0)=='-')&&(!Character.isDigit(str.charAt(i)))){
                g_nStatus = false;
                return 0;
            }
            if(i!=0){
            	sum += (long)(str.charAt(i)-'0')*count;
            	count *= 10;
            }else if(str.charAt(0)=='+'){
                minus = false;
            }else if(str.charAt(0)=='-'){
                minus =true;
            }else{
                sum += (long)(str.charAt(i)-'0')*count;
            	count *= 10;
            }
            
           
        }
        if(!minus){
            return sum>Integer.MAX_VALUE?0:(int)sum;
        }else
            return -sum<Integer.MIN_VALUE?0:(int)(-sum);
        
    }
}