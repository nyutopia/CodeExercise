/*
定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
*/
import java.util.Stack;

public class Test4{
	Stack<Integer> data_stack = new Stack<>();
    Stack<Integer> min_stack = new Stack<>();
    
    public void push(int node) {
        data_stack.push(node);
        if(min_stack.empty()||node<min_stack.peek())
             min_stack.push(node);
        else
           min_stack.push(min_stack.peek());
    }
    
    public void pop() {
        data_stack.pop();
        min_stack.pop();
    }
    
    public int top() {
        return data_stack.peek();
    }
    
    public int min() {
        return min_stack.peek();
    }
}