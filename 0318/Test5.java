/*
���������������У�
��һ�����б�ʾջ��ѹ��˳��
���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ�
��������1,2,3,4,5��ĳջ��ѹ��˳��
����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
*/

import java.util.ArrayList;
import java.util.Stack;
public class Test5{
    public boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<>();
        for(int i = 0,j=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while(!stack.empty()&&stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }
}