/*
��Ŀ����
ţ���������һ����Ա��Fish��
ÿ���糿���ǻ�����һ��Ӣ����־��
дЩ�����ڱ����ϡ�ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish����������
��ȴ������������˼�����磬��student. a am I����
��������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
��ȷ�ľ���Ӧ���ǡ�I am a student.����
Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
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
