/*
������ջ��ʵ��һ�����У�
��ɶ��е�Push��Pop������
 �����е�Ԫ��Ϊint���͡�

*/
import java.util.Stack;

public class Test5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        stack1.push(node);
    }
    
    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
    	
        return stack2.pop();
    }
}