/*
��Ŀ����
�����������һ����λָ�����ѭ�����ƣ�ROL����
�����и��򵥵����񣬾������ַ���ģ�����ָ�����������
����һ���������ַ�����S���������ѭ������Kλ������������
���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ����
����XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
*/
public class Test2{
    public String LeftRotateString(String str,int n) {
        if(str == null||str.length()==0) return "";
        n = n%str.length();
        String s = reverse(str);
        String s1 = s.substring(0,s.length()-n);
        String s2 = s.substring(s.length()-n,s.length());
        return reverse(s1)+reverse(s2);
        
    }
    private String reverse(String str){
        char[] ch = str.toCharArray();
        for(int i = 0;i < ch.length/2;i++){
            char tmp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i]=tmp;
        }
        return String.valueOf(ch);
    }
}

public class Test2       {
    public String LeftRotateString(String str,int n) {
        if(str == null||str.length()==0) return "";
        int len = str.length();
        n = n%len;
        str+=str;
        return str.substring(n,n+len);
        
    }
    
}