/*
��һ���ַ���(1<=�ַ�������<=10000��
ȫ���ɴ�д��ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��
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