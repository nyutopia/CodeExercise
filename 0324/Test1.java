/*
题目描述
牛客最近来了一个新员工Fish，
每天早晨总是会拿着一本英文杂志，
写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，
但却读不懂它的意思。例如，“student. a am I”。
后来才意识到，这家伙原来把句子单词的顺序翻转了，
正确的句子应该是“I am a student.”。
Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
*/

public class Test1{
    public String ReverseSentence(String str) {
        if(str.trim().equals("")) return str;
        String ret = Reverse(str);
        StringBuffer sb = new StringBuffer();
        String[] s = ret.split(" ");
        for(int i=0;i<s.length;i++){
            sb.append(Reverse(s[i]));
            if(i!=s.length-1)
                sb.append(" ");
        }
        return sb.toString();
        
    }
    public String Reverse(String str){
        char[] ch = str.toCharArray();
        for(int i = 0;i<ch.length/2;i++){
            char tmp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i]=tmp;
        }
        return String.valueOf(ch);
    }
}
