/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。
例如输入字符串abc,
则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 
输入描述:
输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
*/
import java.util.ArrayList;
import java.util.TreeSet;
public class Test3{
    public ArrayList<String> Permutation(String str) {
       	ArrayList<String> list = new ArrayList<>();
        if(str==null||str.length() == 0) return list;
        TreeSet<String> set = new TreeSet<>();
        char[] ch = str.toCharArray();
        Permutation(ch,0,set);
        list.addAll(set);
        return list;
    }
    private void Permutation(char[] ch,int begin,TreeSet set){
        if(begin == ch.length-1)
            set.add(String.valueOf(ch));
        else{
            for(int i = begin;i<=ch.length-1;i++){
                swap(ch,begin,i);
                Permutation(ch,begin+1,set);
                swap(ch,begin,i);
            }
            
        }
    }
    private void swap(char[] ch,int i,int j){
        if(i!=j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
        }
    }
}


