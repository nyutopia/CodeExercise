/*
后缀表达式
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are+,-,*,/. Each operand may be an integer or another expression.
Some examples:
  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/

import java.util.Stack;

public class Test5{
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ret = 0;
        for(int i = 0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                ret = a+b;
                stack.push(ret);
            }else if(tokens[i].equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                ret = b-a;
                stack.push(ret);
            }else if(tokens[i].equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                ret = a*b;
                stack.push(ret);
            }else if(tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                ret = b/a;
                stack.push(ret);
            }else{
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}