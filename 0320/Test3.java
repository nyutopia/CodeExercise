/*
����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
���������ַ���abc,
���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� 
��������:
����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ��
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


