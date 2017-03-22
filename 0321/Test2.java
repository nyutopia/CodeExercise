/*
在一个字符串(1<=字符串长度<=10000，
全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
*/
import java.util.HashMap;
import java.util.Map;
public class Test2{
    public int FirstNotRepeatingChar(String str) {
       
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),0);
            map.put(str.charAt(i),map.get(str.charAt(i))+1);
            
        }
        for(int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                return i;
            }
                
        }
        return -1;
    }
}