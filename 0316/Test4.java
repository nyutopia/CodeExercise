/*
����ĳ��������ǰ���������������Ľ����
���ؽ����ö�������
���������ǰ���������������Ľ���ж������ظ������֡�
��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
���ؽ������������ء�
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    
    private TreeNode reConstructBinaryTree(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn){
        if(startPre>endPre||startIn>endIn){
            return null;
        }
        TreeNode tree = new TreeNode(pre[startPre]);
        for(int i = startIn;i<=endIn;i++){
            if(pre[startPre]==in[i]){
                tree.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                tree.right=reConstructBinaryTree(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
            }
        }
        return tree;
    }
}