/*
从上往下打印出二叉树的每个节点，
同层节点从左至右打印
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Test1{
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode tmp = q.poll();
            list.add(tmp.val);
            if(tmp.left!=null)
                q.offer(tmp.left);
            if(tmp.right!=null)
                q.offer(tmp.right);
            
        }
        return list;
    }
}