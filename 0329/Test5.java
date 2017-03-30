/*
从上到下按层打印二叉树，
同一层结点从左至右输出。每一层输出一行
*/

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
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
public class Test5{
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
        if(pRoot==null) return listAll;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> tmp = new ArrayList<>();
        queue.offer(pRoot);
        int now = 1;
        int next = 0;
        while(!queue.isEmpty()){
             
            TreeNode node = queue.poll();
            tmp.add(node.val);
            now--;
            if(node.left!=null){
                queue.offer(node.left);
                next++;
            }
            if(node.right!=null){
                queue.offer(node.right);
                next++;
            }
            if(now==0){
                listAll.add(new ArrayList<>(tmp));
                now=next;
                next = 0;
                tmp.clear();
            }
            
        }
        return listAll;
    }

}