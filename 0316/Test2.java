/*
��ʵ��һ��������
��һ���ַ����еĿո��滻�ɡ�%20����
���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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