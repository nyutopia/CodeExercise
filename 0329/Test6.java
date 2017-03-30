/*
请实现一个函数按照之字形打印二叉树，
即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，
第三行按照从左到右的顺序打印，
其他行以此类推。
*/

import java.util.ArrayList;
import java.util.Stack;

/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Test6{
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        if(pRoot==null) return listAll;
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        
        ArrayList<Integer> tmp = new ArrayList<>();
        stack1.push(pRoot);

        while(!stack1.empty()||!stack2.empty()){
             
            if(!stack1.empty()){
                while(!stack1.empty()){
                   	TreeNode node = stack1.pop();
                	tmp.add(node.val);
                	if(node.left!=null){
                		stack2.push(node.left);
                	}
                	if(node.right!=null){
                    	stack2.push(node.right);
                	} 
                }
                listAll.add(new ArrayList<>(tmp));
                tmp.clear();
            }else{
                while(!stack2.empty()){
                   	TreeNode node = stack2.pop();
                	tmp.add(node.val);
                	
                	if(node.right!=null){
                    	stack1.push(node.right);
                	} 
                    if(node.left!=null){
                		stack1.push(node.left);
                	}
                }
                listAll.add(new ArrayList<>(tmp));
                tmp.clear();
            }
           
            
        }
        return listAll;
    }

}