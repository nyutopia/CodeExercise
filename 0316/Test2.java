/*
请实现一个函数，
将一个字符串中的空格替换成“%20”。
例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
*/
public class Test2 {
    public String replaceSpace(StringBuffer str) {
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}