/*
题目描述
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
*/


public class Test3{
    public boolean IsBalanced_Solution(TreeNode root) {
        
        if(root == null) return true;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        
        if(Math.abs(left-right)>1) return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public int treeDepth(TreeNode root){
        if(root == null) return 0;
        
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        
        return (left>right)?(left+1):(right+1);
    }
}
/*
public class Solution {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        
        treeDepth(root);
        return flag;
    }
    public int treeDepth(TreeNode root){
        if(root == null) return 0;
        
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        if(Math.abs(left-right)>1){
            flag = false;
        }
        
        return (left>right)?(left+1):(right+1);
    }
}
*/